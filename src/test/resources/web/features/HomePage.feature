@Homepage 
Feature: HomePage

COMO usuario de la web
QUIERO visualizar todos los productos disponibles en la web
PARA seleccionar productos

Background: 

    Given Ingreso a la web “http://practice.automationtesting.in/”

@Slider    
Scenario: Solo 3 sliders en la página principal

    When Hago click en las flechas de los "Sliders"
    Then Verifico que solo haya 3 imagenes en los "Sliders"

@Arrivals
Scenario: Solo 3 arrivals en la página principal

    When Navego hasta la sección "New Arrivals"
    Then Solo se muestran tres imagenes en "New arrivals" de la página principal.

@ArrivalsNavigate
Scenario: Las imagenes de la sección "arrivals" deben ser interactivas.

    When Navego hasta la sección "New Arrivals"
    And Hago click en la primera imagen de la sección "New Arrivals"
    Then Se muestran en la página del producto y se debe mostrar el botón de "Add to basket".
    
    //And Si hay stock se debe mostrar el botón de "Add to basket".//

@Arrivals @Descripcion
Scenario: Descripción en los productos de la sección "New Arrivals"

    When Navego hasta la sección "New Arrivals"
    And Hago click en la primera imagen de la sección "New Arrivals"
    And Hago click en la sección "Description" del producto
    Then Se muestra la descripción correspondiente al producto que estoy visualizando.

@Arrivals @Reseña
Scenario: Reseñas en los productos de la sección "New Arrivals"

    When Navego hasta la sección "New Arrivals"
    And Hago click en la primera imagen de la sección "New Arrivals"
    And Hago click en la sección "Reviews" del producto
    Then Se muestran las reseñas correspondiente al producto que estoy visualizando.