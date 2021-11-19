package javaprogram;

public class Encap_Ex2 {

	    public int a;
	    public float b;
	    public String str;
	    
	    Encap_Ex2(){
	    	 
	    	    a = 10;
	    	    b = (float)12.34;
	    	    str = "Public values  !!!";
	    }
	    
	    public void display() {
	    	
	    	    System.out.println("The Public Integer Value is : "+a);
	    	    System.out.println("The Public Integer Value is : "+b);
	    	    System.out.println("The Public Integer Value is : "+str);
	    }
}

class MainClass {

	public static void main(String[] args) {
		
		    Encap_Ex2 obj = new Encap_Ex2();
		    
		    obj.display();

	}

}
