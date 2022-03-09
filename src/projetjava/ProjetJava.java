/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Coline
 */
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.TreeSet;

public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Création des médecins
        Medecin medecin1 = new Medecin("Ucol","Urla", LocalDate.of(1990, 8, 15),"Dentiste");
        Medecin medecin2 = new Medecin("Dorival","Denis", LocalDate.of(1967, 11, 25),"Generaliste");
        Medecin medecin3 = new Medecin("Thiebaut","Terrence", LocalDate.of(1982, 2, 11),"Generaliste");
        Medecin medecin4 = new Medecin("Qasur","Quetsa", LocalDate.of(1975, 7, 29),"Chiropracteur");
//        Création des patients
        Patient patient1 = new Patient("Ucak", "Umir", LocalDate.of(1990, 8, 15), 2055654216, 335263578);
        Patient patient2 = new Patient("Da", "Doriane", LocalDate.of(1999, 2, 12), 2055554216, 335263898);
        Patient patient3 = new Patient("Tichet", "Thierry", LocalDate.of(1966, 9, 25), 955524216, 335893898);
        Patient patient4 = new Patient ("Delos", "Lucien", LocalDate.of(2002, 9, 27), 2)
//        Création des rendez-vous
        RdV rdv1 = new RdV(LocalDateTime.of(2022, 2, 23, 15, 35), LocalDateTime.of(2022, 2, 23, 15, 50), patient1);
        RdV rdv2 = new RdV(LocalDateTime.of(2022, 2, 23, 15, 55), LocalDateTime.of(2022, 2, 23, 16, 30), patient2);
        RdV rdv3 = new RdV(LocalDateTime.of(2022, 2, 23, 14, 00), LocalDateTime.of(2022, 2, 23, 14, 30), patient3);
//        Création des carnets de rendez-vous
        new TreeSet<RdV>  ;
        Carnet carnet1 = new Carnet();
//        Association d'un carnet de rendez-vous avec un médecin
        Dictionnaire dictionnaire = new Dictionnaire() ;
//        Trouver un patient dans la base de donnée avec un nom et un prénom
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom patient : ");
        String nomPatient = sc.nextLine();
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Prenom patient : ");
        String prenomPatient = sc4.nextLine();
        Patient patient = ListePatient.FindPatientByName(nomPatient, prenomPatient);
        
//        Quel horaire?
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Heure debut : ");
        int heureD = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Duree rendez-vous : ");
        int duree = sc3.nextInt();
        int heureF = heureD + duree;
//        Identification
        
//        Demander action à l'utilisateur
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Que souhaitez vous faire? /n M(modifier un rendez-vous) /n m(modifier un patient) /n P(modifier le mot de passe) /n S(supprimer un rendez-vous) /n s(supprimer un patient) /n C(créer un rendez-vous) /n c(créer un patient)");
        String action = sc.nextLine();
        if("M".equals(action)){
            
        }else if("m".equals(action)){
             
        }else if("P".equals(action)){
            
        }else if("C".equals(action)){
            
        }else if("c".equals(action)){
            
        }else if("S".equals(action)){
            
        }else if("s".equals(action)){
            
        }else{
            System.out.print("La commande utilisée n'a pas été reconnue, veuillez réessayer");
        }
    }

}
