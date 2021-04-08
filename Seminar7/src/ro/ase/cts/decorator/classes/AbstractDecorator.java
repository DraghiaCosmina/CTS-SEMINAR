package ro.ase.cts.decorator.classes;

public abstract class AbstractDecorator implements ICard {

	private ICard card;

	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}

	public ICard getCard() {
		return card;
	}
	public String getDetinatorCard() {
		return card.getDetinatorCard();
	}

	@Override
	public void platesteOnline() {
		card.platesteOnline();

	}

	@Override
	public void platesteFizic() {
		card.platesteFizic();

	}

	public abstract void platesteContacteless();

}
