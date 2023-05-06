@Shop
Feature: Shop

Background: Precondiciones

    Given Hngreso a la web “http://practice.automationtesting.in/”

@Shop @PriceFilter       
Scenario Outline: Filtrar por precio con éxito

    When Hago click en botón "Shop" del topmenu
    And Se ajusta el filtro por valor entre "<PriceGilter>"
    And Hago click en el botón "Filter"
    Then Solo se deben mostrar los productos que se encuentren en el rango escogido.

    Examples:
        | Pricefilter | 
        | 150 a 325   |
        | 326 a 500   |
        | 240 a 410   |

@Shop @ProductCategories
Scenario Outline: Filtrar por categoria de productos con éxito.

    When Hago click en botón "Shop" del topmenu
    And Hago click en "<Categ>" del menú "Product Categories"
    Then Se muestran los productos pertenecientes a "<Categ>"

    Examples:
        | Categ      | 
        | Android    |
        | HTML       |
        | javaScript |
        | Selenium   |

@Shop @SortBy
Scenario Outline: Clasificar los productos por popularidad

    When Hago click en botón "Shop" del topmenu
    And Hago click en el menu desplegable "Default Sorting" y selecciono "<Sorting>"
    Then Se muestran los productos clasificados por "<Sorting>"

    Examples:
        | Sorting                       | 
        | Sort by Popularity            |
        | Sort by average rating        |
        | Sort by newness               |
        | Sort by Price: low to high    |
        | Sort by Price: high to low    |

@Shop @ReadMore
Scenario: Funcionalidad "Read More"

    When Hago click en botón "Shop" del topmenu
    And Hago click en el botón "Read More" del primer producto de la lista.
    Then Se muestra la pagina correspondiente al producto con la leyenda "Out of Stock"

@Shop @SaleTag
Scenario: Funcionalidad "Sale"

    When Hago click en botón "Shop" del topmenu
    And Hago click en el primer producto de la lista que tenga la etiqueta "Sale"
    Then Se muestra en la página del producto el precio antiguo tachado para los productos que posean la etiqueta "Sale" acompañado del precio actual.

