package ticket;

public class Window extends Thread{

	private String win;
	private int deltime;
	public Window(String win, int deltime) {
		// TODO Auto-generated constructor stub
		this.win=win;
		this.deltime=deltime;
	}
	@Override
	public void run() {
		while(Station.ticket>0) {
			Station.buy_ticket(win);
			try {
				sleep(deltime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}
