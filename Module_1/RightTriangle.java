public class RightTriangle {
    public static void main(String[] args) {
        /* Write a program RightTriangle that takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle
        - Each integer must be positive
        - The sum of the squares of two of the integers must equal the square of the third integer.*/
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle = (((a > 0) && (b > 0) && (c > 0)) && ((a * a + b * b == c * c) || (
                b * b + c * c == a * a) || (c * c + a * a == b * b)));
        System.out.println(isRightTriangle);
    }
}
