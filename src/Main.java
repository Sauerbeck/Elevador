public class Main {

    public static void main(String[] args) {

        Elevator e = new Elevator(4, 4);
        Elevator e1 = new Elevator(4, 3, 2, 4);

        e.addpassageiro();
        e.proxAndar();
        e.removerpassageiro();
        e.proxAndar();
        e.andarAnterior();
        e.addpassageiro();

        System.out.println(e.getAndaratual());
        System.out.println(e.getPassageiros());

    }
}