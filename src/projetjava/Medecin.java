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
public class Medecin extends Personne{
    
    private String profession ;
    public Medecin(String nom, String prenom, int dateDeNaissance, String profession) {
        super(nom, prenom, dateDeNaissance);
        this.profession = profession ;
    }
    
}
