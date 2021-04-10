class Parent {
public static void m1() {
System.out.println("Parent m1 Method");
}
public void m2() {
System.out.println("Parent m2 Method");
}
}

class Child extends Parent {
public static void m1() {
System.out.println("Child m1 Method");
}
public void m2() {
System.out.println("Child m2 Method");
}
public void m3() {
System.out.println("Child m3 Method");
}
}


class A {
public static void main(String[] args) {
	System.out.println(System.getProperty("user.dir"));
Parent p = new Child();

p.m1(); // Output 1
p.m2() ;// Output 2
String s1 = new String("ABC");
String s2 = "ABC";

StringBuffer sb1 = new StringBuffer("ABC");
StringBuffer sb2 = new StringBuffer("ABC");

System.out.println(s1.equals(s2));
System.out.println(s1 == s2);   // True
System.out.println(s1.equals(sb1)); //  True
System.out.println(sb1.equals(sb2));//  True
String Test = "Dhananjayeq";
int length = Test.length();
int count =0;
for (int i=0;i<length;i++)
{
	if(Test.charAt(i)=='a' || Test.charAt(i)=='e' ||Test.charAt(i)=='i' ||Test.charAt(i)=='o'|| Test.charAt(i)=='o')
	{
		count++;
	}
	}
System.out.println(count);
}

}