package org.ice.common.api.commonapi.client;

import org.ice.common.api.commonapi.model.TrainCfg;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 翟永超
 * @create 2017/6/24.
 * @blog http://blog.didispace.com
 */
@FeignClient("admin-api")
public interface AdminApiClient {

    @GetMapping("/api/j/trainSearch/page")
    List<TrainCfg> page();

}
