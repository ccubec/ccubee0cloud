package com.alibaba.cloud.client;

import com.alibaba.cloud.api.AccountApi;
import com.alibaba.cloud.api.constant.PathConstant;
import com.alibaba.cloud.client.impl.AccountClientImpl;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 账户的客户
 *
 * @author root
 * @date 2021/11/22
 */
@FeignClient(name = PathConstant.APPLICATION_NAME, fallback = AccountClientImpl.class)
public interface AccountClient extends AccountApi {
}
