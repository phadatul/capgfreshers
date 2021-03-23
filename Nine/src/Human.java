
public class Human extends Animal implements Herbivorus,Carnivorus {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Human eats");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human walks");
		
	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("some human eat meat");
		
	}

	@Override
	public void eatVeg() {
		// TODO Auto-generated method stub
		System.out.println("some human  eat veg");
		
	}
	
	

}
