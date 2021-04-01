package ro.ase.cts.builderV3.classes;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonimic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	public Rezervare(Builder builder) {

		this.mancareInclusa = builder.mancareInclusa;
		this.scaunErgonimic = builder.scaunErgonimic;
		this.bauturaRacoritoare = builder.bauturaRacoritoare;
		this.muzicaAmbientala = builder.muzicaAmbientala;
		this.genMuzica = builder.genMuzica;
		this.codRezervare = builder.codRezervare;
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

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder implements IBuilder {
		private boolean mancareInclusa;
		private boolean scaunErgonimic;
		private boolean bauturaRacoritoare;
		private boolean muzicaAmbientala;
		private String genMuzica;
		private int codRezervare;

		public Builder setMancareInclusa(boolean mancareInclusa) {
			this.mancareInclusa = mancareInclusa;
			return this;
		}

		public Builder setScaunErgonimic(boolean scaunErgonimic) {
			this.scaunErgonimic = scaunErgonimic;
			return this;
		}

		public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
			this.bauturaRacoritoare = bauturaRacoritoare;
			return this;
		}

		public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
			this.muzicaAmbientala = muzicaAmbientala;
			return this;
		}

		public Builder setGenMuzica(String genMuzica) {
			this.genMuzica = genMuzica;
			return this;
		}

		public Builder setCodRezervare(int codRezervare) {
			this.codRezervare = codRezervare;
			return this;
		}

		@Override
		public Rezervare build() {

			return new Rezervare(this);
		}

	}
}
