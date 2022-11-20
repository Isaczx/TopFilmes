package Java.Io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import fw.com.bytebank.banco.modelo.Cliente;


public class TesteSerializacaoCliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		

		   
		        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		        Cliente cliente = (Cliente) ois.readObject();
		        ois.close();
		        System.out.println(cliente.getNome());

		    }

		}