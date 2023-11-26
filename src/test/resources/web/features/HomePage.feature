@HomePage
Feature: HomePage

  Background:
    Given El cliente se encutra en la home page de practice.automationtesting.in
    And Se dirige al Menu Tienda
    And Vuelve al Menu Inicio
    And Observa 3 Arrivals
    And Selecciona uno de los Arrivals
    And Observa la informacion del libro
    And Agrega el libro al carrito
    And Procede a pasar al detalle de compra del libro
    When Se ve el libro junto a los valores totales, siempre total < subtotal por los impuestos
    And Procede a realizar el pago que le llevara a la pasarela de pago

    @FormulariodeFacturacion
    Scenario: El cliente interactuar con el formulario de facturacion
      Then El cliente observa el formulario para agregar sus datos
      And Puede agregar un descuento a su compra

    @ConfirmaciondeCompra
    Scenario Outline: El cliente quire confirmar su compra
      Then El cliente rellena sus datos '<Nombre>' '<Apellido>' '<Empresa>' '<Email>' '<Telefono>' '<Pais>' '<Direccion>' '<Dpto>' '<Ciudad>' '<Provincia>' '<CP>' '<Nota>'
      And Confirmacion de compra
      And Detalle de lo comprado

      Examples:
        | Nombre | Apellido | Empresa        | Email           | Telefono  | Pais      | Direccion       | Dpto | Ciudad  | Provincia | CP   | Nota |
        | German | Jofre    | LegendSoftware | german@mail.com | 261277722 | Argentina | Calle falsa 123 | 2    | Mendoza | Mendoza   | 5500 | Nota |
