/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.HashMap;

/**
 *
 * @author Coline
 */
public class Dictionnaire {
    private HashMap<Medecin, Carnet> leDictionnaire ;

    public Dictionnaire(HashMap<Medecin, Carnet> leDictionnaire) {
        this.leDictionnaire = leDictionnaire;
    }
    
    
}
