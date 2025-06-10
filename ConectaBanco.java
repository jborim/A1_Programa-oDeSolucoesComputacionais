package pizzariaDesespero;

import java.sql.*;

public class ConectaBanco {
	 
	     
	    private String usuario = "root"; // usuário de root 
	    private String senha = "senha"; // senha do root 
	    private String host = "localhost"; 
	    private String porta = "3306"; 
	    private String bd = "programacao"; // data base a ser utilizada 
	     
	    public Connection obtemConexao(){ 
	        try{ 
	            Connection c = DriverManager.getConnection( 
	                "jdbc:mysql://" + host + ":" + porta + "/" + bd, 
	                usuario, 
	                senha 
	            ); 
	            return c; 
	        } 
	        catch (Exception e){ 
	            e.printStackTrace(); 
	            return null; 
	        } 
	    } 
	

}
