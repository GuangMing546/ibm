/*
 Navicat Premium Data Transfer

 Source Server         : IBMTest
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : test_mysql

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 18/11/2020 16:33:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '光明', '123');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_class` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `score` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `student_number`(`student_number`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 48 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (3, '宁次', '123', '170815', '一二三', '123', '100');
INSERT INTO `student` VALUES (4, '雏田', '123', '170815', '日向雏田', '55555', '100');
INSERT INTO `student` VALUES (5, '丁次', '123', '170815', '丁次', '11111', '60');
INSERT INTO `student` VALUES (6, '佐助', '123', '170815', '宇智波佐助', '22222', '60');
INSERT INTO `student` VALUES (7, '带土', '123', '170815', '宇智波带土', '33333', '60');
INSERT INTO `student` VALUES (8, '鼬', '123', '170825', '宇智波鼬', '44444', '60');
INSERT INTO `student` VALUES (9, '斑', '123', '170815', '宇智波斑', '88888', '60');
INSERT INTO `student` VALUES (10, '长门', '123', '晓组织', '长门', '99999', '60');
INSERT INTO `student` VALUES (11, '好色仙人', '123', '木叶村', '自来也', '101010', '60');
INSERT INTO `student` VALUES (12, '纲手', '123', '木叶村', '纲手', '121212', '60');
INSERT INTO `student` VALUES (13, '大蛇丸', '123', '反派头目', '大蛇丸', '131313', '60');
INSERT INTO `student` VALUES (14, '阿斯玛', '123', '木叶村', '袁飞阿斯玛', '141414', '60');
INSERT INTO `student` VALUES (15, '我爱罗', '123', '砂隐村', '沙暴我爱罗', '151515', '60');
INSERT INTO `student` VALUES (16, '长十郎', '123', '水村', '长十郎', '161616', '60');
INSERT INTO `student` VALUES (17, '小南', '123', '晓组织', '小南', '171717', '60');
INSERT INTO `student` VALUES (18, '杀人蜂', '123', '雷村', '奇拉比', '181818', '60');
INSERT INTO `student` VALUES (31, '1234', '1234', '170815', 'asdsa', '321321321', '11');
INSERT INTO `student` VALUES (32, '213213', '12', '170815', '1212', '11111111111111', NULL);
INSERT INTO `student` VALUES (33, '11132432', '11', '170815', '1', '213213123', NULL);
INSERT INTO `student` VALUES (34, 'admin', '123456', '170815', '张三', '3117000001', NULL);
INSERT INTO `student` VALUES (35, 'ad', '123456', '170815', '张四', '3117000002', NULL);
INSERT INTO `student` VALUES (39, 'ad in', '123456', '170815', '张六', '3117000004', NULL);
INSERT INTO `student` VALUES (41, 'user01', '12345', '170815', '张八', '3117000006', NULL);
INSERT INTO `student` VALUES (42, 'user02', '123 45', '170815', '张九', '3117000007', NULL);
INSERT INTO `student` VALUES (44, 'user08', '123456', '170815', '张十五', '31170000122', NULL);
INSERT INTO `student` VALUES (45, 'user11', '123456', '170815', '张十八', '3117000012', NULL);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '卡卡西', '1234', 'xikaka');
INSERT INTO `teacher` VALUES (7, 'aa2', '111', 'aa1');
INSERT INTO `teacher` VALUES (8, 'aa3', '111', 'aa1');
INSERT INTO `teacher` VALUES (9, 'aa4', '111', 'aa1');
INSERT INTO `teacher` VALUES (10, 'aa5', '111', 'aa1');
INSERT INTO `teacher` VALUES (11, 'aa6', '111', 'aa1');
INSERT INTO `teacher` VALUES (12, 'aa7', '111', 'aa1');
INSERT INTO `teacher` VALUES (13, 'aa8', '111', 'aa1');
INSERT INTO `teacher` VALUES (15, 'aa10', '111', 'aa1');
INSERT INTO `teacher` VALUES (16, 'aa11', '111', 'aa1');
INSERT INTO `teacher` VALUES (17, 'aa12', '111', 'aa1');
INSERT INTO `teacher` VALUES (21, 'teach02', '12345', '李九');
INSERT INTO `teacher` VALUES (22, 'teach03', '1234 5', '李十');
INSERT INTO `teacher` VALUES (23, 'teach05', '123456', '李十二');
INSERT INTO `teacher` VALUES (24, 'teach07', '1234567', '李十三');
