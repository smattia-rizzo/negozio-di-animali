public class Uccello extends Animale {
    private String colorePiumaggio;
    private double aperturaAlare;
    public Uccello(String razza, String specie, int anno, double prezzo, String note, String colorePiumaggio,
            double aperturaAlare) {
        super(razza, specie, anno, prezzo, note);
        this.colorePiumaggio = colorePiumaggio;
        this.aperturaAlare = aperturaAlare;
    }
    public String getColorePiumaggio() {
        return colorePiumaggio;
    }
    public double getAperturaAlare() {
        return aperturaAlare;
    }

    
}
