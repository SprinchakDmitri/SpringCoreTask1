package main.models;

public class TreatingDoctor {

    private Doctor doctor;

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
