public class CheckDigit 
{   
  /** Returns the check digit for num, as described in part (a).  
   *  Precondition: The number of digits in num is between one and    
   *  six, inclusive.  
   *          num >= 0  
   */  
   public static int getCheck(int num) 
   {  
    int x =0;
     int y= getNumberOfDigits(num);
     for(int i=1;i<=y;i++){
x=x+getDigit(num,i)*(8-i);
     }
     return x%10;
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     if(getCheck((int)(numWithCheckDigit/10))==numWithCheckDigit%10){return true;}
     return false;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
