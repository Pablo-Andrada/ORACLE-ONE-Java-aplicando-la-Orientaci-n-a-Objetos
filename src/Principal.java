import com.ORACLE.screenmatch.calculos.CalculadoraDeTiempo;
import com.ORACLE.screenmatch.modelos.Pelicula;
import com.ORACLE.screenmatch.modelos.Serie;

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

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa del Dragón");
        casaDragon.setTemporadas(2);
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Titanic");
        otraPelicula.setFechaDeLanzamiento(1997);
        otraPelicula.setDuracionEnMinutos(122);

        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();

        calculadoraDeTiempo.incluye(miPelicula);
        calculadoraDeTiempo.incluye(casaDragon);
        calculadoraDeTiempo.incluye((otraPelicula));
        System.out.println("Tiempo necesario para ver tu serie y pelicula favorita: " + calculadoraDeTiempo.getTiempoTotal());


    }
}
