try
{
    echo '################## CARREGANDO TEMPLATE PIPELINE ##################'
    load("../${TEMPLATE_FOLDER}/src/build.groovy")
}
catch(Exception ex)
{
    println("Não foi possível carregar o arquivo '${TEMPLATE_FOLDER}/src/build.groovy'!")
    throw ex
}