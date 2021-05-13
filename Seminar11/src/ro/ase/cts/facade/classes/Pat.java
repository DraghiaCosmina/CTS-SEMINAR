package ro.ase.cts.facade.classes;

public class Pat {
	private int nrPat;
	private boolean liber;

	public int getNrPat() {
		return nrPat;
	}

	public boolean isLiber() {
		return liber;
	}

	public void setLiber(boolean liber) {
		this.liber = liber;
	}

	public Pat(int nrPat, boolean liber) {
		super();
		this.nrPat = nrPat;
		this.liber = liber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
