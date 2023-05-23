package ExamenEntornosGabrielVazquez;

public class HechizoRefactorizacion {

	String nombreHechizero; // Nombre del hechizero
	int nivelHechizero; // Nivel alcanzado por el hechicero
	float destrezaHechizero; // Destreza del hechizero
	float manaHechizero; // Cantidad de maná del hechizero

	abstract class Hechizo {
		private boolean preparado = true;

		/*
		 * Determina si está preparado para lanzar el hechizo
		 */
		boolean puede_lanzar_hechizo() {
			if (preparado) {
				if (manaHechizero > 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

		float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
			return destrezaHechizero;
		}

		class Transformacion extends Hechizo {
			String nombre = "Transformacion";// nombre del hechizo
			String descripcion; // Breve descripción del hechizo

			float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
				return nivelHechizero * 2 + destrezaHechizero;
			}
		}

		class Encantamiente extends Hechizo {
			String nombre = "Encantamiente";// nombre del hechizo
			String descripcion; // Breve descripción del hechizo

			float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
				return nivelHechizero * 1 + destrezaHechizero;
			}
		}

		class Embrujo extends Hechizo {
			String nombre = "Embrujo";// nombre del hechizo
			String descripcion; // Breve descripción del hechizo

			float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
				return nivelHechizero / 2 + destrezaHechizero;
			}
		}

		class Malefico extends Hechizo {
			String nombre = "Malefico";// nombre del hechizo
			String descripcion; // Breve descripción del hechizo

			float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
				return nivelHechizero * 2;
			}
		}

		public static void main(String[] args) {
			HechizoRefactorizacion c = new HechizoRefactorizacion();
			c.nivelHechizero = 2;
			c.destrezaHechizero = 3;
			c.manaHechizero = 10;
		}
	}
}