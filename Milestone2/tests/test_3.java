public class ContinueBreak {
    public static void main(String[] args) {
        System.out.println("Test Break statement in While loop");
		int i = 0;
		while (i < 5) {
			if (i == 4) {
				break;
			}
			if (i == 2){
				continue;
			}
			System.out.println(i++);
		}
    }
}