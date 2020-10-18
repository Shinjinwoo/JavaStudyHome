package HomeWork2;

public class Restaurant_BusyWait {
	public static void main(String[] args) {
		Food_BusyWait food = new Food_BusyWait();
		Waiter_BusyWait Waiter =new Waiter_BusyWait("웨이터",food);
		Chef_BusyWait Chef = new Chef_BusyWait("주방장",food);
		Waiter.start();
		Chef.start();
	}
}//순서를 정하지 않고 접근
//웨이터스레드가 푸드객체에 주문하고있는 도중에
//쉐프스레드가 실행되어 푸드객체에 대해 작업
