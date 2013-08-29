package br.kuab.petiko

class Mural {
    /*
     *O Mural é a timeline de uma pessoa especifica
     *Apenas os proprios posts
     **/
    static mapWith="mongo"
    
    //id unico
    int id
    //guardar as timelines durante os ultimos dois messes
    //e recuperar as duas ultimas na hora de exibir
    int mes // mudar pra uma chave melhor aqui ...
    //lista de posts na timeline
    List<Post> posts
    //posts é um documento interno do mural
    static embedded=['posts']      
    static constraints = {
    }
}
