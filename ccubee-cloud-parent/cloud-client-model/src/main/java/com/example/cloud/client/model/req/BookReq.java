package com.example.cloud.client.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ccubee
 * @since 2021/11/22 19:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookReq {

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
    private String key;
}
