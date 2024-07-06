import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoTest {

    @Test
    void casoDeUso1Test() {


        ArrayList<Entrada> entradasEsperadas = new ArrayList<>();

        // Entrada TipoA =  new TipoA(new Monto(600));
        Entrada TipoB = new TipoB(new Monto(1000));

        entradasEsperadas.add(TipoB);
        entradasEsperadas.add(TipoB);

        Tarjeta nuevaTarjeta = new PertenenciaH();

        Comprador nuevoComprador = new Comprador(nuevaTarjeta);

        nuevoComprador.comprarEntradas(TipoB);
        nuevoComprador.comprarEntradas(TipoB);



        assertEquals(entradasEsperadas, nuevoComprador.getEntradas());
    }

    @Test
    void casoDeUso2Test() {

        ArrayList<Entrada> entradasEsperadas = new ArrayList<>();

        Entrada TipoA =  new TipoA(new Monto(600));
        Entrada TipoB = new TipoB(new Monto(1000));

        entradasEsperadas.add(TipoA);
        entradasEsperadas.add(null);

        Tarjeta nuevaTarjeta = new Gold();

        Comprador nuevoComprador = new Comprador(nuevaTarjeta);

        nuevoComprador.comprarEntradas(TipoA);
        nuevoComprador.comprarEntradas(TipoA);

        assertEquals(entradasEsperadas, nuevoComprador.getEntradas());

        }

    @Test
    void casoDeUso3Test() {

        ArrayList<Entrada> entradasEsperadas = new ArrayList<>();

        Entrada TipoA =  new TipoA(new Monto(600));
        Entrada TipoB = new TipoB(new Monto(1000));

        entradasEsperadas.add(TipoB);
        entradasEsperadas.add(TipoB);
        entradasEsperadas.add(TipoA);
        entradasEsperadas.add(TipoA);

        Tarjeta nuevaTarjeta = new PertenenciaH();

        Comprador nuevoComprador = new Comprador(nuevaTarjeta);

        nuevoComprador.comprarEntradas(TipoB);
        nuevoComprador.comprarEntradas(TipoB);
        nuevoComprador.comprarEntradas(TipoA);
        nuevoComprador.comprarEntradas(TipoA);

        assertEquals(entradasEsperadas, nuevoComprador.getEntradas());

    }
}
