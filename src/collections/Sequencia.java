package collections;

import java.util.ArrayList;

public class Sequencia {
	
	private ArrayList<String> sequencia = new ArrayList<String>();
	
	public void addSequencia(String sequencia) {
		this.sequencia.add(sequencia);
	}
	
	//metodo que 
	public String retornaMaiorSequencia() {
		String maiorSequencia ="";
		int tamanho_max = 0;
		
		for(String s : this.sequencia){		
			if (s.length() > tamanho_max) {				
				tamanho_max = s.length();
				maiorSequencia = s;
			}
		}		
		return maiorSequencia;
	}

	public ArrayList<String> getSequencia() {
		return sequencia;
	}

	public void setSequencia(ArrayList<String> sequencia) {
		this.sequencia = sequencia;
	}
	
}
