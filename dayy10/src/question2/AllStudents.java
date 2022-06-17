package question2;
import java.util.Scanner;
public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The First Student Details");
		 String name = sc.next();
		 System.out.println("Enter Your Address");
		 String add = sc.next();
		 System.out.println("Enter Your Physic marks");
		 int ph = sc.nextInt();
		 System.out.println("Enter Your chem marks");
		 int chem = sc.nextInt();
		 System.out.println("Enter Your maths marks");
		 int mat = sc.nextInt();
		 
		 ScienceStudent dd = new ScienceStudent(name,add,ph,chem,mat);
		 System.out.println("Enter Your Second Student Details");
		 String naa = sc.next();
		 System.out.println("Enter Your Adrress ");
		 String adres = sc.next();
		 System.out.println("Enter Your histror");
		 int hist = sc.nextInt();
		 System.out.println("Enter Your cive");
		 int civ = sc.nextInt();
		 
		 HistoryStudent mar = new HistoryStudent(naa,adres,hist,civ);
		 
		 
		 System.out.println("Percentage of Studetn");
		 double percen = dd.getPercentage();
		 System.out.println(percen);
		 
		 System.out.println("Percentage of Student2");
		 double ta = mar.getPercentage();
		 System.out.println(ta);
	}

}
