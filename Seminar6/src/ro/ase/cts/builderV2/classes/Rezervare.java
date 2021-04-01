package ro.ase.cts.builderV2.classes;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonimic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	public Rezervare(boolean mancareInclusa, boolean scaunErgonimic, boolean bauturaRacoritoare,
			boolean muzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonimic = scaunErgonimic;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}

	public boolean isMancareInclusa() {
		return mancareInclusa;
	}

	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}

	public boolean isScaunErgonimic() {
		return scaunErgonimic;
	}

	public void setScaunErgonimic(boolean scaunErgonimic) {
		this.scaunErgonimic = scaunErgonimic;
	}

	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}

	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonimic=" + scaunErgonimic
				+ ", bauturaRacoritoare=" + bauturaRacoritoare + ", muzicaAmbientala=" + muzicaAmbientala
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}

}
