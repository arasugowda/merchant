/*
Navicat MySQL Data Transfer

Source Server         : db
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : merchant

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2014-11-15 14:07:43
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `balanceamount`
-- ----------------------------
DROP TABLE IF EXISTS `balanceamount`;
CREATE TABLE `balanceamount` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `startingbalance` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of balanceamount
-- ----------------------------
INSERT INTO `balanceamount` VALUES ('76', '100000', '30-09-2014');
INSERT INTO `balanceamount` VALUES ('77', '135624.21937500002', '01-10-2014');
INSERT INTO `balanceamount` VALUES ('78', '200000', '31-10-2014');
INSERT INTO `balanceamount` VALUES ('79', '239659.95899999997', '01-11-2014');
INSERT INTO `balanceamount` VALUES ('80', '1365218.3452399997', '02-11-2014');
INSERT INTO `balanceamount` VALUES ('81', '420664.2794', '03-11-2014');
INSERT INTO `balanceamount` VALUES ('82', '420664.2794', '04-11-2014');
INSERT INTO `balanceamount` VALUES ('83', '420664.2794', '05-11-2014');
INSERT INTO `balanceamount` VALUES ('84', '420664.2794', '06-11-2014');
INSERT INTO `balanceamount` VALUES ('85', '420664.2794', '07-11-2014');
INSERT INTO `balanceamount` VALUES ('86', '-7525470.7206', '08-11-2014');
INSERT INTO `balanceamount` VALUES ('87', '420664.2794', '09-11-2014');
INSERT INTO `balanceamount` VALUES ('88', '420664.2794', '10-11-2014');
INSERT INTO `balanceamount` VALUES ('89', '420664.2794', '11-11-2014');
INSERT INTO `balanceamount` VALUES ('90', '751081.6393999996', '12-11-2014');
INSERT INTO `balanceamount` VALUES ('91', '420664.2794', '13-11-2014');
INSERT INTO `balanceamount` VALUES ('92', '420664.2794', '14-11-2014');
INSERT INTO `balanceamount` VALUES ('93', '2.4695564442794E9', '15-11-2014');
INSERT INTO `balanceamount` VALUES ('94', '420664.2794', '16-11-2014');
INSERT INTO `balanceamount` VALUES ('95', '420664.2794', '17-11-2014');
INSERT INTO `balanceamount` VALUES ('96', '558664.2794', '18-11-2014');
INSERT INTO `balanceamount` VALUES ('97', '420664.2794', '19-11-2014');
INSERT INTO `balanceamount` VALUES ('98', '420664.2794', '20-11-2014');
INSERT INTO `balanceamount` VALUES ('99', '420664.2794', '21-11-2014');
INSERT INTO `balanceamount` VALUES ('100', '420664.2794', '22-11-2014');
INSERT INTO `balanceamount` VALUES ('101', '420664.2794', '23-11-2014');
INSERT INTO `balanceamount` VALUES ('102', '420664.2794', '24-11-2014');
INSERT INTO `balanceamount` VALUES ('103', '429147.18619999994', '25-11-2014');
INSERT INTO `balanceamount` VALUES ('104', '420664.2794', '26-11-2014');
INSERT INTO `balanceamount` VALUES ('105', '420664.2794', '27-11-2014');
INSERT INTO `balanceamount` VALUES ('106', '420664.2794', '28-11-2014');
INSERT INTO `balanceamount` VALUES ('107', '420664.2794', '29-11-2014');
INSERT INTO `balanceamount` VALUES ('108', '420664.2794', '30-11-2014');

-- ----------------------------
-- Table structure for `buyer`
-- ----------------------------
DROP TABLE IF EXISTS `buyer`;
CREATE TABLE `buyer` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `initial` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `address` text NOT NULL,
  `phonenumber` varchar(200) NOT NULL,
  `tin` varchar(200) NOT NULL,
  `commission` varchar(200) NOT NULL,
  `margin` varchar(200) NOT NULL,
  `kannadaname` text NOT NULL,
  `buyerid` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=384 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of buyer
-- ----------------------------
INSERT INTO `buyer` VALUES ('376', 'QSD', 'QSD Name', 'changed_addresss1', '1123456789', '654321', '5', '3', 'kannada name', 'QSD0');
INSERT INTO `buyer` VALUES ('377', 'RMZ', 'Ram', 'xyz', '76543422222', '3333333333', '4', '5', 'NEw', 'RMZ0');
INSERT INTO `buyer` VALUES ('379', 'TYT', 'QSD Name For TYT', 'changed_addresss1', '1123456789', '654321', '5', '3', 'kannada name', 'TYT0');
INSERT INTO `buyer` VALUES ('383', 'AVB', 'AVBff', 'changed_addresss1', '1123456789', '654321', '10', '15', '1', 'AVB0');

-- ----------------------------
-- Table structure for `commodity`
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `kannadaname` text NOT NULL,
  `itemname` varchar(200) NOT NULL,
  `farmerhamali` varchar(200) NOT NULL,
  `purchasehamali` varchar(200) NOT NULL,
  `rmc` varchar(100) NOT NULL,
  `farmercommission` varchar(200) NOT NULL,
  `vat` varchar(100) NOT NULL,
  `surcharge` varchar(100) NOT NULL,
  `commodityid` varchar(200) NOT NULL,
  `initials` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('12', 'dfdfg', 'itemname', '10.00', '10', '10.00', '12.00', '5.00', '5.00', 'INI12', 'INI');
INSERT INTO `commodity` VALUES ('13', 'nuts', 'nuts', '10.00', '10.00', '10.00', '15.00', '13.00', '20.00', 'NUT13', 'NUT');
INSERT INTO `commodity` VALUES ('14', 'beteals', 'betels', '12.00', '20.00', '15.00', '10.00', '10.00', '10.00', 'BET14', 'BET');

-- ----------------------------
-- Table structure for `farmer`
-- ----------------------------
DROP TABLE IF EXISTS `farmer`;
CREATE TABLE `farmer` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `initial` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(200) NOT NULL,
  `kannadaname` varchar(200) NOT NULL,
  `farmerid` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of farmer
-- ----------------------------
INSERT INTO `farmer` VALUES ('1', 'BNB', 'Basavaraj', '#113,5th cross,3rd main,tumkur', '9986747023', 'dfsdf', 'BNB1');
INSERT INTO `farmer` VALUES ('2', 'SV', 'Raghavendra', '#12,6th cross,6th main,tumkur', '9876543211', 'kannada name1', 'SV2');
INSERT INTO `farmer` VALUES ('3', 'SVA', 'Arasu', '#2,3rd cross,tumkur', '080-32623232', 'kannadaname1', 'SVA3');
INSERT INTO `farmer` VALUES ('4', 'SVC', 'Chandru', '#2,3rd main,3rd cross,tumkur', '080-32623232', 'kannadaname1', 'SVC4');

-- ----------------------------
-- Table structure for `governmenttransaction`
-- ----------------------------
DROP TABLE IF EXISTS `governmenttransaction`;
CREATE TABLE `governmenttransaction` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(200) NOT NULL,
  `lotno` varchar(200) NOT NULL,
  `villagename` varchar(200) NOT NULL,
  `farmername` varchar(200) NOT NULL,
  `weight` varchar(200) NOT NULL,
  `buyerinitial` varchar(200) NOT NULL,
  `rateperkg` varchar(200) NOT NULL,
  `abillno` varchar(200) NOT NULL,
  `bbillno` varchar(200) NOT NULL,
  `invoiceno` varchar(200) NOT NULL,
  `rmc` varchar(200) NOT NULL,
  `vat` varchar(200) NOT NULL,
  `surcharge` varchar(200) NOT NULL,
  `hamali` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  `commission` varchar(200) NOT NULL,
  `total` varchar(200) NOT NULL,
  `grandtotal` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of governmenttransaction
-- ----------------------------
INSERT INTO `governmenttransaction` VALUES ('18', 'nuts', '1', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('19', 'nuts', '2', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('20', 'nuts', '3', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('21', 'nuts', '4', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('22', 'nuts', '5', 'dasanpura', 'SVA', '120.34', 'TYT', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_TYT_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('23', 'nuts', '6', 'dasanpura', 'SVA', '120.34', 'TYT', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_TYT_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('24', 'nuts', '7', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('25', 'nuts', '8', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('26', 'nuts', '9', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('27', 'nuts', '10', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('28', 'nuts', '11', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('29', 'nuts', '12', 'dasanpura', 'SVA', '120.34', 'QSD', '11', 'ABIL_NUTS_SVA1', 'BBIL_NUTS_SVA1', 'IN_QSD_NUTS_SVA1', '132.37', '172.09', '264.75', '132.37', '01-11-2014', '66.19', '1323.74', '2091.51');
INSERT INTO `governmenttransaction` VALUES ('30', 'nuts', '13', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('31', 'nuts', '14', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('32', 'nuts', '15', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('33', 'nuts', '16', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('34', 'nuts', '17', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('35', 'nuts', '18', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('36', 'nuts', '19', 'Binmanagala', 'SV', '137.75', 'RMZ', '10.50', 'ABIL_NUTS_SV1', 'BBIL_NUTS_SV1', 'IN_RMZ_NUT_SV1', '144.64', '188.03', '289.28', '144.64', '01-11-2014', '57.86', '1446.375', '2270.825');
INSERT INTO `governmenttransaction` VALUES ('37', 'nuts', '20', 'ramanagara', 'SVC', '150', 'QSD', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_QSD_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('38', 'nuts', '21', 'ramanagara', 'SVC', '150', 'QSD', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_QSD_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('39', 'nuts', '22', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('40', 'nuts', '23', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('41', 'nuts', '24', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('42', 'nuts', '25', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('43', 'nuts', '26', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('44', 'nuts', '27', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('45', 'nuts', '28', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('46', 'nuts', '29', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('47', 'nuts', '30', 'ramanagara', 'SVC', '150', 'TYT', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_TYT_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '112.50', '2250.0', '3555.0');
INSERT INTO `governmenttransaction` VALUES ('48', 'nuts', '31', 'ramanagara', 'SVC', '150', 'RMZ', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_RMZ_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('49', 'nuts', '32', 'ramanagara', 'SVC', '150', 'RMZ', '15', 'ABILL_NUTS_SVC1', 'BBILL_NUTS_SVC1', 'IN_RMZ_NUTS_SVC1', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('50', 'nuts', '1', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('51', 'nuts', '2', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('52', 'nuts', '3', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('53', 'nuts', '4', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('54', 'nuts', '5', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('55', 'nuts', '6', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('56', 'nuts', '7', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('57', 'nuts', '8', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('58', 'nuts', '9', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('59', 'nuts', '10', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('60', 'nuts', '11', 'dasanpura', 'SVA', '120.32', 'TYT', '32.11', 'ABIL_NUTS_SVA2', 'BBIL_NUTS_SVA2', 'IN_TYT_NUTS2', '386.35', '502.25', '772.70', '386.35', '02-11-2014', '193.17', '3863.4752', '6104.2952000000005');
INSERT INTO `governmenttransaction` VALUES ('61', 'nuts', '12', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('62', 'nuts', '13', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('63', 'nuts', '14', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('64', 'nuts', '15', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('65', 'nuts', '16', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('66', 'nuts', '17', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('67', 'nuts', '18', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('68', 'nuts', '19', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('69', 'nuts', '20', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('70', 'nuts', '21', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('71', 'nuts', '22', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('72', 'nuts', '23', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('73', 'nuts', '24', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('74', 'nuts', '25', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('75', 'nuts', '26', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('76', 'nuts', '27', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('77', 'nuts', '28', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('78', 'nuts', '29', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('79', 'nuts', '30', 'ramanagara', 'SVC', '115.32', 'AVB', '40.34', 'ABIL_NUTS_SVC2', 'BBIL_NUTS_SVC2', 'IN_AVB_NUTS2', '465.20', '604.76', '930.40', '465.20', '02-11-2014', '465.20', '4652.0088000000005', '7582.7688');
INSERT INTO `governmenttransaction` VALUES ('80', 'nuts', '33', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('81', 'nuts', '34', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('82', 'nuts', '35', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('83', 'nuts', '36', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('84', 'nuts', '37', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('85', 'nuts', '38', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('86', 'nuts', '39', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('87', 'nuts', '40', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('88', 'nuts', '41', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('89', 'nuts', '42', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('90', 'nuts', '43', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('91', 'nuts', '44', 'ramanagara', 'SVC', '150', 'RMZ', '15', '', '', '', '225.00', '292.50', '450.00', '225.00', '01-11-2014', '90.00', '2250.0', '3532.5');
INSERT INTO `governmenttransaction` VALUES ('92', 'nuts', '1', 'village1', 'farmer1', '123', 'QSD', '123', 'ABIL_FAR_1', '', '', '1512.90', '1966.77', '3025.80', '1512.90', '12-11-2014', '756.45', '15129.0', '23903.820000000003');
INSERT INTO `governmenttransaction` VALUES ('93', 'nuts', '2', 'village1', 'farmer1', '123', 'QSD', '123', '', '', '', '1512.90', '1966.77', '3025.80', '1512.90', '12-11-2014', '756.45', '15129.0', '23903.820000000003');
INSERT INTO `governmenttransaction` VALUES ('94', 'nuts', '3', 'village1', 'farmer1', '123', 'QSD', '123', '', '', '', '1512.90', '1966.77', '3025.80', '1512.90', '12-11-2014', '756.45', '15129.0', '23903.820000000003');
INSERT INTO `governmenttransaction` VALUES ('95', 'nuts', '4', 'village1', 'farmer1', '123', 'QSD', '123', '', '', '', '1512.90', '1966.77', '3025.80', '1512.90', '12-11-2014', '756.45', '15129.0', '23903.820000000003');
INSERT INTO `governmenttransaction` VALUES ('96', 'nuts', '5', 'village1', 'farmer1', '123', 'QSD', '123', '', '', '', '1512.90', '1966.77', '3025.80', '1512.90', '12-11-2014', '756.45', '15129.0', '23903.820000000003');
INSERT INTO `governmenttransaction` VALUES ('97', 'nuts', '6', 'village1', 'farmer1', '123', 'QSD', '123', '', '', '', '1512.90', '1966.77', '3025.80', '1512.90', '12-11-2014', '756.45', '15129.0', '23903.820000000003');
INSERT INTO `governmenttransaction` VALUES ('98', 'nuts', '1', 'village1', 'farmer1', '12.12', 'RMZ', '11', 'ABill1221', '2323', '232323', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('99', 'nuts', '2', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('100', 'nuts', '3', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('101', 'nuts', '4', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('102', 'nuts', '5', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('103', 'nuts', '6', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('104', 'nuts', '7', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('105', 'nuts', '8', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('106', 'nuts', '9', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('107', 'nuts', '10', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('108', 'nuts', '11', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('109', 'nuts', '12', 'village1', 'farmer1', '12.12', 'RMZ', '11', '', '', '', '13.33', '17.33', '26.66', '13.33', '25-11-2014', '5.33', '133.32', '209.30000000000004');
INSERT INTO `governmenttransaction` VALUES ('110', 'nuts', '13', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('111', 'nuts', '14', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('112', 'nuts', '15', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('113', 'nuts', '16', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('114', 'nuts', '17', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('115', 'nuts', '18', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('116', 'nuts', '19', 'village2 ', 'farmer2', '111.12', 'QSD', '11', '', '', '', '122.23', '158.90', '244.46', '122.23', '25-11-2014', '61.12', '1222.3200000000002', '1931.2600000000002');
INSERT INTO `governmenttransaction` VALUES ('117', 'nuts', '45', 'fggf', 'asd', '8', 'RMZ', '5', 'dd123', 'dd125', '55', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('118', 'nuts', '46', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('119', 'nuts', '47', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('120', 'nuts', '48', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('121', 'nuts', '51', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('122', 'nuts', '52', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('123', 'nuts', '53', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('124', 'nuts', '54', 'svsd', 'dfgf', '88', 'TYT', '54', '', '', '', '475.20', '617.76', '950.40', '475.20', '01-11-2014', '237.60', '4752.0', '7508.16');
INSERT INTO `governmenttransaction` VALUES ('125', 'nuts', '55', 'svsd', 'dfgf', '88', 'TYT', '54', '', '', '', '475.20', '617.76', '950.40', '475.20', '01-11-2014', '237.60', '4752.0', '7508.16');
INSERT INTO `governmenttransaction` VALUES ('126', 'nuts', '49', 'fggf', 'asd', '8', 'RMZ', '5', '', '', '', '4.00', '5.20', '8.00', '4.00', '01-11-2014', '1.60', '40.0', '62.800000000000004');
INSERT INTO `governmenttransaction` VALUES ('127', 'nuts', '1', 'www', 'scxscx', '100', 'RmZ', '133', '12333', '5544', '55', '1330.00', '1729.00', '2660.00', '1330.00', '08-11-2014', '532.00', '13300.0', '20881.0');
INSERT INTO `governmenttransaction` VALUES ('128', 'nuts', '2', 'www', 'scxscx', '100', 'RmZ', '133', '', '', '', '1330.00', '1729.00', '2660.00', '1330.00', '08-11-2014', '532.00', '13300.0', '20881.0');
INSERT INTO `governmenttransaction` VALUES ('129', 'nuts', '3', 'www', 'scxscx', '100', 'RmZ', '133', '', '', '', '1330.00', '1729.00', '2660.00', '1330.00', '08-11-2014', '532.00', '13300.0', '20881.0');

-- ----------------------------
-- Table structure for `ledger`
-- ----------------------------
DROP TABLE IF EXISTS `ledger`;
CREATE TABLE `ledger` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `amount` varchar(200) NOT NULL,
  `description` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  `creditordebit` varchar(200) NOT NULL,
  `transactionid` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ledger
-- ----------------------------
INSERT INTO `ledger` VALUES ('14', '1000', 'SBI BANK CREDITED', '24-09-2014', 'credit', 'TRANSACTION14');
INSERT INTO `ledger` VALUES ('15', '1000', 'TGMC Bank Expenditure', '24-09-2014', 'debit', 'TRANSACTION15');
INSERT INTO `ledger` VALUES ('16', '1000', 'Commission Charges', '24-09-2014', 'credit', 'TRANSACTION16');
INSERT INTO `ledger` VALUES ('18', '2000', 'SBI Bank Savings', '25-09-2014', 'credit', 'TRANSACTION18');
INSERT INTO `ledger` VALUES ('19', '2000', 'VAT Charges', '25-09-2014', 'credit', 'TRANSACTION19');
INSERT INTO `ledger` VALUES ('21', '14306.00', 'Credit Description', '01-11-2014', 'credit', 'TRANSACTION21');
INSERT INTO `ledger` VALUES ('23', '120.00', 'Debit Descsription', '01-11-2014', 'debit', 'TRANSACTION23');
INSERT INTO `ledger` VALUES ('24', '110.00', 'Another Credit Description', '01-11-2014', 'credit', 'TRANSACTION24');
INSERT INTO `ledger` VALUES ('25', '1600000', 'Software', '08-11-2014', 'debit', 'TRANSACTION25');
INSERT INTO `ledger` VALUES ('26', '69000.00', 'VAT', '18-11-2014', 'credit', 'TRANSACTION26');
INSERT INTO `ledger` VALUES ('30', '1234567890.00', 'MY dayBook Description', '15-11-2014', 'credit', 'TRANSACTION30');

-- ----------------------------
-- Table structure for `ledgerkannada`
-- ----------------------------
DROP TABLE IF EXISTS `ledgerkannada`;
CREATE TABLE `ledgerkannada` (
  `farmerinput` text NOT NULL,
  `buyerinput` text NOT NULL,
  `manditransaction1` text NOT NULL,
  `manditransaction2` text NOT NULL,
  `manditransaction3` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ledgerkannada
-- ----------------------------
INSERT INTO `ledgerkannada` VALUES ('farmer', 'buyer', '1', '2', '3');

-- ----------------------------
-- Table structure for `manditransaction`
-- ----------------------------
DROP TABLE IF EXISTS `manditransaction`;
CREATE TABLE `manditransaction` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `lotno` varchar(200) NOT NULL,
  `itemname` varchar(200) NOT NULL,
  `villagename` varchar(200) NOT NULL,
  `farmername` varchar(200) NOT NULL,
  `weight` varchar(200) NOT NULL,
  `buyerinitial` varchar(200) NOT NULL,
  `rateperkg` varchar(200) NOT NULL,
  `package1` varchar(200) NOT NULL,
  `package2` varchar(200) NOT NULL,
  `commission` varchar(200) NOT NULL,
  `hamali` varchar(200) NOT NULL,
  `amount` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=193 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manditransaction
-- ----------------------------
INSERT INTO `manditransaction` VALUES ('1', '1', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('2', '2', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('3', '3', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('4', '4', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('5', '5', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('7', '7', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('8', '8', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('9', '9', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('10', '10', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('11', '11', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('12', '12', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('13', '13', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('14', '14', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('15', '15', 'itemname', 'magadipura', 'BNB', '100', 'QSD', '12', '321', '123', '1120.99', '120.12', '1200.00', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('16', '16', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('17', '17', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('18', '18', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('19', '19', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('20', '20', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('21', '21', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('22', '22', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('23', '23', 'itemname', 'magadipura', 'BNB', '120', 'TYT', '11.21', '432', '121', '1120.99', '213.11', '1345.20', '01-10-2014');
INSERT INTO `manditransaction` VALUES ('84', '1', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '1234', '4321', '4500', '3200', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('85', '2', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('86', '3', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('87', '4', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('88', '5', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('89', '6', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('90', '7', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('91', '8', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('92', '9', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('93', '10', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('94', '11', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('95', '12', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('97', '14', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('100', '17', 'nuts', 'binmangala', 'SV', '120', 'QSD', '12', '', '', '4500', '', '1440.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('102', '19', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('103', '20', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('104', '21', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('105', '22', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('106', '23', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('108', '25', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('109', '26', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('110', '27', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('111', '28', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('112', '32', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '2300.00', '', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('113', '31', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('114', '30', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('115', '29', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('116', '33', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('117', '34', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('118', '35', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('119', '36', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('134', '37', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('135', '38', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('136', '39', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('137', '40', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('138', '41', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('139', '42', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('140', '43', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('141', '44', 'nuts', 'dasanpura', 'SVA', '110', 'TYT', '11', '', '', '60.5', '121.0', '1210.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('142', '1', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('143', '2', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('144', '3', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('145', '4', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('146', '11', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('147', '12', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('148', '13', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('149', '10', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('150', '9', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('151', '8', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('152', '14', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('153', '15', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('154', '16', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('155', '17', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('156', '7', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('157', '6', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('158', '5', 'betels', 'village1', 'farmer1', '123.12', 'QSD', '11', '', '', '67.71600000000001', '270.86400000000003', '1354.32', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('159', '18', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('160', '19', 'betels', 'village2', 'farmer2', '111.12', 'RMZ', '12', '', '', '53.3376', '266.68800000000005', '1333.44', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('169', '1', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '123', '321', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('170', '2', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('171', '3', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('172', '4', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('173', '5', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('174', '6', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('175', '7', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('176', '8', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('177', '9', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('178', '10', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('179', '11', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('180', '17', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('183', '18', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('184', '19', 'nuts', 'village2', 'farmer2', '321.123', 'RMZ', '12.32', '321', '123', '158.2494144', '395.62353600000006', '3956.24', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('185', '14', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('186', '13', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('187', '12', 'nuts', 'village1', 'farmer1', '120', 'QSD', '12', '', '', '72.0', '144.0', '1440.00', '13-11-2014');
INSERT INTO `manditransaction` VALUES ('188', '45', 'nuts', 'village', 'farmer', '143', 'RMZ', '12', '', '', '68.64', '171.60000000000002', '1716.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('189', '46', 'nuts', 'village', 'farmer', '143', 'RMZ', '12', '', '', '68.64', '171.60000000000002', '1716.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('190', '47', 'nuts', 'village', 'farmer', '143', 'RMZ', '12', '', '', '68.64', '171.60000000000002', '1716.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('191', '48', 'nuts', 'village', 'farmer', '143', 'RMZ', '12', '', '', '68.64', '171.60000000000002', '1716.00', '01-11-2014');
INSERT INTO `manditransaction` VALUES ('192', '1hddfgdg', 'betels', '', '', '0.0', '', '0.0', '', '', '0.0', '0.0', '', '02-11-2014');

-- ----------------------------
-- Table structure for `transaction`
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `farmername` varchar(200) NOT NULL,
  `itemname` varchar(200) NOT NULL,
  `weight` varchar(200) NOT NULL,
  `lotno` varchar(200) NOT NULL,
  `noofbags` varchar(200) NOT NULL,
  `abillno` varchar(200) NOT NULL,
  `date` varchar(200) NOT NULL,
  `rateperkg` varchar(200) NOT NULL,
  `tradersname` varchar(200) NOT NULL,
  `rmc` varchar(200) NOT NULL,
  `commission` varchar(200) NOT NULL,
  `vat` varchar(200) NOT NULL,
  `surcharge` varchar(200) NOT NULL,
  `hamali` varchar(200) NOT NULL,
  `bbillno` varchar(200) NOT NULL,
  `invoiceno` varchar(200) NOT NULL,
  `total` varchar(200) NOT NULL,
  `grandtotal` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction
-- ----------------------------
INSERT INTO `transaction` VALUES ('10', 'BNB', 'nutt', '100', '3', '10', 'BNB_ABillNO1', '09-09-2014', '10', 'QSD', '110.0', '50.0', '221.0', '122.0', '342340.0', 'BNB_BBillNO1', '', '1000.0', '343843.0');
INSERT INTO `transaction` VALUES ('11', 'SVA', 'nutt', '110', '2', '10', 'SVA_ABillNO1', '09-09-2014', '20', 'QSD', '242.0', '110.0', '486.2', '268.4', '753148.0', 'SVA_BBillNO1', '', '2200.0', '756454.6');
INSERT INTO `transaction` VALUES ('12', 'SVC', 'nutt', '120', '1', '11', 'SVC_ABillNO1', '09-09-2014', '30', 'QSD', '396.0', '180.0', '795.6', '439.2', '1232424.0', 'SVC_BBillNO1', '', '3600.0', '1237834.8');
INSERT INTO `transaction` VALUES ('13', 'SV', 'nutt', '130', '3', '10', 'SV_ABillNO1', '09-09-2014', '40', 'QSD', '572.0', '260.0', '1149.2', '634.4', '1780167.9999999998', 'SV_BBillNO1', '', '5200.0', '1787983.5999999999');
INSERT INTO `transaction` VALUES ('14', 'SVA', 'nutt', '110', '10', '10', 'SVA_ABillNO1', '09-09-2014', '10', 'QSD', '121.0', '55.0', '243.1', '134.2', '376574.0', 'SVA_BBillNO1', '', '1100.0', '378227.3');
INSERT INTO `transaction` VALUES ('15', 'SVA', 'nuts', '90', '10', '10', 'SVA_ABillNO2', '09-09-2014', '20', 'QSD', '235.98', '90.0', '784.08', '1193.7599999999998', '77778.0', 'SVA_BBillNO2', '', '1800.0', '81881.81999999999');
INSERT INTO `transaction` VALUES ('16', 'SVA', 'nuts', '110', '3', '10', 'SVA_ABillNO2', '09-09-2014', '10', 'QSD', '144.20999999999998', '55.0', '479.16', '729.5199999999999', '47531.0', 'SVA_BBillNO2', '', '1100.0', '50038.89');
INSERT INTO `transaction` VALUES ('17', 'BNB', 'nutt', '120', '4', '15', 'BNB_ABillNO1', '09-09-2014', '15', 'QSD', '198.0', '90.0', '397.8', '219.6', '616212.0', 'BNB_BBillNO1', '', '1800.0', '618917.4');
INSERT INTO `transaction` VALUES ('18', 'SV', 'nutt', '90', '10', '10', 'SV_ABillNO1', '09-09-2014', '30', 'QSD', '297.0', '135.0', '596.7', '329.4', '924317.9999999999', 'SV_BBillNO1', '', '2700.0', '928376.0999999999');
INSERT INTO `transaction` VALUES ('19', 'BNB', 'nuts', '100', '7', '20', 'BNB_ABillNO2', '09-09-2014', '10', 'QSD', '131.1', '50.0', '435.6', '663.1999999999999', '43210.0', 'BNB_BBillNO2', '', '1000.0', '45489.9');
INSERT INTO `transaction` VALUES ('20', 'SVC', 'nuts', '110', '9', '30', 'SVC_ABillNO2', '09-09-2014', '10', 'QSD', '144.20999999999998', '55.0', '479.16', '729.5199999999999', '47531.0', 'SVC_BBillNO2', '', '1100.0', '50038.89');
INSERT INTO `transaction` VALUES ('21', 'SVA', 'nutt', '130', '10', '10', 'SVA_ABillNO1', '09-09-2014', '20', 'QSD', '286.0', '130.0', '574.6', '317.2', '890083.9999999999', 'SVA_BBillNO1', '', '2600.0', '893991.7999999999');
INSERT INTO `transaction` VALUES ('22', 'SVA', 'nutt', '110', '5', '20', 'SVA_ABillNO1', '09-09-2014', '31', 'RMZ', '375.1', '136.4', '753.61', '416.02', '1167379.4', 'SVA_BBillNO1', '', '3410.0', '1172470.5299999998');
INSERT INTO `transaction` VALUES ('23', 'SVS', 'nutt', '111', '6', '10', 'SVA_ABillNO1', '10-09-2014', '110', 'QSD', '1343.1', '610.5', '2698.41', '1489.62', '4179971.4', 'SVA_BBillNO1', '', '12210.0', '4198323.029999999');
INSERT INTO `transaction` VALUES ('24', 'BNB', 'nutt', '100', '3', '10', 'SVA_ABillNO1', '10-09-2014', '33', 'QSD', '363.0', '165.0', '729.3', '402.59999999999997', '1129722.0', 'SVA_BBillNO15', '', '3300.0', '1134681.9');
INSERT INTO `transaction` VALUES ('25', 'BNB', 'nut', '100', '1', '10', 'AB1', '20-09-2014', '10', 'QSD', '30.0', '50.0', '60.0', '40.0', '0.0', 'BB1', 'INV1', '1000.0', '1180.0');
INSERT INTO `transaction` VALUES ('26', 'BNB', 'nutt', '150', '2', '10', 'AB2', '20-09-2014', '15', 'QSD', '247.5', '112.5', '497.25', '274.5', '770265.0', 'BB2', 'INV2', '2250.0', '773646.75');
INSERT INTO `transaction` VALUES ('27', 'BNB', 'nut ', '180', '3', '13', 'AB3', '20-09-2014', '18', 'QSD', '97.2', '162.0', '194.4', '129.6', '0.0', 'BB3', 'INV3', '3240.0', '3823.2');
INSERT INTO `transaction` VALUES ('28', 'BNB', 'nut', '160', '4', '10', 'AB4', '20-09-2014', '22', 'TYT', '105.6', '176.0', '211.2', '140.8', '0.0', 'BB4', 'INV4', '3520.0', '4153.6');

-- ----------------------------
-- Table structure for `transaction_details`
-- ----------------------------
DROP TABLE IF EXISTS `transaction_details`;
CREATE TABLE `transaction_details` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT,
  `trans_date` varchar(200) NOT NULL,
  `amount` varchar(200) NOT NULL,
  `CD` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction_details
-- ----------------------------
INSERT INTO `transaction_details` VALUES ('16', '01-10-2014', '100000.0', 'Dr', 'Farmer1');
INSERT INTO `transaction_details` VALUES ('17', '01-10-2014', '24739.1875', 'Cr', 'Buyer1');
INSERT INTO `transaction_details` VALUES ('18', '01-10-2014', '55945.5875', 'Cr', 'Buyer2');
INSERT INTO `transaction_details` VALUES ('19', '01-10-2014', '94656.21937500002', 'Cr', 'Buyer3');
INSERT INTO `transaction_details` VALUES ('20', '01-10-2014', '106432.21937500002', 'Cr', 'Buyer4');
INSERT INTO `transaction_details` VALUES ('21', '01-10-2014', '135634.21937500002', 'Cr', 'Credit1');
INSERT INTO `transaction_details` VALUES ('22', '01-10-2014', '135514.21937500002', 'Dr', 'Debit1');
INSERT INTO `transaction_details` VALUES ('23', '01-10-2014', '135624.21937500002', 'Cr', 'Credit2');
INSERT INTO `transaction_details` VALUES ('24', '01-11-2014', '200000.0', 'Dr', 'Farmer1');
INSERT INTO `transaction_details` VALUES ('25', '01-11-2014', '107916.495', 'Cr', 'Buyer1');
INSERT INTO `transaction_details` VALUES ('26', '01-11-2014', '130620.36499999999', 'Cr', 'Buyer2');
INSERT INTO `transaction_details` VALUES ('27', '01-11-2014', '172094.259', 'Cr', 'Buyer3');
INSERT INTO `transaction_details` VALUES ('28', '02-11-2014', '1283083.20908', 'Dr', 'Farmer2');
INSERT INTO `transaction_details` VALUES ('29', '02-11-2014', '1193264.3827599997', 'Cr', 'Buyer4');
INSERT INTO `transaction_details` VALUES ('30', '02-11-2014', '1247662.1213199997', 'Cr', 'Buyer5');
INSERT INTO `transaction_details` VALUES ('31', '12-11-2014', '598581.3193999998', 'Dr', 'Farmer3');
INSERT INTO `transaction_details` VALUES ('32', '12-11-2014', '507807.3193999998', 'Cr', 'Buyer6');
INSERT INTO `transaction_details` VALUES ('33', '01-11-2014', '239669.95899999997', 'Cr', 'Credit1');
INSERT INTO `transaction_details` VALUES ('34', '01-11-2014', '239549.95899999997', 'Dr', 'Debit1');
INSERT INTO `transaction_details` VALUES ('35', '01-11-2014', '239659.95899999997', 'Cr', 'Credit2');
INSERT INTO `transaction_details` VALUES ('36', '08-11-2014', '-4347016.7206', 'Dr', 'Farmer3');
INSERT INTO `transaction_details` VALUES ('37', '08-11-2014', '-5976143.7206', 'Cr', 'Buyer6');
INSERT INTO `transaction_details` VALUES ('38', '08-11-2014', '-7525470.7206', 'Dr', 'Debit2');
INSERT INTO `transaction_details` VALUES ('39', '12-11-2014', '700248.1993999997', 'Dr', 'Farmer4');
INSERT INTO `transaction_details` VALUES ('40', '12-11-2014', '634890.9193999997', 'Cr', 'Buyer7');
INSERT INTO `transaction_details` VALUES ('41', '25-11-2014', '423491.915', 'Dr', 'Farmer5');
INSERT INTO `transaction_details` VALUES ('42', '25-11-2014', '416163.47059999994', 'Cr', 'Buyer8');
INSERT INTO `transaction_details` VALUES ('43', '25-11-2014', '418195.22419999994', 'Cr', 'Buyer9');
INSERT INTO `transaction_details` VALUES ('44', '15-11-2014', '2469556444.2794', 'Cr', 'Credit3');
INSERT INTO `transaction_details` VALUES ('45', '18-11-2014', '558664.2794', 'Cr', 'Credit4');

-- ----------------------------
-- Table structure for `transactionpatti`
-- ----------------------------
DROP TABLE IF EXISTS `transactionpatti`;
CREATE TABLE `transactionpatti` (
  `id` bigint(200) NOT NULL,
  `kgpatti` varchar(100) NOT NULL,
  `transpatti` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transactionpatti
-- ----------------------------
INSERT INTO `transactionpatti` VALUES ('91', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('92', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('93', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('94', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('95', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('96', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('97', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('98', 'active', 'deactive');
INSERT INTO `transactionpatti` VALUES ('101', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('105', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('106', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('107', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('108', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('109', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('110', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('111', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('112', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('113', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('114', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('115', 'active', 'active');
INSERT INTO `transactionpatti` VALUES ('138', 'active', 'deactive');
INSERT INTO `transactionpatti` VALUES ('139', 'active', 'deactive');
INSERT INTO `transactionpatti` VALUES ('140', 'active', 'deactive');
INSERT INTO `transactionpatti` VALUES ('141', 'active', 'deactive');
INSERT INTO `transactionpatti` VALUES ('188', 'active', 'deactive');
INSERT INTO `transactionpatti` VALUES ('189', 'active', 'deactive');
