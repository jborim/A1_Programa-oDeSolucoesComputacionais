package Pizzaria;

import javax.swing.JOptionPane;

public class Pedido {
	private String tamanho;
	private String sabor;
	private String bebida;
	private double preco;
	private double precobeb;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tam) {
		switch (tam) {
		case "1": 
			
			this.tamanho = "pequena";
			this.preco = 39.90;
			break;
		case "2":
			this.tamanho = "media";
			this.preco = 59.90;
			break;
		case "3":
			this.tamanho = "grande";
			this.preco = 69.90;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		
		}
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		switch(sabor){
		case "1": 
			this.sabor = "Calabresa";
			break;
		case "2":
			this.sabor = "Quatro queijos";
			break;
		case "3":
			this.sabor = "Brigadeiro";
			break;
		case "4":
			this.sabor = "Prestigio";
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		}
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
		JOptionPane.showMessageDialog(null, "Pizza escolhida :\nTamanho: " + tamanho + "\n sabor: " + sabor + "\nR$ " + preco);
		if(bebida == "cocaCola" || bebida == "guarana") {
			JOptionPane.showMessageDialog(null, "Bebida escolhida : " + bebida + "\nR$ " + precobeb  );
			 subtotal = preco + precobeb;
			 JOptionPane.showMessageDialog(null, "SubTotal:  " + subtotal);
		}
		 subtotal = preco;
		JOptionPane.showMessageDialog(null, "SubTotal:  " + subtotal);
	}

			

}
