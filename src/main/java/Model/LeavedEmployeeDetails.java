/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author User
 */
public class LeavedEmployeeDetails {
    
    // model class holding getters, setters and properties
    private StringProperty id;
    private StringProperty name;
    private StringProperty nic;
    private StringProperty tel;
    private StringProperty emgTel;
    private StringProperty date;
    
    public LeavedEmployeeDetails(String id,String name, String nic, String tel, String emgTel,String date) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.nic = new SimpleStringProperty(nic);
        this.tel = new SimpleStringProperty(tel);
        this.emgTel = new SimpleStringProperty(emgTel);
        this.date = new SimpleStringProperty(date);
    }
    
     // Getters
    public String getId() {
        return id.get();
    }
    
    public String getName() {
        return name.get();
    }

    public String getNic() {
        return nic.get();
    }

    public String getTel() {
        return tel.get();
    }

    public String getEmgTel() {
        return emgTel.get();
    }
    
    public String getDate() {
        return date.get();
    }
    
    // Setters
    public void setId(String value) {
        id.set(value);
    }
    
    public void setName(String value) {
        name.set(value);
    }

    public void setNic(String value) {
        nic.set(value);
    }

    public void setTel(String value) {
        tel.set(value);
    }

    public void seEmgTel(String value) {
        emgTel.set(value);
    }
    
    public void setDate(String value) {
        date.set(value);
    }
    
    // Propert values
    
    public StringProperty idProperty() { return id; }
    
    public StringProperty nameProperty() { return name; }
    
    public StringProperty nicProperty() { return nic; }
    
    public StringProperty telProperty() { return tel; }
    
    public StringProperty emgTelProperty() { return emgTel; }
    
    public StringProperty DateProperty() { return date; }
    
}
