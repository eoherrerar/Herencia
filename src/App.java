public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(3,4);
        Punto p2 = new Punto(6);
        Punto p3 = new Punto();
        System.out.println(p3.getX());
        System.out.println(p3.getY());
        System.out.println("------------------------------");
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println("-----------------------------");
        System.out.println(p1.getX());
        System.out.println(p1.getY());
    }
}
