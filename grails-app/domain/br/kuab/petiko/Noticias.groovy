package br.kuab.petiko

class Noticias {
    /*
     *Noticias é semelhante a classe mural, porem com posts de todos os amigos
     *Guarda a timeline do usuario
     **/
    static mapWith="mongo"
    //id unico
    int id
    //mes que a timeline foi criada
    //recuperar as duas ultimas na hora de exibir os dados do usuario
    int mes
    
    //lista de posts de um mural de noticias
    List<Post> posts 
    
    //posts internos no documento noticias
    static embedded=['posts']    
   
    static constraints = {
    }
}
