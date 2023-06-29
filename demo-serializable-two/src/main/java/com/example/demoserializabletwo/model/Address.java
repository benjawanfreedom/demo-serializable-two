package com.example.demoserializabletwo.model;

import lombok.*;

import java.io.Serializable;

//@Data
//@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Address implements Serializable {
    private static final long serialVersionUID = -687991492884005033L;
    public String number;
    public String house;
    public String road;
    public String subDistrict;
    public String district;
    public String province;
    public String postalCode;
}