/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Coline
 */
public abstract class ListePatient extends TreeSet implements Comparable<Patient> {

    private TreeSet<Patient> lesPatients;

    public ListePatient(TreeSet<Patient> lesPatients) {
        this.lesPatients = lesPatients;

    }

    public Patient FindPatientByName(String nom, String prenom) {
        ArrayList patientMemeNom = new ArrayList();
        ;
        for (Patient p : lesPatients) {
            if ((p.getNom().equals(nom)) && (p.getPrenom().equals(prenom))) {
                patientMemeNom.add(p);
            }
        }
        if (patientMemeNom.size() == 1) {
            return (Patient) patientMemeNom.get(0);
        } else {
            System.out.println(patientMemeNom);
            Scanner sc = new Scanner(System.in);
            System.out.print("Quel patient choisissez vous? (numero)");
            int indicePatient = sc.nextInt();
            return (Patient) patientMemeNom.get(indicePatient - 1);
        }
    }

}
