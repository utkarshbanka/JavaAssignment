package question2;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				int num=arr[j][i];
				if(num%2==0) {
					sum=sum+num;
				}
			}
			System.out.println(sum);
		}
	}

}
