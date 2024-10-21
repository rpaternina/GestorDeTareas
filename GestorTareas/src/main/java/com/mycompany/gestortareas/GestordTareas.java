package com.mycompany.gestortareas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestordTareas {

    private ArrayList<Tarea> listaTareas;

    public GestordTareas() {
        listaTareas = new ArrayList<>();
    }

    
    //Metodo para agregat tareas en el ArrayList
    public void agregarTareas() {

        boolean salir = true;
        boolean datosGuardados = true;
        while (salir) {
            try {
                String titulo = JOptionPane.showInputDialog(null, "Ingrese un titulo");
                String descripcion = JOptionPane.showInputDialog(null, "Ingrese una descripcion");

                if (datosGuardados) {
                    Tarea nuevaTarea = new Tarea(titulo, descripcion);
                    listaTareas.add(nuevaTarea);
                    JOptionPane.showMessageDialog(null, "Guardado con exito!");
                    salir = false;
                    break;
                } else {

                    JOptionPane.showMessageDialog(null, "Error al guardar los datos");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    //Metodo para eliminar una tarea
    public void eliminarTarea(String titulo) {

        StringBuilder mostrar = new StringBuilder();

        boolean eliminarTareaEncontrada = false;

        try {
            if (!listaTareas.isEmpty()) {

                for (int i = 0; i < listaTareas.size(); i++) {

                    if (titulo.equalsIgnoreCase(listaTareas.get(i).getTitulo())) {
                        listaTareas.remove(i);
                        eliminarTareaEncontrada = true;
                        JOptionPane.showMessageDialog(null, "Tarea eliminada con exito!");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se elimino");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lista vacia");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    //Metodo para buscar por titulo las tareas
    public void buscarxTitulo(String titulo) {

        StringBuilder titulos = new StringBuilder();

        if (!listaTareas.isEmpty()) {
            for (Tarea buscarTitulo : listaTareas) {
                if (titulo.equalsIgnoreCase(buscarTitulo.getTitulo())) {
                    titulos.append("Titulo: ").append(buscarTitulo.getTitulo()).append("\n")
                            .append("Descripción: ").append(buscarTitulo.getDescripcion());
                }
            }

            JOptionPane.showMessageDialog(null, "TAREAS \n" + titulos.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia!");
        }

    }

    public void mostrarTareas() {
        StringBuilder mostrar = new StringBuilder();
        for (Tarea mostrarTareas : listaTareas) {
            mostrar.append(mostrarTareas.datosTarea());
        }
        JOptionPane.showMessageDialog(null, mostrar.toString());
    }

}
