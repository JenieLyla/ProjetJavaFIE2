/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author Coline
 */
public class Patient extends Personne implements Comparable<Patient> {

    private int numeroSecuriteSociale;
    private int age;
    private int numeroTelephone;
    private String adresseMail;

    public Patient(String nom, String prenom, int dateDeNaissance) {
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
    
}
