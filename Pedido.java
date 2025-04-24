package Pizzaria;
import javax.swing.JOptionPane;

public class Pedido {
	private String sabor;
	private String tamanho;
	private int quantidade;
	private int fatias;
	private double valor;
	private String bebida;
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getFatias() {
		return fatias;
	}

	public void setFatias(int fatias) {
		this.fatias = fatias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public void TamanhoPizza(String tamanho) {
		if(tamanho == "1") {
			this.tamanho = tamanho;
		}if(tamanho == "2"){
			this.tamanho = tamanho;
			
		}if(tamanho == "3") {
			this.tamanho = tamanho;
			
		}else {
			JOptionPane.showMessageDialog(null,"Escolha um dos tamanhos apresentados na tela!");
		}
	}
	
	public void SaboresPequena(String sabor) {
		
		this.sabor = JOptionPane.showInputDialog("Escolha o sabor da pizza.\n1 Quatro queijos\n2 Calabresa\n3 Chocolate\n4 Mesclada");
		
			
	}
	
	public void SaboresMédia() {
		
	}
	
	public void SaboresGrande() {
		
	}

}
