package br.kuab.petiko

class Post extends Comentario{
    /*
     *Um post é um cometatio com um objeto multmidea
     **/
   
    ObjetoMultimidea objeto
    
    //objeto multimidea interno ao post
     static embedded = ['objeto']
   
    
    static constraints = {
    }
}
