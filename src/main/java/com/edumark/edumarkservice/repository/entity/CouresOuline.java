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
@Table(name = "courses_outline")
public class CouresOuline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "outline_name")
    private String outlineName;

    @Column(name = "outline_des")
    private String outlineDes;

    @Column(name = "video")
    private String video;

    @Column(name = "images")
    private String images;

    @Column(name = "order_show")
    private int orderShow;

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
