package com.sai.lc.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        Currency currency = Currency.getInstance(text.toUpperCase());
        setValue(currency);
    }

}

