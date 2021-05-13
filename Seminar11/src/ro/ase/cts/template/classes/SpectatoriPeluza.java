package ro.ase.cts.template.classes;

public class SpectatoriPeluza extends SpectatorAbstract{

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul de peluza s-a asezat la coada.");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul a prezentat biletul.");
		
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println("Spectatorul a realizat controlul corporal.");
		
	}

	@Override
	public void intraPeStadion() {
		System.out.println("Spectatorul a intrat in zona de peluza");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul a ocupat locul din peluza");		
	}

}
