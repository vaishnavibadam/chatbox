import java.io.*;
import java.net.*;

public class Clientprogram
{
public static void main(String[] args)
{

try
{
Socket s=new Socket("localhost",4550);
DataOutputStream d=new DataOutputStream(s.getOutputStream());
d.writeUTF("hello server");
d.flush();
d.close();
s.close();
}
catch(Exception e)
{System.out.println(e);
}
}
}

