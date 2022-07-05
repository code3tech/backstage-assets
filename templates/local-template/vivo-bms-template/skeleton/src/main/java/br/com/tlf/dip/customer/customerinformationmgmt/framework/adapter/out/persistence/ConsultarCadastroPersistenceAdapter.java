package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.ConsultarCadastroPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.dto.CadastroDTO;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.dto.ClienteDTO;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.dto.ContatoClienteDTO;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.Util;

@Service
public class ConsultarCadastroPersistenceAdapter implements ConsultarCadastroPortOut {

	private static Logger logger = LoggerFactory.getLogger(ConsultarCadastroPersistenceAdapter.class);
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public CadastroDTO getCadastro(String numeroLinha, String documento) throws AbstractBusinessException {
		
		CadastroDTO cadastro = new CadastroDTO();
		
		try {
			logger.info("Chamando VIVONET");
			Session session = entityManager.unwrap(Session.class);
			session.doWork(new Work() {

			    @Override
			    public void execute(Connection connection) throws SQLException {
			    	
			    	StringBuilder sb = new StringBuilder();
				
			    	sb.append("BEGIN ")
			    	.append("SOA_OW.PKG_FRONT_END.CONSULTAR_CADASTRO( ")
			    	.append("VI_NRLINHA => ?, ")
			    	.append("VI_DOCUMENTO => ?, ")
			    	.append("VO_LISTA_CT => ?, ")
			    	.append("VO_LISTA => ?, ")
			    	.append("VO_CDERRO => ?, ")
			    	.append("VO_DSERRO => ? ")
			    	.append("); ")
			    	.append("END;");

					CallableStatement stmt = connection.prepareCall(sb.toString());
			    	
					stmt.setNull(1, Types.NUMERIC);
		            stmt.setString(2, documento);

		            stmt.registerOutParameter(3, Types.REF_CURSOR);
		            stmt.registerOutParameter(4, Types.REF_CURSOR);

		            stmt.registerOutParameter(5, Types.NUMERIC);
		            stmt.registerOutParameter(6, Types.VARCHAR);
		            logger.info("Request VivoNet: {}", sb);
		            stmt.executeQuery();
		            
		            ResultSet rsListaCT = (ResultSet)stmt.getObject(3);
		            if (rsListaCT != null) {
		            	while(rsListaCT.next())
		            	{
		            		ContatoClienteDTO contatoCliente = new ContatoClienteDTO();
		            		contatoCliente.setContato(Util.isNotEmptyString(rsListaCT.getString(1)) ? rsListaCT.getString(1) : null);
		            		contatoCliente.setTipoContato(Util.isNotEmptyString(rsListaCT.getString(2)) ? rsListaCT.getString(2) : null);
		            		contatoCliente.setDtExpiracao(rsListaCT.getDate(3) != null ? rsListaCT.getDate(3) : null);
		            		cadastro.setContatoCliente(contatoCliente);
		            	}
		            }
		            
		            ResultSet rsLista = (ResultSet)stmt.getObject(4);
		            if (rsLista != null) {
		            	while(rsLista.next())
		            	{
		            		ClienteDTO cliente = new ClienteDTO();
		            		cliente.setNomeCliente(Util.isNotEmptyString(rsLista.getString(1)) ? rsLista.getString(1) : null);
		            		cliente.setSobrenomeCliente(Util.isNotEmptyString(rsLista.getString(2)) ? rsLista.getString(2) : null);
		            		cliente.setDocumentoCliente(Util.isNotEmptyString(rsLista.getString(3)) ? rsLista.getString(3) : null);
		            		cliente.setDtNascimentoCliente(rsLista.getDate(4) != null ? rsLista.getDate(4) : null);
		            		cliente.setNmMaeCliente(Util.isNotEmptyString(rsLista.getString(5)) ? rsLista.getString(5) : null);
		            		cliente.setNomeUsuario(Util.isNotEmptyString(rsLista.getString(6)) ? rsLista.getString(6) : null);
		            		cliente.setSobrenomeUsuario(Util.isNotEmptyString(rsLista.getString(7)) ? rsLista.getString(7) : null);
		            		cliente.setDocumentoUsuario(Util.isNotEmptyString(rsLista.getString(8)) ? rsLista.getString(8) : null);
		            		cliente.setDtNascimentoUsuario(rsLista.getDate(9) != null ? rsLista.getDate(9) : null);
		            		cliente.setNmMaeUsuario(Util.isNotEmptyString(rsLista.getString(10)) ? rsLista.getString(10) : null);
		            		cliente.setAging(rsLista.getDate(11) != null ? rsLista.getDate(11) : null);
		            		cliente.setTerminal(Objects.nonNull(rsLista.getLong(12)) ? rsLista.getLong(12) : null);
		            		cliente.setEndereco(Util.isNotEmptyString(rsLista.getString(13)) ? rsLista.getString(13) : null);
		            		cliente.setTpCliente(Util.isNotEmptyString(rsLista.getString(14)) ? rsLista.getString(14) : null);
		            		cliente.setCdSegmento(Objects.nonNull(rsLista.getInt(15)) ? rsLista.getInt(15) : null);
		            		cliente.setDsSegmento(Util.isNotEmptyString(rsLista.getString(16)) ? rsLista.getString(16) : null);
		            		cliente.setDataHora(rsLista.getDate(17) != null ? rsLista.getDate(17) : null);
		            		cliente.setEntidade(Util.isNotEmptyString(rsLista.getString(18)) ? rsLista.getString(18) : null);
		            		cadastro.setCliente(cliente);
		            	}
		            	
		            }
		            cadastro.setCdErro(stmt.getInt(5));
		            cadastro.setDsErro(stmt.getString(6));
		            logger.info("Response VivoNet: {}", cadastro);
			    }
			});
		
			if (cadastro.getCdErro() != 0 && cadastro.getCdErro() != 2) {
				throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, "FaultCode: "+cadastro.getCdErro() +" - "+ cadastro.getDsErro());
			}
			logger.info("Concluindo a chamanda do VIVONET");
		} catch (AbstractBusinessException e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "NVGetCustomerAdapter.getCustomer" , e.getMensagemStackTrace(),e);
			throw new AbstractBusinessException(e.getMessagesEnun(), null, e.getMensagemStackTrace());
		
		} catch (Exception e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "ConsultarCadastroPersistenceAdapter.getCadastro" , e.getStackTrace() ,e);		
			throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, e.getMessage());
		}
		
		return cadastro;
	}

}
