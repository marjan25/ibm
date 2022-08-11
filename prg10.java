class AA {
int i,j;
AA(int a,int b){
i=a;
j=b;
}
void show(){
System.out.println("inside A ");
System.out.println("a ="+i+"b = " +j);
}
}
class BB extends AA{
int k;
BB(int a,int b,int c){
super(a,b);
k=c;
}
void show(){
System.out.println("inside B ");
System.out.println("a="+i+"b="+j+"c="+k);
}
}
public class prg10{
public static void main(String args[]){
BB b = new BB(1,2,4);
b.show();
AA a = new AA(1,30);
a.show();
}
}

