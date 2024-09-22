/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

public class Medical {
    private int id;
    private int numMedical;
    private String name;
    private LocalDate Birthdate;
    private String phone;
    private String email;
    private String specialty;
    private double Salary;

    public int getId() {
        return id;
    }

    public int getNumMedical() {
        return numMedical;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getSalary() {
        return Salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Medical(int id, int numMedical, String name, LocalDate Birthdate, String phone, String email, String specialty, double Salary) {
        this.id = id;
        this.numMedical = numMedical;
        this.name = name;
        this.Birthdate = Birthdate;
        this.phone = phone;
        this.email = email;
        this.specialty = specialty;
        this.Salary = Salary;
    }

    public Medical(int id, int numMedical, String name, LocalDate Birthdate, String specialty, double Salary) {
        this(id, numMedical, name, Birthdate, null, null, specialty, Salary);
    }

    public Medical(int id) {
        this(id, 0, null, null, null, 0.0);
    }

    public Medical() {
        this(0);
    }

    @Override
    public String toString() {
        return "Medical{" + "id=" + id + ", numMedical=" + numMedical + ", name=" + name + ", Birthdate=" + Birthdate + ", phone=" + phone + ", email=" + email + ", specialty=" + specialty + ", Salary=" + Salary + '}';
    }
}
