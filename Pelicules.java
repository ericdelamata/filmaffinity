import java.util.Arrays;

public class Pelicules {
    private Pelicula[] pelicules;
    private int npelicules=0;
    private int minVots=5000;


    public Pelicules(){
        this.pelicules= new Pelicula[100];
    }

    public Pelicules(int minVots){
        this.pelicules= new Pelicula[100];
        this.minVots=minVots;
    }

    public void afegirPelicula(Pelicula peli){
        try{
            this.pelicules[npelicules]=peli;
            npelicules++;
        }catch(ArrayIndexOutOfBoundsException e){
            extendPelicules();
        }
    }
    public void extendPelicules(){
        Pelicula[] aux= new Pelicula[npelicules+100];
        for(int i=0;i<npelicules;i++){
            aux[i]=this.pelicules[i];
        }
        this.pelicules=aux;
    }
    public void mostrarPelicules(){
        for(int i=0;i<npelicules;i++){
            if(this.pelicules[i].getnValoracions()>=minVots){
                System.out.println(this.pelicules[i]);
                System.out.println("------------");
            }
        }
    }
    public void ordenarVotsDes(){
        Arrays.sort(this.pelicules,0,npelicules,new ComparatorVotsDes());
    }
    public void ordenarNVotsDes(){
        Arrays.sort(this.pelicules,0,npelicules,new ComparatorNvotsDes());
    }
    public void ordenarVotsAsc(){
        Arrays.sort(this.pelicules,0,npelicules,new ComparatorVotsAsc());
    }
    public void ordenarNVotsAsc(){
        Arrays.sort(this.pelicules,0,npelicules,new ComparatorNvotsAsc());
    }
}
