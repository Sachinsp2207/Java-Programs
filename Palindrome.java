package arrays;

public class Palindrome {
public static void main(String[] args) {
	int ip=212;
	int temp=ip;
	int op=0;
	
	while(ip!=0)
	{
		int rem=ip%10;
		op=op*10+rem;
		ip/=10;
	}
	if (op==temp) {
		System.out.println(op);
		System.out.println("palindrome num");
	} else {
		System.out.println(op);
		System.out.println("its not palindrome number");
	}
}
}
