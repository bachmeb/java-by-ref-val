
class TestApp {
	
	public static void main(String[] args){

		System.out.println("Hello, world");
		
		TestApp me = new TestApp();
		
		me.go();
		
	}
	
	public void go(){
		
		Box box = new Box();
		box.setName("Alpha");
		
		System.out.println("Box is named: " + box.getName() );
		
		BoxChanger.changeName(box);
		
		System.out.println("Box is named: " + box.getName() );		
		
	}
	
	class Box {
		
		String name;
		
		public Box(){
		}
		
		public Box(String givenName){
			this.name = givenName;
		}
		
		public void setName(String newName){
			this.name = newName;
		}	
		
		public String getName(){
			return this.name;
		}
		
	}	
	class BoxChanger {
		
		public BoxChanger(){
		}

		public static void changeName(Box param){
		param.setName("Beta");
		}
	
	}
	
}

