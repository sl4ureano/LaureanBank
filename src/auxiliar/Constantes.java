package auxiliar;

public class Constantes {
	
	public final double TAXA_TRANSFERENCIA = 1.2;

	public void Exibir() {
		Exibir("", 1);
	}

	public void Exibir(String texto, int quantidade) {
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
