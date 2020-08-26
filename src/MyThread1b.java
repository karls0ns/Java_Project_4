
public class MyThread1b implements Runnable {
	int [][] Mas1;
	Thread T;
	String Name;
	int StartRow;
	int Priority;
	int Delay;
	
	public MyThread1b(int[][] M1, int StartRow, String Name,int Priority, int Delay){
		this.Name = Name;
		this.Delay = Delay;
		this.StartRow = StartRow;
		T = new Thread(this);
		T.setPriority(Priority);
		T.start();
	}
	
	
	
	public void run(){
		T.start();
		int sum = 0;
		int k = StartRow, j = 0;
		
		
		
		while(k <= Mas1.length-1){ 

			sum = 0;
			j = 0;
			while(j <= Mas1[0].length-1){
    	   
				sum = sum + Mas1[k][j];    	   
				j = j+1;
			}

			System.out.println("Thread " +Name+ ". Row: " +k+ ", Summa " + sum);  
            try {
				Thread.sleep(Delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			k = k+2;

		}
		
		
	}


}
