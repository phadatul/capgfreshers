
public class Lion extends Animal implements Carnivorus {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lion eats");

	}

	@Override
	public void walk() {
		System.out.println("Lion walks");

	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("Lion eats non veg");
	}

}
