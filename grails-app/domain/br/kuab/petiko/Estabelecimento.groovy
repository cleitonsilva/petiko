package br.kuab.petiko

class Estabelecimento extends Usuario {
    
    //atributos
    String  cnpj
    String  razaoSocial
    String  nomeFantasia
    String  telefone1
    String  telefone2
    String  emailContato
    String  site

    
    
    //Relacionamentos
    static hasMany= [horarios: HorarioAtendimento, servicos: Servico, atendimentos: Atendimento]
    
    //restrições para os atributos
    static constraints = {
        cnpj (blank: false, unique:true, nullable:false)
        nomeFantasia (blank:false, nullable:false)
    }
}
