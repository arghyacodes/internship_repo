class Test{
	public
	char k;
	Test(){
		System.out.println("Non Parameterised Constructor");
	}
	
	public Test(char k){
		this.k = k;
		System.out.println("Non Parameterised Constructor "+ k);
	}
	
	Test(Test obj){
		this(obj.k);
		
	}
}

class Constructor{
	
	public static void main(String[] args) {
		Test obj1 = new Test(); //non parameterized
		
		Test obj2 = new Test('A'); //parameterised
		
		Test obj3 = new Test(obj1); //copy constructor
	}
}