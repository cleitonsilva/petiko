package br.kuab.petiko

class Foto {
    static mapWith="mongo"
    
    //id unico
    int id
    //url do arquivo de foto
    String src
    //lista de cometarios da foto
    List<Comentario> comentarios
    
    static embedded = ['comentatios']
    
    static constraints = {
    }
}
