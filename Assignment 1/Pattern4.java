
public class Pattern4 {
    
    
    
    public static void main(String [] args)
    {
        int m=8;
        int n=14;
        
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                
                
                if((j<=i && i<=5) || i>=6 || j>=n-i)
                {
                    System.out.print("*");
                }
               else
                {
                    System.out.print(" ");
                }
                
            }
            
            
            System.out.println();
        }
    }
    
    
    
}
