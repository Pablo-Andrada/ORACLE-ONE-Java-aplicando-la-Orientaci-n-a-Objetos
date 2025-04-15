package com.ORACLE.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int cantidadDeEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getCantidadDeEvaluaciones(){
        return cantidadDeEvaluaciones;
    }
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la com.ORACLE.screenmatch.modelos.Pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento fue: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        cantidadDeEvaluaciones ++;
    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones / cantidadDeEvaluaciones;
    }
}
