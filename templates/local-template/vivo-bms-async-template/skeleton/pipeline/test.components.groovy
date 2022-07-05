try
{
    echo '################## CARREGANDO TEMPLATE PIPELINE ##################'
    load("../${TEMPLATE_FOLDER}/src/test.components.groovy")
}
catch(Exception ex)
{
    println("Não foi possível carregar o arquivo '${TEMPLATE_FOLDER}/src/test.components.groovy'!")
    throw ex
}