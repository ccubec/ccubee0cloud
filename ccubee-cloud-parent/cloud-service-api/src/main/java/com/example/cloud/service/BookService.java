package com.example.cloud.service;

import com.example.cloud.client.model.req.BookReq;
import com.example.cloud.client.model.vo.BookVo;
import com.example.cloud.model.domain.Book;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 书服务
 *
 * @author lolka
 * @date 2021/11/22
 */
public interface BookService extends IService<Book> {

    /**
     * 找到的条件
     *
     * @param req 要求的事情
     * @return {@link BookVo}
     */
    BookVo findByCondition(BookReq req);

    /**
     * 发现通过id
     *
     * @param id id
     * @return {@link BookVo}
     */
    BookVo findById(Integer id);
}
