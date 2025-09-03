import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostnameResolver {
    public static void main(String[] args) {
        String ipAddress = "172.217.169.100"; // A common Google IP address
        try {
            InetAddress address = InetAddress.getByName(ipAddress);
            System.out.println("The hostname for IP address " + ipAddress + " is: " + address.getHostName());
        } catch (UnknownHostException e) {
            System.err.println("Could not find hostname for " + ipAddress);
        }
    }
}
