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
        System.out.println((a || b) && ((a == b) || a));

        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);

        //Question 5
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));
    }
}

