public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre="InterStellar";
        miPelicula.fechaDeLanzamiento=2021;
        miPelicula.duracionEnMinutos=220;

        System.out.println("Mi Pelicula es: "+ miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento fue: " + miPelicula.fechaDeLanzamiento);
    }
}
