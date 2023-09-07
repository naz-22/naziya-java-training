import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Filecreation {

		public static void main(String[] args)throws Exception {
			Scanner s= new Scanner (System.in);	
		System.out.println("enter totalstudents :");
		int num=s.nextInt();
		s.nextLine();
		String stud[]=new String[num] ;
		 System.out.println("Enter"+num+" students name: ");
		for(int i=0;i<num;i++) {
			
			stud[i]=s.nextLine();
		}
				File f=new File("C:/Users/azuser/Documents/TCS training/tcs-training1.xls");
				if(f.createNewFile())
				{
					System.out.println("File is created with the name: "+f.getName());
				}
				else
				{
					System.out.println("Unable to create a file");
				}
				 FileWriter fw=new FileWriter("C:/Users/azuser/Documents/TCS training/tcs-training.xls");
			       
				  for(int j=0;j<num;j++) {

				  fw.write(stud[j]);

				  fw.write(System.getProperty( "line.separator" ));

				  }

				  fw.close();

				     

				System.out.println("Students names are saved on excel sheet named <<tcs-training.xls");

				}				
		
	}
