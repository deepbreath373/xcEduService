package com.xuecheng.manage_cms.dao;


import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 使用spring data mongoDB对数据库进行操作
 * CmsSite(数据库表名）Repository 固定写法
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
