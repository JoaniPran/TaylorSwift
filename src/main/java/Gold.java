public class Gold implements Tarjeta{

    Monto monto = new Monto(1000);

    private boolean saldoSuficiento(Monto monto) {
        return (monto.esMayor(this.monto));
    }
    @Override
    public Entrada comprarEntrada(Entrada entrada){

        if (saldoSuficiento(entrada.obtenerMonto())){
            descontarMonto(entrada);
            return (entrada.venderEntradas());
        }
       return null;
    }

    private void descontarMonto(Entrada entrada){
        this.monto = this.monto.restarPrecio(entrada.obtenerMonto());
    }

}
