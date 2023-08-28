//public class arshu //array
//{
  //  public static void main(String[]args)
    //{
      //  int num[] =  new int[4];
        //num[0]=2;
        //num[1]=4;
        //num[2]=9;
        //num[3]=8;

        //for (int i=0;i<4;i++)
        //{
          //  System.out.println(num[i]);
        //}
        

    //}

//}


//public class arshu    //multi dimensional array
//{
  //  public static void main(String [] args)
    //{

      //  int num[][]= new int[3][4];
        //for (int i=0;i<3;i++)
        //{
          //  for (int j=0;j<4;j++)
            //{
              //num[i][j] = (int) (Math.random() *10);
            //}
        //}
        //for (int i=0;i<3;i++)
        //{
          //  for (int j=0;j<4;j++)
            //{
              //System.out.print(num[i][j] + " ");
            
            //}
            //System.out.println();
        //}
        //for (int n[] : num)
        //{
          //for (int m:n)
          //{
            //System.out.print(m + " ");
          //}
          //System.out.println();
        //}
    //}

//}



public class arshu
{
  public static void main(String [] args)
  {
    int num[][] = new int[4][4];
    //int random = 0 ;
     //generate a random value
    //random function returns a double value  
    // random function gives u a function which in decimal points
    //since random value gives decimal value as result it is multiplied by 100
    //then it is type casted to integer.since i wnt to repeat several times using this syntax in loop.
     //(int)Math.random() * 100 ;
     for (int i=0;i<4;i++)
    {
      for (int j=0;j<4;j++)
      {
        num[i][j]=(int)(Math.random() * 10 );
        
      }
      
    }
    
    for (int i=0;i<4;i++)
    {
      for (int j=0;j<4;j++)
      {
        System.out.print(num[i][j] + " " );
      }
      System.out.println();
    }

  }
}