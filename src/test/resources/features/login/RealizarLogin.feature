#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
############################################################################################################
## un ejemplo de Gherkin
#Feature: preparacion de un cafe
# Como empleado de un banco quiero tomar un cafe para mejorar mi rendimiento.

#Scenario: obtener un cafe con 3 cucharadas de azucar

#Given : Laa máquina está enchufada
#And: tiene cafe y leche.
#And: tiene vasos.
#And: tiene azucar

#When: selecciono la opción de cafe
# And: seleccionoo 3 cucharas de azucar

#Then la máquina sirve un vaso de cafe con tres de azucar.
#And: los valores del café, leche, azucar y vaso se actualizan
##############################################################################################################

Feature: Logarse Correctamente
Como usuario quiero logarme en la página de Amazon de forma correcta y de forma incorrecta
Scenario: Login correcto
Given yo como usuario quiero ingresar un correo electrónio válido en el campo "<correo>" 
And quiero ingresar un password válido en el campo "<password>"
When se hace click en el boton "<boton>"
Then debe aparecer el mensaje "<mensaje>"

Examples:
| correo                     | password           | boton          | mensaje     |
| marcoslateralus@gmail.com  | Tanin01081982      | iniciar sesion | Hola marcos |



