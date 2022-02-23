/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.Scanner;

/**
 *
 * @author Coline
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dictionnaire dictionnaire = new Dictionnaire ;
       Scanner sc = new Scanner(System.in);
        System.out.print("Nom patient : ");
        String nomPatient = sc.nextLine();
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Prenom patient : ");
        String prenomPatient = sc4.nextLine();
        Patient patient = ListePatient.FindPatientByName(nomPatient, prenomPatient);        
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Heure debut : ");
        int heureD = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Duree rendez-vous : ");
        int duree = sc3.nextInt();
        int heureF = heureD + duree;
    }
    
}
