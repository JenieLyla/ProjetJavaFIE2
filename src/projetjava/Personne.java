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
public class Personne {
    protected String nom;
    protected String prenom;
    private int dateDeNaissance;

    public Personne(String nom, String prenom, int dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }
    
    
}
