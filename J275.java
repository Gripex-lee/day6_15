package day6_15;

public class J275 {
	public static void main(String[] args) {
		Hero sj=new Hero("赏金猎人",1200,250);
		Hero ms=new Hero("盲僧",2000,200);
		Hero gl=new Hero("盖伦",3000,150);
		Hero tm=new Hero("提莫",1600,180);
		KillThread one=new KillThread(sj);
		KillThread two=new KillThread(gl);
		one.run(ms);
		two.run(tm);
	}
}
class Hero{
	String name;
	int hp;
	int damage;
	public Hero(String n,int h,int d) {
		this.name=n;
		this.hp=h;
		this.damage=d;
	}
}
class KillThread extends Thread{
	String name;
	public KillThread(Hero a) {
		this.name=a.name;
	}
	public void run(Hero b) {
		System.out.println(name+" 攻击 "+b.name);
	}
}