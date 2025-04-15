public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre="InterStellar";
        miPelicula.fechaDeLanzamiento=2021;
        miPelicula.duracionEnMinutos=220;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(9);

        System.out.println("Suma de las evaluaciones: "+ miPelicula.sumaDeLasEvaluaciones);
        System.out.println("Total de las evaluaciones: "+ miPelicula.cantidadDeEvaluaciones);
        System.out.println("Puntaje promedio: "+ miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 2001;
        otraPelicula.duracionEnMinutos = 190;

        otraPelicula.muestraFichaTecnica();
    }
}
