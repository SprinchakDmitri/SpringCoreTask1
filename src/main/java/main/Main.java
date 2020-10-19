package main;

import main.config.Config;
import main.models.TreatingDoctor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext  context =
                new AnnotationConfigApplicationContext(Config.class);

        TreatingDoctor treatingDoctor = context.getBean(TreatingDoctor.class);
        treatingDoctor.treatPatient();

    }
}
