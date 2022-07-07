try
{
    echo '################## CARREGANDO TEMPLATE PIPELINE ##################'
    load("../${TEMPLATE_FOLDER}/src/test.unit.groovy")
}
catch(Exception ex)
{
    println("Não foi possível carregar o arquivo '${TEMPLATE_FOLDER}/src/test.unit.groovy'!")
    throw ex
}
