package PatronesDiseño;


//Esta clase es llamada por la clase "Principal"
public class Modem {
   /*  S I N G L E T O N  */

   private String ssid;
   private String password;
   private String mac_address;

   //variable estática privada que almacene una referencia al objeto que vamos a crear a traves del constructor
   private static Modem mimodem;

   private Modem(String ssid, String password, String mac_address) {
      this.ssid = ssid;
      this.password = password;
      this.mac_address = mac_address;
   }

 //método estático publico que se encarga de instanciar el objeto la primera vez y almacenarlo en la variable estática
 // apoyándose en el constructor privado que recordemos se puede llamar desde la misma clase.
   public static Modem getModem(String ssid, String password, String mac_address) {
      if(mimodem==null){
         mimodem = new Modem(ssid,password,mac_address);
      }

      return mimodem;
   }

   //Getter and setters

   public String getSsid() {
      return ssid;
   }

   public void setSsid(String ssid) {
      this.ssid = ssid;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getMac_address() {
      return mac_address;
   }

   public void setMac_address(String mac_address) {
      this.mac_address = mac_address;
   }



}
