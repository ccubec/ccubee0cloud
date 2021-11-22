package com.example.cloud.client.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 因此签证官
 *
 * @author root
 * @date 2021/11/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> {

    private Integer code;

    private String message;

    private T data;


    public static <T> ResultVo<T> success() {
        return convert(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getDesc(), null);
    }

    public static <T> ResultVo<T> success(T data) {
        return convert(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getDesc(), data);
    }

    public static <T> ResultVo<T> fail() {
        return convert(ResultEnum.FAIl.getCode(), ResultEnum.FAIl.getDesc(), null);
    }

    private static <T> ResultVo<T> convert(Integer code, String message, T data) {
        return new ResultVo<>(code, message, data);
    }
}
