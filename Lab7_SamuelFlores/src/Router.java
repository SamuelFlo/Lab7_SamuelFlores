
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class Router implements Serializable{
    private static final long SerialVersionUID=666L;
    private int ip;
    private String mascara;
    private String protocolo;
    private int velocidadt;
    private int velocidadr;
    private Router switchh;
    private ArrayList<Router> routers = new ArrayList();

    public Router() {
    }

    public Router(int ip, String mascara, String protocolo, int velocidadt, int velocidadr, Router switchh) {
        this.ip = ip;
        this.mascara = mascara;
        this.protocolo = protocolo;
        this.velocidadt = velocidadt;
        this.velocidadr = velocidadr;
        this.switchh = switchh;
    }

    public Router getSwitchh() {
        return switchh;
    }

    public void setSwitchh(Router switchh) {
        this.switchh = switchh;
    }

    

    public ArrayList<Router> getRouters() {
        return routers;
    }

    public void setRouters(ArrayList<Router> routers) {
        this.routers = routers;
    }
    

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getVelocidadt() {
        return velocidadt;
    }

    public void setVelocidadt(int velocidadt) {
        this.velocidadt = velocidadt;
    }

    public int getVelocidadr() {
        return velocidadr;
    }

    public void setVelocidadr(int velocidadr) {
        this.velocidadr = velocidadr;
    }

    @Override
    public String toString() {
        return "Router";
        
    }
    
    
}
