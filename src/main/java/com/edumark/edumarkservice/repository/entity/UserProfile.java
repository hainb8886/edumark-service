package com.edumark.edumarkservice.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(callSuper = false)
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "address")
    private String address;

    @Column(name = "cityId")
    private String cityId;

    @Column(name = "countryId")
    private String countryId;

    @Column(name = "state")
    private String state;

    @Column(name = "hobby")
    private String hobby;
}
