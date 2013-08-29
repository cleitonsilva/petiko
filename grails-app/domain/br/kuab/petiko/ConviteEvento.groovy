package br.kuab.petiko

class ConviteEvento extends Convite{
    //qual post associado ao evento
    Post post
    //post é interno ao documento convite 
    static embedded=['post','amigo']    
    static constraints = {
    }
}
