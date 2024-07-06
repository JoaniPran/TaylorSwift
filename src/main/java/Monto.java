import java.util.Objects;

public class Monto {

    private int valor;

    Monto(int valor) {
        this.valor = valor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monto puntaje = (Monto) o;
        return valor == puntaje.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    Monto restarPrecio(Monto precioRestar) {
        return new Monto(this.valor - precioRestar.obtenerValor());
    }

    int obtenerValor(){
        return valor;
    }

    public boolean esMayor(Monto monto) {
        return monto.obtenerValor() > this.obtenerValor();
    }


}

