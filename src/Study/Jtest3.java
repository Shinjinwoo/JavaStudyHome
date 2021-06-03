package Study;

class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T, S> {
	// T,S에 올수 있는 데이터타입은 참조형만 올수 있다.
	// 기본 데이터 타입은 올 수 없다 . : int,char,double 등등
	// WrapperClass를 사용해 기본 데이터타입을 객체인것 처럼 만들수 있는 객체를 제공
	public T info;
	public S id;

	Person(T info, S id) {
		this.id = id;
	}

	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class Jtest3 {
	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person p1 = new Person(e, i);
		p1.printInfo(e);

	}
}
