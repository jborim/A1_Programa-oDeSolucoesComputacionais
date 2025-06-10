package pizzariaDesespero;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;


public class Pedido {
	private int id_pedido;
	private String tamanho;
	private String sabor;
	private String []saborFatias;// = new String[3];
	private String bebida;
	private double preco;
	private double precobeb;
	int quantidadeSabor = 0;
	
	//Aqui é criado o metodo do pedido usando ferramentas de condição e repetição para excutar as escolhas do cliente permitindo escolher entre pizza ou bebida; 
	
	public void PrimeiroPedido(){
		
			int	tam = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho da pizza:\n1 - Pequena (1 sabor)\n2 - Média (2 sabores)\n3 - Grande (3 sabores)"));						
			switch (tam) {
			case 1: 
				
				this.tamanho = "pequena";
				this.preco = 39.90;
				quantidadeSabor = 1;
				 saborFatias = new String[1];
				break;
			case 2:
				this.tamanho = "media";
				this.preco = 59.90;
				quantidadeSabor = 2;

				 saborFatias = new String[2];
				break;
			case 3:
				this.tamanho = "grande";
				this.preco = 69.90;
				quantidadeSabor = 3;
				 saborFatias = new String[3];
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			
			}
		
			

			for(int i = 0; i < quantidadeSabor; i++) {
			sabor = JOptionPane.showInputDialog("Escolha o sabor da fatia :\n1 - Calabresa\n2 - Quatro queijos\n3 - Brigadeiro\n4 - Portuguesa");
			switch(sabor){
			case "1": 
				this.saborFatias[i] = "Calabresa";
				break;
			case "2":
				this.saborFatias[i] = "Quatro queijos";
				break;
			case "3":
				this.saborFatias[i] = "Brigadeiro";
				break;
			case "4":
				this.saborFatias[i] = "Portuguesa";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
			}
			
			
	 int beb = Integer.parseInt(JOptionPane.showInputDialog("Deseja alguma bebida?(Refrigerante, Suco, Água)\n1 - sim\n2 - não "));
	
	   switch (beb) {
			case 1:
				String bebida = JOptionPane.showInputDialog(null,"Escolha a bebida:\n1 - Coca-cola\n2 - Guarana\n3 - Suco laranja\n4 - Água");
				switch (bebida) {
				case "1" :
					setBebida("cocaCola");
					setPrecobeb(8.00);
					break;
				case "2" :
					setBebida("guarana");
					setPrecobeb(8.00);
					break;
				case "3":
					setBebida("Suco laranja");
					setPrecobeb(6.00);
					break;					
				case "4" :
					setBebida("Água");
					setPrecobeb(3.00);
					break;	
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
					}											
				break;	
				
			case 2:
				break;
				
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida!!");
				break;
			}
	
	}
	
	
	//Abaixo metodo para somatoria dos valores dos itens escolhidos

	public void ReciboItens() {   //metodo utilizado para mostrar todos os itens escolhidos pelo cliente; falta descpbrir uma forma de mostrar tudo em uma pagina só e não cada item por vez, mostrar como uma lista mesmo.
		
		double subtotal;
		if(tamanho != null && bebida != null) {
			subtotal = preco + precobeb ;
			JOptionPane.showMessageDialog(null, "===== RECIBO DO PEDIDO =====\\n"
					+ "Pizza escolhida \nTamanho: " + tamanho +  "- R$ " + preco 
					+ "\nsabor: " + Arrays.toString(saborFatias) 
					+ "\n\nBebida escolhida : " + bebida + " - R$ " + precobeb 
					+ "SubTotal: " + subtotal);;
			
			
		} else if(tamanho != null ) {
			JOptionPane.showMessageDialog(null, "===== RECIBO DO PEDIDO =====\\n"
					+ "Pizza escolhida \nTamanho: " + tamanho +  "- R$ " + preco 
					+ "\nsabor: " + Arrays.toString(saborFatias) 
					+ "SubTotal: " + preco);
				
			}else if(bebida != null) {
				
				JOptionPane.showMessageDialog(null, "===== RECIBO DO PEDIDO =====\\n"
						+ "Bebida escolhida : " + bebida + " - R$ " + precobeb
						+"Subtotal: " + precobeb);
		
			}else {
				JOptionPane.showMessageDialog(null, "nenhum pedido feito!!  ");
			}
		}
	
	//Parte em que inserimos os dados no banco de dados
			public void inserir (){ 
		        //1: Definir o comando SQL 
		        String sql = "INSERT INTO pedido(tamanho, Sabor, preco, bebida, preco_beb) VALUES (?, ?, ?, ?, ?)"; 
		        //2: Abrir uma conexão 
		        ConectaBanco factory = new ConectaBanco(); 
		        try (Connection c = factory.obtemConexao()){ 
		            //3: Pré compila o comando 
		            PreparedStatement ps = c.prepareStatement(sql); 
		            //4: Preenche os dados faltantes 
		            ps.setString(1, tamanho); 
		            ps.setString(2, sabor);
		            ps.setDouble(3, preco);
		            ps.setString(4, bebida);
		            ps.setDouble(5, precobeb);
		            //5: Executa o comando 
		            ps.execute(); 
		        } 
		        catch (Exception e){ 
		            e.printStackTrace(); 
		        } 
		    } 
			

		public String getTamanho() {
			return tamanho;
		}
		
		
		public String getSaborFatias() {
			return sabor;
		}
		
		
		public double getPreco() {
			return preco;
		}
		
		public String getBebida() {
			return bebida;
		}
		public void setBebida(String bebida) {
				
			this.bebida = bebida;
		}
		public double getPrecobeb() {
			return precobeb;
		}
		public void setPrecobeb(double precobeb) {
			this.precobeb = precobeb;
		}	
}