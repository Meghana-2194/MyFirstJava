package FirstJava;

public class MainClass {

	public static void main(String[] args) {
		// complie time polymorphism
		Mango mango = new Mango();

		mango.nameTest(); // inherited from parent class
		// inherited from parent class
		mango.priceTest(); // own child class
		// inherited

		FruitClass fruit = new FruitClass();
		fruit.nameTest();
		// fruit.priceTest(); // cannot be called

		// Top CAST : // dynamic polymorphism

		FruitClass obj = new Mango(); // child class object can be referred by
										// parent class referece variable
		obj.nameTest(); // overide
		// obj.priceRate () ; // cannot be called

	}

}
