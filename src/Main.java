public class Main {
    public static void main(String[] args) {
        char x=0;
        for (int i = 0; i < 555554; i++) {
            x=(char)i;
            System.out.print(x);
            if((int)i%1000==0) System.out.println();
        }
    }
}
