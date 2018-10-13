
//程序入口类
public class Main {

	//程序入口函数
	public static void main(String[] args){
		Bank bank=new Bank();
		PersonA a=new PersonA(bank);
		a.start();
		PersonB b=new PersonB(bank);
		b.start();
	}
}
