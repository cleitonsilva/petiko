package br.kuab.petiko

class CategoriaServico {
    //atributos
    String nome
    String descricao
    
    //relacionamento
    static hasMany = [servicos: Servico]
    
    //restrições
    static constraints = {
        nome(blank:false, nullable:false)
        descricao(blank:false, nullable:false, maxSize: 1024)
    }
}
