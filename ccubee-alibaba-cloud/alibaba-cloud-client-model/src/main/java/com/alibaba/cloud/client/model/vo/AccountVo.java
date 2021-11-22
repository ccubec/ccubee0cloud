package com.alibaba.cloud.client.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 账户签证官
 *
 * @author root
 * @date 2021/11/22
 */
@Data
public class AccountVo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Byte type;

}