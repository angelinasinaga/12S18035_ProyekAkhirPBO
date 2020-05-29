/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProykAkhirPBO;

import java.util.Date;
/**
 *
 * @author 12s18035 - Angelina Naomi Sinaga
 */
public class Mahasiswa {
    public String ID_mhs;
    public String Nama_mhs;
    Date Registered;
    
    public Mahasiswa(String ID_mhs, String Nama_mhs, Date Registered){
        this.ID_mhs = ID_mhs;
        this.Nama_mhs = Nama_mhs;
        this.Registered = Registered;
    }
    
    public void Borrow(){
        this.ID_mhs= ID_mhs;
        this.Registered = Registered;
    }
    public void Return(){
        this.ID_mhs = ID_mhs;
        this.Registered = Registered;
    }
}
