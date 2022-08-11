import java.io.*;
class prg18{
public static void main(String args[]) throws IOException{
int i ;
FileInputStream fin;
FileOutputStream fout;
try
{
try
{
fin = new FileInputStream(args[0]);
}
catch(FileNotFoundException e)
{
System.out.println("input file not found");
return;
}
fout = new FileOutputStream(args[1]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("filename not found");
return;
}
try
{
do
{
i=fin.read();
if(i!=-1)fout.write(i);
}while(i!=-1);
System.out.println("file copied sucessfullu");
}

catch(IOException e)
{
System.out.println("file not found");

}
fin.close();
fout.close();
}
}
