public class if_else {
    public static int main() {
        int c = 20;
        if(c >= 10){
            for(int i=0;i<5;i++){
                c++;
            }
        }else{
            for(int i=0;i<5;i++){
                c--;
            }
        }
        System.out.println(c);
        return 0;
    }
}