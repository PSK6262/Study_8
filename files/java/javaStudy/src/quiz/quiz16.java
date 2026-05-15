package quiz;

public class quiz16 {

	public static void main(String[] args) {
		int[][] iArr = new int[5][5];
		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr[i].length;j++) {
				if(i==j) iArr[i][j] = 1;
				else if(i<j) iArr[i][j] = 2;
				else iArr[i][j] = 3;
				System.out.print(iArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}