# 学成在线

## 项目介绍

学成在线是一个在线教育平台，包括前台课程学习系统、后台课程管理系统以及CMS（内容管理系统）。该项目为前后端分离开发，前端基于vue.js技术，服务端基于SpringBoot、SpringCloud等Spring全家桶技术。

前台课程学习系统：首页门户、课程搜索、课程详情、在线学习、用户登录

后台课程管理系统：课程管理、文件上传

CMS：页面管理

## 组织结构

```
xc
├── xc-framework-common -- 通用代码
├── xc-framework-model -- 各服务所需的模型类
├── xc-framework-parent -- 父工程(负责依赖导入)
├── xc-framework-utils -- 工具类
├── xc-govern-center -- EurekaServer
├── xc-govern-gateway -- zuul网关
├── xc-service-api -- api接口定义
├── xc-service-base-filesystem -- 文件系统
├── xc-service-learning -- 在线播放视频
├── xc-service-manage-cms -- cms页面管理(增删改查)
├── xc-service-manage-cms-client -- cms页面发布
├── xc-service-manage-course -- 课程管理
├── xc-service-manage-media -- 媒资文件管理
├── xc-service-manage-media-processor -- 媒资文件格式处理工程
├── xc-service-manage-order -- 订单管理
├── xc-service-search -- 基于elasticsearch的课程搜索
├── xc-service-ucenter -- 用户中心
└── xc-service-ucenter-auth -- 用户的登录认证
```

## 技术选型

### 后端技术

| 技术                  | 说明                | 官网                                                 |
| --------------------- | ------------------- | ---------------------------------------------------- |
| SpringBoot            | 容器+MVC框架        | https://spring.io/projects/spring-boot               |
| SpringCloud           | 微服务              | https://spring.io/projects/spring-cloud              |
| SpringSecurity Oauth2 | 认证和授权框架      | https://spring.io/projects/spring-security-oauth     |
| SpringTask            | 任务处理            |                                                      |
| Swagger-UI            | 服务端测试工具      | https://github.com/swagger-api/swagger-ui            |
| MyBatis               | ORM框架(MySQL)      | http://www.mybatis.org/mybatis-3/zh/index.html       |
| PageHelper            | MyBatis物理分页插件 | http://git.oschina.net/free/Mybatis_PageHelper       |
| ElasticSearch         | 搜索引擎            | https://github.com/elastic/elasticsearch             |
| RabbitMq              | 消息队列            | https://www.rabbitmq.com/                            |
| Redis                 | 分布式缓存          | https://redis.io/                                    |
| MongoDb               | NoSql数据库         | https://www.mongodb.com/                             |
| MySQL                 | 关系型数据库        | https://www.mysql.com/cn/                            |
| JWT                   | JWT登录支持         | https://github.com/jwtk/jjwt                         |
| LogStash              | 数据采集            | https://github.com/logstash/logstash-logback-encoder |
| Lombok                | 简化对象封装工具    | https://github.com/rzwitserloot/lombok               |

### 前端技术

| 技术       | 说明       | 官网                                                  |
| ---------- | ---------- | ----------------------------------------------------- |
| Vue        | 前端框架   | https://vuejs.org/                                    |
| Element-UI | 前端UI框架 | [https://element.eleme.io](https://element.eleme.io/) |

## 开发工具

| 工具         | 说明                |
| ------------ | ------------------- |
| IDEA         | java开发IDE         |
| WebStorm     | 前端开发IDE         |
| RedisDesktop | redis客户端连接工具 |
| SQLyog       | MySQL连接工具       |
| Studio-3T    | MongoDB连接工具     |
| Postman      | API接口调试工具     |
| Typora       | Markdown编辑器      |

## 架构图
![image](https://user-images.githubusercontent.com/61624237/115703807-21f79a00-a39d-11eb-939b-0c1e2b7838a1.png)


