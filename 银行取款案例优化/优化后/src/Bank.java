
//银行类
public class Bank {

	public static int money=10000;//钱
	
	//柜台取钱函数
	public static void Counter(String name,int num){
		money-=num;
		System.out.println(name+"取了："+num+" 剩余钱数："+money);
	}
	
	//ATM取钱函数
	public static void Atm(String name,int num){
		money-=num;
		System.out.println(name+"取了："+num+" 剩余钱数："+money);
	}
	
	
}
