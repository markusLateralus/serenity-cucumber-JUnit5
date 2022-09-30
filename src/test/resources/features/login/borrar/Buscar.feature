Feature: Buscar por Marcas
Con el objetivo de comprobar la marca de varios objetos
Scenario:
Realizar busquedas de varios objetos y comprobar su marca


Given yo como usuario de Amazon
 
When realizo una búsqueda de "<objeto>" 
And elijo el primer objeto

Then compruebo que el marca sea "<marca>"

Examples:
| objeto  | marca |
| coches  | Salind GPS   | 
