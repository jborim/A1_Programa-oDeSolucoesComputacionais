package Pizzaria;

import javax.swing.JOptionPane;

public class Pedido {
	private String tamanho;
	private String sabor;
	private String[] saborFatias = new String[3];
	private String bebida;
	private double preco;
	private double precobeb;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tam) {
		switch (tam) {
		case 1: 
			
			this.tamanho = "pequena";
			this.preco = 39.90;
			break;
		case 2:
			this.tamanho = "media";
			this.preco = 59.90;
			break;
		case 3:
			this.tamanho = "grande";
			this.preco = 69.90;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		
		}
	}
	
	public String getSaborFatias() {
		return sabor;
	}
	public void setSaborFatias(int tam) {
		for(int i = 0; i < tam; i++) {
		sabor = JOptionPane.showInputDialog("1 - Calabresa\n2 - Quatro queijos\n3 - Brigadeiro\n4 - prestigio");
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
			this.saborFatias[i] = "Prestigio";
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		}
		}
	}
	
	public double getPreco() {
		return preco;
	}
	public void adicionaBebida(String bebida) {
		switch (bebida) {
		case "1" :
			setBebida("cocaCola");
			setPrecobeb(6.00);
			break;
		case "2" :
			setBebida("guarana");
			setPrecobeb(5.00);
			break;
		case null:
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
			}			
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
	
	
	public void Recibo() {
		double subtotal;
		if(tamanho != null && bebida != null) {
			
			JOptionPane.showMessageDialog(null, "Pizza escolhida :\nTamanho: " + tamanho  );
			
				for(int i = 0; i < 2 -1 ; i++) {
				JOptionPane.showMessageDialog(null,"\n sabor: " + saborFatias[i]);
				}
				
			JOptionPane.showMessageDialog(null, "Bebida escolhida : " + bebida + "\nR$ " + precobeb  );
			subtotal = preco + precobeb;
			JOptionPane.showMessageDialog(null, "SubTotal:  " + subtotal);
			
		} else if(tamanho != null ) {
			
			JOptionPane.showMessageDialog(null, "Pizza escolhida :\nTamanho: " + tamanho  );
			
				for(int i = 0; i < 3; i++) {
				JOptionPane.showMessageDialog(null,"\n sabor: " + saborFatias[i]);
				}
				
			}else if(bebida != null) {
				
			
				JOptionPane.showMessageDialog(null, "Bebida escolhida : " + bebida + "\nR$ " + precobeb  );
				subtotal = preco + precobeb;
				JOptionPane.showMessageDialog(null, "SubTotal:  " + subtotal);
					//JOptionPane.showMessageDialog(null,"\nR$ " + preco);
		
			}else {
				JOptionPane.showMessageDialog(null, "nenhum pedido feito!!  ");
			}
	}
}
		
	
	
	
	
	

