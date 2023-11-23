@HomePage
Feature: HomePage

  Background:
    Given El cliente se encutra en la home page de practice.automationtesting.in
    And Se dirige al Menu Tienda
    And Vuelve al Menu Inicio
    And Observa 3 Sliders
    And Se dirige a uno de los Arrivals
    And Observa el libro elegido
    And Agrega el libro a su cesta
    When Procede a pasar a la pagina de pago
    And El cliente ve los detalles de compra
    And Se ven los valores totales, siempre total < subtotal por los impuestos
    And Procede a realizar el pago que le llevara a la pasarela de pago

    @Proceso
    Scenario: Proceso de Compra
      Then El cliente observa el formulario para agregar sus datos y puede seleccionar por cualquier tipo de pago como transferencia bancaria directa, cheque, efectivo o paypal
      And Tiene la opcion de agregar cupones en la página de la pasarela de pago, tambien puede encontrar la facturacion, el pedido y detalles adicionales

    @Confirmacion
    Scenario Outline: Confirmacion de Compra
      Then El cliente rellena sus datos del formulario '<Nombre>' '<Apellido>' '<Empresa>' '<Email>' '<Telefono>' '<Pais>' '<Direccion>' '<Dpto>' '<Ciudad>' '<Provincia>' '<Codigo Postal>' '<Nota>'
      And Se confirma la compra

      Examples:
        | Nombre | Apellido | Empresa    | Email                       | Telefono   | Pais      | Direccion   | Dpto | Ciudad  | Provincia | Codigo Postal | Nota             |
        | German | Jofre    | LegendSoft | germancorreoprueba@gmailcom | 2612722777 | Argentina | Calle Falsa | N1   | Mendoza | Mendoza   | 5500          | Esto es una nota |

