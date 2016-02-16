
class RefTest {

	public static void main( String[] args ){
		RefTest me = new RefTest();
		me.go();
	}

	public void go(){
		Dog aDog = new Dog("Max");
		
		foo(aDog);

		if (aDog.getName().equals("Max")) { //true
			System.out.println( "Java passes by value." );

		} else if (aDog.getName().equals("Fifi")) {
			System.out.println( "Java passes by reference." );
		}	
		
	}
	
	public void foo(Dog d) {
		d.getName().equals("Max"); // true

		d = new Dog("Fifi");
		d.getName().equals("Fifi"); // true
	}
	
	class Dog {
		String name;
		
		public Dog(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	}
	
}