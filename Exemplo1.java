/** 
	Romulo Silva de Oliveira
	Departamento de Automacao e Sistemas - UFSC
*/

import java.util.*;

class Carro {

	private String placa = "";
	private int numeroDePortas = 2;

	Carro( String p) {
		placa = p;
	}
	
	void setPlaca( String p){
		placa = p;
		}

	String getPlaca(){
		return placa;
		}

	void setNumeroDePortas( int n){
		numeroDePortas = n;
		}

	int getNumeroDePortas(){
		return numeroDePortas;
		}
	}


class ExemploCollections{
 
	ExemploCollections() {

		// vector armazena apenas inteiros
		Vector<Integer> vect1 = new Vector<Integer>();
		vect1.add(10);
		vect1.add(20);
		vect1.add(30);
		vect1.add(40);
        
		// vector armazena apenas strings
		Vector<String> vect2 = new Vector<String>();
		vect2.add("zero");
		vect2.add("one");
		vect2.add("two");
		vect2.add("three");
		vect2.add("four");
		vect2.add("five");
		vect2.add("six");
		vect2.add("seven");
		vect2.add("eight");
		vect2.add("nine");
		vect2.add("ten");

		List<String> sublista = vect2.subList(1, 9);
		System.out.println("Elementos da sublista: " + sublista);
 
		System.out.println("Valores originais de vect2: " + vect2);
		Collections.swap(vect2, 2, 4);
		System.out.println("Apos trocar os elementos 2 e 4: " + vect2);
 
		System.out.println("Valor maximo de vect1: " + Collections.max(vect1));
		System.out.println("Valor maximo de vect2: " + Collections.max(vect2));
 
		System.out.println("Valor minimo de vect1: " + Collections.min(vect1));
		System.out.println("Valor minimo de vect2: " + Collections.min(vect2));
 
		Vector<Integer> vect3 = new Vector<Integer>();
		vect3.add(50);
		vect3.add(60);
		vect3.add(70);
		vect3.add(80);
		System.out.println("Valores originais de vect3: " + vect3);
		vect1.addAll(vect3);
		System.out.println("Apos adicionar vect3 em vect1, vect1 novos valores: " + vect1);    
 
		Collections.reverse(vect3);
		System.out.println("Valores invertidos de vect3: " + vect3);
 
		System.out.println("Valores originais de vect1: " + vect1);
		Collections.shuffle(vect1);
		System.out.println("Embaralha vect1: " + vect1);
		Collections.shuffle(vect1);
		System.out.println("Embaralha novamente vect1: " + vect1);
 
		Collections.rotate(vect1, 3);
		System.out.println("Valores de vect1 apos rotacao: " + vect1);
 
		Collections.fill(vect1, 100);    
		System.out.println("vect1 apos completar com 100: " + vect1);
  
		vect1.clear();
		System.out.println("Tamanho do vect1 apos limpar: " + vect1.size());
 
		String str = vect3.toString();
		System.out.println("vect3 como um string: " + str);
	}
}	
	

	
public class Exemplo22{                
	public static void main( String args[] ){
		System.out.println("Inicio");           
		new ExemploCollections();
		System.out.println("Fim");
		}
	}       
		

// Crie um Vector de objetos do tipo carro e teste com 3 instancias de carros

// Remova o carro do meio e coloque o novo conteudo de vector na tela

// Experimente alguns metodos de Collections com o vetor de carros
 



