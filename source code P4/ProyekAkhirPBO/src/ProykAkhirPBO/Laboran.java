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
public class Laboran {
    private String ID_laboran;
    private String Password;
    private char username;
    private String full_name;
    Date Registered;
    
    public Laboran(String ID_laboran, String Password, char Username, String full_name, Date Registered){
        this.ID_laboran = ID_laboran;
        this.Password = Password;
        this.full_name = full_name;
        this.username = username;
        this.Registered = Registered;
    }
    
    public void Validate_equipment(){
        this.ID_laboran = ID_laboran;
        this.Registered = Registered;
    }
    public void Manage(){
        this.ID_laboran = ID_laboran;
    }
}

