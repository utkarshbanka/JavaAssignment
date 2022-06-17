package question2;

public class HistoryStudent  extends Student{

	
	int historyMarks;
	int civicsMarks;
	
	
	
	public HistoryStudent(String name, String address ,int am, int civ) {
		super(name, address);
		this.historyMarks = am;
		this.civicsMarks = civ;
		// TODO Auto-generated constructor stub
	}



	@Override
	double getPercentage() {
		double sum = (this.historyMarks+this.civicsMarks);
		double percent=((sum/200)*100);
		System.out.println("Name :"+ name); 
		System.out.println("Address:"+ address);
		return percent;
	}

}
