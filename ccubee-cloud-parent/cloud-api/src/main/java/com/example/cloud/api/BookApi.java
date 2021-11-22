package com.example.cloud.api;

import com.example.cloud.api.constant.CloudPathConstant;
import com.example.cloud.client.model.common.ResultVo;
import com.example.cloud.client.model.req.BookReq;
import com.example.cloud.client.model.vo.BookVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ccubee
 * @since 2021/11/22 19:48
 */
@RequestMapping(CloudPathConstant.BOOK)
public interface BookApi {


    /**
     * 条件查找
     *
     * @param req 要求的事情
     * @return {@link ResultVo<BookVo>}
     */
    @PostMapping("findByCondition")
    ResultVo<BookVo> findByCondition(@RequestBody BookReq req);
}
