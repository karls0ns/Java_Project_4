public class MyThread1a extends Thread {
	int [][] Mas;
	String Name;
	int StartRow;
	int Priority;
	int Delay;
	
	public MyThread1a(int[][] M, int StartRow, String Name,int Priority, int Delay){
		Mas = M;
		this.Name = Name;
		this.StartRow = StartRow;
		this.Priority = Priority;
		this.Delay = Delay;
		
	}
	
	public void run() {		 	
		
		int sum = 0;
		int k = StartRow, j = 0;
		
		
		
		while(k <= Mas.length-1){ 

			sum = 0;
			j = 0;
			while(j <= Mas[0].length-1){
    	   
				sum = sum + Mas[k][j];    	   
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
