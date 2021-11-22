package com.alibaba.cloud.service.impl;

import com.alibaba.cloud.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.cloud.model.domain.Account;

import com.alibaba.cloud.dao.AccountMapper;
import org.springframework.stereotype.Service;

/**
 * impl账户服务
 *
 * @author root
 * @date 2021/11/22
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService {

}




