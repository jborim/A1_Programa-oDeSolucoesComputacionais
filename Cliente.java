package Pizzaria;
import javax.swing.JOptionPane;

public class Cliente {

	private String nome;
	private String endereco;
	private String contato;
	private int idCliente;
	private int senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdCliente() {
		return idCliente;
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
		
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		
        if (contato.matches("d{11}")) {
            this.contato = contato;
        } else {
            JOptionPane.showMessageDialog(null,"Numero inválido!");
        }
	}
	
	public void adicionandocontato(String contato) {
		
	        if (contato.matches("\\d{10,11}")) { // Validação básica para números de telefone
	        	this.contato = contato;
	        } else {
	        	 JOptionPane.showMessageDialog(null,"Numero inválido!");
	        }
		
	}
	
	public void cadastroValido(String nome, int senha) {
		if(nome ==this.nome || senha == this.senha ){
			JOptionPane.showMessageDialog(null,"bem vindo !" + nome);
		}else {
			JOptionPane.showMessageDialog(null,"Nome ou senha inválidos!");
		}
		
	}
	
	public void cadastroNovo(String nome, String endereco, String contato) {
		if(nome != null || endereco != null || contato != null ){
			setNome(nome);
			setEndereco(endereco);
			setContato(contato);
		}else {
			JOptionPane.showMessageDialog(null,"Nome ou senha inválidos!");
		}
	}
	
	
}
