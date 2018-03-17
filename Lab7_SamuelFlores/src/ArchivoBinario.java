
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class ArchivoBinario {
    ArrayList<PC> pcs = new ArrayList();
    File archivo = null;
    ArrayList<Router>rout= new ArrayList();

    public ArchivoBinario(String path) {
        archivo =new File(path);
    }

    public ArrayList<PC> getPcs() {
        return pcs;
    }

    public void setPcs(ArrayList<PC> pcs) {
        this.pcs = pcs;
    }


   

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ArchivoBinario{" + "pcs=" + pcs + ", archivo=" + archivo + '}';
    }

    
    public void cargarArchivo(){
        try {
            pcs = new ArrayList();
            PC temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(PC)objeto.readObject())!=null){
                        pcs.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (PC t : pcs) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    
   
    
}
