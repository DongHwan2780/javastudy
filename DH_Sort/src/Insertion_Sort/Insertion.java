package Insertion_Sort;

public class Insertion
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    int arr[] = {5,3,1,4,2};
    
    for(int i = 1; i < 5; i++)
    {
      int temp = arr[i];
      for(int j = i; j >= 0; j--)
      {
        if(j == 0)
          arr[0] = temp;
        else if(arr[j - 1] <= temp)
        {
          arr[j] = temp;
          break;
        }
        else
          arr[j] = arr[j - 1];
      }
    }
    
    for(int a : arr)
      System.out.println(a);
  }

}
