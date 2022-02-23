/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.text.SimpleDateFormat;

/**
 *
 * @author Coline
 */
public class RdV {

    protected static final SimpleDateFormat DateHeureDebut = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    protected static final SimpleDateFormat DateHeureFin = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private Medecin medecin;
    private Patient patient;

    public RdV(String DateHeureDebut, String DateHeureFin, Medecin medecin, Patient patient) {
        this.medecin = medecin;
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "RDV : " + patient + " avec docteur " + medecin + " aura lieu de " + DateHeureDebut + " à " + DateHeureFin;
    }

}
