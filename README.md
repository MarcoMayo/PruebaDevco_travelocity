# Proyecto: Reto DEVCO. Automatización Travelocity.

El proyecto nace por la necesidad de garantizar el correcto funcionamiento de la plataforma travelocity
al hacer uso de la funcionalidad de busqueda de vuelos.

La aplicación de Automatización Travelocity cuenta con 3 escenarios:

* **search_flights:** Casos automatizados para tipo de vuelo One-Way. 
* **select_flight_roundtrip:** Casos no automatizados para tipo de vuelo Roundtrip.
* **select_flights_multi_city:** Casos no automatizados para tipo de vuelo Multi-City.  


## PROYECTO DE AUTOMATIZACIÓN TRAVELOCITY 

* **Nombre:** Automatización Travelocity.
* **Lenguaje de programación:** Java.  
* **Frameworks:** Selenium, JUnit y Serenity BDD.  
* **Patrón de diseño:** Screenplay.  
* **Feature:** Hecho en lenguaje Gherkin.  
* **IDE:** Intellij  
* **Driver:** ChromeDriver.exe  
* **Manejo de dependencias con Gradle.**
* **Versión java:** 1.8
* **Versión gradle:** 5.6.2   
* **Versión Googlechrome:** 88.0.4324.182

## EJECUCIÓN

Para ejecutar la automatización se abre la consola en la raíz del proyecto, y se pone el comando: 

* gradle clean test --tests SearchFlights aggregate --info

La plataforma travelocity es algo inestable durante la automatización, ya que puede cambiar el diseño entre la ejecución de los diferentes casos,
esto se podría solucionar agregando condiciones (Check.whether().andIfSo(Click).otherwise()) y tener un mapeo para ambos diseños, ya que los
flujos también se ven afectados. 

Esta automatización se realizó basado en el diseño al cual el usuario final tiene acceso. Si durante la ejecución cambia de diseño, es posible que la
automatización falle.

