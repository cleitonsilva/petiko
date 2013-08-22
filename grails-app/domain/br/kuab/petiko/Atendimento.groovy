package br.kuab.petiko

class Atendimento {
    //Atributos
    Date    dataHorario
    Servico servico
    Cliente cliente
    Pet     pet
    Integer status                      //0 = solicitado, 1=confirmado, 2=cancelado, 3=negado
    String  justificativa               //se negado, necessita uma justificativa

    //relacionamentos
    static belongsTo=[estabelecimento: Estabelecimento]
    
    //restrições
    static constraints = {
        
    }
}
