classDiagram
    class Torneo {
        torneo_id
        nombre
        fecha
        ... (otros atributos)
    }
    
    class Equipo {
        equipo_id
        nombre
        ... (otros atributos)
    }
    
    class Jugador {
        jugador_id
        nombre
        apellido
        fecha_nacimiento
        pais
        ... (otros atributos)
    }
    
    class Participacion {
        participacion_id
        torneo_id
        equipo_id
        jugador_id
        fecha_asignacion
        ... (otros atributos)
    }
    
    Torneo "1" -- "n" Equipo
    Equipo "n" -- "n" Jugador
    Torneo "n" -- "n" Participacion
