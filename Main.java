package pizzariaDesespero;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, 
            "Bem-vindo à Pizzaria do Desespero! \n" +
            "A maneira mais rápida e prática de pedir sua pizza favorita!\n" +
            "Com apenas alguns toques, você escolhe, personaliza e recebe sua pizza quentinha onde quiser.");
	Pedido p1 = new Pedido();
	p1.PrimeiroPedido();
	p1.ReciboItens();
	p1.inserir();
	Cliente cliente1 = new Cliente();
	cliente1.Cadastro();
	cliente1.mostrarDados();
	cliente1.inserir();
	
	}
}
