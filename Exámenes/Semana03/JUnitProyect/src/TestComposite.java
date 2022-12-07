
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curso.composite.Constante;
import com.curso.composite.Div;
import com.curso.composite.Expresion;
import com.curso.composite.Multi;
import com.curso.composite.Resta;
import com.curso.composite.Suma;

class TestComposite {

	@Test
	void testConstante1() {
		double testValor = 5.5;
		Expresion e = new Constante(testValor);
		assertEquals(testValor,e.getValor());
	}
	
	@Test
	void testConstante2() {
		double testValor = 8.8;
		Expresion e = new Constante(testValor);
		assertEquals(testValor,e.getValor());
	}
	
	@Test
	void testSuma() {
		double valor1 = 2.0;
		double valor2 = 4.0;
		Expresion left = new Constante(valor1);
		Expresion right = new Constante(valor2);
		Expresion e = new Suma(left,right);
		assertEquals(valor1+valor2,e.getValor());		
	}
	
	@Test
	void testResta() {
		double valor1 = 2.0;
		double valor2 = 4.0;
		Expresion left = new Constante(valor1);
		Expresion right = new Constante(valor2);
		Expresion e = new Resta(left,right);
		assertEquals(valor1-valor2,e.getValor());		
	}
	
	@Test
	void testMulti() {
		double valor1 = 2.0;
		double valor2 = 4.0;
		Expresion left = new Constante(valor1);
		Expresion right = new Constante(valor2);
		Expresion e = new Multi(left,right);
		assertEquals(valor1*valor2,e.getValor());		
	}
	
	@Test
	void testDiv() {
		double valor1 = 2.0;
		double valor2 = 4.0;
		Expresion left = new Constante(valor1);
		Expresion right = new Constante(valor2);
		Expresion e = new Div(left,right);
		assertEquals(valor1/valor2,e.getValor());		
	}
	
	@Test
	void testComplex1() {
		double testValorA = 4.5;
		double testValorB = 8.9;
		Expresion e = new Resta(
				new Suma(
						new Constante(testValorB),
						new Constante(testValorA)
						),
				new Constante(testValorB));
		assertEquals(4.5,e.getValor(),0.01);
	}

}