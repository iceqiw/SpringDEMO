package org.ice.common.api.commonapi.client;

import org.ice.server.api.common.apicommon.api.TrainCfgService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author 翟永超
 * @create 2017/6/24.
 * @blog http://blog.didispace.com
 */
@FeignClient(value = "admin-api",path = "/api/j/trainCfg")
public interface TrainCfgClient extends TrainCfgService {

}
