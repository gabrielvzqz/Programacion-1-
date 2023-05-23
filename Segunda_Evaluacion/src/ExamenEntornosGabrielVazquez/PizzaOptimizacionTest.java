package ExamenEntornosGabrielVazquez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaOptimizacionTest {

	PizzaOptimizacion g = new PizzaOptimizacion();
	String frutas[] = { "platano", "fresa", "pomelo", "limon", "naranja", "pera" };

	
	@Test
	void testBusca() {
        assertEquals(frutas[0], g.busca("platano"));
        }

	@Test
	void testCuentaFrutasConMinimoLetras() {
		int frutasConMinimoLetras = g.cuentaFrutasConMinimoLetras(2);
        assertEquals(6, g.cuentaFrutasConMinimoLetras(2));	
	}

	@Test
	void testMediaCaracteres() {
        assertEquals(5.6, g.mediaCaracteres(),0.1);	
	}
	}

