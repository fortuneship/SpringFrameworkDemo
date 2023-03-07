package com.tunde;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(scopeName = "singleton")
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    //    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }
//
    private String qualification;

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
