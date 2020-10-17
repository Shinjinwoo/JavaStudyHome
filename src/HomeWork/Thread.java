
public class Thread {
	/*프로세스
- 정의 : CPU가 실행중인 프로그램을 의미합니다.
- 구성요소 : Code와 Data로 구성됩니다.

※기타 용어의 정리
멀티 프로세싱
- 하나 이상의 cpu에 의해서 여러개의 프로그램이 실행 되는 것.
멀티 프로그래밍
- 하나의 cpu에서 여러개의 프로그램이 실행 되는 것 
멀티 태스킹 
- 멀티 프로그래밍과 비슷한 개념으로 여러개의 job을 동시에 병렬처리하는 것
- 멀티 프로그래밍과 동일하다고 보면 됨.

*/
/**[Thread]
 * :Process 내(실행중인 프로그램)에 존재하는 독립된 작업의 단위로 실행 중에 제어권 이동이 가능한 것
쓰레드의 장점 - 재사용과 데이터 공유 : 위의 그림에서와 같이 프로세스는 메모리에 각각 올라가게 되며 쓰레드는 데이터를 공유합니다.
쓰레드의 단점- 공유 자원에 대한 처리(Mutex관리, 상호배제)

 * [정의 및 기능]
- 메모리를 공간을 할당받아서 프로세서가 실행 중인 프로그램을 프로세스라고 합니다.
- 스레드는 프로세스 내의 명령어 블록으로 시작점과 종료점을 가지는 일련된 하나의 작업 흐름
- 순차적으로 동작하는 문장들의 단일 집합으로 실행 중에 멈출 수 있으며
(제어권을 다른 스레드에게 넘김) 동시에 서로 다른 스레드를 수행하는 것이 가능
- 프로세스는 제어권을 가지면 종료 될 때까지 제어권의 이동이 불가능하지만 
스레드는 종료되기 전에도 제어권의 이동이 가능합니다.
- Java 에서는 java.lang 패키지에 스레드를 위한 Runnable 인터페이스와
 Thread, ThreadGroup, ThreadLocal, InheritableThreadLocal 클래스를 제공
- 1.5 이상의 버전에서는 스레드의 동기화를 위해서 java.util.concurrent 패키지 제공
- JDK는 스레드를 지원하는 java.lang.Thread 클래스를 제공

**[[ java.lang.Thread 이용 -Thread 클래스 ]]
: Thread를 extends 해줍니다.
:다음 여기서 run()메소드를 오버라이드 해줍니다.
:그 후에 실행을 할 수 있도록 start()메소드를 실행시켜줍니다
■ 스레드를 생성하는 방법
 => java.lng.Thread 클래스를 이용하는 방법
1) Thread 클래스를 상속받는 클래스를 작성함
2) public void run() 메소드를 오버라이딩 함
3) main 메소드에서 클래스를 객체 생성함
4) 해당 객체의 start() 메소드를 호출하여 스레드를 실행시킴

public class Go extends Thread { // Thread 클래스 상속받음
	public void run() { // run 메소드에 실행할 코드 넣음
		while (true) {
			System.out.println("Go");
		}
	}
}
public static void main(String[] args) {
		Go g = new Go();  // Go 클래스 객체 생성
		g.start(); // Go 클래스의 start 메소드를 호출
	}

1. Thread의 생성자
v Thread()
v Thread(String s): 스레드 이름을 설정해서 생성
v Thread(Runnable r): Runnable 을 implements 한 클래스 객체를 이용해서 생성
v Thread(Runnable r, String s)--> name이 없으면 Thread 0,1,2....​​
2. 메서드
void run() : 스레드로 수행될 내용을 저장, 재정의 해서 사용--> 이 메소드 반드시 재정의 해서 해야 스레드 사용가능
start(): 스레드를 시작	
v static void sleep(long msec) throws InterruptedException: msec에 지정된 밀리초(milliseconds) 동안 대기
v String getName(): 스레드의 이름을 반환
v void setName(String s): 스레드의 이름을 s로 설정
v void start(): 스레드를 시작 run() 메서드를 호출
v int getPriority(): 스레드의 우선 순위를 반환(1~10사이의 값)
v void setPriority(int p): 스레드의 우선 순위를 p값으로 설정
v boolean isAlive(): 스레드가 시작되었고 아직 끝나지 않았으면 true를 그렇지 않으면 false를 반환
v void join() throws InterruptedException : 호출하는 스레드가 끝날 때까지 대기 
v void run(): 스레드가 실행할 부분을 기술하는 메서드로 하위 클래스에서 오버라이딩 되어야 합니다.
v void suspend(): 스레드가 일시 정지 resume()에 의해 다시 시작될 수 있습니다.
v void resume():일시 정지된 스레드를 다시 시작시킵니다.
v void yield(): 다른 스레드에게 실행 상태를 양보하고 자신은 준비 상태로 변경됩니다.
v void interrupted():스레드 강제 종료
V static void sleep(long msec):million second동안 중지
V setDamon(boolean daemon): 데몬설정여부, start()전에 호출되어야 효과가 있음
 
 

**[[java.lang.Runnable 이용 -Runnable 인터페이스]]
:Runnable 인터페이스를 구현 한 후에,  Thread 생성자에 Runnable 인터페이스를 전달 합니다.
- 새로 만들어진 쓰레드의 상태 (모든 상태가 아닙니다.)
- Runnable 상태 : 쓰레드가 실행 가능한 상태
- Running 상대 : 스케쥴러에 의해 선택된 쓰레드가 실행중인 상태

■ 스레드를 생성하는 방법
2. => java.lang.Runnable 인터페이스를 이용하는 방법
1) Runnable 인터페이스를 구혆하는 클래스를 작성함
2) public void run() 메소드를 오버라이딩 함
3) main 메소드에서 클래스를 객체 생성함
4) Thread 객체를 생성함 생성자 인자로 Runnable 를 구현한 클래스 객체를 지정함
5) Thread 객체의 start() 메소드를 호출함

// Runnable 인터페이스를 구현한 Go 클래스 정의
// 단지 Runnable 인터페이스만을 구현했기에 Go 클래스는 아직 스레드는 아님
public class Go implements Runnable {
	public void run() { // Run 메소드를 오버라이딩 하고 무한루프를 실행함
		while (true) {
			System.out.println("Go");
		}
	}
}
	public static void main(String[] args) {
		Go g = new Go();  // Go 클래스 객체 생성
		Thread t = new Thread(g); // Go 클래스를 스레드로 실행시키기 위해 Thread 객체 생성
		// Thread t = new Thread(new Go());
		t.start(); // Go 클래스의 스레드 객체의 start 메소드를 호출
	}

:스레드를 만들기 위한 인터페이스
:public void run()만 소유
Runnable 인터페이스 
v Runnable 인터페이스를 이용하여 스레드를 생성할 수 있습니다.
v Runnable 인터페이스에는 run() 메서드만 선언되어 있습니다

**스레드의 종료
-run()메서드 리턴,  try, catch문에서 catch(Interrupted Exception e){ return; }; 만났을때 

**Multi Thread
- 2개 이상의 스레드가 실행 중인 겨우
- static 쓸때 주의할 것(공유자원)

멀티스레드 고려사항
1. 상호배제 : 하나의 스레드가 사용중인 공유자원을 다른스레드가 수행 할 수 없다.
2. 동기화 : 작업 순서를 결정 하는 것
3. 생산자와 소비자 문제 : 소비자는 생산자가 자원을 생산해 주어야만 작업을 수행할 수 있다.
Object 클래스의 wait(),notify()  사용
if, 내가 소비자면 기본 wait 이고, 생산자가 notify를 하게 됨.
4. Semaphore 세마포어
2개 이상의 공유 자원이 있을 때 동시에 공유자원을 사용 할 수 있는 스레드의 개수를 설정

 * */
/**자바는 사용자가 직접 스레드를 생성하고 관리하여 멀티태스킹 환경을 구축할 수 있도록 도와준다.
 *  시간이 오래걸리는 작업을 백그라운드에서 수행하거나, 타이머 (Timer),
 *  소켓 프로그래밍 (Socket Programming) 등에 널리 활용될 수 있다.
우선, 스레드를 구현하는 방법은 여러가지가 있는데, 대표적으로 두 가지 방법이 가장 많이 사용된다.
1. Thread라는 클래스를 상속 (Extending Thread class)
2. Runnable이라는 인터페이스를 구현 (Implementing Runnable interface)
*/ 
	/*CPU스케쥴링과 쓰레드 스케쥴링
 2-1 CPU스케쥴링
- 작업을 처리하기 위해서 프로세스에게 CPU나 다른 처리기를 할당하는 정책을 말합니다.
- 종류
●선점(preemptive) 스케쥴링
하나의 프로세스가 CPU를 차지하고 있을 때 우선순위가 높은 다른 프로세스가 현재 프로세스를 중지시키고 자신이 CPU를 차지할 수 있는 정책
●비선점(non-preemptive) 스케쥴링
하나의 프로세스가 CPU를 할당 받으면 다른 프로세스는 CPU를 점유하지 못하고 수행중인 프로세스가 끝날 때까지 기다리는 정책

 2-2 쓰레드 스케쥴링
- 멀티 쓰레드가 동작 할 때 어떤 쓰레드를 먼저 실행 할지 결정하는 작업을 말합니다.
- 보통 선점 스케쥴링과 비선점 스케쥴링을 혼합하여 동작을 합니다. 
- 자바에서는 선점형 스케쥴러를 사용합니다.(우선 순위가 높은 쓰레드가 먼저 실행됨!!)
*/
	

 
/*
■ blocking 메소드 
1. => sleep 메소드
1) sleep 메소드 사용법 : Thread.sleep(1/1000초);
2) 메소드 인자로 지정된 시간만큼 실해중인 스레드가 block 됨
3) 스레드 잠자기

	public void run() {
		// TODO Auto-generated method stub
		페이지 237
		long sleepTime = (long) (Math.random() * 500);
		try {
			Thread.sleep(sleepTime);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

2. => yield 메소드
1) 용도는 다른 스레드에게 실행할 기회를 주기 위해서 사용됨
2) 우선권이 동일한 스레드에게 실행할 기회를 제공함
3) 사용법 : Thread.yield();
4) 현재 스레드의 실행을 중단하고 다른 스레드가 실행될 수 있도록 양보한다 

3.=> join 메소드
1) 스레드의 종료 순서를 지정할 수 있는 방법으로 사용할 수 있음
2) join 메소드를 호출한 스레드가 종료하기 전까지 현재 실행중인 스레드가 block 됨
3) 다른 스레드가 죽을 때까지 기다리기
*/
 
/*
■ 동기화 (synchronized 키워드를 사용함)
자바도 여러 스레드가 하나의 데이터를 공유할 때 
하나의 스레드가 해야 되는 작업이 끝날 때까지 공유되지 않도록 보장해 주는 방법이 동기화다

// 동기화 메소드를 사용하는 방법
접근지정자 synchronized 리턴타입 메소드명() {..}

// 동기화 블록을 사용하는 방법
접근지정자 리턴타입 메소드명() {
	...
	synchronized(공유객체) {
	}
	...
}
*/
	
/*■ 스레드 정보 
필드           / 타입                   / 내용
 
스레드 이름    / 스트링                 / 스레드의 이름으로서 사용자가 지정 
스레드 ID    / 정수                   / 스레드 고유의 식별자 번호 
스레드의 PC(Program Count)/ 정수   / 현재 실행 중인 스레드 코드의 주소 
스레드 상태   / 정수 / NEW, RUNNABLE, WAITING, TIMED_WAITING, BLOCK,TERMINATED 등 6개 상태 중 하나 
스레드 우선순위/ 정수                   / 스레드 스케줄링 시 사용되는 우선순위 값으로서 1~10 사이의 값이며 10이 최상위 우선순위
스레드 그룹   / 정수                    / 여러 개의 자바 스레드가 하나의 그룹을 형성할 수 있으며 이 경우 스레드가 속한 그룹
스레드 레지스터 스택/ 메모리 블록       / 스레드가 실행되는 동안 레지스터들의 값
 
*/

}
