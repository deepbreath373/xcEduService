package com.xuecheng.manage_cms.dao;


import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 使用spring data mongoDB对数据库进行操作
 * CmsPage(数据库表名）Repository 固定写法
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    //根据页面名称查询
    CmsPage findByPageName(String pageName);
    //根据页面名称和类型查询
    CmsPage findByPageNameAndPageType(String pageName,String pageType);
    //根据站点和页面类型查询记录数
    int countBySiteIdAndPageType(String siteId,String pageType);
    //根据站点和页面类型分页查询
    Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);
}
