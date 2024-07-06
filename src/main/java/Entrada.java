public abstract class Entrada {

    Monto precio;

    Entrada(Monto precio){
        this.precio = precio;
    }

    public Entrada venderEntradas(){
            return this;
    }

    Monto obtenerMonto(){
        return precio;
    }
}
