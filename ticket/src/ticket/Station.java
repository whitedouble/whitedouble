package ticket;

public class Station {
	public static int ticket=100;
	
	public static void buy_ticket(String win_name) {
		ticket--;
		System.out.print(win_name+"\n"+"·¢Æ±Êý1:"+"Ê£Óà"+ticket+"\n");
	}
}
