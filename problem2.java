class Gcd
{
    public static void main(String[] args) {

       boolean result=prime(8); 
       System.out.println(result);
       if(result)
       {
        System.out.println("yes it is prime");
       }
       else
       System.out.println("no");
        
    }
    
   static boolean prime(int num)
    {
        int count= 0;
        for(int i=1; i<=num; i++)
        {
            if(num/i == 0)
            {
                count++;
            }
        }
        if(count==2)
            return true;
        else
        return
            false;

    }
}
