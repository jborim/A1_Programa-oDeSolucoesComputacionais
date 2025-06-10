package pizzariaDesespero;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.PreparedStatement;
public class Cliente {
	private int id_cliente;
	private String nome;
	private String contato;
	private String logradouro;
	private String bairro;
	private String pontoReferencia;
	double taxa;
	
	public void inserir (){ 
        //1: Definir o comando SQL 
        String sql = "INSERT INTO cliente(nome, contato, logradouro, bairro, referencia) VALUES (?, ?, ?, ?, ?, ?)"; 
        //2: Abrir uma conexão 
        ConectaBanco factory = new ConectaBanco(); 
        try (Connection c = factory.obtemConexao()){ 
            //3: Pré compila o comando 
            PreparedStatement ps = c.prepareStatement(sql); 
            //4: Preenche os dados faltantes 
            ps.setString(1, nome); 
            ps.setString(2, contato);
            ps.setString(3, logradouro);
            ps.setString(4, bairro);
            ps.setString(5, pontoReferencia);
            //5: Executa o comando 
            ps.execute(); 
        } 
        catch (Exception e){ 
            e.printStackTrace(); 
        } 
    } 

	public class CadastroSimples {
	    public static void main(String[] args) {
	        String nome, contato, endereco;

	        while ((nome = JOptionPane.showInputDialog("Digite seu nome:")) == null || nome.trim().isEmpty());
	        while ((contato = JOptionPane.showInputDialog("Digite seu contato:")) == null || contato.trim().isEmpty());
	        while ((endereco = JOptionPane.showInputDialog("Digite seu endereço:")) == null || endereco.trim().isEmpty());

	        JOptionPane.showMessageDialog(null, "Cadastro concluído!\nNome: " + nome + "\nContato: " + contato + "\nEndereço: " + endereco);
	    }
	}
	public void Cadastro() {
		JOptionPane.showMessageDialog(null, "Vamos para o rápido cadastro para efetuar a compra.");
		//cadastro nome e contato
				String nome = JOptionPane.showInputDialog(	"Insira o nome que deseja ser chamado:");				
				setNome(nome);		
				while (true) {
					String contato = JOptionPane.showInputDialog(null, "Insira o contato (11 digitos): ");
		            if (contato.matches("\\d{11}")) {
		                setContato(contato);
		                break; // Sai do loop quando o número é válido
		            } else {
		                JOptionPane.showMessageDialog(null, "Número inválido!\nGaranta que está adicionando o DDD!");
		            }
		        }
		//cadastro do endereço
		String logradouro = JOptionPane.showInputDialog(null, "Insira o nome da rua: ");
		setLogradouro(logradouro);
		String bairro = JOptionPane.showInputDialog(null, "Nome do bairro: ");
		setBairro(bairro);
		
        String ponto = JOptionPane.showInputDialog(null, "Nos ajude com algum tipo de ponto de refência");
        setPontoReferencia(ponto);

	}
	

	public void mostrarDados() {        
       JOptionPane.showMessageDialog(null,"Cliente: " + nome + "\nContato: " 
       + contato + "\nEndereço: " + logradouro + ", " + bairro 
       + "\nPonto de refência: " + pontoReferencia);
    }
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
		
	}
	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if(bairro.equals("morrotes") || bairro.equals("Morrotes") ) {
			this.bairro = bairro;
			this.taxa = 5.00;
		}else if(bairro.equals("dehon") || bairro.equals("Dehon") ) {
			this.bairro = bairro;
			this.taxa = 6.00;
		}else if(bairro.equals("São João") ||bairro.equals("são joão") || bairro.equals("sao joao") ) {
			this.bairro = bairro;
			this.taxa = 7.00;
		}else if(bairro.equals("humaita") ||bairro.equals("Humaita") ) {
			this.bairro = bairro;
			this.taxa = 8.00;
		}else{
			JOptionPane.showMessageDialog(null, "Desculpe, mas não entregamos no seu bairro! Você pode pedir e vir buscar em nossa loja!");
			
		}
	
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public double getTaxa() {
		return taxa;
	}

	

}
