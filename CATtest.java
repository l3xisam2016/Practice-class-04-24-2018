package animals;
import java.util.Scanner;
public class CATtest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		CAT[] CatList = new CAT[3];
		
		for(int i = 0; i<CatList.length; i++) {
			
			
	    System.out.println("Enter the Name cats");	
		String nam1=scanner.nextLine();
		
		System.out.println("Enter the Breed cats");
		String bre1=scanner.nextLine();
		
		
		CatList [i] = new CAT(nam1, bre1);
		}
		
		 
		System.out.println (CatList[1].Name + CatList[1].Breed); 
		
		

	}

}
