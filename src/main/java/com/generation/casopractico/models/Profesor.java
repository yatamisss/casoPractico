package com.generation.casopractico.models;

public class Profesor extends Persona{
    public String materiaAsignada;
    public Integer aniosTrabajados;

    public Profesor() {
        super();
    }

    public Profesor(String nombreCompleto, Integer anioIngreso, String materiaAsignada, Integer aniosTrabajados) {
        super(nombreCompleto, anioIngreso);
        this.materiaAsignada = materiaAsignada;
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getMateriaAsignada() {
        return materiaAsignada;
    }

    public void setMateriaAsignada(String materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    public Integer getaniosTrabajados() {
        return aniosTrabajados;
    }

    public void setaniosTrabajados(Integer aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    /***********************************funcionalidades********************************/

    public void enseniar (boolean enseniaBien){
        if (enseniaBien == true){
            System.out.println("un/a profe genial, enseña de maravilla");
        } else {
            System.out.println("Quizas falta mejorar un poco sus metodos de enseñanza");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [materiaAsignada=" + materiaAsignada + ", aniosTrabajados=" + aniosTrabajados + "]";
    }

}
