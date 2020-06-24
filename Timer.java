class Timer extends Thread{
	int time;
	public static void main(String[] args) {
		Timer timingThread  = new Timer();
		timingThread.start();
	}

	@Override
	public void run(){
		while(true){
			System.out.print(time+"\r");
			time+=1;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){

			}

		}
	}
}