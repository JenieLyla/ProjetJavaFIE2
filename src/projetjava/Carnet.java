/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Coline
 */
public class Carnet extends TreeSet<RdV> {

    private TreeSet<RdV> lesRdV;

    public Carnet(TreeSet<RdV> lesRdV) {
        this.lesRdV = lesRdV;

    }

    public Carnet(TreeSet<RdV> lesRdV, Comparator<? super RdV> comparator) {
        super(comparator);
        this.lesRdV = lesRdV;
    }

    public Carnet(TreeSet<RdV> lesRdV, Collection<? extends RdV> c) {
        super(c);
        this.lesRdV = lesRdV;
    }

    public Carnet(TreeSet<RdV> lesRdV, SortedSet<RdV> s) {
        super(s);
        this.lesRdV = lesRdV;
    }

    public void newRdV(Medecin medecin, Patient patient, String DateHeureDebut,String DateHeureFin) {
        RdV rdv = new RdV(DateHeureDebut, DateHeureFin, medecin, patient);
    }
    
    

}
