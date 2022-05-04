public class Casting {
    public static void main(String[] args) {

        double num = 112.35; //Double 
        System.out.println("Double: " + num);

        int data = (int) num; //Converts the double into an integer.
        System.out.println("int: " + data);

        String value = "49"; //String
        System.out.println("The string value is: " + value);

        int dataValue = Integer.parseInt(value); //Converts the string into a integer.
        System.out.println("The int value is: " + dataValue);

    }
}
