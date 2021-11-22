package com.example.cloud.web.rest;

import com.example.cloud.api.BookApi;
import com.example.cloud.client.model.common.ResultVo;
import com.example.cloud.client.model.req.BookReq;
import com.example.cloud.client.model.vo.BookVo;
import com.example.cloud.service.BookService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ccubee
 * @since 2021/11/22 19:47
 */
@RestController
public class BookRest implements BookApi {

    @Resource
    private BookService bookService;

    @Override
    public ResultVo<BookVo> findByCondition(BookReq req) {
        return ResultVo.success(bookService.findByCondition(req));
    }
}
