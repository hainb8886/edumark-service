package com.edumark.edumarkservice.dto;

import java.util.Date;

public class CoursesOrderDTO {

    private long id;
    private long coursesid;
    private double priceOld;
    private double price;
    private String voucher;
    private float voucherValue;
    private int paymentId;
    private int paymentStatus;
    private float discount;
    private int orderStatus;
    private long createUser;
    private long updateUser;
    private Date createDate;
    private Date updateDate;
}
