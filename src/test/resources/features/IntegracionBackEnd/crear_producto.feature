#language: es
## jairo._garcia82122@elpoli.edu.co
Característica: crear producto
  Yo como QA deseo realizar el proceso de automatización de pruebas
  Para el microservicio de prodcutos
  Con el fin de presentar un stack de pruebas referenciado a dicho servicio

  Esquema del escenario:  Crear producto
    Dado Procede a realizar el llamado del servicio de productos
    Cuando Se procede a crear el producto
      | precio   |
      | <precio> |
    Entonces Podemos observar el codigo 200

    Ejemplos:
      | precio |
      | 20     |

  Esquema del escenario: crear producto con error
    Dado Procede a realizar el llamado del servicio de productos
    Cuando Se procede a crear el producto
      | precio   |
      | <precio> |
    Entonces Podemos observar el codigo 400

    Ejemplos:
      | precio |
      | B      |