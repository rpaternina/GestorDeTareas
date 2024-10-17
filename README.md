
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestor de Tareas - README</title>
</head>
<body>
    <h1>Gestor de Tareas (To-Do List)</h1>
    <p>Este proyecto es un sistema de gestión de tareas que permite a los usuarios agregar, eliminar, marcar como completadas y buscar tareas de manera sencilla y eficiente.</p>

<h2>Características</h2>
    <ul>
        <li>Agregar tareas con título y descripción.</li>
        <li>Eliminar tareas.</li>
        <li>Marcar tareas como completadas.</li>
        <li>Mostrar todas las tareas.</li>
        <li>Buscar tareas por título.</li>
        <li>Interfaz de usuario simple y fácil de usar.</li>
    </ul>

<h2>Clases Implementadas</h2>

<h3>1. Clase <code>Tarea</code></h3>
    <ul>
        <li><strong>Atributos:</strong>
            <ul>
                <li><code>titulo</code> (String)</li>
                <li><code>descripcion</code> (String)</li>
                <li><code>estado</code> (boolean)</li>
            </ul>
        </li>
        <li><strong>Métodos:</strong>
            <ul>
                <li><code>Tarea(String titulo, String descripcion)</code></li>
                <li><code>getTitulo()</code></li>
                <li><code>getDescripcion()</code></li>
                <li><code>isEstado()</code></li>
                <li><code>marcarComoCompleta()</code></li>
                <li><code>toString()</code></li>
            </ul>
        </li>
    </ul>

<h3>2. Clase <code>GestorTareas</code></h3>
    <ul>
        <li><strong>Atributos:</strong>
            <ul>
                <li><code>listaTareas</code> (ArrayList<Tarea>)</li>
            </ul>
        </li>
        <li><strong>Métodos:</strong>
            <ul>
                <li><code>agregarTarea(Tarea tarea)</code></li>
                <li><code>eliminarTarea(int indice)</code></li>
                <li><code>marcarTareaComoCompleta(int indice)</code></li>
                <li><code>mostrarTareas()</code></li>
                <li><code>buscarTarea(String termino)</code></li>
            </ul>
        </li>
    </ul>

<h2>Flujo de Interacción</h2>
    <p>Al iniciar la aplicación, el usuario verá un menú con las opciones disponibles. Podrá agregar tareas, eliminar tareas, marcarlas como completadas y buscar tareas específicas. El usuario puede salir del sistema en cualquier momento.</p>

<h2>Instalación y Ejecución</h2>
    <ol>
        <li>Clona este repositorio en tu máquina local.</li>
        <li>Abre el proyecto en tu entorno de desarrollo Java preferido.</li>
        <li>Compila y ejecuta el programa.</li>
    </ol>

<h2>Contribuciones</h2>
    <p>Las contribuciones son bienvenidas. Si deseas contribuir, por favor crea un fork del repositorio y envía un pull request con tus cambios.</p>

<h2>Licencia</h2>
    <p>Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más información.</p>

<h2>Información de Contacto</h2>
    <p><strong>Correo:</strong> <a href="mailto:paterninayolir@gmail.com">paterninayolir@gmail.com</a></p>
    <p><strong>LinkedIn:</strong> <a href="https://www.linkedin.com/in/robert-paternina/" target="_blank">Robert Paternina</a></p>
    <p><strong>GitHub:</strong> <a href="https://github.com/rpaternina" target="_blank">rpaternina</a></p>

<footer>
        <p>&copy; 2024 Robert Paternina. Todos los derechos reservados.</p>
    </footer>
</body>
</html>
