package com.alibaba.cloud.service;


import com.alibaba.cloud.client.model.req.AccountReq;
import com.alibaba.cloud.client.model.vo.AccountVo;
import com.alibaba.cloud.model.domain.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 帐户服务
 *
 * @author root
 * @date 2021/11/22
 */
public interface AccountService extends IService<Account> {

    AccountVo findByCondition(AccountReq req);
}
