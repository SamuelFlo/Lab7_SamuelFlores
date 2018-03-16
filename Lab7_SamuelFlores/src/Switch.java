
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
public class Switch implements Serializable {
    private String nombre;
    private int velocidadr;
    private int velocidadt;
    private String router;
    private ArrayList<PC> pcs = new ArrayList();
    private j_lan jf =new j_lan();

    public Switch() {
    }

    public Switch(String nombre, int velocidadr, int velocidadt, String router) {
        this.nombre = nombre;
        this.velocidadr = velocidadr;
        this.velocidadt = velocidadt;
        this.router = router;
    }

    public j_lan getJf() {
        return jf;
    }

    public void setJf(j_lan jf) {
        this.jf = jf;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadr() {
        return velocidadr;
    }

    public void setVelocidadr(int velocidadr) {
        this.velocidadr = velocidadr;
    }

    public int getVelocidadt() {
        return velocidadt;
    }

    public void setVelocidadt(int velocidadt) {
        this.velocidadt = velocidadt;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public ArrayList<PC> getPcs() {
        return pcs;
    }

    public void setPcs(ArrayList<PC> pcs) {
        this.pcs = pcs;
    }

    @Override
    public String toString() {
        return "Switch{" + "nombre=" + nombre + ", velocidadr=" + velocidadr + ", velocidadt=" + velocidadt + ", router=" + router + ", pcs=" + pcs + '}';
    }

    
    
}
