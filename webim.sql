/*
 Navicat Premium Data Transfer

 Source Server         : webim
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : 52xbjs.com:3306
 Source Schema         : webim

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 19/10/2018 08:55:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for im_chatlog
-- ----------------------------
DROP TABLE IF EXISTS `im_chatlog`;
CREATE TABLE `im_chatlog` (
  `chatlogId` bigint(30) unsigned NOT NULL AUTO_INCREMENT,
  `fromId` bigint(30) DEFAULT NULL COMMENT '发送者id',
  `toId` bigint(30) DEFAULT NULL COMMENT '接受者id',
  `content` varchar(1024) DEFAULT NULL COMMENT '消息内容',
  `sendTime` bigint(30) DEFAULT NULL COMMENT '发送时间',
  `typ` varchar(30) DEFAULT NULL COMMENT '群聊还是好友',
  `status` int(1) DEFAULT '1' COMMENT '状态:接收者收到1/未收到0',
  PRIMARY KEY (`chatlogId`),
  KEY `from` (`fromId`,`toId`)
) ENGINE=InnoDB AUTO_INCREMENT=175 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_chatlog
-- ----------------------------
BEGIN;
INSERT INTO `im_chatlog` VALUES (1, 1, 2, '111', 1537000148191, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (2, 1, 2, 'ceshi', 1537006948170, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (46, 2, 1, '1232213321132', 1537006948160, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (47, 2, 1, '出现再次展现出自产自销', 1537007287731, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (48, 2, 1, 'zxxzxz', 1537007290187, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (49, 2, 1, 'xzczxx', 1537007291811, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (50, 2, 1, 'xzzcx', 1537007445594, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (51, 1, 2, 'zcxzxzcx', 1537007464417, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (52, 1, 2, 'xczzczxc', 1537007467288, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (53, 1, 2, 'czxczxc', 1537007468714, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (54, 1, 2, 'cxzczcz', 1537007479311, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (55, 1, 2, '222', 1537874880578, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (56, 2, 1, '1231', 1537875564989, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (57, 2, 1, '312312', 1537875566091, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (58, 1, 3, '11', 1537875784652, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (59, 1, 4, '1111', 1537875787373, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (60, 1, 2, '111', 1537875790836, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (61, 1, 2, '111', 1537875791892, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (62, 1, 2, '111', 1537875793764, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (63, 2, 1, '1111', 1537875885885, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (64, 2, 1, '12123', 1537875887507, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (65, 2, 1, '3123123', 1537875888579, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (66, 2, 1, '1111', 1537875979357, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (67, 2, 1, '123132', 1538058192107, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (68, 2, 1, '123', 1538058234784, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (69, 2, 1, '111', 1538059331435, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (70, 2, 1, '111', 1538059332710, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (71, 2, 12, '12313123', 1538059337023, 'group', 1);
INSERT INTO `im_chatlog` VALUES (72, 2, 11, '111', 1538059355753, 'group', 1);
INSERT INTO `im_chatlog` VALUES (73, 2, 1, '123', 1538060136828, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (74, 1, 2, 'mp', 1538060153537, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (75, 1, 2, 'zxx12', 1538097536252, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (76, 2, 1, 'xzcvxc', 1538097929508, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (77, 2, 1, 'xzc', 1538098128053, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (78, 2, 1, '111', 1538098863908, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (79, 2, 1, '13223', 1538099461696, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (80, 2, 1, '13213', 1538099464123, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (81, 2, 1, 'xcxc', 1538100121381, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (82, 2, 1, '111', 1538100233764, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (83, 2, 1, '111', 1538100234696, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (84, 2, 1, '1', 1538100235101, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (85, 2, 1, '11', 1538100235482, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (86, 2, 1, '1', 1538100236172, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (87, 2, 1, '1', 1538100236222, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (88, 2, 1, '1', 1538100236270, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (89, 2, 1, '1', 1538100236374, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (90, 2, 1, '1', 1538100236721, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (91, 2, 1, '1', 1538100236893, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (92, 2, 1, '1', 1538100237055, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (93, 2, 1, '1', 1538100237273, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (94, 2, 1, '1', 1538100237441, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (95, 2, 1, '1', 1538100237615, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (96, 2, 1, '1', 1538100237779, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (97, 2, 1, '111', 1538100253864, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (98, 2, 1, 'cc', 1538100410138, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (99, 2, 1, 'cccx', 1538100412598, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (100, 2, 1, 'xc', 1538100413504, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (101, 2, 1, 'xc', 1538100414423, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (102, 2, 1, 'x', 1538100421056, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (103, 2, 1, 'xcxc', 1538100422608, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (104, 2, 1, 'xcxc', 1538100425370, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (105, 1, 2, 'xcxcx', 1538100430790, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (106, 1, 2, 'vxcv', 1538100441265, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (107, 1, 2, 'xcvxc', 1538100442458, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (108, 1, 2, 'vcxvxc', 1538100443523, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (109, 1, 2, 'vcxvx', 1538100444516, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (110, 1, 2, 'vcxvx', 1538100445680, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (111, 1, 2, 'vcxvxc', 1538100446754, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (112, 1, 2, 'vcxvx', 1538100447900, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (113, 1, 4, 'xcvxc', 1538100456572, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (114, 2, 1, 'xcvxc', 1538100462244, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (115, 2, 1, 'vxcvx', 1538100464079, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (116, 1, 4, 'cxvxc', 1538100467257, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (117, 1, 4, 'xcvxc', 1538100477158, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (118, 1, 4, 'cxvv', 1538100478892, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (119, 1, 4, 'xcvxc', 1538100479927, 'friend', 0);
INSERT INTO `im_chatlog` VALUES (120, 2, 1, 'zxczxc', 1538100532779, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (121, 1, 2, 'zxczx', 1538100536245, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (122, 2, 1, 'zxcz', 1538100541712, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (123, 1, 2, 'xzczx', 1538100544518, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (124, 2, 1, 'xx', 1538100555236, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (125, 1, 2, 'xx', 1538100557834, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (126, 2, 1, 'XX', 1538100898182, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (127, 1, 2, 'XXX', 1538100900820, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (128, 1, 2, 'xxx', 1538101002264, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (129, 2, 1, 'cvc', 1538101153065, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (130, 1, 2, 'cvcvcv', 1538101155167, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (131, 2, 1, '2123', 1538117628942, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (132, 2, 1, '123', 1538117635859, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (133, 2, 1, 'cc', 1538117807187, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (134, 2, 1, 'xcvxc', 1538117879794, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (135, 2, 1, 'xcvcv', 1538117881378, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (136, 2, 1, 'cvbcv', 1538117882617, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (137, 2, 1, 'cvbcv', 1538117884266, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (138, 2, 1, '111', 1538119985797, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (139, 1, 2, '111', 1538119992774, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (140, 2, 1, '111', 1538120002404, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (141, 2, 1, 'xxcx', 1538120110270, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (142, 1, 2, 'cxvcv', 1538120113417, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (143, 2, 1, 'ccc', 1538120119289, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (144, 1, 2, 'xcvxcv', 1538120225148, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (145, 1, 2, '11', 1538120288262, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (146, 1, 2, '111', 1538120403494, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (147, 1, 2, '111', 1538120425994, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (148, 1, 2, 'ccc', 1538120503710, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (149, 1, 2, 'cvcv', 1538120581024, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (150, 1, 2, '111', 1538120769261, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (151, 1, 2, '1111', 1538121707801, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (152, 1, 2, '111', 1538121709234, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (153, 1, 2, '111', 1538121710386, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (154, 1, 2, '111', 1538121711591, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (155, 1, 2, '111', 1538121712601, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (156, 2, 1, 'xcvx', 1538122641234, 'friend', 1);
INSERT INTO `im_chatlog` VALUES (157, 2, 12, '123', 1538123102754, 'group', 1);
INSERT INTO `im_chatlog` VALUES (158, 2, 11, '12123', 1538123106976, 'group', 1);
INSERT INTO `im_chatlog` VALUES (159, 1, 11, '123', 1538123129115, 'group', 1);
INSERT INTO `im_chatlog` VALUES (160, 2, 1, '1323', 1538123133771, 'group', 1);
INSERT INTO `im_chatlog` VALUES (161, 2, 12, 'zxc', 1538123171296, 'group', 1);
INSERT INTO `im_chatlog` VALUES (162, 2, 12, 'xcv', 1538123177584, 'group', 1);
INSERT INTO `im_chatlog` VALUES (163, 2, 11, 'xcvx', 1538123180951, 'group', 1);
INSERT INTO `im_chatlog` VALUES (164, 1, 11, 'xcvc', 1538123186727, 'group', 1);
INSERT INTO `im_chatlog` VALUES (165, 2, 11, 'xcxczxc', 1538123219471, 'group', 1);
INSERT INTO `im_chatlog` VALUES (166, 1, 11, 'xcxcv', 1538123221546, 'group', 1);
INSERT INTO `im_chatlog` VALUES (167, 1, 11, 'xcvxc', 1538123226393, 'group', 1);
INSERT INTO `im_chatlog` VALUES (168, 1, 11, 'zxczx', 1538123329596, 'group', 1);
INSERT INTO `im_chatlog` VALUES (169, 2, 11, 'zxczxczxcxc', 1538123365560, 'group', 1);
INSERT INTO `im_chatlog` VALUES (170, 2, 11, 'cxcv', 1538123489554, 'group', 1);
INSERT INTO `im_chatlog` VALUES (171, 1, 11, 'zxczx', 1538123503444, 'group', 1);
INSERT INTO `im_chatlog` VALUES (172, 2, 1, 'zx', 1538123512498, 'group', 1);
INSERT INTO `im_chatlog` VALUES (173, 2, 11, 'zx', 1538123515851, 'group', 1);
INSERT INTO `im_chatlog` VALUES (174, 1, 2, 'z\'x\'z\'x', 1539861078095, 'friend', 0);
COMMIT;

-- ----------------------------
-- Table structure for im_group
-- ----------------------------
DROP TABLE IF EXISTS `im_group`;
CREATE TABLE `im_group` (
  `group_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '群号',
  `groupname` varchar(255) NOT NULL COMMENT '群名字',
  `avatar` varchar(255) DEFAULT NULL COMMENT '群头像',
  `notice` varchar(255) DEFAULT NULL COMMENT '群公告',
  `user_id` bigint(20) DEFAULT NULL COMMENT '群主id/用户id',
  `approval` int(11) DEFAULT NULL COMMENT '是否开启验证（0/1）',
  PRIMARY KEY (`group_id`) USING BTREE,
  KEY `group_id` (`group_id`,`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of im_group
-- ----------------------------
BEGIN;
INSERT INTO `im_group` VALUES (11, '群组一', '//xbjss-1251762061.cos.ap-chengdu.myqcloud.com/logo.png', '公告1', 1, 1);
INSERT INTO `im_group` VALUES (12, '群组二', '//xbjss-1251762061.cos.ap-chengdu.myqcloud.com/logo.png', NULL, 2, 1);
COMMIT;

-- ----------------------------
-- Table structure for im_group_user
-- ----------------------------
DROP TABLE IF EXISTS `im_group_user`;
CREATE TABLE `im_group_user` (
  `group_user_id` bigint(22) NOT NULL AUTO_INCREMENT COMMENT '关联用户和群',
  `user_id` bigint(22) NOT NULL COMMENT '用户id',
  `group_id` bigint(22) NOT NULL COMMENT '群组id',
  `nickName` varchar(255) NOT NULL COMMENT '该用户的群员昵称',
  PRIMARY KEY (`group_user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of im_group_user
-- ----------------------------
BEGIN;
INSERT INTO `im_group_user` VALUES (1, 2, 11, '');
INSERT INTO `im_group_user` VALUES (2, 3, 12, '');
INSERT INTO `im_group_user` VALUES (3, 4, 11, '群昵称');
COMMIT;

-- ----------------------------
-- Table structure for im_msgbox
-- ----------------------------
DROP TABLE IF EXISTS `im_msgbox`;
CREATE TABLE `im_msgbox` (
  `box_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `uid` bigint(11) unsigned DEFAULT NULL,
  `fromid` bigint(11) unsigned DEFAULT NULL,
  `from_group` bigint(11) unsigned DEFAULT NULL,
  `typ` int(11) unsigned DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `href` varchar(200) DEFAULT NULL,
  `read` smallint(11) unsigned DEFAULT NULL,
  `time` bigint(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`box_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for im_my_friend
-- ----------------------------
DROP TABLE IF EXISTS `im_my_friend`;
CREATE TABLE `im_my_friend` (
  `my_friend_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '好友和分组关联id',
  `my_fz_id` bigint(20) DEFAULT NULL COMMENT '用户分组id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id,也就是那个用户是好友',
  `nickName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '好友的昵称/默认是好友名字',
  PRIMARY KEY (`my_friend_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of im_my_friend
-- ----------------------------
BEGIN;
INSERT INTO `im_my_friend` VALUES (1, 1, 2, '我是备注');
INSERT INTO `im_my_friend` VALUES (2, 2, 3, '我也是备注');
INSERT INTO `im_my_friend` VALUES (3, 1, 4, '我真的是备注');
INSERT INTO `im_my_friend` VALUES (4, 3, 1, '吾爱小白');
COMMIT;

-- ----------------------------
-- Table structure for im_my_fz
-- ----------------------------
DROP TABLE IF EXISTS `im_my_fz`;
CREATE TABLE `im_my_fz` (
  `fz_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '分组id',
  `fz_groupname` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '分组名称',
  PRIMARY KEY (`fz_id`) USING BTREE,
  KEY `id` (`fz_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of im_my_fz
-- ----------------------------
BEGIN;
INSERT INTO `im_my_fz` VALUES (1, '分组一');
INSERT INTO `im_my_fz` VALUES (2, '分组二');
INSERT INTO `im_my_fz` VALUES (3, '分组一');
COMMIT;

-- ----------------------------
-- Table structure for im_user
-- ----------------------------
DROP TABLE IF EXISTS `im_user`;
CREATE TABLE `im_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'userid',
  `username` varchar(255) NOT NULL COMMENT '昵称',
  `pass` varchar(255) NOT NULL COMMENT '用户密码',
  `sign` varchar(255) DEFAULT NULL COMMENT '签名',
  `status` varchar(255) DEFAULT NULL COMMENT '是否在线状态',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `sex` int(1) DEFAULT NULL COMMENT '性别（0男/1女）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of im_user
-- ----------------------------
BEGIN;
INSERT INTO `im_user` VALUES (1, '吾爱小白', '1', '吾爱小白-小白技术社', 'hide', '//xbjss-1251762061.cos.ap-chengdu.myqcloud.com/logo.png', 1);
INSERT INTO `im_user` VALUES (2, '小白技术社', '2', '小白技术社', 'hide', '//xbjss-1251762061.cos.ap-chengdu.myqcloud.com/logo.png', 1);
INSERT INTO `im_user` VALUES (3, '小白', '3', '1', 'online', '//xbjss-1251762061.cos.ap-chengdu.myqcloud.com/logo.png', 2);
INSERT INTO `im_user` VALUES (4, '技术', '4', '1', 'online', '//xbjss-1251762061.cos.ap-chengdu.myqcloud.com/logo.png', 1);
COMMIT;

-- ----------------------------
-- Table structure for im_user_fz
-- ----------------------------
DROP TABLE IF EXISTS `im_user_fz`;
CREATE TABLE `im_user_fz` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户和分组关联',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `fz_id` bigint(20) DEFAULT NULL COMMENT '分组id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_user_fz
-- ----------------------------
BEGIN;
INSERT INTO `im_user_fz` VALUES (1, 1, 1);
INSERT INTO `im_user_fz` VALUES (2, 1, 2);
INSERT INTO `im_user_fz` VALUES (4, 2, 3);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
