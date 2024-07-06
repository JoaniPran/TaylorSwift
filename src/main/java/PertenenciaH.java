public class PertenenciaH implements Tarjeta{

    @Override
    public Entrada comprarEntrada(Entrada entrada){
        return (entrada.venderEntradas());
    }

}
