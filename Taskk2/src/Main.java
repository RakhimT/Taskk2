public class Main {

    public static void main(String[] args) {
        int amount = 1000;
        int rubles = 20; // (за каждые 20 рублей начисляются милли)
        int mile = 1;
        System.out.println(amount / rubles + " миль можно получить за 1000 рублей потраченные на билет");


        double a = 1030.5, r = 20;
        double m = a / r;
        System.out.println(m); // 51.525 миль можно получить за 1030.5 рублей потраченные на билет

    }
}