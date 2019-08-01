
## 通过一个小的项目练习Spring-Boot
## 资料
[Maven](https://mvnrepository.com)<br>
[Spring文档](https://spring.io/guides)<br>
[Spring外部文档](https://spring.io/guides/gs/serving-web-content/)<br>
[MyBatis-Spring-Boot-Starter模块](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/index.html)<br>
[Spring官方文档](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)<br>
[ES](https://elasticsearch.cn/explore)<br>
# 工具
[Bootstrap](https://v3.bootcss.com)
[Git](https://git-scm.com/download)
[Flyway](https://flywaydb.org/grtstarted/firststeps/maven)
# 新型UML画图工具
[Visual Paradigm](https://www.visual-paradigm.com)<br>
## sql脚本
```sql
create table user(
  id int AUTO_INCREMENT primary key not null ,
  account_id varchar(100),
  name varchar(50),
  token varchar(36),
  GMT_CREATE bigint,
  GMT_MODIFIED bigint
);

```
