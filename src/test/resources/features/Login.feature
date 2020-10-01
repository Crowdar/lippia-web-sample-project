Feature: Como Cliente, quiero ingresar las credenciales de mi cuenta, para ingresar al sitio de prueba

@Login
Scenario: El cliente inicia sesión en el sitio de compras
  Given el cliente se encuentra en la pagina Home
  When el cliente hace click en el boton SignIn
  Then el cliente verifica que fue redireccionado a la pantalla del login

  When el cliente ingresa su email: testing@testing.com
  And el cliente ingresa su password: testing123
  And el cliente hace click en el boton SignIn1
  Then el cliente verifica que fue redireccionado a la pantalla del My account

  When el cliente ingresa el nombre del producto: Faded Short Sleeve T-shirts
  And el cliente hace click en buscar
  Then el cliente verifica que fue redireccionado a la pantalla del Resultado de busqueda

  When el Cliente selecciona el producto
  Then el cliente verifica que fue redireccionado exitosamente a la pantalla del Producto

  When el cliente hace click en el botón Add to chart
  Then el cliente verifica que el producto se agregó al carrito

  When el cliente hace click en el boton Proceed
  Then el cliente verifica que fue redireccionado a la pantalla del Summary

  When el cliente hace click en el boton Proceed to checkout
  Then el cliente verifica que fue redireccionado a la pantalla del Address

  When el cliente valida el domicilio Buenos Aires 123 de la seccion Address
  And el cliente hace click en el boton Proceed to checkout1
  Then el cliente verifica que fue redireccionado a la pantalla del Shipping

  When el cliente hace click en el checkbox
  And el cliente hace click en el boton Proceed to checkbox2
  Then el cliente verifica que fue redireccionado a la pantalla del Payment

  When el cliente hace click en el boton Pay by bank
  Then el cliente verifica que fue redireccionado a la pantalla del BANK-WIRE-PAYMENT

  When el cliente hace click en el boton confirm my order
  Then el cliente verifica que su compra ha sido confirmada

















