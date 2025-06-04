public class Hi {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hi");
        System.out.println("Hello, Hello!");

        int a, b, i;
        i=0;
        for (a=0; a<=10; a++) {
            i++;
            //System.out.println(i + " " + a);
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}
