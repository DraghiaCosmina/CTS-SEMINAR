package ro.ase.cts.decorator.classes;

public class DecoratorContactless extends AbstractDecorator {

	public DecoratorContactless(ICard card) {
		super(card);

	}

	@Override
	public void platesteContacteless() {
		System.out.println(super.getCard().getDetinatorCard()+" plateste contactless");
	}

}
