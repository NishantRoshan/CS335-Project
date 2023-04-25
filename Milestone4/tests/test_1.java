public class test {
    public static int foo(){
        return 1;
    }

    public static int main() {
        for (int i = 0; i < 10; i++) {
            int j = foo();
            System.out.println(j);
        }
        return 0;
    }
}