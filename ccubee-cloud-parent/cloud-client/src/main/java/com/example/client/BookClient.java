package com.example.client;

import com.example.client.impl.BookClientImpl;
import com.example.cloud.api.BookApi;
import com.example.cloud.api.constant.CloudPathConstant;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ccubee
 * @since 2021/11/22 20:20
 */
@FeignClient(name = CloudPathConstant.APPLICATION_NAME, fallback = BookClientImpl.class)
public interface BookClient extends BookApi {
}
