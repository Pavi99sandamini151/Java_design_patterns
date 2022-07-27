package proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Image img1 = ProxyImage('file.jpg');
        img1.display();
    }
}