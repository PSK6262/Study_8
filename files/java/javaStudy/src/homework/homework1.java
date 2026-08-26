package homework;

public class homework1 {//1~10

	public static void main(String[] args) {
		//1
		int[] iArr = {1,2,3,4,5};
		for(int p : iArr) System.out.print(p+" ");
		System.out.println();
		
		//2
		int[] iArr2 = new int[5];
		iArr2[2] = 50;
		
		//3
		System.out.println(iArr.length);
		
		//4
		int sum = 0;
		for(int p : iArr) sum+=p;
		System.out.println(sum);
		
		//5 , 1과 동일
		for(int p : iArr) System.out.print(p+" ");
		System.out.println();
		//-----------------//
		
		System.out.println(averageInt(iArr2)); //6
		
		System.out.println(maxValue(iArr2)); //7
		
		for(int p : iArr) System.out.print(p+" "); //8
		System.out.println();
		plusOne(iArr);
		for(int p : iArr) System.out.print(p+" "); //8 원본 변경
		System.out.println();
		
		int[] iArr3 = createIntArray(10); // 9
		
		for(int p : iArr) System.out.print(p+" "); //10 전
		System.out.println();
		flip(iArr);
		for(int p : iArr) System.out.print(p+" "); //10 후
		System.out.println();
		
		
		
	}
	public static double averageInt(int[] data) { //6
		double sum=0;
		for(int p : data) sum+=p;
		return sum/data.length;
	}
	public static int maxValue(int[] data) { //7
		int max = data[0];
		for(int i=1;i<data.length;i++)
			if(max<data[i]) max=data[i];
		return max;
	}
	public static void plusOne(int[] data) { //8
		for(int i=0;i<data.length;i++)
			data[i]++;
	}
	public static int[] createIntArray(int length) {//9
		return new int[length];
	}
	public static void flip(int[] data) { //10
		int[] temp = new int[data.length];
		for(int i=0;i<data.length;i++) temp[i]=data[i];
		for(int i=0;i<data.length;i++) {
			data[data.length-(i+1)] = temp[i];
		}
	}
}
