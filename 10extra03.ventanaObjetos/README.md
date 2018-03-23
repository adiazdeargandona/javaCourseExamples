## Práctica Extra: Swing con Objetos
### Desarrollar una aplicación gráfica utilizando diferentes Layouts. Conocer la API de las clases más representativas del paquetes java.awt. Gestionar eventos de forma anónima.

##### Enunciado
Desarrollar un programa Java basado en Swing que permita la creación de objetos tipo Alumno a través de un interfaz gráfico.
Un alumno posee la siguiente información:
   - Nombre
   - Apellidos
   - Curso

En la parte superior de la ventana se mostrará el título "Gestión de Alumnos".
La ventana debe dar la opción al usuario de guardar la información del alumno y listar todos los alumnos introducidos a través de sendos botones.

##### Eventos a gestionar:
- Al pulsar la tecla <ENTER> sobre cada caja de texto, se pasará el foco a la siguiente. Si se pulsa sobre curso, equivaldrá a pulsar el botón guardar.
- Al pulsar la tecla <ESC> sobre las cajas de texto, se limpiará su texto. 
- Al hacer clic sobre el botón guardar, se encapsulará la información en una ocurrencia de la clase Alumno y se guardará en un ArrayList.
- Al hacer clic sobre el botón listar, se mostrará el contenido del Arraylist por la consola.
- Al intentar cerrar la ventana se preguntará al usuario mediante una ventana de diálogo del tipo JOptionPane si desea realmente salir.
 

##### Características de la aplicación:
- Las cajas de texto tendrán un color de fondo R:140, G:163, B:132 y el texto blanco.
- La fuente de las etiquetas será Arial 12pt Negrita.
- El cursor cambiará a una mano, cuando se posiciones el ratón encima de los botones.

![alt text](https://raw.githubusercontent.com/DavidContrerasICAI/javaCourseExamples/master/10extra03.ventanaObjetos/output.jpg)