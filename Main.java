package Pizzaria;
import javax.swing.JOptionPane;

//Criar metodo de pagamento que mostra valor total e taxa de entrega
//Criar metodo que mostra todos os valores "para entregar para o cliente na entrega" com todo o pedido,valores,nome do cliente, id pedido, enderço de entrega.
//permitir adicionar mais de uma pizza ou bebida, usando for ou deixar a pessoa escolher quantos ele quer.
//



public class Main {

	public static void main(String[] args) {
		
		int beb;
		boolean a = true;
		Cliente cli1 = new Cliente(null, null);
		cli1.cadastrarCliente();
		JOptionPane.showMessageDialog(null, "Bem vindo a Pizzaria do Desespero!!\n\nAcabe com o seu desespero e faça seu pedido agora!!\n\n");
//while(a == true) {
		
		 
		String opcao = JOptionPane.showInputDialog("1 - Pizza.\n2 - bebidas.");	   
		Pedido p1 = new Pedido();
		
					switch(opcao) {
					case "1" :
						String tam = JOptionPane.showInputDialog("Escolha o tamanho da pizza:\n1 - pequena \n2- Média\n3 - Grande");
						p1.setTamanho(tam);
						String sabor = JOptionPane.showInputDialog("1 - Calabresa\n2 - Quatro queijos\n3 - Brigadeiro\n4 - prestigio");
						p1.setSabor(sabor);
						//String observacao = JOptionPane.showInputDialog("Observações: ");
								
						beb = Integer.parseInt(JOptionPane.showInputDialog("Deseja alguma bebida?\n1 - sim\n2 - não "));
						
						   switch (beb) {
								case 1:
									String bebida = JOptionPane.showInputDialog(null,"Escolha a bebida:\n1 - Coca-cola\n2 - Guarana");
									p1.adicionaBebida(bebida);									
									break;	
									
								case 2:
									break;
									
								default:
									JOptionPane.showMessageDialog(null,"Opção inválida!!");
									break;
								}
						break;
								
					case "2" :
								String bebida = JOptionPane.showInputDialog(null,"Escolha a bebida:\n1 - Coca-cola\n2 - Guarana");
								p1.adicionaBebida(bebida);	
								
						break;
						
					default :
								JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
					}
//}		

	
					JOptionPane.showMessageDialog(null,"Deseja seguir para o pagamento?");
					p1.Recibo();
					JOptionPane.showMessageDialog(null,"acabou");
}

}
	
	