@Shop @AddToBasketViaShopPage
Scenario Outline: Funcionalidad "Add to Basket" visualizando los productos por el botón "Basket" y finalizar compra
    When Hago click en botón "Shop" del topmenu
    And Hago click en el botón "Add to Basket" del primer producto de la lista de la sección "Shop" que lo tenga activo. 
    And Hago click en el botón con forma de carrito en la parte superior derecha
    Then Se muestra la lista de productos agregados, el subtotal, los impuestos y el total de los mismos.
    And Hago click en el botón "Proceed to Checkout" y se muestra el formulario de "Billing Details"
    And Se completa el formulario con los datos: First Name: "<FName>", Last Name: "<LName>", Company Name: "<CName>", Email Address: "<Mail>", Phone: "<Phone>", Country "<Country>", Address: "<Address>", Town/City: "<Town>", State/Country: "<State>", Postal/ZIP: "<ZIP>", Additional Information: "<AdInfo>"
    And Se selecciona el método de pago "<PayMethod>"
    And Se hace click en el botón "Place Order"
    Then Se muestra la página de "Order Detail"

    #Se toman todos éstos casos ya que se tuvo una visión más sobre el testing manual a la hora de escribir el gherkin, a la hora de automatizar se puede reducir a los 7/10 casos más relevante.

    Examples:
            | FName  | LName  | CName   | Mail             | Phone     | Country   | Address   | Town   | State  | ZIP    | AdInfo | PayMethod               |
            |        |        | @"!#$%  | Carlos@gmail.com |           | Argentina | @"!#$%    | CABA   |        | @"!#$% |        | Direct Bank Transfer    |
            |        | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina |           | @"!#$% | BS.AS  |        | Hola   | Check Payments          |
            |        | @"!#$% | Crowdar | Carlos@gmail.com |           | Argentina | Brown 427 |        | @"!#$% | @"!#$% |        | Check Payments          |
            |        |        | @"!#$%  | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   | BS.AS  |        | Hola   | Cash on Delivery        |
            |        | Perez  | Crowdar |                  | @"!#$%    | Argentina |           | @"!#$% | @"!#$% | 1648   |        | PayPal Express Checkout |
            | Carlos | @"!#$% | @"!#$%  |                  |           | Argentina | Brown 427 | CABA   | BS.AS  | 1648   |        | Direct Bank Transfer    |
            | Carlos | @"!#$% | @"!#$%  | Carlos.gmail.com | @"!#$%    | Argentina |           |        | BS.AS  | 1648   | Hola   | Check Payments          |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com |           | Argentina |           | CABA   |        | 1648   | Hola   | PayPal Express Checkout |
            | @"!#$% |        | @"!#$%  |                  | 4647-5969 | Argentina | Brown 427 | @"!#$% | BS.AS  | @"!#$% | Hola   | Direct Bank Transfer    |
            | @"!#$% | Perez  | @"!#$%  |                  | @"!#$%    | Argentina | Brown 427 |        | BS.AS  | @"!#$% |        | PayPal Express Checkout |
            | @"!#$% | @"!#$% |         | Carlos@gmail.com |           | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | Direct Bank Transfer    |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina | @"!#$%    |        | BS.AS  |        | Hola   | Cash on Delivery        |
            |        | Perez  | Crowdar |                  |           | Argentina | @"!#$%    | CABA   | BS.AS  |        | Hola   | Direct Bank Transfer    |
            |        | Perez  |         | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 |        |        | @"!#$% |        | Cash on Delivery        |
            |        | @"!#$% | Crowdar | Carlos@gmail.com |           | Argentina | @"!#$%    | CABA   | BS.AS  |        | Hola   | PayPal Express Checkout |
            |        |        | @"!#$%  | Carlos.gmail.com | 4647-5969 | Argentina |           | @"!#$% | @"!#$% | 1648   |        | Direct Bank Transfer    |
            |        | @"!#$% | Crowdar | Carlos@gmail.com |           | Argentina | @"!#$%    | @"!#$% | BS.AS  | 1648   |        | Cash on Delivery        |
            | Carlos | @"!#$% |         |                  | 4647-5969 | Argentina | @"!#$%    | @"!#$% |        | 1648   | Hola   | Check Payments          |
            | Carlos |        | Crowdar | Carlos@gmail.com | @"!#$%    | Argentina |           | CABA   | BS.AS  | @"!#$% |        | Cash on Delivery        |
            | Carlos | Perez  | @"!#$%  | Carlos.gmail.com |           | Argentina | Brown 427 | @"!#$% | @"!#$% |        | Hola   | PayPal Express Checkout |
            | Carlos | @"!#$% |         | Carlos@gmail.com | 4647-5969 | Argentina | @"!#$%    |        |        | 1648   |        | Direct Bank Transfer    |
            | Carlos | Perez  | Crowdar | Carlos.gmail.com | @"!#$%    | Argentina |           | CABA   | BS.AS  | @"!#$% | Hola   | Check Payments          |
            | Carlos | @"!#$% | @"!#$%  |                  |           | Argentina | Brown 427 | @"!#$% | @"!#$% |        | Hola   | Cash on Delivery        |
            | Carlos |        |         | Carlos@gmail.com | 4647-5969 | Argentina | @"!#$%    |        | BS.AS  | 1648   |        | PayPal Express Checkout |
            | Carlos | Perez  | Crowdar | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | @"!#$% | @"!#$% | Hola   | Direct Bank Transfer    |
            | Carlos | @"!#$% | @"!#$%  |                  | 4647-5969 | Argentina | @"!#$%    | @"!#$% |        |        |        | Check Payments          |
            | Carlos |        | Crowdar | Carlos@gmail.com | @"!#$%    | Argentina |           |        | BS.AS  | 1648   | Hola   | Cash on Delivery        |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 |        | @"!#$% |        | Hola   | Direct Bank Transfer    |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina | @"!#$%    | CABA   |        | 1648   |        | Check Payments          |
            | @"!#$% | Perez  |         | Carlos.gmail.com |           | Argentina | Brown 427 | @"!#$% | BS.AS  | @"!#$% | Hola   | Cash on Delivery        |
            | @"!#$% | @"!#$% | Crowdar |                  | 4647-5969 | Argentina | @"!#$%    |        | @"!#$% | 1648   |        | PayPal Express Checkout |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina |           | CABA   |        | @"!#$% | Hola   | Direct Bank Transfer    |
            | @"!#$% | @"!#$% |         | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 | @"!#$% | BS.AS  |        |        | Check Payments          |
            | @"!#$% |        | Crowdar |                  | @"!#$%    | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | Cash on Delivery        |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com |           | Argentina |           | @"!#$% |        | @"!#$% | Hola   | PayPal Express Checkout |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 |        | BS.AS  |        |        | Direct Bank Transfer    |
            | @"!#$% |        | @"!#$%  |                  | @"!#$%    | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | Check Payments          |
            | @"!#$% | Perez  |         | Carlos@gmail.com |           | Argentina |           | @"!#$% | BS.AS  | @"!#$% |        | Cash on Delivery        |
            |        |        |         |                  | @"!#$%    | Argentina | @"!#$%    | @"!#$% | BS.AS  | 1648   |        | Direct Bank Transfer    |
            |        | Perez  | Crowdar | Carlos@gmail.com | 4647-5969 | Argentina |           |        | @"!#$% | @"!#$% | Hola   | Check Payments          |
            |        | @"!#$% | @"!#$%  | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | BS.AS  |        |        | Cash on Delivery        |
            |        | Perez  |         |                  |           | Argentina | @"!#$%    | @"!#$% | @"!#$% | 1648   | Hola   | PayPal Express Checkout |
            |        | @"!#$% | Crowdar | Carlos@gmail.com | 4647-5969 | Argentina |           |        |        | @"!#$% |        | Direct Bank Transfer    |
            |        |        | @"!#$%  | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | BS.AS  | 1648   | Hola   | Check Payments          |
            |        | Perez  | Crowdar |                  |           | Argentina | @"!#$%    | @"!#$% | @"!#$% | @"!#$% |        | Cash on Delivery        |
            |        | @"!#$% | @"!#$%  | Carlos@gmail.com | 4647-5969 | Argentina | Brown 427 |        |        |        | Hola   | PayPal Express Checkout |
            |        |        |         | Carlos.gmail.com | @"!#$%    | Argentina | @"!#$%    | CABA   | BS.AS  | 1648   | Hola   | Direct Bank Transfer    |
            |        | Perez  | Crowdar | Carlos@gmail.com |           | Argentina |           | @"!#$% | @"!#$% | @"!#$% |        | Check Payments          |
            |        | @"!#$% | @"!#$%  | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 | CABA   |        |        | Hola   | Cash on Delivery        |
            | Carlos | Perez  | @"!#$%  |                  | 4647-5969 | Argentina | @"!#$%    |        | BS.AS  | @"!#$% | Hola   | Direct Bank Transfer    |
            | Carlos | @"!#$% |         | Carlos@gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | @"!#$% |        |        | Check Payments          |
            | Carlos | Perez  | Crowdar | Carlos.gmail.com |           | Argentina | @"!#$%    | @"!#$% |        | 1648   | Hola   | Cash on Delivery        |
            | Carlos | @"!#$% | @"!#$%  |                  | 4647-5969 | Argentina |           | CABA   | BS.AS  | @"!#$% |        | PayPal Express Checkout |
            | Carlos |        | Crowdar | Carlos@gmail.com | @"!#$%    | Argentina | Brown 427 | @"!#$% | @"!#$% |        | Hola   | Direct Bank Transfer    |
            | Carlos | Perez  | @"!#$%  | Carlos.gmail.com |           | Argentina | @"!#$%    |        | BS.AS  | 1648   |        | Check Payments          |
            | Carlos | @"!#$% |         | Carlos@gmail.com | 4647-5969 | Argentina |           | CABA   | @"!#$% | @"!#$% | Hola   | Cash on Delivery        |
            | Carlos |        | Crowdar | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | @"!#$% |        | 1648   |        | PayPal Express Checkout |
            | Carlos | @"!#$% |         | Carlos@gmail.com | @"!#$%    | Argentina |           | CABA   | @"!#$% |        | Hola   | Check Payments          |
            | Carlos |        | Crowdar | Carlos.gmail.com |           | Argentina | Brown 427 | @"!#$% |        | 1648   |        | Cash on Delivery        |
            | @"!#$% | @"!#$% | Crowdar |                  | @"!#$%    | Argentina |           | @"!#$% | BS.AS  |        |        | Direct Bank Transfer    |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com |           | Argentina | Brown 427 |        | @"!#$% | 1648   | Hola   | Check Payments          |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   |        | @"!#$% |        | Cash on Delivery        |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina |           | @"!#$% | BS.AS  |        | Hola   | PayPal Express Checkout |
            | @"!#$% | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 |        | @"!#$% | 1648   |        | Direct Bank Transfer    |
            | @"!#$% | @"!#$% | Crowdar |                  | @"!#$%    | Argentina | @"!#$%    | CABA   |        | @"!#$% | Hola   | Check Payments          |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com |           | Argentina | Brown 427 | @"!#$% | BS.AS  |        |        | Cash on Delivery        |
            | @"!#$% | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | PayPal Express Checkout |
            | @"!#$% | @"!#$% | Crowdar |                  | @"!#$%    | Argentina |           | @"!#$% | BS.AS  | @"!#$% |        | Direct Bank Transfer    |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com |           | Argentina | Brown 427 |        | @"!#$% | 1648   | Hola   | Check Payments          |
            | @"!#$% | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   |        | @"!#$% | Hola   | Cash on Deliver         |

