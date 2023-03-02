package com.generation.casopractico.models;

// generar el perfil de la persona que pertenece a la institucion, segun yo estas clases padre (Persona) e hijos (profesor, alumno)
//me serviria para ayudar en el tema de los registros a la escuela y asi no se pierdan los datos 
public class Persona {
    public String nombreCompleto;
    public Integer anioIngreso;

    public Persona() {
    }

    public Persona(String nombreCompleto, Integer anioIngreso) {
        this.nombreCompleto = nombreCompleto;
        this.anioIngreso = anioIngreso;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getanioIngreso() {
        return anioIngreso;
    }

    public void setanioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }


   
    @Override
    public String toString() {
        return "Persona [nombreCompleto=" + nombreCompleto + ", anioIngreso=" + anioIngreso + "]";
    }
    

}
