package main.models;

import org.springframework.stereotype.Component;

@Component
public class DoctorSpecialization {

    private String doctorSpecialization = "Surgeon";

    public void setDoctorSpecialization(String doctorSpecialization){
        this.doctorSpecialization = doctorSpecialization;
    }

    public String getDoctorSpecialization(){
        return doctorSpecialization;
    }

    @Override
    public String toString() {
        return doctorSpecialization;
    }
}
