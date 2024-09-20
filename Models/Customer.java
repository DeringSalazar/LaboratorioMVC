/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Utils.UtilDate;
import java.time.LocalDate;

/**
 *
 * @author misma
 */
public class Customer {
    private int id;
    private String name;
    private LocalDate birthday;
    private String phone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    private int getAge() {
        return (birthday != null)?UtilDate.calculateYears(birthday):0;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(int id, String name, LocalDate birthday, String phone, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public Customer(int id, String name, LocalDate birthday, String phone) {
        this(id,name,birthday,phone,null);
    }
    
    public Customer(int id) {
        this(id,null,null,null,null);
    }
    
    public Customer() {
        this(0);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
}
