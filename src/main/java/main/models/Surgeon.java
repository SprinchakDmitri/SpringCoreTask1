package main.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("surgeon")
public class Surgeon implements Specialization {
    private DoctorSpecialization doctorSpecialization;

    @Autowired
    Surgeon(DoctorSpecialization doctorSpecialization){
        this.doctorSpecialization = doctorSpecialization;
    }

    public Surgeon(){

    }

    @Override
    public DoctorSpecialization getDoctorSpecialization() {
        return this.doctorSpecialization;
    }

    @Override
    public String toString() {
        return "Surgeon";
    }
}
