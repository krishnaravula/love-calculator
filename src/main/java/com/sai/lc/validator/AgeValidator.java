package com.sai.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    private  int lower;
    private int upper;

    @Override
    public void initialize(Age age) {

        this.upper = age.upper();
        this.lower = age.lower();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {

        if(age<lower || age>upper){
            return false;
        }
        if(age== null){
            return false;
        }

        return true;
    }
}
