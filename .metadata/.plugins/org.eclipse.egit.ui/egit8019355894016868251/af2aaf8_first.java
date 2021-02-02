public class first {

	public static void main(String args[]) {
		System.out.println(StringRev("Dhananjay"));
		System.out.println(CheckSum("3222"));
		SentenceRev();
	}

	public static	String StringRev(String input)
 {
String output = "";
int length = input.length();
for (int i =length-1;i>=0;i--)
{
char a = input.charAt(i);
output =output+a;
	}
		
		return output;
	}
	public static int CheckSum(String inp) {
		
		int lenght = inp.length();
		int sum = 0;
		for (int i = 0; i < lenght; i++) {
			char a = inp.charAt(i);

			int b = Integer.parseInt(String.valueOf(a));

			//System.out.println(b);
			sum = sum + b;

		}
	//	System.out.println(sum);
		if (sum == 9) {
			//System.out.println("Yes You Find");
		}
		return sum;
	}
	public static void SentenceRev() {
		
		String input = "This is my country";
		
		String[] x  = input.split(" ");
		System.out.println(x[1]);
		int lenght = x.length;
		
		for (int i = 0; i <lenght;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println(StringRev(input));
	}
}
