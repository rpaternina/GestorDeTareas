package com.mycompany.gestortareas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tarea {

    private String titulo;
    private String descripcion;
    private boolean estado;

    public Tarea() {}
    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
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
       

    public String datosTarea() {
        
        return  "Titulo: " + titulo + "\n" + "Descripción: " + descripcion + "\n" + "Estado: " + estado + "\n" +
                "---------------------------" + "\n";
                
    }

}
