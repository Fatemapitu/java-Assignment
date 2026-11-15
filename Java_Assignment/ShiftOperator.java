public class ShiftOperator {
    public static void main(String[] args) {
        int num = 100;

        System.out.println("Left shift 1 time  : " + (num << 1));
        System.out.println("Left shift 2 times : " + (num << 2));
        System.out.println("Left shift 3 times : " + (num << 3) + "\n");

        System.out.println("Right shift 1 time  : " + (num >> 1));
        System.out.println("Right shift 2 times : " + (num >> 2));
        System.out.println("Right shift 3 times : " + (num >> 3) + "\n");

        System.out.println("Unsigned shift 1 time  : " + (num >>> 1));
        System.out.println("Unsigned shift to a Negative number 1 time : " + (-100 >>> 1));
    }
}
