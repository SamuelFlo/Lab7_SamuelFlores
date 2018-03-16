
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
public class PC implements Serializable {
    private static final long SerialVersionUID=666L;
    private int ip;
    private String mascara;
    private String Gateway;
    private ArrayList<Mensaje>mensajes = new ArrayList();

    public PC() {
    }

    public PC(int ip, String mascara, String Gateway) {
        this.ip = ip;
        this.mascara = mascara;
        this.Gateway = Gateway;
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

    public String getGateway() {
        return Gateway;
    }

    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "PC{" + "ip=" + ip + ", mascara=" + mascara + ", Gateway=" + Gateway + ", mensajes=" + mensajes + '}';
    }

   
    
    
    
}
