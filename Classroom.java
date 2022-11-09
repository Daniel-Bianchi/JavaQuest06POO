public class Classroom {
	
	public static void main(String[] args) {	
		Wilder a = new Wilder ("Kukrapok",true); 		  
	    Wilder b = new Wilder ("Kevina",false);
	    Wilder c = new Wilder ("Patator", true);	
	    Wilder d = new Wilder ("Jean-Eudes", false);
	    Wilder e = new Wilder ("John-Claude", true);
	    
	    a.getFirstname();
	    a.getIsAware();
	    System.out.println(a.whoAmI());
	    System.out.println(b.whoAmI());
	    System.out.println(c.whoAmI()); 
	    System.out.println(d.whoAmI());
	    System.out.println(e.whoAmI());
	}
}