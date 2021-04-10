import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TryWithU {

	public static void main(String[] args) {
		 List<Character> lis = new ArrayList<>();
		 lis.add('a');
		 lis.add('r');
		 lis.add('o');
		 lis.add('p');
		 lis.add('s');
		 lis.add('s');
		 lis.add('r');
		 lis.add('o');
		 lis.add('p');
		RetunDuplicate(lis);
	}

	public static List<Character> RetunDuplicate(List<Character> charlist)
	{
		
		 List<Character> rem = new ArrayList<>();
		 int len = charlist.size();
		 
		 for (int i = 0;i<len;i++)
		 {
			 for (int j= i+1 ;j<len;j++)
			 {
				 if(charlist.get(i)==charlist.get(j))
				 {
					 rem.add(charlist.get(i));
				 }
				
			 }
			
		 } System.out.println(rem);
		
		return rem;
	}
}
