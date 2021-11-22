package com.alibaba.cloud.web.rest;

import com.alibaba.cloud.api.AccountApi;
import com.alibaba.cloud.client.model.req.AccountReq;
import com.alibaba.cloud.client.model.response.ResultVo;
import com.alibaba.cloud.client.model.vo.AccountVo;
import org.springframework.web.bind.annotation.RestController;

/**
 * 考虑其他
 *
 * @author root
 * @date 2021/11/22
 */
@RestController

public class AccountRest implements AccountApi {

    @Override
    public ResultVo<AccountVo> findByCondition(AccountReq req) {
        return null;
    }
}
