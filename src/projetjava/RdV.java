/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 *
 * @author Coline
 */
public class RdV {

    private Patient patient;
    private LocalDateTime dateHeureDebut ;
    private LocalDateTime dateHeureFin ;

    public RdV(LocalDateTime dateHeureDebut, LocalDateTime dateHeureFin, Patient patient) throws HoraireException{
        this.patient = patient;
        this.dateHeureDebut = dateHeureDebut ;
        this.dateHeureFin = dateHeureFin ;
    }

    @Override
    public String toString() {
        return "RDV : " + patient + " avec docteur " + " aura lieu de " + dateHeureDebut + " à " + dateHeureFin;
    }

}
