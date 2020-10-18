package HomeWork2;





class Waiter_BusyWait extends Thread {
	String Waiter;
	Food_BusyWait food;

	public Waiter_BusyWait(String Waiter, Food_BusyWait food2) {
		this.Waiter = Waiter;
		this.food = food2;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			food.receiveOder(Waiter);
		}
	}
}

public class Restaurant_BusyWait_synchronized {
	public static void main(String[] args) {
		Food_BusyWait food = new Food_BusyWait();
		Waiter_BusyWait Waiter =new Waiter_BusyWait("웨이터",food);
		Chef_BusyWait Chef = new Chef_BusyWait("주방장",food);
		Waiter.start();
		Chef.start();
	}
}
