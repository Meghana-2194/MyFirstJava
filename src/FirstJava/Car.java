package FirstJava;

public class Car extends Vehicle {
	
	String color;
		
		public Car (String name , int speed , String color){
			super(name , speed); // variable 
			this.color  = color ; // car variable	
		}
		
		// Car Method
		public void race(){
			System.out.println("Racing......");
		}
		
		void display(){
			System.out.println(super.name+ "   "+super.speed); //print variable 
			System.out.println(color); // print variable
			super.start();
			
		}
	}
	
