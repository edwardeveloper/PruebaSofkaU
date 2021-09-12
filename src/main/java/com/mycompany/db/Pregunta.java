package com.mycompany.db;
import java.util.List; 

public class Pregunta {
    private String pregunta;
    private List<Respuesta> respuestas;

    public Pregunta(String pregunta, List<Respuesta> respuestas) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Respuesta getRespuestas(int pos) {
        return respuestas.get(pos);
    }
    
    public List<Respuesta> getRespuestasList() {
        return respuestas;
    }
    
    public void setRespuestas(Respuesta respuestas) {
        this.respuestas.add(respuestas);
    }
}

