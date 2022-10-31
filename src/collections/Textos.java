package collections;

import java.util.ArrayList;

public class Textos {

	private String texto;
	private ArrayList<String> textos = new ArrayList<String>();

	public Textos() {
		
	}
	
	public Textos(String t1,String t2,String t3, String t4, String t5) {
		this.textos.add(t1);
		this.textos.add(t2);
		this.textos.add(t3);
		this.textos.add(t4);
		this.textos.add(t5);
	}

	public ArrayList<String> getTextos() {
		return textos;
	}

	public void setTextos(ArrayList<String> textos) {
		this.textos = textos;
	}
	
	public String getTexto(int indice) {
		return this.textos.get(indice);
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
