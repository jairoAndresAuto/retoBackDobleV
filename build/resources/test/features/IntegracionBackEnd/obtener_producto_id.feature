#language: es
## jairo._garcia82122@elpoli.edu.co
Característica: Consultar producto
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el microservicio de prodcutos
  Con el fin de presentar un stack de pruebas referenciado a dicho servicio

  Escenario: obtener producto id
    Dado Procede a realizar el llamado del servicio de productos
    Cuando Se procede a consultar por el id 1
    Entonces Podemos observar el codigo 200

  Escenario: obtener producto id no creado
    Dado Procede a realizar el llamado del servicio de productos
    Cuando Se procede a consultar por el id 43555
    Entonces Podemos observar el codigo 200 con respuesta vacia