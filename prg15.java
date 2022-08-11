import java.util.*;
class myexp extends Exception
{
myexp(String s){
super(s);
}
}
public class prg15
{
public static void main(String args[])throws myexp
{
System.out.print("enter marks");
Scanner sc = new Scanner(System.in);
int marks = sc.nextInt();
try{
if(marks>100)
{
throw new myexp(" marks are greater than 100");
}
else
System.out.println("marks="+marks);

}
catch(Exception e){
System.out.println("invalid marks error ++++++");
}
}
}