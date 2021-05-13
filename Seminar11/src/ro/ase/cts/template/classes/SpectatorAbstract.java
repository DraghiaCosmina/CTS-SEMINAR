package ro.ase.cts.template.classes;

public abstract class SpectatorAbstract {

	public final void intrareaSpectatoruluiPeStadion() {
		asezareLaCoada();
		prezintaBilet();
		realizeazaControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}

	public abstract void asezareLaCoada();

	public abstract void prezintaBilet();

	public abstract void realizeazaControlCorporal();

	public abstract void intraPeStadion();

	public abstract void ocupaLoc();

}
