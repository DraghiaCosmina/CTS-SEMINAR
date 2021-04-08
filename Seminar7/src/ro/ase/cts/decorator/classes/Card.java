package ro.ase.cts.decorator.classes;

public class Card implements ICard {
	private String detinatorCard;

	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
	}

	@Override
	public String getDetinatorCard() {
		return detinatorCard;
	}

	@Override
	public void platesteOnline() {
		System.out.println(detinatorCard + " a platit online");

	}

	@Override
	public void platesteFizic() {
		System.out.println(detinatorCard + " a platit fizic");

	}

}
