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
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "courses_name")
    private String courses_name;

    @Column(name = "price")
    private double price;

    @Column(name = "price_old")
    private double priceOld;

    @Column(name = "discount")
    private float discount;

    @Column(name = "total_video")
    private int totalVideo;

    @Column(name = "total_hours")
    private int totalHours;

    @Column(name = "total_min")
    private int totalMin;

    @Column(name = "objectives")
    private String objectives;

    @Column(name = "trainer_video")
    private String trainerVideo;

    @Column(name = "description")
    private String description;

    @Column(name = "sharecode")
    private String shareCode;

    @Column(name = "approve")
    private int approve;

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
