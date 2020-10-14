#language: es

Característica: Realizar compra en automationpractice

  Yo como usuario
  Quiero agregar productos al carrito
  Para finalizar la compra de los productos seleccionados

  Antecedentes:
    Dado que Diego inicia sesion en automationpractice
      | Usuario                | Clave     | NombreUsuario |
      | TestDiego101@gmail.com | Diego1234 | Diego Merchan |

  @RealizarCompra
  Escenario: Comprar prendas en automationpractice
    Dado que agrega los productos al carrito de compras
      | Producto                    | Cantidad | Talla |
      | Printed Dress               | 3        | L     |
      | Faded Short Sleeve T-shirts | 4        | M     |
      | Blouse                      | 1        | S     |
    Cuando observa el resumen de la compra
    Y realiza el proceso de pago
      | NombreUsuario | Empresa | Direccion         | MetodoPago |
      | Diego Merchan | SOFKA   | Cra 12 - 21 B 121 | Cheque     |
    Entonces observa el mensaje de compra exitosa
