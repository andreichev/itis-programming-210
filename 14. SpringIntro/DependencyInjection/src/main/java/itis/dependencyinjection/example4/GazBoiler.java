package itis.dependencyinjection.example4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GazBoiler implements Boiler {
    GazBoiler() {
        System.out.println("GAZ INIT");
    }

    @Override
    public void warm() {
        System.out.println("GAZ");
    }
}
