package com.alibaba.cloud.web.handler;

import cn.hutool.http.ContentType;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;

/**
 * @author ccubee
 * @since 2021/11/27 10:49
 */
@Configuration
public class MyUrlHandler implements BlockExceptionHandler {


    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse response, BlockException e) throws Exception {
        ErrorMsg msg = null;
        if (e instanceof FlowException) {
             msg = ErrorMsg.builder().msg("限流了").status(101).build();
        } else if (e instanceof DegradeException) {
            msg = ErrorMsg.builder().msg("降级了").status(102).build();
        } else if (e instanceof AuthorityException) {
            msg = ErrorMsg.builder().msg("权限错误").status(103).build();
        } else if (e instanceof ParamFlowException) {
            msg = ErrorMsg.builder().msg("热点参数限流").status(104).build();
        } else if (e instanceof SystemBlockException) {
            msg = ErrorMsg.builder().msg("系统被一场").status(105).build();
        }

        response.setStatus(500);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setHeader("Content-type", ContentType.JSON.getValue());
        response.setContentType(ContentType.JSON.getValue());

        new ObjectMapper().writeValue(
                response.getWriter(), msg
        );
    }

}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class ErrorMsg {
    private Integer status;

    private String msg;
}
