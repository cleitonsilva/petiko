package br.kuab.petiko

class Pet {
    //Atributos
    String  nome
    String  genero  //ave, cao, gato,...
    String  raca
    Date    nascimento
    Integer peso
    String  unidade //g, kg, etc...
    String  porte   //pequeno, médio, grande..
    String  foto    //url para a foto
    
    //relacionamentos
    static belongsTo=[cliente:Cliente] //um pet pertence a um cliente
    
    //restrições
    static constraints = {
        nome(blank:false, nullable:false)
        genero(blank:false, nullable:false)
        raca(blank:false, nullable:false)
        nascimento(nullable:true)
    }
}
