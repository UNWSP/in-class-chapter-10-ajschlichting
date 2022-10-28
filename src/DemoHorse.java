
public class DemoHorse {
	
	public static void main(String args[])
	{
		Horse horse1 = new Horse();
		horse1.setName("Fred");
		horse1.setColor("Blue");
		horse1.setBirthYear(2000);
		
		RaceHorse horse2 = new RaceHorse();
		horse2.setName("Greg");
		horse2.setColor("Red");
		horse2.setBirthYear(2001);
		horse2.setRaces(1444);
		
		System.out.println(horse1.getName() + " is " + 
			horse1.getColor() + " and was born in " + horse1.getBirthYear()+".");
		System.out.println(horse2.getName() + " is " + 
				horse2.getColor() + " and was born in " + horse2.getBirthYear()+".");
		System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
			
		
		
		
	}
	
	
	

}
