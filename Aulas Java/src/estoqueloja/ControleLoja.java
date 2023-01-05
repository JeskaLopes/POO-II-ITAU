package estoqueloja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> estoque = new ArrayList<String>();
		
		// adicona itens na lista
		estoque.add("Camiseta");
		estoque.add("Vestido");
		estoque.add("Bota");
		
		// antes de atualizar
		
		System.out.println("Listagem do estoque antes de atualizar "+ estoque);
		
		// atualiza itens da lista
		
		estoque.remove("Bota");
		estoque.add("Coturno");
		
		//mostra itens da lista
		System.out.println("Listagem do estoque depois de atualizar"+ estoque);
	
		//remove um item
		estoque.remove(1);
		
		//estoque depois de remover um item
		System.out.println("Listagem do estoque depois de deletar um item"+ estoque);
	
	}

}
