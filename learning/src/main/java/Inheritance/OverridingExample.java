package Inheritance;

class Parent {
	void show() {
		System.out.println("Parent's class msg");
	}
}

class Child extends Parent {

	@Override
	void show() {
		System.out.println("Child's class message");
	}
}

class OverridingExample {
	public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		obj1.show();
		Parent obj2 = new Child();
		obj2.show();
	}
}
