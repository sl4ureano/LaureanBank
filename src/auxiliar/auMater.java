package auxiliar;

public class Constantes {
	
	public static final double TAXA_TRANSFERENCIA = 1.2;
	public static final double TAXA_IMPOSTO = 4.2;

	public void Exibir() {
		Exibir("", 1);
	}

	public static void Exibir(String texto, int quantidade) {
		if (texto.equals("n")) {
			for (int i = 0; i < quantidade; i++) {
				System.out.printf("\n");
			}
		} else if (texto.equals("l")) {
			for (int i = 0; i < quantidade; i++) {
				System.out.println("------------------------------------------------------------------------");
			}
		} else {
			for (int i = 0; i < quantidade; i++) {
				System.out
						.println("#############################" + texto + "#########################################");
			}
		}
	}

}
