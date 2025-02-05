public class Gatto extends Animale {
    private String mantello;
    private String unghie;
    
    public Gatto(String razza, String specie, int anno, double prezzo, String note, String mantello, String unghie) {
        super(razza, specie, anno, prezzo, note);
        this.mantello = mantello;
        this.unghie = unghie;
    }

    public String getMantello() {
        return mantello;
    }


    public String getUnghie() {
        return unghie;
    }

    
}
