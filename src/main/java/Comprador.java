import java.util.ArrayList;

public class Comprador {

    ArrayList<Entrada> entradas = new ArrayList<Entrada>();
    private Tarjeta tarjeta;

    public Comprador(Tarjeta conTarjeta){
        this.tarjeta = conTarjeta;
    }

    public void comprarEntradas(Entrada entrada){
        entradas.add(this.tarjeta.comprarEntrada(entrada));
    }

    public ArrayList<Entrada> getEntradas(){
        return this.entradas;
    }

}
