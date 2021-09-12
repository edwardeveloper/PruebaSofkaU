package com.mycompany.db;

public class Ronda {
    private int ronda;
    private Categoria categoria;

    public Ronda(int ronda, Categoria categoria) {
        this.ronda = ronda;
        this.categoria = categoria;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }    
}
