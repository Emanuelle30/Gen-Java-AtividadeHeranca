package AtividadeHeranca;

public class Preguica extends Animal {
	
	private String subirArvore;

	public Preguica(String nome, String emitirSom, int idade, String subirArvore) 
	{
		super(nome, emitirSom, idade);
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+" \nIdade: "+getIdade()+
			"\nQual som emiti? "+getEmitirSom()+"\nEsse animal corre ou sobe em árvores? "+subirArvore);
	}
}


