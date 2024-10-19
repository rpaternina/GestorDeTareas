
package com.mycompany.gestortareas;

public class Tarea {

    private String titulo;
    private String descripcion;
    private boolean estado;

    public Tarea() {
    }

    
    public Tarea(String titulo, String descripcion, boolean estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void agregarTareas(){
        
    }
    
    
    public String toString(){
        return "Titulo: " + titulo + "\n" + "Descripción: " + descripcion + "\n"+ "Estado " + estado;
    }

}
