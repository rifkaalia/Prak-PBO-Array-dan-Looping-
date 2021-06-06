package multidimensionalArray;

public class ContohArrayDuaDimensi {
	public static void main (String[] args) {
		int a[][]= {{1,2,3}, {3,4,5}};
		int b[][]= {{1,2,3}, {3,4,5}};
		int hasil[][]= new int[2][3];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				hasil[i][j]=a[i][j]+b[i][j];
				System.out.print(hasil[i][j]+" ");
			}
			System.out.println();
		}
	}
}
