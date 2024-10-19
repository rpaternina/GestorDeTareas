package com.mycompany.gestortareas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestordTareas {

    private ArrayList<Tarea> listaTareas;

    public GestordTareas() {
        listaTareas = new ArrayList<>();
    }

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

    public void eliminarTarea(String titulo) {

        StringBuilder mostrar = new StringBuilder();
        boolean eliminarTareaEncontrada = false;
        try {
            
            for(int i = 0; i < listaTareas.size();i++){
                if(titulo.equalsIgnoreCase(listaTareas.get(i).getTitulo())){
                    listaTareas.remove(i);
                    eliminarTareaEncontrada = true;
                     JOptionPane.showMessageDialog(null, "Tarea eliminada con exito!");
                    break;
                }else{
                     JOptionPane.showMessageDialog(null, "No se elimino");
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

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
