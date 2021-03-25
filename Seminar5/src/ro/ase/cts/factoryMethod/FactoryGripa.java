package ro.ase.cts.factoryMethod;

public class FactoryGripa implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pret) {
		
		return new Gripa(pret);
	}

}
