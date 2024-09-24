/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author misma
 */
public class HojaMedica {
    private Appointment appointment;  
    private String vitalSigns;
    private String diagnosis;
    private String medicalObservations;
    private String prescribedMedications;
    private String recommendedExams;

    public HojaMedica(Appointment appointment, String vitalSigns, String diagnosis, String medicalObservations, String prescribedMedications, String recommendedExams) {
        this.appointment = appointment;
        this.vitalSigns = vitalSigns;
        this.diagnosis = diagnosis;
        this.medicalObservations = medicalObservations;
        this.prescribedMedications = prescribedMedications;
        this.recommendedExams = recommendedExams;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(String vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalObservations() {
        return medicalObservations;
    }

    public void setMedicalObservations(String medicalObservations) {
        this.medicalObservations = medicalObservations;
    }

    public String getPrescribedMedications() {
        return prescribedMedications;
    }

    public void setPrescribedMedications(String prescribedMedications) {
        this.prescribedMedications = prescribedMedications;
    }

    public String getRecommendedExams() {
        return recommendedExams;
    }

    public void setRecommendedExams(String recommendedExams) {
        this.recommendedExams = recommendedExams;
    }

    @Override
    public String toString() {
        return "HojaMedica{" + "appointment=" + appointment + ", vitalSigns='" + vitalSigns + '\'' + ", diagnosis='" + diagnosis + '\'' +
                ", medicalObservations='" + medicalObservations + '\'' +
                ", prescribedMedications='" + prescribedMedications + '\'' +
                ", recommendedExams='" + recommendedExams + '\'' +
                '}';
    }
}
