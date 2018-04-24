package animals;
import java.util.Scanner;
public class GAMEtest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		GAME[] Gamelist =new GAME[5];

		
		//create 5 games 
		Gamelist[0]= new  GAME("sdf","sdfsdf",43);
		Gamelist[1]= new  GAME("xia","efcwe", 13);
		Gamelist[2] = new  GAME("bbgd","vfh", 20);
		Gamelist[3] = new  GAME("btsrp","sedr", 65);
		Gamelist[4] = new  GAME("exoki","vbgh", 15);
		
		//ask the user to enter in a name of a game 
		System.out.println("Enter the games Name");	
		String nam1=scanner.nextLine();

		for(int i=0; i<Gamelist.length; i++) {
			//compare the user entered to what's inside the array 
			if(nam1.equals(Gamelist[i].Name)) {
				System.out.println(Gamelist[i].Name + Gamelist[i].Genre + Gamelist[i].Rating);
			}else {
				System.out.println("Game not found");
			}
			
		

		}

			


	}

}
