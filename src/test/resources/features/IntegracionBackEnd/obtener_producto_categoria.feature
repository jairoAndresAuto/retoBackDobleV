#language: es
## jairo._garcia82122@elpoli.edu.co
Característica: Consultar productos
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el microservicio de prodcutos
  Con el fin de presentar un stack de pruebas referenciado a dicho servicio

  Escenario: Consultar producto categoria
    Dado Procede a realizar el llamado del servicio de productos
    Cuando Se procede a consultar la categoria "electronics"
    Entonces Podemos observar el codigo 200

  Escenario: Consultar producto categoria no encontrado
    Dado Procede a realizar el llamado del servicio de productos
    Cuando Se procede a consultar la categoria "electronicos"
    Entonces Podemos observar el codigo 200