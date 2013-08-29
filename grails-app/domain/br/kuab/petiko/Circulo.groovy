package br.kuab.petiko

class Circulo {
     static mapWith="mongo"

    //lista de membros do circulo 
    List<Amigo> membros
    //responsavel pelo circulo
    Amigo dono
    
    static embendded=['membros','dono'] 
    static constraints = {
    }
}
