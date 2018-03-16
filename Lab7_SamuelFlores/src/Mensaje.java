
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class Mensaje implements Runnable {
    
    private int IPorigen;
    private int IPdestino;
    private String titulo;
    private String contenido;
    private boolean avanzar;
    private boolean vive;
    private JTable tabla;
    

    public Mensaje() {
    }

    public Mensaje(int IPorigen, int IPdestino, String titulo, String contenido) {
        this.IPorigen = IPorigen;
        this.IPdestino = IPdestino;
        this.titulo = titulo;
        this.contenido = contenido;
        avanzar=true;
        vive=true;
    }

    public Mensaje(int IPorigen, int IPdestino, String titulo, String contenido, JTable tabla) {
        this.IPorigen = IPorigen;
        this.IPdestino = IPdestino;
        this.titulo = titulo;
        this.contenido = contenido;
        this.tabla = tabla;
        avanzar=true;
        vive=true;
    }
    

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    

    public int getIPorigen() {
        return IPorigen;
    }

    public void setIPorigen(int IPorigen) {
        this.IPorigen = IPorigen;
    }

    public int getIPdestino() {
        return IPdestino;
    }

    public void setIPdestino(int IPdestino) {
        this.IPdestino = IPdestino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "IPorigen=" + IPorigen + ", IPdestino=" + IPdestino + ", titulo=" + titulo + ", contenido=" + contenido + '}';
    }

    @Override
    public void run() {
        while(true){
            if(avanzar){
                Object[] newrow = {
                    titulo,
            };
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.addRow(newrow);
            tabla.setModel(model);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
