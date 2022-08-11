class gudmorning extends Thread{
public void run(){
try{
int i= 0;
while(i<5)
{
sleep(1000);
System.out.println("gud morning ");
i++;
}
}
catch(Exception e)
{
}
}
}
class hello extends Thread{
public void run(){
try{
int i=0;
while(i<5)
{
sleep(2000);
System.out.println("hello");
i++;
}
}
catch(Exception e){}
}
}
class welcome extends Thread{
public void run()
{
try{
int i=0;
while(i<5){
sleep(3000);
System.out.println("welcome");
i++;
}
}
catch(Exception e)
{
}
}
}
public class prg17{
public static void main(String[] args)
{
gudmorning t1 = new gudmorning();
hello t2 = new hello();
welcome t3 = new welcome();
t1.start();
t2.start();
t3.start();
}
}