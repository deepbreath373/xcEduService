package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QuerySiteRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="cms页面管理接口",description = "cms页面管理接口，提供页面的模板查询")
public interface CmsTemplateControllerApi {
    //站点查询
    @ApiOperation("查询模板列表")
    public QueryResponseResult findList();
}


