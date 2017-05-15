package com.davidrus.freeparking.parking.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by david on 12-May-17.
 */
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "UserResource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
