package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		/**
		 * JPA: JAVA PERSISTANCE API
		 * 
		 * - Es un framework de o para JAVA,  que maneja datos relacionales.
		 * - Esta dependencia viene de la mano de un conector DB relacional.
		 * 
		 * PARTES DE JPA.
		 * La API de por sí, está definida en un package (javax.persistence).
		 * El lenguaje de consulta JPQL or JPL (Java Persistance Query Language).
		 * metadata objeto/relacional.
		 * 
		 * Se crea para poder conectar y no perder la ventaja de POO, al interactuar
		 * con las DB
		 * 
		 * Sigue el patrón de diseño de mapeo objeto-relacional 
		 * (objeto y su relación con algún componente del ambiente)
		 * 
		 * 
		 * 
		 * HERRAMIENTAS:
		 * - Anotaciones. 
		 * 		. @Entity: 	. Entidad de persistencia. A través de una clase de JAVa ligera.
		 * 					generalmente pertenece al MODELO.
		 * 					. El estado de la clase inyectada (modelo) es persistido de manera asociada
		 * 					a una tabla en una DB relacional.
		 * 					. Todas las relaciones que tengan las entidades se manifestan a través de
		 * 					la metadata objeto/relacional. Estos, pueden ser setteados directamente
		 * 					en el fichero de la clase, con anotaciones  de JAVA, o en un XML descriptivo.
		 */
	}

}
