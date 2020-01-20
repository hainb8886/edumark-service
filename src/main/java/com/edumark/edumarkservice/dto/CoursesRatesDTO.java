package com.edumark.edumarkservice.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class CoursesRatesDTO {

    private int id;
    private long coursesId;
    private int rateThree;
    private int rateFour;
    private int rateFive;
    private int rateOne;
    private int rateTwo;
    private String feedback;
    private boolean disable;
    private long createUser;
    private long updateUser;
    private Date createDate;
    private Date updateDate;
}
