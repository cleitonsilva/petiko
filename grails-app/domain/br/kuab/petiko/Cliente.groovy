package br.kuab.petiko

class Cliente extends Usuario{
    //atributos
    String  cpf
    String  nome
    String  telefone
    String  celular
    String  foto = 'default.png'

    //relacionamentos
    static hasMany = [pets:Pet]              //um cliente pode ter vários pets
    

    static constraints = {
        cpf(unique:true, nullable: true)
        telefone(nullable:true)
        celular(nullable:true)
    }
}
