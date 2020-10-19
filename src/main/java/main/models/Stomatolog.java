package main.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dent")
public class Stomatolog implements Specialization {
    private DoctorSpecialization doctorSpecialization;

    @Autowired
    Stomatolog(DoctorSpecialization doctorSpecialization){
        this.doctorSpecialization = doctorSpecialization;
    }

    public Stomatolog(){

    }

    @Override
    public DoctorSpecialization getDoctorSpecialization() {
        return this.doctorSpecialization;
    }

    @Override
    public String toString() {
        return "Dentist";
    }
}
