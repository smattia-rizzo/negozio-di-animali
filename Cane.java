public class Cane extends Animale {
    private String formaOrecchie;
    private String mantello;


    public Cane(String razza, String specie, int anno, double prezzo, String note, String formaOrecchie, String mantello) {
        super(razza, specie, anno, prezzo, note);
        this.formaOrecchie = formaOrecchie;
        this.mantello = mantello;
    }


    public String getFormaOrecchie() {
        return formaOrecchie;
    }


    public String getMantello() {
        return mantello;
    }

    

    
}
