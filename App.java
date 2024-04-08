import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====================================================================================================");
        System.out.println("Selecciona el numero de vots minim");
        System.out.println("=====================================================================================================");
        int minvots = entrada.nextInt();
        Pelicules pelicules = new Pelicules(minvots);
        pelicules.afegirPelicula(new Pelicula("El Padrino", 9.0, 175389));
        pelicules.afegirPelicula(new Pelicula("La lista de Schindler", 8.6, 175776));
        pelicules.afegirPelicula(new Pelicula("Pulp Fiction", 8.6, 203273));
        pelicules.afegirPelicula(new Pelicula("La vida es bella", 8.5, 192255));
        pelicules.afegirPelicula(new Pelicula("American History X", 8.3, 153824));
        pelicules.afegirPelicula(new Pelicula("El viaje de Chihiro", 8.1, 114011));
        pelicules.afegirPelicula(new Pelicula("El señor de los anillos: El retorno del rey", 8.2, 186409));
        pelicules.afegirPelicula(new Pelicula("Ben-Hur", 7.9, 67882));
        pelicules.afegirPelicula(new Pelicula("Memento", 7.8, 148349));
        pelicules.afegirPelicula(new Pelicula("Old Boy", 7.8, 72564));
        pelicules.afegirPelicula(new Pelicula("Spider-Man: Cruzando el Multiverso", 7.8, 14362));
        pelicules.afegirPelicula(new Pelicula("Forest Gump", 8.2, 202992));
        pelicules.afegirPelicula(new Pelicula("El club de la lucha", 8.1, 188375));
        
        int ordenar = entrada.nextInt();

        if(ordenar==1){
            pelicules.ordenarNVotsDes();
        }else if(ordenar==2){
            pelicules.ordenarNVotsAsc();
        }else if(ordenar==3){
            pelicules.ordenarVotsDes();
        }else if(ordenar==4){
            pelicules.ordenarVotsAsc();
        }
        pelicules.mostrarPelicules();
        
        entrada.close();
    }
}
