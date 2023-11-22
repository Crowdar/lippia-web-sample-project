@HomePage
Feature: HomePage

  Background:
    Given El cliente se dirige al Menu Tienda
    And Vuelve al Menu Inicio
    And Observa 3 Sliders
    And Se dirige a uno de los Arrivals
    And Observa el libro elegido
    And Agrega el libro a su cesta
    And El cliente ve agreado el libro con su precio
    When Se dirige a la cesta con el libro agregado
    And El cliente ve los detalles de compra
    And Procede a pasar a la pagina de pago
    And Ahora puede encontrar los valores total y subtotal
    And El total siempre < subtotal porque los impuestos se añaden en el subtotal
    And Procede a realizar el pago que le llevara a la pasarela de pago

    Scenario: Proceso de Compra
      Then El cliente observa el formulario para agregar sus datos y puede seleccionar por cualquier tipo de pago como transferencia bancaria directa, cheque, efectivo o paypal
      And Tiene la opcion de agregar cupones en la página de la pasarela de pago, tambien puede encontrar la facturacion, el pedido y detalles adicionales

    Scenario Outline: Confirmacion de Compra
      Then El cliente rellena sus datos del formulario '<Nombre>' '<Apellido>' '<Empresa>' '<Email>' '<Telefono>' '<Pais>' '<Direccion>' '<Dpto>' '<Ciudad>' '<Provincia>' '<Codigo Postal>' '<Nota>'
      And Se confirma la compra

      Examples:
        | Nombre | Apellido | Empresa    | Email                       | Telefono   | Pais      | Direccion   | Dpto | Ciudad  | Provincia | Codigo Postal | Nota             |
        | German | Jofre    | LegendSoft | germancorreoprueba@gmailcom | 2612722777 | Argentina | Calle Falsa | N°1  | Mendoza | Mendoza   | 5500          | Esto es una nota |

