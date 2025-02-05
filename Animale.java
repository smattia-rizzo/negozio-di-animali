public class Animale {

    private static int nextCodice = 1;
    //Attributi
    protected int codice;
    protected String razza;
    protected String specie;
    protected int anno;
    protected double prezzo;
    protected String note;


    public Animale(String razza, String specie, int anno, double prezzo, String note) {
        codice = nextCodice;
        nextCodice++;
        this.razza = razza;
        this.specie = specie;
        this.anno = anno;
        this.prezzo = prezzo;
        this.note = note;
    }


    public int getCodice() {
        return codice;
    }


    public String getRazza() {
        return razza;
    }


    public String getSpecie() {
        return specie;
    }


    public void setSpecie(String specie) {
        this.specie = specie;
    }


    public int getAnno() {
        return anno;
    }


    public double getPrezzo() {
        return prezzo;
    }


    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    public String getNote() {
        return note;
    }


    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}