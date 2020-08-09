public class newThread extends Thread {
    public void run() {
    	try {
    	Thread.sleep(10000);
    	DrinkMachine.outlets--;
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	}
        }
}
