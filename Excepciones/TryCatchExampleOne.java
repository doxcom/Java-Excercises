package Excepciones;

public class TryCatchExampleOne {


    public static void main(String[] args) {
        method1();
        System.out.println("Line after exception - main");
    }

    private static void method1() {

        method2();
        System.out.println("Line after Exception - Method 1");
    }
   private static void method2() {
       Connection connection = new Connection();
       connection.open();
        try {
            //logic
            String str = null;
            str.toString();

            connection.close();

        }catch (Exception e){
            System.out.println("Exception Handled - Method 2");
            return;
        }finally {
            connection.close();
        }



   }
}
