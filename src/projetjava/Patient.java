/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.time.LocalDate;

/**
 *
 * @author Coline
 */
public class Patient extends Personne implements Comparable<Patient> {

    private long numeroSecuriteSociale;
    private int age;
    private long numeroTelephone;
    private String adresseMail;

    public Patient(String nom, String prenom, LocalDate dateDeNaissance, long numeroSecuriteSociale, long numeroTelephone) {
        super(nom, prenom, dateDeNaissance);
        this.adresseMail = adresseMail;
        this.age = age;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.numeroTelephone = numeroTelephone;
    }

    public int compareTo(Patient o) {
        int ret = this.nom.compareTo(o.nom);
        if (ret == 0) {
            ret = this.prenom.compareTo(o.prenom);
        }
        return ret;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Patient : " + super.toString() + numeroSecuriteSociale + " ; " + age + " ans ; " + numeroTelephone + " ; " + adresseMail + "/n";
    }
    
    
}
