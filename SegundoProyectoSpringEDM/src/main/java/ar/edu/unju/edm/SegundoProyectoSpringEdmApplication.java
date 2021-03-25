package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controler.CalculadoraControler;
import ar.edu.unju.edm.model.Calculadora;

@SuppressWarnings("unused")
@SpringBootApplication
public class SegundoProyectoSpringEdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoSpringEdmApplication.class, args);
		
		CalculadoraControler nuevoControlador = new CalculadoraControler();
		nuevoControlador.resolverSuma();
	}

}
