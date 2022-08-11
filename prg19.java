import java.io.File;
public class prg19{

static void print(File[] arr,int index,int level)
{
if(index==arr.length)
return;
for(int i=0;i<level;i++)
System.out.println("\t");
if(arr[index].isFile())
System.out.println(arr[index].getName());
else if(arr[index].isDirectory()){
System.out.println("["+arr[index].getName()+"]");
print(arr[index].listFiles(),0,level+1);
}
print(arr,++index,level);
}
public static void main(String[] args){
String dispath = "C:/prog";
File mdir = new File(dispath);
if(mdir.exists()&& mdir.isDirectory()){
File arr[] = mdir.listFiles();
System.out.println("the main directory file are :"+mdir);
print(arr,0,0);
}
}
}