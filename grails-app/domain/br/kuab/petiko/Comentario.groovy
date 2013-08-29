package br.kuab.petiko

class Comentario {
    static mapWith="mongo"
   
    //id unico
    int id
    //data em que o comentario foi feito 
    Date data
    //conteudo do cometatio
    String texto
    //quem fez o comentario
    Amigo amigo  
    
    //amigo contido dentro do documento de comentario
    static embedded=['amigo']        

    
    static constraints = {
    }
}
