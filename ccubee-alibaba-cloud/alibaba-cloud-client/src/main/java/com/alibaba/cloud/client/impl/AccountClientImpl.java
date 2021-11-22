package com.alibaba.cloud.client.impl;

import com.alibaba.cloud.client.AccountClient;
import com.alibaba.cloud.client.model.req.AccountReq;
import com.alibaba.cloud.client.model.response.ResultVo;
import com.alibaba.cloud.client.model.vo.AccountVo;
import org.springframework.stereotype.Component;

/**
 * 账户客户impl
 *
 * @author root
 * @date 2021/11/22
 */
@Component
public class AccountClientImpl implements AccountClient {

    @Override
    public ResultVo<AccountVo> findByCondition(AccountReq req) {
        return ResultVo.fail();
    }
}
