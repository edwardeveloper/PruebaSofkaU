package com.mycompany.db;

import java.util.List;

public class Categoria {
    private int id;
    private String nombreCategoria;
    private String dificultad;
    private final List<Pregunta> pregunta;
    
    public Categoria(String nombreCategoria, String dificultad,int id,List<Pregunta> pregunta) {
        this.id = id;
        this.pregunta = pregunta;
        this.nombreCategoria = nombreCategoria;
        this.dificultad = dificultad; 
    }

    public Pregunta getPreguntaCategoria(int pos) {
        return pregunta.get(pos);
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
}

