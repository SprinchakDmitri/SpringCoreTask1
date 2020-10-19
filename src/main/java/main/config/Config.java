package main.config;

import main.models.Doctor;
import main.models.DoctorSpecialization;
import main.models.TreatingDoctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    TreatingDoctor getTreatingDoctor(){
        TreatingDoctor treatingDoctor = new TreatingDoctor();
        treatingDoctor.setDoctor(getDoctor());
        return treatingDoctor;
    }

    @Bean
    DoctorSpecialization getDoctorSpecialization(){
        DoctorSpecialization doctorSpecialization = new DoctorSpecialization();
        doctorSpecialization.setDoctorSpecialization("Surgeon");
        return doctorSpecialization;
    }

    @Bean Doctor getDoctor(){
        Doctor doctor = new Doctor();
        doctor.setName("John Doe");
        doctor.setDoctorSpecialization(getDoctorSpecialization());
        doctor.setCabinet(301);
        return doctor;
    }


}
