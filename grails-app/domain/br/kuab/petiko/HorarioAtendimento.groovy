package br.kuab.petiko

class HorarioAtendimento {
    //Atributos
    Date inicio
    Date fim
    int diaSemana //dias da semana: 0 = Domingo
                                 // 1 = Segunda
                                 // 2 = Terça
                                 // 3 = Quarta
                                 // 4 = Quinta
                                 // 5 = Sexta
                                 // 6 = Sábado
                                 
    //Relacionamentos
    static belongsTo = [estabelecimento: Estabelecimento]
    
    static constraints = {
        inicio(blank:false, nullable:false)
        fim(blank:false, nullable:false)
    }
}
