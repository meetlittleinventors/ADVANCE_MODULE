import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressResolver {
    public static void main(String[] args) {
        String hostname = "www.google.com";
        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("The IP address for " + hostname + " is: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Could not find IP address for " + hostname);
        }
    }
}
