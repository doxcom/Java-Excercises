package PatronesDiseño;

public class Principal {

    public static void main(String[] args) {

        Modem mod = Modem.getModem("TPLAYSS34488A","Singletonpwd","91:75:1a:ec:9a:c7");

        System.out.println(mod.getSsid());
        System.out.println(mod.getMac_address());
        System.out.println(mod.getPassword());

    }
}
