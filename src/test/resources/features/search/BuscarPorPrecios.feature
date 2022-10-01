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

Feature: Buscar por precios
	Con el objetivo de comprobar que el precio del producto buscado no supere los 100 euros
	Scenario:
	Realizar busquedas de varios objetos y comprobar que no supera los 100 euros

	Given yo como usuario estoy logado correctamente
	When realizo una búsqueda de "<objeto>" en el buscador
	And elijo el primer objeto de la lista
	Then compruebo que el precio sea inferior de <cantidad> euros.

	Examples:
| objeto  | cantidad|
| coches  | 10000.00   | 


