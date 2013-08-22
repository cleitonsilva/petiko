package br.kuab.petiko

class Servico {
    //atributos
    Integer duracao
    Boolean simultaneo = false  //existem serviços que podem ser simultaneos
    Integer maxSimult = 0       //se poder haver mais de um atendimento no mesmo hrario, indica o maximo
    
    //relacionamento
    static belongsTo = [estabelecimento: Estabelecimento, categoria: CategoriaServico]
    
    //restrições
    static constraints = {
        maxSimult min:0 //evita negativos
        duracao min: 30 //duração mínima de um serviço é de 30 minutos
    }
}
