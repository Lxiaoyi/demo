/*
 Navicat Premium Data Transfer

 Source Server         : mySel
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : mytest

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 08/01/2019 16:31:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `s_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `s_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `s_age` smallint(6) NOT NULL DEFAULT 0,
  `s_sex` tinyint(6) NOT NULL DEFAULT 0 COMMENT '0 : 男，1：女',
  PRIMARY KEY (`s_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1008 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1000, '张三', 20, 0);
INSERT INTO `student` VALUES (1001, '李四', 21, 0);
INSERT INTO `student` VALUES (1002, '王五', 20, 0);
INSERT INTO `student` VALUES (1003, '张芳', 20, 1);
INSERT INTO `student` VALUES (1004, '李艳', 19, 1);
INSERT INTO `student` VALUES (1005, '王静', 19, 1);
INSERT INTO `student` VALUES (1007, '测试新增', 20, 0);

SET FOREIGN_KEY_CHECKS = 1;
