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