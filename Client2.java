    import java.net.*;  
    import java.io.*;  
    import java.util.*;
    class Client2{  
    public static void main(String args[])throws Exception{  
    int a;
    Socket s=new Socket("localhost",6666);  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
   Scanner sc=new Scanner(System.in);  
System.out.println("1");
    //String a=s.isConnected();   
    String str="",str2="";  
      while(s.isConnected()&&(!s.isClosed())){
System.out.println("2");	
   str=sc.next();   
    str2=din.readUTF();
 
    do{
    System.out.println("entered do while");
    if(str2!=null) {a=1;System.out.println("value"+str2);} 
    else if(str!=null) a=0;
    else a=2;
switch(a){
    case 0:dout.writeUTF(str);  
    dout.flush(); 
    break;
    case 1:  
    System.out.println("Server says: "+str2);
    break; 
    case 2:break; 
    }}while(str!=null || str2!=null );  }
      
    dout.close();  
    s.close();  
    
    }}  
