package design.patterns.structural.proxy;

/**
 * @author durgesh.soni
 */
public class DemoProxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("abc.com");
    }
}
