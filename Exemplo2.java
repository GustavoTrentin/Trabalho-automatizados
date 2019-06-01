/** 
	Romulo Silva de Oliveira
	Departamento de Automacao e Sistemas - UFSC
*/

import java.util.*;

class Veiculo {

	private String placa = "";

	void setPlaca( String p){
		placa = p;
		}

	String getPlaca(){
		return placa;
		}

	double getValorPedagio(){
		return 0.0;
		}
		
	public String toString() {
		return placa;
		}	
	}
	

class Carro extends Veiculo {
	private int numeroDePortas = 2;
	
	void setNumeroDePortas( int n){
		numeroDePortas = n;
		}

	int getNumeroDePortas(){
		return numeroDePortas;
		}
	}


class Caminhao extends Veiculo {
	private int numeroDeEixos = 2;
	
	void setNumeroDeEixos( int n){
		numeroDeEixos = n;
		}

	int getNumeroDeEixos(){
		return numeroDeEixos;
		}
	
	double getValorPedagio(){
		return 5.0 * numeroDeEixos;
		}
	}



class ExemploGenerics{

	Carro c;
	Caminhao cm;
	Hashtable<String, Veiculo> minhaFrota;

	public void printFrota() {
        System.out.println("### Minha Frota ###");
        Enumeration<String> keys = minhaFrota.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Veiculo: " + key);
        }
    }

	
	ExemploGenerics(){
	
		minhaFrota = new Hashtable<String, Veiculo>();

		c = new Carro();			c.setPlaca("CAR1111");
		cm = new Caminhao();		cm.setPlaca("CAM9999");
	
		minhaFrota.put( c.getPlaca(), c);
		minhaFrota.put( cm.getPlaca(), cm);

		System.out.println("Com CAR1111 achou = " + minhaFrota.get("CAR1111") );
		System.out.println("Com CAR4444 achou = " + minhaFrota.get("CAR4444") );
   
		printFrota();
		}
	}        
		
		
		
public class Exemplo21{
	public static void main( String args[] ){
		System.out.println("Inicio");           
		new ExemploGenerics();
		System.out.println("Fim");
		}
	}       
		
// Delete um dos elementos de Frota

// Tente inserir dois veiculos com a mesma placa

// Crie uma tabela hash que aceita apenas Caminhao, tente inserir Carro




