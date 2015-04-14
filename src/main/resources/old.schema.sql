drop database jooq_test;
create database jooq_test;
use jooq_test;

CREATE TABLE `t_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL DEFAULT '',
  `province` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_company` (
  `cid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT '',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_province` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省';

CREATE TABLE `t_recruitment` (
  `rid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `showTime` datetime DEFAULT NULL,
  `school` int(11) DEFAULT NULL,
  `place` varchar(512) DEFAULT NULL,
  `company` int(11) DEFAULT NULL,
  `jobType` int(11) DEFAULT NULL,
  `content` mediumtext COMMENT '招聘信息, 内容, 一大篇文本, HTML',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_school` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(200) NOT NULL DEFAULT '',
  `province` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_School_Province` (`province`),
  CONSTRAINT `FK_School_Province` FOREIGN KEY (`province`) REFERENCES `t_province` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学校\n\n一个有独立教务管理的就是一个学校\n\n用不同教务管理的不是同一个学校';

CREATE TABLE `t_user` (
  `uid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(128) CHARACTER SET latin1 DEFAULT NULL,
  `password` varchar(32) CHARACTER SET latin1 DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `nickName` varchar(128) CHARACTER SET latin1 DEFAULT NULL,
  `avatar` varchar(512) CHARACTER SET latin1 DEFAULT NULL,
  `sign` varchar(256) CHARACTER SET latin1 DEFAULT NULL,
  `school` int(11) DEFAULT NULL,
  `rigisterTime` datetime DEFAULT NULL,
  `location` varchar(128) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
