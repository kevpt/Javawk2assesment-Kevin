package Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.util.Scanner;



public class User<Play, kevin> {

	
	
private List <kevin> myList = new ArrayList<>();
	
	Player kevin = new Player(4, 7, 1, 12);  
	
	Scanner type = new Scanner(System.in);
	int number = type.nextInt();


	
	
	
	
	public void Userr() {
		
		myList.listIterator();
		
		
		
		if(number == kevin.east  || number <= 1  )  {
			System.out.println("Your In EAST");
			System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");
		}else if(number == kevin.north  || number <=2) {
			System.out.println("Your in NORTH");
			System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");
			
			
		}else if(number == kevin.south ||  number <=3) {
			System.out.println("Your in SOUTH");
			System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");
			
		}else if(number == kevin.west ||  number <=8) {
			System.out.println("WEST");
			System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");
		
		}else if(number ==13) {
			System.out.println("You Found the TREASURE!!!!!!");
			System.out.println("PROUD OF YOU KEVIN WELL DONEE!!!!!!!!!!! Time For Pizza ");
			
			
		}
	}
}

	


			


	
	
	
	
	
	

