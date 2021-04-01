package ro.ase.cts.builderV1.classes;

public class Builder implements IBuilder{
	private Rezervare rezervare;

	public Builder() {
		rezervare = new Rezervare(false, false, false, false, "gen", 1);
	}
	public Builder(int codRezervare) {
		rezervare = new Rezervare(false, false, false, false, "gen", codRezervare);
	}
	public Builder setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}

	public Builder setScaunErgonimic(boolean scaunErgonimic) {
		rezervare.setScaunErgonimic(scaunErgonimic);
		return this;
	}

	public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		rezervare.setBauturaRacoritoare(bauturaRacoritoare);
		return this;
	}

	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public Builder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	public Builder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}

}
