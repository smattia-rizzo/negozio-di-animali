import java.util.ArrayList;
/**Si vogliono gestire le informazioni relative ad un negozio di animali, di ogni animale interessa codice univoco, razza, specie, anno di nascita, prezzo, note. Il negozio di animali vende principalmente CANI, GATTI e UCCELLI. 
Dei cani in particolare interessa la forma delle orecchie, e il tipo di mantello (corto o lungo, ispido o morbido, liscio o riccio).
Dei gatti in particolare interessa mantello e tipologia delle unghie (retrattili o protrattili).
Degli uccelli in particolare interessa colore del piumaggio e apertura alare.
Degli acquirenti/proprietari interessa nome, cognome, indirizzo, telefono. Si noti che un animale può essere acquistato da un solo proprietario.
Realizzare un’applicazione che gestisca l’elenco degli animali del negozio (inseriti hard coded), e permetta di inserire i dati del compratore (che dovranno essere memorizzati dal programma unitamente al codice dell’animale acquistato). All’esecuzione dell’acquisto l’animale risulterà acquistato dal compratore e sarà eliminato dalla lista degli animali del negozio e associato direttamente al cliente. 
Si noti che il negozio dovrà tenere traccia di tutti i suoi clienti.
Predisporre i metodi per visualizzare:
Numero di animali venduti, Cifra totale incassata, Numero di clienti, Numero di animali nel negozio e valore complessivo 
*/
public class Negozio {
    private String nome;
    private ArrayList<Cliente> clienti;
    private ArrayList<Animale> animali;
    private double cassa;
    public Negozio(String nome) {
        this.nome = nome;
        clienti = new ArrayList<Cliente>();
        animali = new ArrayList<Animale>();
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Cliente> getClienti() {
        return clienti;
    }


    public ArrayList<Animale> getAnimali() {
        return animali;
    }
    
    

    public double getCassa() {
        return cassa;
    }

    
    public void setCassa(double cassa) {
        this.cassa = cassa;
    }


    public void addCliente(Cliente cliente){
        clienti.add(cliente);
    }


    public void addAnimale(Animale animale){
        animali.add(animale);
    }


    public boolean vendiAnimale(int codice, Cliente cliente){
        for (Animale animale : animali) {
            if (animale.getCodice()==codice) {
                animali.remove(animale);
                cliente.addAnimale(animale);
                cassa+=animale.getPrezzo();
                return true;
            }
        }
        return false;
    }

    public int getNumAnimaliInNegozio(){
        return animali.size();
    }

    public int getNumAnimaliVenduti(){
        int num = 0;
        for (Cliente cliente : clienti)
            num += cliente.getAnimali().size();
        return num;
    }


    public double getValoreComplessivoAnimali(){
        double val = 0;
        for (Animale animale : animali) {
            val += animale.getPrezzo();
        }
        return val;
    }
}
