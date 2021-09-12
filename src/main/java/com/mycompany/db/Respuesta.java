package com.mycompany.db;

public class Respuesta {
   // private int idRespuesta;
    private String posibleRespuesta;
    private boolean respuestasCorrecta;

    public Respuesta(String posibleRespuesta, boolean respuestas) {
       // this.idRespuesta = idRespuesta;
        this.posibleRespuesta = posibleRespuesta;
        this.respuestasCorrecta = respuestas;
    }

    public String getPosibleRespuesta() {
        return posibleRespuesta;
    }

    public void setPosibleRespuesta(String posibleRespuesta) {
        this.posibleRespuesta = posibleRespuesta;
    }

    public boolean getRespuestasCorrecta() {
        return respuestasCorrecta;
    }

    public void setRespuestasCorrecta(boolean respuestasCorrecta) {
        this.respuestasCorrecta = respuestasCorrecta;
    }
}
