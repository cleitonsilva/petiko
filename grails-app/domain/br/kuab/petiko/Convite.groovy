package br.kuab.petiko

class Convite {
    static mapWith="mongo"
    //id unico
    int id
    //quem enviou o convite
    Amigo amigo
    //documento amigo interno no documento convite
    static embedded=['amigo']    
    
    static constraints = {
    }
}
