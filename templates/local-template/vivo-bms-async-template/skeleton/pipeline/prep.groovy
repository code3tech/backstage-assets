try
{
    echo '################## REALIZANDO CHECKOUT TEMPLATE PIPELINES ##################'

    dir(env.WORKSPACE)
    {
        gitClone steps: steps,
            url: "${TEMPLATE_URL}",
            username: GIT_CREDENTIAL_USR,
            password: GIT_CREDENTIAL_PSW,
            folder: "${TEMPLATE_FOLDER}",
            branch: "master"

        println("Clone realizado com sucesso.")
    }
}
catch(Exception ex)
{
    println("Não foi possível efetuar checkout dos templates dos pipelines!")
    throw ex
}

try
{
    echo '################## CARREGANDO TEMPLATE PIPELINE ##################'
    load("../${TEMPLATE_FOLDER}/src/prep.groovy")
}
catch(Exception ex)
{
    println("Não foi possível carregar o arquivo '${TEMPLATE_FOLDER}/src/prep.groovy'!")
    throw ex
}