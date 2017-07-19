# spring-boot-mybatis-thymeleaf
本案例以SpringBoot基础，使用sts-bundle作为集成开发工具，深度整合了SpringMVC、MySQL、MyBatis与Thymeleaf框架。
### 案例使用的数据表结构如下：
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `name` varchar(30) DEFAULT NULL COMMENT '商品名称',
  `kind` varchar(20) DEFAULT NULL COMMENT '商品类别',
  `price` float DEFAULT NULL COMMENT '商品价格',
  `factory` varchar(50) DEFAULT NULL COMMENT '生产厂商',
  `trem` varchar(15) DEFAULT NULL COMMENT '保质期',
  `info` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='商品信息表';
