package day5.string;

public class StringDemo2 {
	  public static void main(String[] args){
	        System.out.println("***********Using New Operator**********");

	        String st1 = new String("hello");
	        String st2 = new String("hello");

	        if(st1==st2){
	             System.out.println("both refer to same object");
	        }else{
	            System.out.println("both refer to differernt object");
	        }
	        
	        System.out.println("***********Using String Literal**********");
	        
	        String st3 = "java" ; 
	        String st4 = "java";
	        
	        if(st3 == st4) {
	        	 System.out.println("both refer to same object");
	        }else {
	        	 System.out.println("both refer to differernt object");
	        }

	    }
}
