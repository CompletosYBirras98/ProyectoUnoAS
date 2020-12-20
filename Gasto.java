package com.mycompany.proyectounoas;


public class Gasto {
    private String tipo;
    private int valor;
    private boolean pagado;

    public Gasto(String tipo, int valor, boolean pagado) {
        this.tipo = tipo;
        this.valor = valor;
        this.pagado = pagado;
    }

    public int getValor() {
        return valor;
    }
    
    
}
