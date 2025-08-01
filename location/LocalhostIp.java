
import java.net.InetAddress;

public class LocalhostIp {

    public static void main(String[] args) {
        try {
            InetAddress myIp = InetAddress.getLocalHost();
            System.out.println("My Ip Address is :");
            System.out.println(myIp.getHostAddress());
            System.out.println(myIp.getHostName());
            System.out.println(myIp.getCanonicalHostName());
            System.out.println(myIp.getAddress());
            System.out.println(myIp);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
