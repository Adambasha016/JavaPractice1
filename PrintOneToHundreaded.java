

class NumbePrinter implements Runnable{
	
	private int number;
	
	public NumbePrinter(int i) {
		this.number=i;
	}

	@Override
	public void run() {
		System.out.println(number+"    ");
	}
	
	
}


public class PrintOneToHundreaded {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			NumbePrinter nu=new NumbePrinter(i);
			Thread t1=new Thread(nu);
			t1.start();
	}

}
}    