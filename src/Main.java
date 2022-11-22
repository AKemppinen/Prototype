public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Kello k = new Kello(1, 0);
        System.out.println(k.getAika());

        Kello k2 = (Kello) k.clone();
        System.out.println(k2.getAika());

        k2.setMinuuttiviisari(45);
        k2.setTuntiviisari(15);
        System.out.println(k2.getAika());

    }
}
