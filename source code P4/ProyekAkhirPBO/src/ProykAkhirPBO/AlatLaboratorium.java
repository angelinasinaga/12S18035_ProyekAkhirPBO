/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProykAkhirPBO;

/**
 *
 * @author 12s18035 - Angelina Naomi Sinaga
 */
public class AlatLaboratorium {
    private String ID_alatlab;
    public String Nama_alatlab;
    private String Lokasi_alatlab;
    public String Status_alatlab;
    
    public AlatLaboratorium(String ID_alatlab, String Nama_alatlab, String Lokasi_alatlab, String Status_alatlab){
        this.ID_alatlab = ID_alatlab;
        this.Lokasi_alatlab = Lokasi_alatlab;
        this.Nama_alatlab = Nama_alatlab;
        this.Status_alatlab = Status_alatlab;
    }
    
    public void Borrow(){
        this.ID_alatlab = ID_alatlab;
        this.Status_alatlab = Status_alatlab;
    }
    public void Return(){
        this.ID_alatlab = ID_alatlab;
        this.Status_alatlab = Status_alatlab;
    }
    public void Is_available(){
        this.ID_alatlab = null;
    }
}
