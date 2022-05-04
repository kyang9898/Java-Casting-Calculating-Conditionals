public class Casting {
    public static void main(String[] args) {

        double num = 112.35;
        System.out.println("Double: " + num);

        int data = (int) num;
        System.out.println("int: " + data);

        String value = "49";
        System.out.println("The string value is: " + value);

        int dataValue = Integer.parseInt(value);
        System.out.println("The int value is: " + dataValue);

    }
}
