package main.config;

import main.models.Doctor;
import main.models.DoctorSpecialization;
import main.models.TreatingDoctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main.models")
public class Config {
    @Bean
    DoctorSpecialization getDoctorSpecialization(){
        DoctorSpecialization doctorSpecialization = new DoctorSpecialization();
        doctorSpecialization.setDoctorSpecialization("Surgeon");
        return doctorSpecialization;
    }

    @Bean
    Doctor getDoctor(){
        return new Doctor(getDoctorSpecialization());
    }
}
