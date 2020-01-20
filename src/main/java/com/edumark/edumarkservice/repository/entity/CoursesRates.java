package com.edumark.edumarkservice.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(callSuper = false)
@Table(name = "courses_rates")
public class CoursesRates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "coursesId")
    private long coursesId;

    @Column(name = "rate_three")
    private int rateThree;

    @Column(name = "rate_four")
    private int rateFour;

    @Column(name = "rate_five")
    private int rateFive;

    @Column(name = "rate_one")
    private int rateOne;

    @Column(name = "rate_two")
    private int rateTwo;

    @Column(name = "feedback")
    private String feedback;

    @Column(name = "disable")
    private boolean disable;

    @Column(name = "create_user")
    private long createUser;

    @Column(name = "update_user")
    private long updateUser;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;
}
