package interfaces;

import personas.Socio;

public interface IPrestable {

    void prestar(Socio s);

    void devolver();

    boolean estaPrestado();

}
