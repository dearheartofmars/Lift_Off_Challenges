public class AreaOfTriangle {
    public static void main(String[] args) {
        int base = 3;
        int height = 2;
        int area = AreaOfTriangle(base, height);
        System.out.println("triArea(" + base + ", " + height + ") ➞ " + area);
    }

    public static int AreaOfTriangle(int base, int height) {
        return (int) (0.5 * base * height);
    }
}
