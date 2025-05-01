package Pizzaria;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String opcao;
		int beb;
		
		JOptionPane.showMessageDialog(null, "Bem vindo a Pizzaria do Desespero!!\n\nAcabe com o seu desespero e faça seu pedido agora!!\n\n");

		opcao = JOptionPane.showInputDialog("1 - Pizza.\n2 - bebidas.");
		       
		Pedido p1 = new Pedido();
					switch(opcao) {
					case "1" :
						String tam = JOptionPane.showInputDialog("Escolha o tamanho da pizza:\n1 - pequena\n2 - Média\n3 - Grande");
						p1.setTamanho(tam);
						String sabor = JOptionPane.showInputDialog("1 - Calabresa\n2 - Quatro queijos\n3 - Brigadeiro\n4 - prestigio");
						p1.setSabor(sabor);
						//String observacao = JOptionPane.showInputDialog("Observações: ");
								
						beb = Integer.parseInt(JOptionPane.showInputDialog("Deseja alguma bebida?\n1 - sim\n2 - não "));
						
								switch (beb) {
								case 1:
									String bebida = JOptionPane.showInputDialog(null,"Escolha a bebida:\n1 - Coca-cola\n2 - Guarana");
									p1.adicionaBebida(bebida);
									JOptionPane.showConfirmDialog(null,"Deseja seguir para o pagamento?\n\n*Caso não queira irá retornar do inicio!! ");
									break;
								
								case 2:
									JOptionPane.showConfirmDialog(null,"Deseja seguir para o pagamento?\n\n*Caso não queira irá retornar do inicio!! ");
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
					JOptionPane.showMessageDialog(null,"acabou");
		}


	
	
}
