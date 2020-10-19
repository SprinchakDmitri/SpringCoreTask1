package main.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TreatingDoctor {

    private Doctor doctor;

    @Autowired
    public TreatingDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void treatPatient(){
        System.out.println("Your doctor is "
                +doctor.getDoctorName()+", "
                + doctor.getDoctorSpecialization() +".\n"+
                "Go in "+doctor.getCabinet()+" cabinet and he will cut your leg");
    }
}
