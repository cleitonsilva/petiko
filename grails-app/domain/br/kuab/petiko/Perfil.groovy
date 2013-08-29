package br.kuab.petiko

class Perfil {
     static mapWith="mongo"
    
    //id unico
    int usuario_id
    //nome
    String nome
    //url da foto de perfil
    String foto_perfil
    //se o usuario está ativo 
    boolean bloqueado
    //lista de amigos do usuario
    List<Amigo> amigos   
    
    //lista de amigos interna ao documento perfil
    static embedded = ['amigos']
    
    //String endereco vai ter endereço aqui?
    //String telefone telefone tb ... vai ser replicado as informação do banco relacional
    
    static constraints = {
         usuario_id   unique: true
    }
}
