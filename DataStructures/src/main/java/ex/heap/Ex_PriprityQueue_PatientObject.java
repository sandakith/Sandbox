/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdatastructures.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ex_PriprityQueue_PatientObject {

    public static void main(String[] args) {
        PriorityQueue<PatientObject> patientQueue 
                = new PriorityQueue<PatientObject>(10, new Comparator<PatientObject>() {
            @Override
            public int compare(PatientObject patient1, PatientObject patient2) {
                return (
                        patient1.isEmergencyCase() == patient2.isEmergencyCase()) ? 
                        (Integer.valueOf(patient1.getId()).compareTo(patient2.getId()))
                        : (patient1.isEmergencyCase() ? -1 : 1);
            }
        });

        patientQueue.add(new PatientObject(1, "Patient1", false));
        patientQueue.add(new PatientObject(2, "Patient2", false));
        patientQueue.add(new PatientObject(3, "Patient3", true));
        patientQueue.add(new PatientObject(4, "Patient4", false));
        patientQueue.add(new PatientObject(5, "Patient5", true));

        System.out.println();
        System.out.print("Doctor's waiting for patients  : ");
        while (true) {
            PatientObject currentPatient = patientQueue.poll();
            if (currentPatient == null) {
                break;
            }

            System.out.print(currentPatient.getName() + " <-- ");
        }
        System.out.println();
    }
}
