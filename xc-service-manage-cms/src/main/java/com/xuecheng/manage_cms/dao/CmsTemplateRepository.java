package com.xuecheng.manage_cms.dao;


import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 使用spring data mongoDB对数据库进行操作
 * CmsTemplate(数据库表名）Repository 固定写法
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {
}
