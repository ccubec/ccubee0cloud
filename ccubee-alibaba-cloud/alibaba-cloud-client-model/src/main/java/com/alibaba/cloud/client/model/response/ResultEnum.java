package com.alibaba.cloud.client.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 结果枚举
 *
 * @author root
 * @date 2021/11/22
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    //
    SUCCESS(0, "成功"),
    FAIl(1, "失败")

    ;

    private final Integer code;

    private final String desc;
}
