package Pizzaria;
import javax.swing.JOptionPane;

public class Pedido {
	
	//private int idCliente;
	private String tamanho;
	private String sabor;
	private String bebida;
	private double preco;
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tam) {
		switch (tam) {
		case "1": 
			this.tamanho = "pequena";
			break;
		case "2":
			this.tamanho = "media";
			break;
		case "3":
			this.tamanho = "grande";
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
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
			
		this.bebida = bebida;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {		
		this.preco = preco;
	}	
	
	public void adicionaPizza() {
		
	}
	
			public void adicionaBebida(String bebida) {
				switch (bebida) {
				case "1" :
					setBebida("cocaCola");
					break;
				case "2" :
					setBebida("guarana");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
					}			
				}
			
			

}
