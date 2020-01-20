package com.edumark.edumarkservice.dto;

import java.util.Date;

public class BlogCommentsDTO {

    private long id;
    private long blogId;
    private String comments;
    private int approve;
    private boolean disable;
    private long createUser;
    private long updateUser;
    private Date createDate;
    private Date updateDate;

}
