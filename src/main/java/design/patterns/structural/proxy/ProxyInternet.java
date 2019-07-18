package design.patterns.structural.proxy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author durgesh.soni
 */
public class ProxyInternet implements Internet {

    private static Set<String> blockedSites = new HashSet<>();

    static {
        blockedSites.add("abc.com");
        blockedSites.add("pqr.com");
        blockedSites.add("xyz.com");
    }

    private Internet internet;

    public ProxyInternet() {
        internet = new RealInternet();
    }

    @Override
    public void connectTo(String url) {
        if (blockedSites.contains(url)) {
            System.out.println("Access Denied");
        } else {
            internet.connectTo(url);
        }
    }
}
