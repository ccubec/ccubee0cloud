package com.example.client.impl;

import com.example.client.BookClient;
import com.example.cloud.client.model.common.ResultVo;
import com.example.cloud.client.model.req.BookReq;
import com.example.cloud.client.model.vo.BookVo;
import org.springframework.stereotype.Component;

/**
 * @author ccubee
 * @since 2021/11/22 20:21
 */
@Component
public class BookClientImpl implements BookClient {

    @Override
    public ResultVo<BookVo> findByCondition(BookReq req) {
        return ResultVo.fail();
    }

    @Override
    public ResultVo<BookVo> findById(Integer id) {
        return ResultVo.fail();
    }
}
