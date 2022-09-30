Feature: Logarse Mal
Como usuario quiero logarme en la página de Amazon de forma correcta y de forma incorrecta
Scenario: Login Incorrecto
Given yo como usuario quiero ingresar un correo electrónio válido en el campo "<correo>" 
And quiero ingresar un password válido en el campo "<password>"
When se hace click en el boton "<boton>"
Then debe aparecer el mensaje "<mensaje>"

Examples:
| correo                     | password           | boton          | mensaje     |
| marcoslateralus@gmail.com  | Tanin01081982      | iniciar sesion | Hola pepe |