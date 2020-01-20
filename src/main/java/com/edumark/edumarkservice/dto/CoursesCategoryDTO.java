package com.edumark.edumarkservice.dto;

import lombok.*;

import java.util.Date;

@Builder
@Data
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class CoursesCategoryDTO {

    private long id;
    private String categoryName;
    private String description;
    private boolean disable;
    private long createUser;
    private long updateUser;
    private Date createDate;
    private Date updateDate;

}
