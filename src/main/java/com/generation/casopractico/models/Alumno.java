package com.generation.casopractico.models;

public class Alumno extends Persona{
    public String nivelCurso;// primero, segundo, tercero...
    public char letraCurso; // si estuvo o esta en el primero 'A', 'B' o 'C'
    public Boolean ensenianzaCompleta; 
    public String materiasCursadas;

    public Alumno(){
        super();
    }
  
    public Alumno(String nombreCompleto, Integer anioIngreso, String nivelCurso, char letraCurso,
            Double promedioGeneral, Boolean ensenianzaCompleta, String materiasCursadas) {
        super(nombreCompleto, anioIngreso);
        this.nivelCurso = nivelCurso;
        this.letraCurso = letraCurso;
        this.ensenianzaCompleta = ensenianzaCompleta;
        this.materiasCursadas = materiasCursadas;
    }

    public String getNivelCurso() {
        return nivelCurso;
    }

    public void setNivelCurso(String nivelCurso) {
        this.nivelCurso = nivelCurso;
    }

    public char getLetraCurso() {
        return letraCurso;
    }

    public void setLetraCurso(char letraCurso) {
        this.letraCurso = letraCurso;
    }

    public Boolean getensenianzaCompleta() {
        return ensenianzaCompleta;
    }

    public void setensenianzaCompleta(Boolean ensenianzaCompleta) {
        this.ensenianzaCompleta = ensenianzaCompleta;
    }

    public String getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(String materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    /**************************funcionalidades*********************************/

    public void aprendizaje (Boolean aprender){
        if (aprender == true){
            System.out.println("El alumno esta aprendiendo de maravilla");
        }else{
            System.out.println("Quizas le esta costando un poco mas aprender, pero lo esta intentando");
        }
    }

    public void asistencia (Boolean asiste){
        if (asiste == true){
            System.out.println("El/la alumno/a asiste a todas sus clases");
        } else {
            System.out.println("El/la alumno/a falta demasiado a sus clases");
        }
    }

    public void participacion (Boolean participar){
        if (participar == true){
            System.out.println("El/la alumno/a es muy participativo/a");
        }else{
            System.out.println("El/la alumno/a no es tan participativo/a");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [nivelCurso=" + nivelCurso + ", letraCurso=" + letraCurso + ", ensenianzaCompleta="
                + ensenianzaCompleta + ", materiasCursadas=" + materiasCursadas + "]";
    }

    
   
    } 
    

