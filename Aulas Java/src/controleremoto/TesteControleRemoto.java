package controleremoto;

public class TesteControleRemoto {

	public static void main(String[] args) {
		
		ControleRemoto controleRemoto = new ControleRemoto();
		
		System.out.println("Chamando Carro " + controleRemoto.mover("Carro"));
		
		System.out.println("Chamando Avi�o " + controleRemoto.mover("Avi�o", true ));
		
		System.out.println("Chamando Barco "+ controleRemoto.mover("Barco", true, true));

	}

}
