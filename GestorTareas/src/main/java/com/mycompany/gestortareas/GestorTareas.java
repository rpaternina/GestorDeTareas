package com.mycompany.gestortareas;

import javax.swing.JOptionPane;

public class GestorTareas {

    public static void main(String[] args) {

        boolean salir = true;
        GestordTareas metodos = new GestordTareas();

        while (salir) {
            try {
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "GESTOR DE TAREAS \n"
                        + "1: Agregar nueva tarea \n"
                        + "2: Eliminar tarea \n"
                        + "3: Marcar tarea como completada \n"
                        + "4: Ver todas las tareas \n"
                        + "5: Buscar tarea por título \n"
                        + "6: Salir"));

                switch (menu) {

                    //agregar nueva tarea
                    case 1:

                        metodos.agregarTareas();
                        break;

                    //Eliminar tarea    
                    case 2:

                        try {
                            metodos.eliminarTarea(JOptionPane.showInputDialog(null, "Ingrese el titulo de la tarea"));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                        break;

                    //Marcar tarea como completada    
                    case 3:

                        break;

                    //Ver todas las tareas    
                    case 4:
                        metodos.mostrarTareas();
                        break;

                    //Buscar tarea por título    
                    case 5:
                        try {
                            metodos.buscarxTitulo(JOptionPane.showInputDialog(null, "Ingrese el titulo de la tarea"));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                        break;

                    //Salir    
                    case 6:
                        salir = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option 1-6");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }
}
