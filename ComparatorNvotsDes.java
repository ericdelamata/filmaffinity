import java.util.Comparator;

public class ComparatorNvotsDes implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        if(o1.getnValoracions()>o2.getnValoracions()){
            return -1;
        }else if(o1.getnValoracions()<o2.getnValoracions()){
            return 1;
        }
        return 0;
    }
    
}
