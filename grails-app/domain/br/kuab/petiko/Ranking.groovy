package br.kuab.petiko

class Ranking {
    //atributos
    String  feedback
    Cliente cliente
    Date    data
    Boolean positivo    //se gostou
    Boolean negativo    //se nao gostou
    
    //relacionamento
    static belongsTo = [estabelecimento: Estabelecimento]
    
    //restrições
    static constraints = {
        feedback(maxSize: 1024)
    }
}
