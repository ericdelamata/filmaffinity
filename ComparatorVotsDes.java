import java.util.Comparator;

public class ComparatorVotsDes implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        if(o1.getValoracio()>o2.getValoracio()){
            return -1;
        }else if(o1.getValoracio()<o2.getValoracio()){
            return 1;
        }
        return 0;
    }
    
}
