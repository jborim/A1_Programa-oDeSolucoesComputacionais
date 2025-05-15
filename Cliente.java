package Pizzaria;
import javax.swing.JOptionPane;





public class Cliente {

	private String nome;
	private String endereco;
	private String contato;
	
	public Cliente(String nome2, String contato2) {
		// TODO Auto-generated constructor stub
	}
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
	/*
	public void adicionandocontato(String contato) {
		
	        if (contato.matches("\\d{10,11}")) { // Validação básica para números de telefone
	        	this.contato = contato;
	        } else {
	        	 JOptionPane.showMessageDialog(null,"Numero inválido!");
	        }
		
	}
	
	public void cadastroValido(String nome) {
		if(nome ==this.nome  ){
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
	*/
	 
	public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nContato: " + contato);
    }

    // Método para cadastrar cliente usando JOptionPane
    public static Cliente cadastrarCliente() {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String contato = JOptionPane.showInputDialog("Digite o contato do cliente:");

        return new Cliente(nome,contato);
    }


	
}


