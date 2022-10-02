package com.sai.lc.formatter;

import com.sai.lc.api.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

        System.out.println("into the parse method>>>>>>>>>>>>");
      Phone phone = new Phone();
        String[] phoneArray= completePhoneNumber.split("-");
      int index = completePhoneNumber.indexOf("-");
      if(index==-1 || index==0)
      {
          phone.setCountryCode("91");
          phone.setUserNumber(phoneArray[0]);}
      else{
      phone.setCountryCode(phoneArray[0]);
      phone.setUserNumber(phoneArray[1]);
    }

      return phone;
    }

    @Override
    public String print(Phone object, Locale locale) {
        return null;
    }
}
