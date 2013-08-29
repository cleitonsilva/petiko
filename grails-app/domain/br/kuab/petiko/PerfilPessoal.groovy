package br.kuab.petiko

class PerfilPessoal extends Perfil {
    static mapWith="mongo"
    
    Integer idade
    String sexo
    //lista de circulos
    List<Circulo> circulos
    //lista de pets 
    List<PerfilPet> pets
    
    List<Convite> convites
    
    //circulos e pets contidos no documento perfil pessoal
    static embedded = ['circulos','pets','convites']
    
    static constraints = {
    }
    
}
