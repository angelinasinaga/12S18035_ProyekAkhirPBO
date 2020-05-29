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
public class Transaksi {
    private String ID_transaksi;
    Date Borrowed;
    Date Returned;
    
    public Transaksi(String ID_transaksi, Date Borrowed, Date Returned){
        this.Borrowed = Borrowed;
        this.ID_transaksi = ID_transaksi;
        this.Returned = Returned;
    }
    
    public void Validate(){
        this.ID_transaksi = ID_transaksi;
    }
}
