try
{
    echo '################## CARREGANDO TEMPLATE PIPELINE ##################'
    load("../${TEMPLATE_FOLDER}/src/bundle.groovy")
}
catch(Exception ex)
{
    println("Não foi possível carregar o arquivo '${TEMPLATE_FOLDER}/src/bundle.groovy'!")
    throw ex
}