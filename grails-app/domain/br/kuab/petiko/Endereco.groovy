package br.kuab.petiko

class Endereco {
    static mapWith="mongo"	//avisa ao gorm que é mapeado pelo mongo

    //atributos
    Integer usuario_id      //Usuario dono do endereço
    List    location	//coordenadas [x,y] do mongo
        
    //endereco
    String  rua
    String  bairro
    String  numero
    String  complemento
    String  cidade
    String  uf

    //restrições
    static constraints = {
        usuario_id   unique: true
    }

    //define o mapeamento das coordenadas em tipo 2d geoIndex no mongo
    static mapping = {
        usuario_id index: true    //indexa para melhorar a busca
    	location geoIndex:true
    }
}
