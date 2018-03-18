/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1795162
 */
public class personne {
    
    private String nom ;
    private String prenom;
    private int Age;
    private double salary ;

    public personne(String nom, String prenom, int Age, double salary) {
        this.nom = nom;
        this.prenom = prenom;
        this.Age = Age;
        this.salary = salary;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "personne{" + "nom=" + nom + ", prenom=" + prenom + ", Age=" + Age + ", salary=" + salary + '}';
    }
    
    
}
