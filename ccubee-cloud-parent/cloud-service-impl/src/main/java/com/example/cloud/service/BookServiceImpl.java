package com.example.cloud.service;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cloud.client.model.req.BookReq;
import com.example.cloud.client.model.vo.BookVo;
import com.example.cloud.mapper.BookMapper;
import com.example.cloud.model.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 书服务impl
 *
 * @author lolka
 * @date 2021/11/22
 */
@Service
@RequiredArgsConstructor
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {


//    private final BookMapper bookMapper;

    @Override
    public BookVo findByCondition(BookReq req) {
        Book book = this.getById(req.getId());
        BookVo bookVo = BeanUtil.copyProperties(book, BookVo.class);
        return bookVo;
    }
}




