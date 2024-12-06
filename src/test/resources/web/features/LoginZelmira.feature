@Login @Regression
Feature: Login

  @LoginExitoso @Smoke @Automated
  Scenario Outline: Login manual exitoso en Zelmira
    Given El usuario "<rol>" se encuentra en la página de Login de Zelmira
    When El usuario ingresa su email "<email>"
    And El usuario ingresa su contraseña "<password>"
    And El usuario hace clic en el botón Ingresar
    Then El usuario es redirigido a la vista "<view>"

    Examples:
      | rol 	   | email						     | password   | view 	   	    |
      | SuperAdmin | d.andresperalta@outlook.com     | Zelmira24$ | Dashboard       |
      | Admin      | danteandresperalta@gmail.com    | JNtK%ApD   | Dashboard 	    |
      | Docente    | meitiffoiyifou-8056@yopmail.com | O0eqYECf   | Dashboard 	    |
      | Alumno     | testingdevdap@gmail.com 		 | rjF4W7Yv   | Mi informacion  |


  @LoginExitoso @Automated
  Scenario Outline: Login exitoso recordando credenciales en Zelmira
    Given El usuario "<rol>" se encuentra en la página de Login de Zelmira
    When El usuario ingresa su email "<email>"
    And El usuario ingresa su contraseña "<password>"
    And El usuario hace click en el checkbox Recordar Contraseña
    And El usuario hace clic en el botón Ingresar
    Then El usuario es redirigido a la vista "<view>"

    Examples:
      | rol 	   | email						     | password   | view 	   	  |
      | SuperAdmin | d.andresperalta@outlook.com     | Zelmira24$ | Dashboard     |
      | Admin      | danteandresperalta@gmail.com    | JNtK%ApD   | Dashboard 	  |
      | Docente    | meitiffoiyifou-8056@yopmail.com | O0eqYECf   | Dashboard 	  |
      | Alumno     | testingdevdap@gmail.com 		 | rjF4W7Yv   | Mi informacion|