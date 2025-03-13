package cosas;

import java.util.Date;

public class Compra {

    private Usuario usuario;
    private Videojuego videojuego;
    private Date fechaCompra;
    private EstadoCompra estado;

    public Compra(Usuario usuario, Videojuego videojuego) {
        this.usuario = usuario;
        this.videojuego = videojuego;
    }

    public boolean confirmarCompra(){

    }
}