@Shop @AddToBasketViaProductPage
Scenario Outline: Funcionalidad "Add to Basket" visualizando los productos por la pagina de producto y finalización de compra.
    When Hago click en botón "Shop" del topmenu
    And Hago click en el primer producto de la lista que tenga el botón "Add to Basket" activo.
    And Hago click en el botón "Add to Basket" en la página del producto seleccionado.
    And Clickeo el botón "View Baket"
    Then Se muestra la lista de productos agregados, el subtotal, los impuestos y el total de los mismos.
    And Hago click en el botón "Proceed to Checkout" y se muestra el formulario de "Billing Details"
    And Se completa el formulario con los datos: First Name: "<FName>", Last Name: "<LName>", Company Name: "<CName>", Email Address: "<Mail>", Phone: "<Phone>", Country "<Country>", Address: "<Address>", Town/City: "<Town>", State/Country: "<State>", Postal/ZIP: "<ZIP>", Additional Information: "<AdInfo>"
    And Se selecciona el método de pago "<PayMethod>"
    Then Se muestra la página de "Order Detail"

    #Se toman todos éstos casos ya que se tuvo una visión más sobre el testing manual a la hora de escribir el gherkin, a la hora de automatizar se puede reducir a los 7/10 casos más relevante.

    Examples:
            | FName  | LName  | CName   | Mail             | Phone     | Country   | Address   | Town   | State  | ZIP    | AdInfo | PayMethod               |
            |        |        | @"!#$%  | Carlos@gmail.com |           | Argentina | @"!#$%    | CABA   |        | @"!#$% |        | Direct Bank Transfer    |
            |        | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina |           | @"!#$% | BS.AS  |        | Hola   | Check Payments          |
            |        | @"!#$% | Crowdar | Carlos@gmail.com |           | Argentina | Brown 427 |        | @"!#$% | @"!#$% |        | Check Payments          |
            |        |        | @"!#$%  | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   | BS.AS  |        | Hola   | Cash on Delivery        |
            |        | Perez  | Crowdar |                  | @"!#$%    | Argentina |           | @"!#$% | @"!#$% | 1648   |        | PayPal Express Checkout |
            | Carlos | @"!#$% | @"!#$%  |                  |           | Argentina | Brown 427 | CABA   | BS.AS  | 1648   |        | Direct Bank Transfer    |
            | Carlos | @"!#$% | @"!#$%  | Carlos.gmail.com | @"!#$%    | Argentina |           |        | BS.AS  | 1648   | Hola   | Check Payments          |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com |           | Argentina |           | CABA   |        | 1648   | Hola   | PayPal Express Checkout |
            | @"!#$% |        | @"!#$%  |                  | 4647-5969 | Argentina | Brown 427 | @"!#$% | BS.AS  | @"!#$% | Hola   | Direct Bank Transfer    |
            | @"!#$% | Perez  | @"!#$%  |                  | @"!#$%    | Argentina | Brown 427 |        | BS.AS  | @"!#$% |        | PayPal Express Checkout |
            | @"!#$% | @"!#$% |         | Carlos@gmail.com |           | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | Direct Bank Transfer    |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina | @"!#$%    |        | BS.AS  |        | Hola   | Cash on Delivery        |
            |        | Perez  | Crowdar |                  |           | Argentina | @"!#$%    | CABA   | BS.AS  |        | Hola   | Direct Bank Transfer    |
            |        | Perez  |         | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 |        |        | @"!#$% |        | Cash on Delivery        |
            |        | @"!#$% | Crowdar | Carlos@gmail.com |           | Argentina | @"!#$%    | CABA   | BS.AS  |        | Hola   | PayPal Express Checkout |
            |        |        | @"!#$%  | Carlos.gmail.com | 4647-5969 | Argentina |           | @"!#$% | @"!#$% | 1648   |        | Direct Bank Transfer    |
            |        | @"!#$% | Crowdar | Carlos@gmail.com |           | Argentina | @"!#$%    | @"!#$% | BS.AS  | 1648   |        | Cash on Delivery        |
            | Carlos | @"!#$% |         |                  | 4647-5969 | Argentina | @"!#$%    | @"!#$% |        | 1648   | Hola   | Check Payments          |
            | Carlos |        | Crowdar | Carlos@gmail.com | @"!#$%    | Argentina |           | CABA   | BS.AS  | @"!#$% |        | Cash on Delivery        |
            | Carlos | Perez  | @"!#$%  | Carlos.gmail.com |           | Argentina | Brown 427 | @"!#$% | @"!#$% |        | Hola   | PayPal Express Checkout |
            | Carlos | @"!#$% |         | Carlos@gmail.com | 4647-5969 | Argentina | @"!#$%    |        |        | 1648   |        | Direct Bank Transfer    |
            | Carlos | Perez  | Crowdar | Carlos.gmail.com | @"!#$%    | Argentina |           | CABA   | BS.AS  | @"!#$% | Hola   | Check Payments          |
            | Carlos | @"!#$% | @"!#$%  |                  |           | Argentina | Brown 427 | @"!#$% | @"!#$% |        | Hola   | Cash on Delivery        |
            | Carlos |        |         | Carlos@gmail.com | 4647-5969 | Argentina | @"!#$%    |        | BS.AS  | 1648   |        | PayPal Express Checkout |
            | Carlos | Perez  | Crowdar | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | @"!#$% | @"!#$% | Hola   | Direct Bank Transfer    |
            | Carlos | @"!#$% | @"!#$%  |                  | 4647-5969 | Argentina | @"!#$%    | @"!#$% |        |        |        | Check Payments          |
            | Carlos |        | Crowdar | Carlos@gmail.com | @"!#$%    | Argentina |           |        | BS.AS  | 1648   | Hola   | Cash on Delivery        |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 |        | @"!#$% |        | Hola   | Direct Bank Transfer    |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina | @"!#$%    | CABA   |        | 1648   |        | Check Payments          |
            | @"!#$% | Perez  |         | Carlos.gmail.com |           | Argentina | Brown 427 | @"!#$% | BS.AS  | @"!#$% | Hola   | Cash on Delivery        |
            | @"!#$% | @"!#$% | Crowdar |                  | 4647-5969 | Argentina | @"!#$%    |        | @"!#$% | 1648   |        | PayPal Express Checkout |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina |           | CABA   |        | @"!#$% | Hola   | Direct Bank Transfer    |
            | @"!#$% | @"!#$% |         | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 | @"!#$% | BS.AS  |        |        | Check Payments          |
            | @"!#$% |        | Crowdar |                  | @"!#$%    | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | Cash on Delivery        |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com |           | Argentina |           | @"!#$% |        | @"!#$% | Hola   | PayPal Express Checkout |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 |        | BS.AS  |        |        | Direct Bank Transfer    |
            | @"!#$% |        | @"!#$%  |                  | @"!#$%    | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | Check Payments          |
            | @"!#$% | Perez  |         | Carlos@gmail.com |           | Argentina |           | @"!#$% | BS.AS  | @"!#$% |        | Cash on Delivery        |
            |        |        |         |                  | @"!#$%    | Argentina | @"!#$%    | @"!#$% | BS.AS  | 1648   |        | Direct Bank Transfer    |
            |        | Perez  | Crowdar | Carlos@gmail.com | 4647-5969 | Argentina |           |        | @"!#$% | @"!#$% | Hola   | Check Payments          |
            |        | @"!#$% | @"!#$%  | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | BS.AS  |        |        | Cash on Delivery        |
            |        | Perez  |         |                  |           | Argentina | @"!#$%    | @"!#$% | @"!#$% | 1648   | Hola   | PayPal Express Checkout |
            |        | @"!#$% | Crowdar | Carlos@gmail.com | 4647-5969 | Argentina |           |        |        | @"!#$% |        | Direct Bank Transfer    |
            |        |        | @"!#$%  | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | BS.AS  | 1648   | Hola   | Check Payments          |
            |        | Perez  | Crowdar |                  |           | Argentina | @"!#$%    | @"!#$% | @"!#$% | @"!#$% |        | Cash on Delivery        |
            |        | @"!#$% | @"!#$%  | Carlos@gmail.com | 4647-5969 | Argentina | Brown 427 |        |        |        | Hola   | PayPal Express Checkout |
            |        |        |         | Carlos.gmail.com | @"!#$%    | Argentina | @"!#$%    | CABA   | BS.AS  | 1648   | Hola   | Direct Bank Transfer    |
            |        | Perez  | Crowdar | Carlos@gmail.com |           | Argentina |           | @"!#$% | @"!#$% | @"!#$% |        | Check Payments          |
            |        | @"!#$% | @"!#$%  | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 | CABA   |        |        | Hola   | Cash on Delivery        |
            | Carlos | Perez  | @"!#$%  |                  | 4647-5969 | Argentina | @"!#$%    |        | BS.AS  | @"!#$% | Hola   | Direct Bank Transfer    |
            | Carlos | @"!#$% |         | Carlos@gmail.com | @"!#$%    | Argentina | Brown 427 | CABA   | @"!#$% |        |        | Check Payments          |
            | Carlos | Perez  | Crowdar | Carlos.gmail.com |           | Argentina | @"!#$%    | @"!#$% |        | 1648   | Hola   | Cash on Delivery        |
            | Carlos | @"!#$% | @"!#$%  |                  | 4647-5969 | Argentina |           | CABA   | BS.AS  | @"!#$% |        | PayPal Express Checkout |
            | Carlos |        | Crowdar | Carlos@gmail.com | @"!#$%    | Argentina | Brown 427 | @"!#$% | @"!#$% |        | Hola   | Direct Bank Transfer    |
            | Carlos | Perez  | @"!#$%  | Carlos.gmail.com |           | Argentina | @"!#$%    |        | BS.AS  | 1648   |        | Check Payments          |
            | Carlos | @"!#$% |         | Carlos@gmail.com | 4647-5969 | Argentina |           | CABA   | @"!#$% | @"!#$% | Hola   | Cash on Delivery        |
            | Carlos |        | Crowdar | Carlos.gmail.com | @"!#$%    | Argentina | Brown 427 | @"!#$% |        | 1648   |        | PayPal Express Checkout |
            | Carlos | @"!#$% |         | Carlos@gmail.com | @"!#$%    | Argentina |           | CABA   | @"!#$% |        | Hola   | Check Payments          |
            | Carlos |        | Crowdar | Carlos.gmail.com |           | Argentina | Brown 427 | @"!#$% |        | 1648   |        | Cash on Delivery        |
            | @"!#$% | @"!#$% | Crowdar |                  | @"!#$%    | Argentina |           | @"!#$% | BS.AS  |        |        | Direct Bank Transfer    |
            | @"!#$% | Perez  | @"!#$%  | Carlos@gmail.com |           | Argentina | Brown 427 |        | @"!#$% | 1648   | Hola   | Check Payments          |
            | @"!#$% | @"!#$% | Crowdar | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   |        | @"!#$% |        | Cash on Delivery        |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com | @"!#$%    | Argentina |           | @"!#$% | BS.AS  |        | Hola   | PayPal Express Checkout |
            | @"!#$% | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina | Brown 427 |        | @"!#$% | 1648   |        | Direct Bank Transfer    |
            | @"!#$% | @"!#$% | Crowdar |                  | @"!#$%    | Argentina | @"!#$%    | CABA   |        | @"!#$% | Hola   | Check Payments          |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com |           | Argentina | Brown 427 | @"!#$% | BS.AS  |        |        | Cash on Delivery        |
            | @"!#$% | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   | @"!#$% | 1648   | Hola   | PayPal Express Checkout |
            | @"!#$% | @"!#$% | Crowdar |                  | @"!#$%    | Argentina |           | @"!#$% | BS.AS  | @"!#$% |        | Direct Bank Transfer    |
            | @"!#$% |        | @"!#$%  | Carlos@gmail.com |           | Argentina | Brown 427 |        | @"!#$% | 1648   | Hola   | Check Payments          |
            | @"!#$% | Perez  |         | Carlos.gmail.com | 4647-5969 | Argentina | @"!#$%    | CABA   |        | @"!#$% | Hola   | Cash on Deliver         |

@Shop @TaxFunctionality
Scenario Outline: Agregar producto al carro y visualizar los impuestos correctamente
    When Hago click en botón "Shop" del topmenu
    And Hago click en el botón "Add to Basket" del primer producto de la lista de la sección "Shop" que lo tenga activo. 
    And Hago click en el botón con forma de carrito en la parte superior derecha
    Then Se muestra la lista de productos agregados, el subtotal, los impuestos y el total de los mismos.
    And Hago click en el botón "Proceed to Checkout" y se muestra el formulario de "Billing Details"
    And Completo el formulario seleccionando en: Country "<Country>"
    Then Se muestra que el impuesto para "<Country>" es del "<Tax>"

    Examples:
            | Country | Tax |
            | India   | 2%  |
            | Otro    | 5°  |