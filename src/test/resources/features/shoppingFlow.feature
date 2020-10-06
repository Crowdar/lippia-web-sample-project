Feature: Como cliente quiero

  @Smoke @Regresion @ShoppingFlow
  Scenario Outline: El cliente se logea, va al home, selecciona distintos productos para comprar y pasa por distintas ventanas hasta finalizar el proceso de compra.
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón 'Sign in'
    Then el cliente verifica que fue redireccionado a la pantalla de 'AUTHENTICATION'

    When el cliente ingresa su email '<email>'
    And  el cliente ingresa su password '<password>'
    And  el cliente hace click en el botón 'Sign in'
    Then el cliente verifica que fue redireccionado a la pantalla de 'MY ACCOUNT'

    When el cliente hace click en la categoría '<category>'
    Then el cliente verifica que fue redireccionado a la pantalla de '<category>'

    When el cliente selecciona el artículo '<nomArticulo>'
    Then el cliente verifica que fue redireccionado a la pantalla de 'ARTICLE PREFERENCES'

    When el cliente selecciona la talla '<size>'
    And  el cliente selecciona la cantidad '<quantity>'
    And  el cliente selecciona el color '<color>'
    And el cliente hace click en el botón 'Add to cart'
    And el cliente hace click en el botón 'Proceed to checkout'
    Then el cliente verifica que fue redireccionado a la pantalla de 'SHOPPING-CART SUMMARY'

    When el cliente hace click en el botón 'Proceed to checkout'
    Then el cliente verifica que fue redireccionado a la pantalla de 'ADDRESSES'

    When el cliente hace click en el botón 'Proceed to checkout'
    Then el cliente verifica que fue redireccionado a la pantalla de 'SHIPPING'

    When el cliente acepta los términos y condiciones
    And  el cliente hace click en el botón 'Proceed to checkout'
    Then el cliente verifica que fue redireccionado a la pantalla de 'PLEASE CHOOSE YOUR PAYMENT METHOD'

    When el cliente elige el método de pago '<paymentMethod>'
    Then el cliente verifica que fue redireccionado a la pantalla de 'ORDER SUMMARY'

    When el cliente hace click en el botón 'I confirm my order'
    Then el cliente verifica que fue redireccionado a la pantalla de 'ORDER CONFIRMATION'





    Examples:
      | email                           | password | category | nomArticulo                 | size | quantity | color  | paymentMethod |
      | testing.crowdar@testing.net.com | 12345    | WOMEN    | Blouse                      | L    | 3        | Orange | check         |
      | testing.crowdar@testing.net.com | 12345    | DRESSES  | Printed Dress               | S    | 20       | Blue   | bank wire     |
      | testing.crowdar@testing.net.com | 12345    | T-SHIRTS | Faded Short Sleeve T-shirts | M    | 7        | Blue   | check         |
