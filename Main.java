public class Main{

    public static int add(int a, int b) {
        return a + b;
    }   

    public static void main(String[] args) {
        System.out.println("This is Main file running");
        int result = add(5, 3);
        System.out.println("The sum is: " + result);
    }
}