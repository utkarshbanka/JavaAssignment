package question3;

public class Main{
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
	//write the logic to iterate through the supplied inputArray and
		 int k=0;
		 int [] secArray=new int[inputArray.length];
		for(int i=0;i<inputArray.length;i++) {
			int count=0;
			int num= inputArray[i];
			for(int j=1;j<=num;j++) {
			if(num%j==0) {
				count++;
			}
		  }
			if(count==2) {
				secArray[k]=inputArray[i];
				k++;
			}
		}

		int flag=0;
		for(int i=0;i<secArray.length;i++) {
			if(secArray[i]==0) {
				flag++;
			}
		}
		
		if(flag==secArray.length) {
			return  null;
		}else {
			return secArray;
		}
		
	}
	public static void main(String[] args){
	//Create the object of Main class
		Main m1=new Main();
		
	
	 int[] arr = {10,12,5,20,11,14,15};
	 int[] res=m1.findAndReturnPrimeNumbers(arr);
	 if(res==null) {
		 System.out.println("Prime number not found in the supplied Array");
	 }else {
	 for(int i=0;i<res.length;i++) {
		 if(res[i]!=0) {
		 System.out.print(res[i]+" ");
		 }
	 }
	 }
	}
	}
