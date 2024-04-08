
public class Pelicula {
    private String nom;
    private double valoracio;
    private int nValoracions;

    public Pelicula(String nom, double puntuacio, int nValoracions){
        this.nom=nom;
        this.valoracio=puntuacio;
        this.nValoracions=nValoracions;
    }
    public String getNom() {
        return nom;
    }

    public double getValoracio() {
        return valoracio;
    }

    public int getnValoracions() {
        return nValoracions;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setValoracio(float valoracio) {
        this.valoracio = valoracio;
    }

    public void setnValoracions(int nValoracions) {
        this.nValoracions = nValoracions;
    }

    @Override
    public String toString() {
        return "Pelicula [nom=" + nom + ", valoracio=" + valoracio + ", nValoracions=" + nValoracions + "]";
    }
}