package BinarySearchJava;

public class BSJava {
        //in sorted array
      static int binarySearch(int array[], int l, int r, int xSearch){

          while(l<=r){ //means that will keep search until both parts get fetch
              //looking middle point of array:

              int m =(l+r) / 2; //l on start should be zero, and R should be last position of the array

              if(array[m] == xSearch){
                  return m;
              }else if(array[m] > xSearch){
                  r = m - 1;
              }else{
                  l = m + 1;
              }

          }
        return -1; //in case element is not found
      }

      public static void main (String args[]){
          int a[]={2,3,4,100,200,400};
          int n = a.length;
          int xSearch = 100;

          int res = binarySearch(a,0,n-1, xSearch);

          System.out.println("element to be searched is: "+ xSearch);

          if(res == -1)
              System.out.println("element is not in array");
          else
              System.out.println("element is at index: " + res);
      }
}
