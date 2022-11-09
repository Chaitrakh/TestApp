package in.ineuron.main;

//insertion sorting
public class InsertionSort
{
  public static void main(String[] args)
  {
      int[] ar = {5,8,9,0,6,7};

      //apply insertion sort algorithm on the array
      //to sort current index value be comparing with previous indexes value
      for(int k=1; k<ar.length-1; k++)
      {
          int temp = ar[k];//current index value - 5
          int j= k-1;//previous index key - index 0
          while(j>=0 && temp <= ar[j]) //index key(0) >=0 and current index value(5)//temp<= previous index value(7)
          {
              ar[j+1] = ar[j]; //ar[1] = ar [0] -> ar[1] will be 7
              j = j-1;//to check next previous index(0-1 = -1 -> j value will be -1)
          }//-1 >=0 -> false -> 1st : {7,7,2,3,1,4,6}
          ar[j+1] = temp; //ar[-1+1]=> ar[0] = temp(5) =>{5,7,2,3,1,4,6}
      }
      //to print
      for(int elem : ar)
      {
          System.out.print(elem+" ");
      }
      System.out.println(" ");
  }
}