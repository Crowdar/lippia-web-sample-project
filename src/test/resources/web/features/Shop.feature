@Shop
Feature: Shop

  Background:
    Given El cliente se encutra en la home page de practice.automationtesting.in
    And Se dirige al Menu Tienda
    And Seleciona un libro
    And Observa el precio del producto en el carrito
    And Procede a pasar al detalle de compra del libro
    When Se ve el libro junto a los valores totales, siempre total < subtotal por los impuestos
    And Procede a realizar el pago que le llevara a la pasarela de pago

  @ConfirmaciondeCompraDesdeShop
  Scenario Outline: El cliente quire confirmar su compra
    Then El cliente rellena sus datos '<Nombre>' '<Apellido>' '<Empresa>' '<Email>' '<Telefono>' '<Pais>' '<Direccion>' '<Dpto>' '<Ciudad>' '<Provincia>' '<CP>' '<Nota>'
    And Confirmacion de compra
    And Detalle de lo comprado

    Examples:
      | Nombre | Apellido | Empresa        | Email           | Telefono  | Pais      | Direccion       | Dpto | Ciudad  | Provincia | CP   | Nota |
      | German | Jofre    | LegendSoftware | german@mail.com | 261277722 | Argentina | Calle falsa 123 | 2    | Mendoza | Mendoza   | 5500 | Nota |

  @Impuestos
  Scenario Outline: El cliente observa diferentes impuestos
    Then Ingresa un pais '<Pais>' observa diferente impuestos '<Impuesto>' segun pais

    Examples:
      | Pais  | Impuesto |
      | India | 2        |