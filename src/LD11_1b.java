
public class LD11_1b {
	
	private static int [][] M1 = new int[][] {{1,1,1,1,1,1,1,1,1,1},
											{2,2,2,2,2,2,2,2,2,2},
											{3,3,3,3,3,3,3,3,3,3},
											{4,4,4,4,4,4,4,4,4,4},
											{5,5,5,5,5,5,5,5,5,5},
											{6,6,6,6,6,6,6,6,6,6},
											{7,7,7,7,7,7,7,7,7,7},
											{8,8,8,8,8,8,8,8,8,8},
											{9,9,9,9,9,9,9,9,9,9},
											{10,10,10,10,10,10,10,10,10,10}};
	public static void main(String[] args) {

MyThread1b First;
		First = new MyThread1b(M1,5,"Even",3,0);
		new MyThread1b(M,1,"ODD",2,0);
First.start();
	}
}
