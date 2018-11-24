set names utf8;
DROP database IF EXISTS `oa`;
create database oa;
use oa;



DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `loginName` varchar(20)  DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `groupId` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `employee` VALUES ('1', '刘备', 'liubei', 'liubei', '1');
INSERT INTO `employee` VALUES ('2', '张飞', 'zhangfei', 'zhangfei', '2');
INSERT INTO `employee` VALUES ('3', '关羽', 'guanyu', 'guanyu', '2');
INSERT INTO `employee` VALUES ('4', '123', '123', '123', '1');

DROP TABLE IF EXISTS `loan`;
CREATE TABLE `loan` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employeeId` int(10) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `amount` double(10,0) DEFAULT NULL,
  `applyDate` datetime DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

INSERT INTO `loan` VALUES ('1', '2', '出差借款', '1500', '2018-09-05', '1');
INSERT INTO `loan` VALUES ('2', '2', '婚宴借款', '5000', '2018-09-05', '2');
INSERT INTO `loan` VALUES ('3', '3', '房贷借款', '10000', '2018-09-05', '1');
INSERT INTO `loan` VALUES ('4', '1', '招待借款', '1000', '2018-09-05', '1');

