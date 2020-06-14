package FirstJava;

public class MainAggregate {

	public static void main(String[] args) {
		
		Address add= new Address("India","Karnataka");
		Employee emp = new Employee("Tom " ,add) ;
		
		emp.display1();
	}

}
