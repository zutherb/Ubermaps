package com.comsysto.google.service.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @author zutherb
 */
@JsonSerialize
public class TextValueObject implements Serializable {
    private String text;
    private Integer value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
