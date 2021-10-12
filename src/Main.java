
public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.setId(1);
        atm.setUserName("Dimon");
        atm.setCacheAmount(5);

        Atm atm2 = new Atm();
        atm2.setId(2);
        atm2.setUserName("Вася");
        atm2.setCacheAmount(5);

        Atm atm3 = new Atm();
        atm3.setId(3);
        atm3.setUserName("Петя");
        atm3.setCacheAmount(5);

        atm.run();
        atm2.run();
        atm3.run();
    }
}
