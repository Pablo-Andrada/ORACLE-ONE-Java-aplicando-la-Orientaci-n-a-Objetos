public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    int cantidadDeEvaluaciones;



    double sumaDeLasEvaluaciones;
    void muestraFichaTecnica(){
        System.out.println("El nombre de la Pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento fue: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }
    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        cantidadDeEvaluaciones ++;
    }
    double calculaMedia(){
        return sumaDeLasEvaluaciones / cantidadDeEvaluaciones;
    }
}
