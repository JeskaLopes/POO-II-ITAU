package controleremoto;

public class ControleRemoto {

	public String mover(String tipoBrinquedo, boolean paraquedas) {
		return "O brinquedo movido foi o Avi?o";
	}
	
	public String mover(String tipoBrinquedo, boolean sinalizador, boolean boia) {
		return "O brinquedo movido foi o Barco";
	}
	
	public String mover(String tipoBrinquedo) {
		return "O brinquedo movido foi o Carro";
	}
}
