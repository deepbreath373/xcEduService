package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 14:59
 **/
@Data
public class QuerySiteRequest {
    //接收页面查询的查询条件
    //站点id
    @ApiModelProperty("站点id")
    private String siteId;
    //页面ID
    @ApiModelProperty("站点名称")
    private String siteName;
    //页面名称
    @ApiModelProperty("Url前缀")
    private String siteDomain;
    //别名
    @ApiModelProperty("站点端口")
    private String sitePort;
    //模版id
    @ApiModelProperty("UrlPath")
    private String siteWebPath;
    //....
}
