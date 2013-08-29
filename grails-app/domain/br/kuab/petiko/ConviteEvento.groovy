package br.kuab.petiko

class ConviteEvento {
    //qual post associado ao evento
    Post post
    //post é interno ao documento convite 
    static embedded=['post']    
    static constraints = {
    }
}
