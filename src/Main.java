public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(344, 1230, 674, "Ferrari");
        Tesla tesla = new Tesla(350, 1950, 612, "Tesla");
        Porshe porshe = new Porshe(354, 1560, 600, "Porche");
        porshe.getCar();
        tesla.getCar();
        ferrari.getCar();
    }
}
