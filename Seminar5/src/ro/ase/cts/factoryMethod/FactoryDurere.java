package ro.ase.cts.factoryMethod;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie creareCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Durere(pret);
	}

}
