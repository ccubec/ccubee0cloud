package com.alibaba.cloud.web.rest;

import com.alibaba.cloud.api.AccountApi;
import com.alibaba.cloud.client.model.req.AccountReq;
import com.alibaba.cloud.client.model.response.ResultVo;
import com.alibaba.cloud.client.model.vo.AccountVo;
import com.alibaba.cloud.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * 考虑其他
 *
 * @author root
 * @date 2021/11/22
 */
@RestController
@RequiredArgsConstructor
public class AccountRest implements AccountApi {

    private final AccountService accountService;

    @Override
    public ResultVo<AccountVo> findByCondition(AccountReq req) {
        return ResultVo.success(accountService.findByCondition(req));
    }
}
