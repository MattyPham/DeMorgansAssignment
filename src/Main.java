public class Main {
    public static void main(String[] args) {
        //Question 1
        int x = 18;
        int y = 36;
        System.out.println((((x * 4) / 2) == y) && (x < y));

        //Question 2
        x = 60;
        y = 100;
        int z = 200;
        System.out.println((x != y) || (x < y) && (x + y) > z);

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println((a == b) || (a == a) && (b == b) || a);

        //Question 4
        a = false;
        b = false;
        x = 300;
        y = 460;
        System.out.println((b == b) && ((x / 30) * 2) == (((y * 2) / (247 + 213)) * 10));

        //Question 5
        System.out.println(Math.sqrt(Math.pow(9,9)) == (9841.5 * 2) || (Math.sqrt(Math.pow(8,2)) == 9));
    }
}

