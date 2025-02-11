# Serenity BDD project using Cucumber and Screenplay 

Es un proyecto de back, para validar los conceptos tecnicos y las buenas practicas de programación

### Prerequisites
* Java 17 installed
* Gradle  (Suggested version 7.5.1)
* IDE installed (Suggested IntelliJ IDEA 2022.2)

### Como instalarlo
* Instrucciones de instalacion
Realizar la clonacion del proyecto con el comando git clone https://github.com/jairoAndresAuto/retoBackDobleV.git <br>
Abrir intellij IDEA y abrir el proyecto


### Ejecución de pruebas

Abrir el archivo readme y dar clic en el boton play

ejecutar casos de prueba<br>
`gradle clean test -Dcucumber.filter.tags=@BACKEND`

### Descripcion de las pruebas automatizadas

Los escenarios de back son los de crear producto, obtener producto categoria y obtener producto id, cada uno de los escenarios tiene el happy paths como el Unhappy paths. tambien tiene una data variable que es generada con data faker.

### Estructura del Proyecto:

[src/main/java/co/com/practica/doblev/interactions]() - consumo de los servicios de back <br>
[src/main/java/co/com/practica/doblev/questions]() - Aserciones de las pruebas. <br>
[src/main/java/co/com/practica/doblev/task]() - que ejecutan las tareas de las pruebas. <br>
[src/main/java/co/com/practica/doblev/util]() - Clase de utilidades genericas del proyecto <br>

[src/test/java/co/com/practica/doblev/runners]() - Clases para ejecutar los test <br>
[src/test/java/co/com/practica/doblev/stepdefinitions]() - Son la traducción de los features a código <br>
[src/test/resources/features]() - Historias de usuario que se llevarán a cabo en las pruebas <br>


### Generación de Reportes:

target/site/serenity/index.html - este es el archivo que se debe abrir para revisar los reportes de ejecucion


### Pruebas en CI/CD: <br>


### Contribución y Contacto:

[jairo_garcia82122@elpoli.edu.co](mailto:jairo_garcia82122@elpoli.edu.co)


 
