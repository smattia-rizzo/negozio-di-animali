public class Main {

    public static void main(String[] args) {
        Negozio negozio = new Negozio("Frassyca");
        negozio.addAnimale(new Gatto("siamese", "gatto", 2010, 100, "", "riccio", "retrattili"));
        negozio.addAnimale(new Gatto("sphynx", "gatto", 2010, 100, "", "riccio", "retrattili"));
        negozio.addAnimale(new Gatto("europeo", "gatto", 2010, 100, "", "riccio", "retrattili"));

        negozio.addAnimale(new Cane("Akita", "canide", 2020, 200, "", "sventola", "lungo e liscio"));
        negozio.addAnimale(new Uccello("Canarino", "uccello", 2023, 50, null, "bianco", 10));

        negozio.addCliente(new Cliente("Sebastiano", "Frassyca", "", ""));
        
        System.out.println(negozio.vendiAnimale(4, negozio.getClienti().get(0)) ? "Venduto" : "Non esistente");
        System.err.println(negozio.getNumAnimaliVenduti());
        System.out.println(negozio.getCassa());
        System.out.println(negozio.getNumAnimaliInNegozio());
        System.out.println(negozio.getValoreComplessivoAnimali());

    }
}