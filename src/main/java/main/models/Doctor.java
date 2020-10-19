package main.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Doctor {

    private String name;
    private DoctorSpecialization doctorSpecialization;
    private int cabinet;

    public String getDoctorName() {
        return name;
    }

    public DoctorSpecialization getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctorSpecialization(DoctorSpecialization doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }
}
