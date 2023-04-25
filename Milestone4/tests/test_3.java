public class test {
    public static int foo(){
        return 1;
    }

    public static int main() {
        int i,j,v;
        i= 4;
        j =3;
        v = 5;
        if (i < j) {
            v = j-i;
        } else {
            v = j*i+j;
        }
        System.out.println(v);
        return 0;
    }
}