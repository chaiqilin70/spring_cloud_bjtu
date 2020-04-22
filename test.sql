# Host: 127.0.0.1  (Version: 5.7.20)
# Date: 2020-04-22 18:48:09
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES gb2312 */;

#
# Structure for table "order_s"
#

DROP TABLE IF EXISTS `order_s`;
CREATE TABLE `order_s` (
  `userId` int(4) DEFAULT NULL,
  `seatId` int(4) DEFAULT NULL,
  `price` int(4) DEFAULT NULL,
  `isPay` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "order_s"
#

INSERT INTO `order_s` VALUES (1,1,300,1),(1,2,300,1);

#
# Structure for table "seat"
#

DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
  `seatId` int(4) NOT NULL,
  `isOrder` int(4) DEFAULT NULL,
  `price` int(4) DEFAULT NULL,
  PRIMARY KEY (`seatId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "seat"
#

INSERT INTO `seat` VALUES (1,1,300),(2,1,300),(3,0,300),(4,0,300),(5,0,300),(6,0,300),(7,0,300),(8,0,300);

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(4) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `userPas` varchar(255) DEFAULT NULL,
  `account` int(4) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'fushengyu','fushengyu',100),(2,'root','root',1000);
