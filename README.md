# Taylor Swift - Ejercicio de venta de entradas

## Descripción

Este proyecto es un ejercicio de Algoritmos 3 que modela la venta de entradas para un recital de Taylor Swift. Está diseñado para aprender y practicar los pilares de la programación orientada a objetos: abstracción, encapsulación, herencia y polimorfismo.

## Objetivo

Implementar un sistema sencillo donde un `Comprador` puede adquirir `Entrada`s usando diferentes tipos de `Tarjeta`. El comportamiento de compra depende del tipo de tarjeta utilizado, lo que permite explorar cómo el polimorfismo y la abstracción mejoran el diseño del software.

## Qué se aprende

- **Abstracción**: `Entrada` es una clase abstracta que representa el concepto general de una entrada.
- **Encapsulación**: `Monto` oculta el valor interno y expone operaciones como `restarPrecio` y `esMayor`.
- **Herencia**: `TipoA` y `TipoB` extienden `Entrada`, mostrando cómo construir variantes concretas.
- **Polimorfismo**: `Tarjeta` es una interfaz, y `Gold` y `PertenenciaH` implementan su comportamiento de compra de manera distinta.

## Estructura del proyecto

- `src/main/java/Comprador.java` - Administra las entradas compradas por un comprador.
- `src/main/java/Entrada.java` - Clase abstracta que representa una entrada general.
- `src/main/java/TipoA.java` - Entrada de tipo A.
- `src/main/java/TipoB.java` - Entrada de tipo B.
- `src/main/java/Tarjeta.java` - Interfaz para tarjetas de compra.
- `src/main/java/Gold.java` - Tarjeta con saldo y validación de compra.
- `src/main/java/PertenenciaH.java` - Tarjeta que siempre permite la compra.
- `src/main/java/Monto.java` - Valor de dinero usado para comparar y descontar precios.
- `src/main/java/org/example/Main.java` - Punto de entrada generado por Maven/IDE, usado como ejemplo básico.
- `src/test/java/CasosDeUsoTest.java` - Tests de JUnit que validan los escenarios de compra.

## Cómo ejecutar

1. Asegúrate de tener Java 11 y Maven instalados.
2. En la raíz del proyecto, ejecuta:

```bash
mvn test
```

3. Para compilar el proyecto sin ejecutar tests:

```bash
mvn package -DskipTests
```

## Casos de uso incluidos

Los tests modelan situaciones de compra como:

- Compra de entradas con una tarjeta de tipo `PertenenciaH`, que siempre devuelve la entrada.
- Compra con una tarjeta `Gold` que sólo permite comprar cuando hay saldo suficiente.
- Registro de entradas adquiridas por el `Comprador`.

## Notas

Este ejercicio no implementa una interfaz de usuario ni persistencia. Su foco está en construir un diseño de clases claro y en aprender conceptos de POO usando un dominio simple: venta de entradas.

---

### Autor

Ejercicio de Algoritmos 3 para aprender los pilares de la programación orientada a objetos.

