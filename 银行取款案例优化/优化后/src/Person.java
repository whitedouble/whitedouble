
//½ÇÉ«Àà
public class Person extends Thread {

	private String name;
	private String type;
	private int num;
	private int deltime;
	public Person(String name,String type,int num,int deltime){
		this.name=name;
		this.type=type;
		this.num=num;
		this.deltime=deltime;
	}
	
	@Override
	public void run(){
		
		while(Bank.money>=num){
			if(type=="A"){
				Bank.Counter(name,num);
			}else{
				Bank.Atm(name,num);
			}
			
			try {
				sleep(deltime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
