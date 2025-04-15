import com.ORACLE.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("InterStellar");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(220);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(9);

        System.out.println("Total de las evaluaciones: "+ miPelicula.getCantidadDeEvaluaciones());
        System.out.println("Puntaje promedio: "+ miPelicula.calculaMedia());

    }
}
