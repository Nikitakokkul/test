
import java.util.*;
 public class ConvertNumToWord1
 {
	private static String fun(int n)
	{
	   String str="";
	  String[]units={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	   String[]tens={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	 if(n<20)
	  {
		str =  units[n];
	  }
	  else if (n>=20 && n<100)
	  {
	  str=tens[n/10]+units[n%10];
	  }
	  
	    else if (n>=100 && n<1000)
	  {
		  return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + fun(n % 100);
	  }
	  else if (n>=1000 && n<100000)
	  {
		return fun(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + fun(n % 1000);  
	  }
	  else if (n>=100000 && n<10000000)
	  {
		 return fun(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + fun(n % 100000);
		 
	  }
	  return str ;
	 }
	 
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter num");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		System.out.println("Rs. "+ fun(num) +" ONLY");	
	}
 }
		
	  
	  