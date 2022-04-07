package AtividadeHeranca;

public class Cachorro extends Animal {
	
	private String correr;

	public Cachorro(String nome, String emitirSom, int idade, String correr) 
	{
		super(nome, emitirSom, idade);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: "+getNome()+" \nIdade: "+getIdade()+
			"\nQual som emiti? "+getEmitirSom()+"\nEsse animal corre ou sobe em árvores? "+correr);
	}

}
