/* Half Dollar - chapter 4 using for loops */

class HalfDollar {
    public static void main(String[] arguments) {
        int[] denver = { 2500000, 2900000, 3500000 };
        int[] philadelphia = { 2500000, 2900000, 3800000 };
        int[] total = new int[denver.length];
        int sum = 0;
 
        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philadelphia[i];
            System.out.format((i + 2003) + " production: %, d%n", total[i]);
           sum += total[i];
        }
        System.out.format("Average production: %,d%n", (sum / denver.length));
}
}

