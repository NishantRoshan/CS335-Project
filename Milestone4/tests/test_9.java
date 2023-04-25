public class expression {
    public static int foo(){
        int j = 5;
        System.out.println(j);
        return 1;
    }
    public static int fee(){
        int i = 10;
        System.out.println(i);
        return 1;
    }
    public static int main() {
        int c;
        c = 10;
        if(c>20){
            int a = foo();
        }else{
            int b= fee();
        }
        return 0;
    }
}