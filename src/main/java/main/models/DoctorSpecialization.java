package main.models;

public class DoctorSpecialization {

    private String doctorSpecialization;

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
