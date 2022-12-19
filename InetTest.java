import java.io.*;
import java.net.InetAddress;
import java.net.SocketPermission;

class InetTest{
    public static void main(String[] args)throws Exception
    {
        InetAddress i=InetAddress.getLocalHost();
        System.out.println("local Host"+i.getLocalHost());

        System.out.println("host name"+i.getHostName());
        System.out.println("canonical host name"+i.getCanonicalHostName());

        i=InetAddress.getByName("157.240.13.35");
        System.out.println("157.240.13.35 having host"+i.getHostName());

        i=InetAddress.getByName("Google.com");
        System.out.println("google host name"+i.getHostAddress());

        System.out.println(i.isMulticastAddress()?"yes it is MCA":"no MCA");
        System.out.println(i.isLoopbackAddress()?"yes it is LBA":"no it is not MCA");

        InetAddress iArr[]=InetAddress.getAllByName("Facebook.com");

        for(int j=0; j< iArr.length;j++){
            System.out.println(iArr[j]);
        }
        
    }
}