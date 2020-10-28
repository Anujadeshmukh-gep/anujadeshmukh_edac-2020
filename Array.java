//Addition of two matrices
class Array
{
  public static void main(String[] args)
  {
      int row=2;
      int col=3;
      int matrix1[][]={{1,2,3},{4,5,6}};
      int matrix2[][]={{1,1,1},{2,2,2}};
      
      int sum[][]=new int[row][col];
       
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
           sum[i][j]=matrix1[i][j]+matrix2[i][j];
           
        }
      }
      System.out.println("sum of matrices ");
      
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
          System.out.print(sum[i][j]);
        }
            System.out.println();
      }    
  }
       
  }
      //OUTPUT

  sum of matrices
234
678

            
	
      

