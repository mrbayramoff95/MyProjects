package lesson6;

public class Main {
    public static void main(String[] args) {
        Computer Pc1 = new Computer(500,"Asus");
        System.out.println(Pc1);
        Computer Pc2 = new Computer(500,"Horizont",new Hdd("Patriot500",1,"External"),new RAM("Dell",1000));
        System.out.println(Pc2);
    }
}
