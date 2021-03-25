package ro.ase.cts.factoryMethod;

public class FactoryBody implements FactoryCategorie {

	@Override
	public Categorie creareCategorie(float pret) {
		
		return new Body(pret);
	}
	

}
