package br.kuab.petiko

class Album {
    static mapWith="mongo"
    
    //id unico para cada album 
    int id 
    //nome do album 
    String nome  
    // lista com as fotos
    List<Foto> fotos 
    //foto de capa do album
    Foto fotoCapa 
    
    //lista de fotos contidas dentro do dcumento album
    static embendded = ['fotos']         
    
    static constraints = {
        
    }
}
