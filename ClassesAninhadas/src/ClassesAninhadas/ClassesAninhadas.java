package ClassesAninhadas;

public class ClassesAninhadas {
	private String texto = "Texto externo";

	public class Interna {
		private String texto = "Texto interno";

		public void imprimeTexto() {
			// Ira imprimir texto de classe interna
			System.out.println(texto);

			// Para acessar classe externa
			System.out.println(ClassesAninhadas.this.texto);
		}
	}

	public void metodoQualquer() {
		class ClasseLocal {
			private String texto = "Classe local";

			public void imprimeTexto() {
				System.out.println(texto);
			}
		}

		ClasseLocal local = new ClasseLocal();
		local.imprimeTexto();
	}

	public class Anonima {
		public void imprimeTexto() {
			System.out.println("Qualquer texto ");
		}
	}

	public static void main(String[] args) {
		ClassesAninhadas externa = new ClassesAninhadas();
		// Precisa primeiro instanciar a externa
		Interna interna = externa.new Interna();

		interna.imprimeTexto();
		externa.metodoQualquer();

		Anonima anonima = externa.new Anonima() {
			public void imprimeTexto() {
				System.out.println("Texto sobrescrito");
			}
		};

		anonima.imprimeTexto();

		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("Texto interface");	
			}
		};
		texto.imprimeTexto();
	}
}
