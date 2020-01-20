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
@Table(name = "courses_order")
public class CoursesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "coursesId")
    private long coursesId;

    @Column(name = "price_old")
    private double priceOld;

    @Column(name = "price")
    private double price;

    @Column(name = "voucher")
    private String voucher;

    @Column(name = "voucher_value")
    private float voucherValue;

    @Column(name = "paymentId")
    private int paymentId;

    @Column(name = "payment_status")
    private int paymentStatus;

    @Column(name = "discount")
    private float discount;

    @Column(name = "order_status")
    private int orderStatus;

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
