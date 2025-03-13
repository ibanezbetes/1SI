package INTERFACES;

import cliente.Cliente;

public interface IAlquilable {

    void alquilar(Cliente c);

    void devolver();

    boolean estaAlquilado();

}
