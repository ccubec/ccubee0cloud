package com.alibaba.cloud.api;

import com.alibaba.cloud.api.constant.PathConstant;
import com.alibaba.cloud.client.model.req.AccountReq;
import com.alibaba.cloud.client.model.response.ResultVo;
import com.alibaba.cloud.client.model.vo.AccountVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户api
 *
 * @author root
 * @date 2021/11/22
 */
@RequestMapping(PathConstant.ACCOUNT)
public interface AccountApi {

    /**
     * 找到的条件
     *
     * @param req 要求的事情
     * @return {@link ResultVo}<{@link AccountVo}>
     */
    @PostMapping("findByCondition")
    ResultVo<AccountVo> findByCondition(@RequestBody AccountReq req);
}
