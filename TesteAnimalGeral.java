package AtividadeHeranca;

public class TesteAnimalGeral {

	public static void main(String[] args) 
	
	{
			
		System.out.println("\n\t***CURIOSIDADE ANIMAL***");	
		Cachorro bicho1 = new Cachorro (" Maria Princesa"," Au au!",7," Corre.");
		bicho1.imprimirInfo();
		System.out.println("\n*******************************************************************");
		Cavalo bicho2 = new Cavalo (" Pé de pano"," Relincho",5," Corre.");
		bicho2.imprimirInfo();
		System.out.println("\n*******************************************************************");
		Preguica bicho3 = new Preguica (" Sonequinha"," aaaaahhhh!",10," Sobe em árvores.");
		bicho3.imprimirInfo();
		System.out.println("\n*******************************************************************");	

	}

}
