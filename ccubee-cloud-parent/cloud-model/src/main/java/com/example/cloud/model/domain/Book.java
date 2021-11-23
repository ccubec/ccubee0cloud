package com.example.cloud.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName book
 */
@TableName(value ="book")
@Data
public class Book implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String bookName;

    /**
     * 
     */
    private String author;

    /**
     * 
     */
    private String category;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String bookStatus;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String lender;

    /**
     * 
     */
    private String lenderId;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Integer saleNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}