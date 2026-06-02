package BinarySearchJava;

public class BSTelephone {

    static int bst(String[] contacts,int l, int r, String name){

         while(l<=r){
             int mid= (l+r)/2;

             if(contacts[mid]==name){
                 return mid;
             }else if(contacts[mid].charAt(0) >= name.charAt(0)){
                 r = mid - 1;
             }else{
                 l = mid + 1;
             }
         }

        return -1;
    }

    public static void main(String [] args){
        String contacts[] ={"aldo", "alberto", "alicia", "berenice", "beto","babason", "cullen", "cuorimi","danario", "dionicio","dinisius","efrain", "efren","daniela"};
        int n = contacts.length;
        String name = "dinisius";
       int res = bst(contacts,0,n-1,name);

        System.out.println("element to be searched is : " + name);

        if(res == -1){
            System.out.println("element was not found");
        }else {

            System.out.println("contact is on position: " + res);
        }

    }

    //dinisius

    // aldo, alberto, alicia, berenice, beto,babason, cullen, cuorimi,danario, dionicio,dinisius,efrain, efren,daniela
}                                                           //l         m                    r       mid
