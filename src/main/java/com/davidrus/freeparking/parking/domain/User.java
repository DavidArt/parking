package com.davidrus.freeparking.parking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by david on 12-May-17.
 */
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = User.GET_USER_BY_ID, query = "SELECT u FROM User u WHERE u.id = :id"),
        @NamedQuery(name = User.GET_USER_BY_NAME, query = "SELECT u FROM User u WHERE u.name = :name")
})
public class User {

    public static final String GET_USER_BY_ID = "getUserById";
    public static final String GET_USER_BY_NAME = "getUserByName";


    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
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
