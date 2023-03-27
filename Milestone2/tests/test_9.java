public class Nesting {
    public static void main(String args[])
    {
        //Input
        int x=30;
        int y=50;
	    
        //Condition1
        if(x==30){
            //Nested condition
	        if(y==40){
	            System.out.println("Correct Answer");
	        }
	        else{
	            System.out.println("Wrong Answer");
	        }
        }
    }
}
