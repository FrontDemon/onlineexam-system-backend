/*
Navicat MySQL Data Transfer

Source Server         : MyConnection
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : onlineexam

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-05-12 16:09:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `ano` char(6) NOT NULL COMMENT '管理员号',
  `adm_psw` varchar(255) NOT NULL DEFAULT '123456' COMMENT '登录密码，默认为123456',
  `adm_name` varchar(255) NOT NULL COMMENT '管理员姓名',
  `adm_sex` varchar(255) NOT NULL DEFAULT '男' COMMENT '管理员性别',
  `adm_email` varchar(255) NOT NULL COMMENT '管理员邮箱',
  `adm_phone` char(11) DEFAULT NULL COMMENT '管理员手机号码',
  `adm_last_login_time` datetime DEFAULT NULL COMMENT '管理员最近登录时间',
  PRIMARY KEY (`ano`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('100000', '123456', '小王', '男', '123456@qq.com', '13358452698', '2019-04-22 01:57:55');
INSERT INTO `admin` VALUES ('100001', '123456', '小李', '男', '123456@qq.com', '13358452695', null);
INSERT INTO `admin` VALUES ('123456', '123456', '小张', '男', '123456@qq.com', '13380544897', '2019-05-07 16:32:26');

-- ----------------------------
-- Table structure for `bank_fill_que`
-- ----------------------------
DROP TABLE IF EXISTS `bank_fill_que`;
CREATE TABLE `bank_fill_que` (
  `fill_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '填空题id',
  `fill_content` varchar(255) DEFAULT NULL COMMENT '填空题内容',
  `fill_answer` varchar(255) DEFAULT NULL COMMENT '填空题答案',
  `compose_flag` varchar(255) DEFAULT '0' COMMENT '是否被组成',
  `answer_explain` varchar(255) DEFAULT NULL COMMENT '题目解析',
  `lang_id` int(11) DEFAULT NULL COMMENT '该题所属编程语言',
  PRIMARY KEY (`fill_id`),
  KEY `fill_lang_id` (`lang_id`),
  CONSTRAINT `fill_lang_id` FOREIGN KEY (`lang_id`) REFERENCES `programing_language` (`lang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_fill_que
-- ----------------------------
INSERT INTO `bank_fill_que` VALUES ('1', 'Java的三大平台分别是Java SE、______和Java ME。', 'Java EE', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('2', 'Java程序开发前需下载安装Java应用程序开发包，其英文缩写是__________。', 'JDK', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('3', '在Windows下打开命令行界面的方法是搜索输入命令_________________。', 'CMD', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('4', 'JDK安装完成后，javac和java这些编译和运行工具存放在JDK安装目录的_____________子目录中。', 'bin', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('5', 'JDK安装完成后，在操作系统上还需要配置_______________环境变量，\n该环境变量用于存储Java的编译和运行工具所在的路径。', 'Path', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('6', 'Java中的________________用于为程序增加一些说明性文字，增加程序的可读性，\n本身不会被执行。', '注释', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('7', 'Java中单行注释是在注释前书写______________符号。', '//', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('8', 'Java中有三种注释，分别是单行注释、多行注释和_________________。', '文档注释', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('9', 'Java程序从________________方法开始执行。', 'main()', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('10', 'Java是一种___________________编程语言，它要求所有变量都具有一个类型。', '强类型', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('11', 'Java数据类型分为两大类，分别是基本数据类型和____________________。', '引用数据类型', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('12', 'Java中的int类型占用______________个字节。', '4', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('13', 'Java中的整型数的字面值在表示八进制时，需添加前缀________________。', '0', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('14', 'Java中都整型数的字面值在表示十六进制时，需添加前缀_______________。', '0x', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('15', 'Java中在整数后面添加后缀字母______________表示long型整数。', 'L', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('16', 'Java的基本数据类型中，float和____________________类型用于保存浮点数。', 'double', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('17', 'float类型的字面值在书写时浮点数时，还需要在最后添加后缀字母_____________。', 'f', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('18', 'Java的基本类型中，_______________类型表示字符型。', 'char', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('19', 'Java中的赋值运算符是______________。', '=', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('20', 'Java的boolean类型只有_______________和false两个取值。', 'true', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('21', '依据结构化程序设计理论，所有程序都可以用三种基本控制结构构成，', '循环', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('22', '它们分别是顺序、选择和________________。', 'if-else', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('23', '而条件为false时执行另一些语句。。', '分号', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('24', '（用汉字回答）', 'switch', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('25', '从多路分支中选择其中一路执行。。', 'do-while', '0', null, '1');
INSERT INTO `bank_fill_que` VALUES ('26', '______________循环会在执行循环体之后判断测试条件，因此至少会执行一遍循环体。', 'continue', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('27', '会跳过循环体中剩下的语句，继续进行下一次循环。', 'void', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('28', 'Java的数组属于___________________数据类型。', '引用', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('29', 'Java中取得数组的长度，可以使用用数组变量的_______________属性。', 'length', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('30', 'Java中包含10个元素的数组，其下标的范围是___________________。', '从0到9', '1', null, '1');
INSERT INTO `bank_fill_que` VALUES ('31', '测试填空题1', '测试填空题答案1', '0', '测试填空题解析1', '1');
INSERT INTO `bank_fill_que` VALUES ('32', '测试填空题2', '测试填空题答案2', '0', '测试填空题解析2', '2');
INSERT INTO `bank_fill_que` VALUES ('34', '测试手动录填空题哈哈哈', '测试手动录填空题啊啊啊', '0', '测试手动录填空题呀呀呀', '4');

-- ----------------------------
-- Table structure for `bank_judge_que`
-- ----------------------------
DROP TABLE IF EXISTS `bank_judge_que`;
CREATE TABLE `bank_judge_que` (
  `judge_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '判断题id',
  `judge_content` varchar(255) DEFAULT NULL COMMENT '判断题内容',
  `judge_answer` varchar(255) DEFAULT NULL COMMENT '判断题答案',
  `compose_flag` varchar(255) DEFAULT '0' COMMENT '是否被组成试卷',
  `answer_explain` varchar(255) DEFAULT NULL COMMENT '题目解析',
  `lang_id` int(11) DEFAULT NULL COMMENT '该题所属编程语言',
  PRIMARY KEY (`judge_id`),
  KEY `judge_lang_id` (`lang_id`),
  CONSTRAINT `judge_lang_id` FOREIGN KEY (`lang_id`) REFERENCES `programing_language` (`lang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_judge_que
-- ----------------------------
INSERT INTO `bank_judge_que` VALUES ('1', 'Java中，h22是合法的变量名，而22h是不合法的变量名。（  ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('2', 'Java中birthday和birthDay是两个不同的变量。（     ）。', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('3', 'Java中，多行注释/* …*/中可以嵌套//的单行注释，\n但不能嵌套/*… */的多行注释。（      ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('4', 'Java表达式 5>7 || 3>=2的运算结果是true。（      ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('5', 'Java语句int n=9/2;执行后，n的值是5。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('6', 'Java表达式 7>=7 ? 777 : 888的运算结果是888。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('7', '已知int型的Java变量int x=3;，那么执行完int y=x++;语句后，y的值是4。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('8', 'Java表达式0xC8-2的运算结果是198。（      ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('9', '已知int型的Java变量int x=5;，那么执行完x%=3;语句后，x的值是2。（      ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('10', 'Java源代码中出现的整型数5其默认类型是int。（      ）', 'T', '0', null, '1');
INSERT INTO `bank_judge_que` VALUES ('11', 'Java源代码中出现的浮点数值4.5其默认类型是float。（      ）', 'F', '0', null, '1');
INSERT INTO `bank_judge_que` VALUES ('12', 'Java中，int类型的数据可以直接赋值给double类型的变量，实现自动类型转换。（      ）', 'T', '0', null, '1');
INSERT INTO `bank_judge_que` VALUES ('13', 'Java中的boolean类型可以和int类型之间相互转换。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('14', 'Java的switch语句中可以没有default子句，该子句是可选的。（      ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('15', 'Java的for循环语句中，for关键字后面的小括号()内三部分内容之间用逗号(,)分隔。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('16', '在Java方法的内部不能调用自身方法。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('17', 'Java的数组声明并初始化语句int[ ] arrayX = (1, 7, 8, 5, 9); 是正确的。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('18', '声明Java数组boolean[ ] boolArray = new boolean[3]，那么boolArray[0]的值是false。（      ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('19', '声明并初始化二维数组int[ ][ ] dim2Array = { {1, 2}, {3, 4, 5}}，则dim2Array[1][2]的值是2。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('20', 'Java在循环中出现的break语句的作用是结束本次循环，执行下一次循环。（      ）', 'F', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('21', 'Java中，h22是合法的变量名，而22h是不合法的变量名。（  ）', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('22', 'Java中birthday和birthDay是两个不同的变量。（     ）。', 'T', '1', null, '1');
INSERT INTO `bank_judge_que` VALUES ('23', '测试判断题1', 'T', '0', '测试判断题解析1', '1');
INSERT INTO `bank_judge_que` VALUES ('24', '测试判断题2', 'F', '0', '测试判断题解析2', '3');

-- ----------------------------
-- Table structure for `bank_multiple_choice_que`
-- ----------------------------
DROP TABLE IF EXISTS `bank_multiple_choice_que`;
CREATE TABLE `bank_multiple_choice_que` (
  `multiple_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '多选题id',
  `multiple_content` varchar(255) DEFAULT NULL COMMENT '多选题内容',
  `choice_A` varchar(255) DEFAULT NULL COMMENT '选项A',
  `choice_B` varchar(255) DEFAULT NULL COMMENT '选项B',
  `choice_C` varchar(255) DEFAULT NULL COMMENT '选项C',
  `choice_D` varchar(255) DEFAULT NULL COMMENT '选项D',
  `choice_E` varchar(255) DEFAULT NULL COMMENT '选项E',
  `choice_F` varchar(255) DEFAULT NULL COMMENT '选项F',
  `choice_G` varchar(255) DEFAULT NULL COMMENT '选项G',
  `multiple_answer` varchar(255) DEFAULT NULL COMMENT '多选题答案',
  `compose_flag` varchar(255) DEFAULT '0' COMMENT '是否被组成试卷',
  `answer_explain` varchar(255) DEFAULT NULL COMMENT '题目解析',
  `lang_id` int(11) DEFAULT NULL COMMENT '该题所属编程语言',
  PRIMARY KEY (`multiple_id`),
  KEY `multiple_lang_id` (`lang_id`),
  CONSTRAINT `multiple_lang_id` FOREIGN KEY (`lang_id`) REFERENCES `programing_language` (`lang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_multiple_choice_que
-- ----------------------------
INSERT INTO `bank_multiple_choice_que` VALUES ('1', '下面说法错误的是（）？[[[31b23b75-6de2-4aef-9c1b-1873ecf45b79]]]', 'A:能被java.exe成功运行的java class文件必须有mian（）方法。', 'B:J2SDK就是Java API。', 'C:Appletviewer.exe可利用jar选项运行.jar文件。', 'D:能被Appletviewer成功运行的java class文件必须有main方法。', 'E:Collection属于MVC模式中的对象。', '', null, 'BCDE', '1', 'A：main是主函数，是程序执行的起始点。没有main函数会报错不能编译执行。B：J2SDK是java开发环境包，包括了JDK（开发工具包）和JRE（运行环境包）。而API是Application Programming Interface，是应用程序编程接口，两者不是一个东西。C：这个楼楼真的没搞懂，欢迎懂得大佬来踢馆。D：Applet只要继承Applet类就行了,不需要main()方法。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('2', '下面说法正确的是（）？', 'A:环境变量可在编译source code（源编译）时指定。', 'B:在编译程序时，所能指定的环境变量不包括classpath。', 'C:javac一次可同时编译数个Java源文件。', 'D:javac.exe能指定编译结果要置于哪个directory（目录）。', 'E:与HttpSessionListener接口有关的方法是sessionInitialized()。', null, null, 'BCD', '1', 'A：环境变量不能再源编译的时候指定的，它的配置一般都是在系统环境变量中。B：错误，可以设置classpath。C：这个不知道怎么讲，我只知道可以。 D：可以，在CDM中就能进行相应的操作。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('3', '下面说法错误的是（）？', 'A:数组是一种对象。', 'B:数组属于一种原生类。', 'C:int number=[]={31,23,33,43,35,63}。', 'D:数组的大小可以任意改变。', 'E:可以在声明数组的同时进行初始化，也可以在声明以后进行初始化。', 'F:可以通过下标来引用数组。', null, 'BCD', '1', 'A：数组是一个对象，其内存分配在堆内。基本类型内存分配在栈内。 B：所谓的原生类，也称基本数据类型或内置对象。显然数组属于引用数据类型。 C：写法错误。D：数组的定义是：相同类型，固定长度的一组数据，一旦被初始化，长度不可更改。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('4', '不能用来修饰interface的有（）？', 'A:private', 'B:public', 'C:protected', 'D:static', null, null, null, 'ACD', '1', 'A：接口是为了让别人实现的，你私有化了，就和自身作用其冲突，所以错误。B：正确。C：接口为的是实现，所以你修饰protected了，别的类就无法实现了，错误。 D：interface是一个接口，也就是说它的方法全部都为空，只有方法名，没有方法体，如果定义成static，那么就能直接调用类来调用抽象方法，没有意义。故而规定interface不能用static修饰。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('5', '下列正确的有（）？', 'A:call by value（值调用）不会改变实际参数的数值。', 'B:call by reference（引用调用）能改变实际参数的参考地址。', 'C:call by reference（引用调用）不能改变实际参数的参考地址。', 'D:call by reference（引用调用）能改变实际参数的内容。', 'E:XML 是一种元语言, 可以用它来描述其他语言。', 'F:类图用来表示系统中类和类与类之间的关系，它是对系统动态结构的描述。', 'G:context为JSP的隐含对象。', 'ACD', '1', 'A：因为在java中，值调用的形参是实参的一个拷贝体。B：正确。C：引用调用，传递的是对象的地址，也就是说你改变的只能是形参对象。 D：引用调用，不能改变实参的参考地址，却能改变实参的属性（内容）。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('6', '下列说法错误的有（）？', 'A:在类方法中可用this来调用本类的类方法。', 'B:在类方法中调用本类的类方法时可直接调用。', 'C:在类方法中只能调用本类中的类方法。', 'D:在类方法中绝对不能调用实例方法。', 'E:在类方法中可使用本类声明的私有变量。', null, null, 'ACD', '1', 'A：所谓的类方法就是静态方法，super和this都指向的是父类和本类的对象，而在类方法中调用的时候，这些指代的对象有可能都还没有创建。静态方法是用类方法名.方法名称调用。 B：正确。C：错误，类方法可以调用其他类的类方法。D：错误，实例化对象，然后调用方法。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('7', '下列说法错误的有（）？', 'A:Java面向对象语言容许单独的过程与函数存在。', 'B:Java面向对象语言容许单独的方法存在。', 'C:Java语言中的方法属于类中的成员。', 'D:Java语言中的方法必定隶属于某一类（对象），调用方法与过程或函数相同。', null, null, null, 'ABC', '1', 'A：错误，java是面向对象编程语言。B：错误，java是面向对象编程的语言。C：错误，类方法属于类中的成员，实例方法属于对象中的成员。D：正确。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('8', '下列属于J2EE的体系是()', 'A:JSP', 'B:JAVA', 'C:Servlet', 'D:WebService', null, null, null, 'AC', '1', 'J2EE的核心技术包括：JDBC(Java Database Connectivity) JNDI(Java Name and Directory Interface)', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('9', '下列函数是public void method(){...}的重载函数有（）？', 'A:public void method(int m){...}', 'B:public int method(){...}', 'C:public void method2(){...}', 'D:public int method(int m,float f){...}', null, null, null, 'AD', '1', '重载函数要求函数必须同名，必须参数数量或者参数类型不同，与修饰符和返回值无关。', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('10', '执行下列代码后，哪个结论是错误的String[] s =new String[10];（）？', 'A:s[10]为\"\";', 'B:s[9]为null;', 'C:s[0]为未定义;', 'D:s.length()=10;', null, null, null, 'ACD', '1', null, '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('17', '测试导入多选题1[[[62bb69e2-ca56-4ee6-aaf3-88fffaacbdb5]]]', 'A:测试A', 'B:测试B', 'C:测试C', 'D:测试D', 'E:测试E', 'F:测试F', null, 'ABCDEF', '0', '测试多选题答案解析1', '1');
INSERT INTO `bank_multiple_choice_que` VALUES ('18', '测试导入多选题2', 'A:测试A', 'B:测试B', 'C:测试C', 'D:测试D', 'E:测试E', null, 'G:测试G', 'BCDG', '0', '测试多选题答案解析2', '2');
INSERT INTO `bank_multiple_choice_que` VALUES ('19', '测试手动添加多选题[[[056ae06e-c54f-4839-acdf-7d56cccbe769]]]', 'A:答案A', 'B:答案B', 'C:答案C', 'D:答案D', 'E:答案E', 'F:答案F', '', 'ACDEF', '0', '测试手动添加多选题答案解析', '2');

-- ----------------------------
-- Table structure for `bank_single_choice_que`
-- ----------------------------
DROP TABLE IF EXISTS `bank_single_choice_que`;
CREATE TABLE `bank_single_choice_que` (
  `single_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单选题id',
  `single_content` varchar(255) DEFAULT NULL COMMENT '单选题内容',
  `choice_A` varchar(255) DEFAULT NULL COMMENT '选项A',
  `choice_B` varchar(255) DEFAULT NULL COMMENT '选项B',
  `choice_C` varchar(255) DEFAULT NULL COMMENT '选项C',
  `choice_D` varchar(255) DEFAULT NULL COMMENT '选项D',
  `choice_E` varchar(255) DEFAULT NULL COMMENT '选项E',
  `choice_F` varchar(255) DEFAULT NULL COMMENT '选项F',
  `choice_G` varchar(255) DEFAULT NULL COMMENT '选项G',
  `single_answer` varchar(255) DEFAULT NULL COMMENT '单选题答案',
  `compose_flag` varchar(255) DEFAULT '0' COMMENT '是否被组成试卷',
  `answer_explain` varchar(255) DEFAULT NULL COMMENT '题目解析',
  `lang_id` int(11) DEFAULT NULL COMMENT '该题所属编程语言',
  PRIMARY KEY (`single_id`),
  KEY `single_lang_id` (`lang_id`),
  CONSTRAINT `single_lang_id` FOREIGN KEY (`lang_id`) REFERENCES `programing_language` (`lang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank_single_choice_que
-- ----------------------------
INSERT INTO `bank_single_choice_que` VALUES ('1', '如果JDK的安装路径是\"d:\\jdk\"，若想在命令行窗口中任何路径下，都可以直接使用javac和java命令，\n需要将环境变量Path设置为以下哪个选项：（     ）', 'A. d:\\jdk', 'B. d:\\jdk\\bin', 'C. d:\\jre\\bin', 'D. d:\\jre', null, null, null, 'B', '1', '这是常识喔，请自行百度哈', '1');
INSERT INTO `bank_single_choice_que` VALUES ('2', '下面以哪种类型的文件可以直接在Java虚拟机中运行：（     ）。', 'A．.java', 'B．.jre', 'C．.exe', 'D．.class', null, null, null, 'D', '1', '哦你陀佛', '1');
INSERT INTO `bank_single_choice_que` VALUES ('3', '下面哪个是合法的Java标识符：（      ）', 'A．void', 'B．12class', 'C．_blank', 'D．95', null, null, null, 'C', '1', '善哉善哉', '1');
INSERT INTO `bank_single_choice_que` VALUES ('4', 'Java中类的定义必须包含在一下哪种符号之间？（      ）', 'A. 方括号[ ]', 'B. 花括号{ }', 'C. 双引号\" \"', 'D. 圆括号( )', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('5', 'Java的运算符中用于执行除法运算的是哪个？（      ）', 'A. /', 'B. \\', 'C. %', 'D. *', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('6', '以下哪个关键字不是用于循环语句的？（      ）', 'A. for', 'B. do...while', 'C. while', 'D. switch', null, null, null, 'D', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('7', '以下哪种写法可以实现访问数组array的最开始的第一个元素？（      ）', 'A. array[0]', 'B. array(0)', 'C. array[1]', 'D. array(1)', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('8', '如下哪个选项可以正确地创建一个长度为3的二维数组？（      ）', 'A. new int[2][3]', 'B. new int[3][ ]', 'C. new int[ ][3]', 'D. 以上都不对', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('9', '当编译和运行下列代码会发生什么？（      ）[[[c229fd38-9eb4-4337-818d-3772c4071060]]]', 'A. 编译错误', 'B. 运行错误', 'C. 输出888', 'D. 输出125', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('10', '下列选项中，哪个不属于Java语言的基本数据类型？（      ）', 'A. 整型', 'B. 数组', 'C. 字符型', 'D. 浮点型', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('11', '有关方法重载，以下说法正确的是：（      ）', 'A. 重载的方法，其方法名可以不一致', 'B. 重载的方法参数的个数或类型必须不一致', 'C. 重载的方法，其返回值类型必须不同', 'D. 重载的方法，其参数个数必须一致', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('12', '下列关于Java语言简单数据类型的说法中，正确的一项是：（      ）', 'A. 以0开头的整数数值代表8进制整型数', 'B. 以0x或0X开头的整数代表8进制整型常量', 'C. char型的值可以包含一个或多个字符', 'D. double类型的数据占计算机存储的32位', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('13', '下列语句中编译错误的一个是：（      ）', 'A. float f = 1.1f;', 'B. byte b = 128;', 'C. double d = 1.1/0.0;', 'D. char c = (char)1.1f;', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('14', '表达式(12==0) && (1/0 < 1)的值为：（      ）', 'A. true', 'B. false', 'C. 0', 'D. 运行时抛出异常', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('15', '表达式10^2的值为：（      ）', 'A. 100', 'B. 12', 'C. 8', 'D. 10', null, null, null, 'C', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('16', '假设i=10, j=20, k=30，则表达式 !(i<j+k) || !(i+10<=j) 的值为：（      ）', 'A. true', 'B. false', 'C. 表达式错误', 'D. 以上都不对', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('17', '以下代码的运行结果是：（      ）[[[b6ce7968-6d8b-4ba3-aad7-c2341d4c65ee]]]', 'A. 1', 'B. 2', 'C. 3', 'D. 以上都不对', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('18', '分析以下代码，正确的选项是：（      ）[[[5be9f02f-1d2a-4e1d-b421-5772818d3679]]]', 'A. 打印b=3', 'B. 打印b=7', 'C. 编译错误', 'D. 以上都不对', null, null, null, 'C', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('19', '分析以下代码，正确的选项是：（      ）[[[354dc7c3-11d3-4821-978f-bc15b323f2c0]]]', 'A. 打印3', 'B. 打印6', 'C. 编译错误', 'D. 以上都不对', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('20', '分析以下代码，正确的选项是：（      ）[[[1f9b26b1-dec3-4041-9250-6568041be8d6]]]', 'A. 打印9 8 7', 'B. 打印9 8 7 6', 'C. 打印9 8 7 6 5', 'D. 以上都不对', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('21', '如果JDK的安装路径是\"d:\\jdk\"，若想在命令行窗口中任何路径下，都可以直接使用javac和java命令，', 'A. d:\\jdk', 'B. d:\\jdk\\bin', 'C. d:\\jre\\bin', 'D. d:\\jre', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('22', '下面以哪种类型的文件可以直接在Java虚拟机中运行：（     ）。', 'A．.java', 'B．.jre', 'C．.exe', 'D．.class', null, null, null, 'D', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('23', '下面哪个是合法的Java标识符：（      ）', 'A．void', 'B．12class', 'C．_blank', 'D．95', null, null, null, 'C', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('24', 'Java中类的定义必须包含在一下哪种符号之间？（      ）', 'A. 方括号[ ]', 'B. 花括号{ }', 'C. 双引号\" \"', 'D. 圆括号( )', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('25', 'Java的运算符中用于执行除法运算的是哪个？（      ）', 'A. /', 'B. \\', 'C. %', 'D. *', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('26', '以下哪个关键字不是用于循环语句的？（      ）', 'A. for', 'B. do...while', 'C. while', 'D. switch', null, null, null, 'D', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('27', '以下哪种写法可以实现访问数组array的最开始的第一个元素？（      ）', 'A. array[0]', 'B. array(0)', 'C. array[1]', 'D. array(1)', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('28', '如下哪个选项可以正确地创建一个长度为3的二维数组？（      ）', 'A. new int[2][3]', 'B. new int[3][ ]', 'C. new int[ ][3]', 'D. 以上都不对', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('29', '当编译和运行下列代码会发生什么？（      ）', 'A. 编译错误', 'B. 运行错误', 'C. 输出888', 'D. 输出125', null, null, null, 'A', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('30', '下列选项中，哪个不属于Java语言的基本数据类型？（      ）', 'A. 整型', 'B. 数组', 'C. 字符型', 'D. 浮点型', null, null, null, 'B', '1', null, '1');
INSERT INTO `bank_single_choice_que` VALUES ('31', '测试添加单选题[[[f686007e-3caf-45f1-912f-257619296645]]]', 'A:测试', 'B:测试', 'C:测试', 'D:测试', '', '', '', 'B', '0', '测试添加单选题', '2');
INSERT INTO `bank_single_choice_que` VALUES ('32', '测试导入单选题1', 'A:测试A', 'B:测试B', 'C:测试C', 'D:测试D', null, null, null, 'A', '0', '测试单选题答案解析1', '1');
INSERT INTO `bank_single_choice_que` VALUES ('33', '测试导入单选题2', 'A:测试A', 'B:测试B', 'C:测试C', 'D:测试D', null, null, null, 'B', '0', '测试单选题答案解析2', '2');
INSERT INTO `bank_single_choice_que` VALUES ('36', '测试导入单选题3', 'A:测试A', 'B:测试B', 'C:测试C', 'D:测试D', null, null, null, 'A', '0', '测试单选题答案解析1', '1');
INSERT INTO `bank_single_choice_que` VALUES ('37', '测试导入单选题4', 'A:测试A', 'B:测试B', 'C:测试C', 'D:测试D', null, null, null, 'B', '0', '测试单选题答案解析2', '2');

-- ----------------------------
-- Table structure for `paper`
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `paper_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '试卷id',
  `paper_name` varchar(255) DEFAULT NULL COMMENT '试卷名称',
  `paper_create_time` datetime DEFAULT NULL COMMENT '试卷创建时间',
  `paper_duration` int(11) DEFAULT NULL COMMENT '考试时长，单位秒',
  `paper_difficulty` int(11) DEFAULT NULL COMMENT '试卷难度',
  `paper_attention` varchar(255) DEFAULT NULL COMMENT '考试注意事项',
  `paper_type` int(11) DEFAULT NULL COMMENT '组卷机制，1为随机，2为固定',
  `single_score` int(11) DEFAULT NULL COMMENT '单选题分配分数',
  `multiple_score` int(11) DEFAULT NULL COMMENT '多选题分配分数',
  `judge_score` int(11) DEFAULT NULL COMMENT '判断题分配分数',
  `fill_score` int(11) DEFAULT NULL COMMENT '填空题分配分数',
  `lang_id` int(11) DEFAULT NULL COMMENT '试卷所属编程语言',
  `participate_num` int(11) DEFAULT '0' COMMENT '已参加人数',
  PRIMARY KEY (`paper_id`),
  KEY `paper_lang_id` (`lang_id`),
  CONSTRAINT `paper_lang_id` FOREIGN KEY (`lang_id`) REFERENCES `programing_language` (`lang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper
-- ----------------------------
INSERT INTO `paper` VALUES ('1', 'Java语言程序设计（一）', '2019-03-15 14:35:58', '6000', '2', '考试时间结束系统将自动提交试卷，考试过程强制退出浏览器成绩记0分', '2', '3', '5', '1', '2', '1', '12');
INSERT INTO `paper` VALUES ('2', 'Java语言程序设计（二）', '2019-03-15 14:41:35', '3000', '3', '请勿作弊，考试过程强制退出浏览器成绩记0分', '1', '4', '6', '2', '2', '1', '6');
INSERT INTO `paper` VALUES ('3', 'Java进阶训练（一）', '2019-03-15 19:36:30', '9000', '4', '请遵守考试规则，考试过程强制退出浏览器成绩记0分', '2', '4', '6', '3', '5', '1', '1');
INSERT INTO `paper` VALUES ('4', 'Java进阶训练（二）', '2019-03-16 00:03:46', '5400', '5', '请务必认真答题，考试过程强制退出浏览器成绩记0分', '1', '4', '6', '2', '4', '1', '0');
INSERT INTO `paper` VALUES ('5', 'Java应用技术', '2019-03-16 00:06:00', '3600', '3', '请按照要求答题，考试过程强制退出浏览器成绩记0分', '2', '4', '6', '1', '4', '1', '1');
INSERT INTO `paper` VALUES ('6', 'C++语言程序设计', '2019-03-25 22:38:07', '5400', '3', '请仔细阅卷，考试过程强制退出浏览器成绩记0分', '1', '3', '5', '2', '3', '2', '0');
INSERT INTO `paper` VALUES ('7', 'Android程序设计', '2019-03-25 22:40:58', '4200', '1', '请仔细作答，考试过程强制退出浏览器成绩记0分', '2', '4', '6', '2', '2', '3', '0');
INSERT INTO `paper` VALUES ('8', '测试随机组卷', '2019-04-13 19:40:50', '7200', '4', '测试随机组卷', '1', '6', '4', '4', '5', '1', '0');
INSERT INTO `paper` VALUES ('9', '111', '2019-04-13 21:19:44', '1200', '4', '111', '1', '1', '1', '1', '1', '1', '0');
INSERT INTO `paper` VALUES ('10', '测试固定组卷', '2019-04-14 02:25:46', '5400', '3', 'this is测试固定组卷喔', '2', '4', '4', '2', '5', '1', '0');
INSERT INTO `paper` VALUES ('11', '222', '2019-04-15 00:46:17', '1200', '2', '222', '2', '1', '1', '1', '1', '1', '9');

-- ----------------------------
-- Table structure for `paper_que`
-- ----------------------------
DROP TABLE IF EXISTS `paper_que`;
CREATE TABLE `paper_que` (
  `que_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '问题id',
  `que_type` int(11) DEFAULT NULL COMMENT '题类型',
  `single_id` int(11) DEFAULT NULL COMMENT '单选题id',
  `multiple_id` int(11) DEFAULT NULL COMMENT '多选题id',
  `judge_id` int(11) DEFAULT NULL COMMENT '判断题id',
  `fill_id` int(11) DEFAULT NULL COMMENT '填空题id',
  `paper_id` int(11) DEFAULT NULL COMMENT '试卷id',
  PRIMARY KEY (`que_id`),
  KEY `que_single_id` (`single_id`),
  KEY `que_multiple_id` (`multiple_id`),
  KEY `que_judge_id` (`judge_id`),
  KEY `que_fill_id` (`fill_id`),
  KEY `que_paper_id` (`paper_id`),
  CONSTRAINT `que_fill_id` FOREIGN KEY (`fill_id`) REFERENCES `bank_fill_que` (`fill_id`),
  CONSTRAINT `que_judge_id` FOREIGN KEY (`judge_id`) REFERENCES `bank_judge_que` (`judge_id`),
  CONSTRAINT `que_multiple_id` FOREIGN KEY (`multiple_id`) REFERENCES `bank_multiple_choice_que` (`multiple_id`),
  CONSTRAINT `que_paper_id` FOREIGN KEY (`paper_id`) REFERENCES `paper` (`paper_id`),
  CONSTRAINT `que_single_id` FOREIGN KEY (`single_id`) REFERENCES `bank_single_choice_que` (`single_id`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper_que
-- ----------------------------
INSERT INTO `paper_que` VALUES ('1', '1', '1', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('2', '1', '2', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('3', '1', '3', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('4', '1', '4', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('5', '1', '5', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('6', '1', '6', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('7', '1', '7', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('8', '1', '8', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('9', '1', '9', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('10', '1', '10', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('11', '1', '11', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('12', '1', '12', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('13', '1', '13', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('14', '1', '14', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('15', '1', '15', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('16', '1', '16', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('17', '1', '17', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('18', '1', '18', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('19', '1', '19', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('20', '1', '20', null, null, null, '1');
INSERT INTO `paper_que` VALUES ('21', '2', null, '1', null, null, '1');
INSERT INTO `paper_que` VALUES ('22', '2', null, '2', null, null, '1');
INSERT INTO `paper_que` VALUES ('23', '2', null, '3', null, null, '1');
INSERT INTO `paper_que` VALUES ('24', '2', null, '4', null, null, '1');
INSERT INTO `paper_que` VALUES ('25', '2', null, '5', null, null, '1');
INSERT INTO `paper_que` VALUES ('26', '3', null, null, '1', null, '1');
INSERT INTO `paper_que` VALUES ('27', '3', null, null, '2', null, '1');
INSERT INTO `paper_que` VALUES ('28', '3', null, null, '3', null, '1');
INSERT INTO `paper_que` VALUES ('29', '3', null, null, '4', null, '1');
INSERT INTO `paper_que` VALUES ('30', '3', null, null, '5', null, '1');
INSERT INTO `paper_que` VALUES ('31', '4', null, null, null, '1', '1');
INSERT INTO `paper_que` VALUES ('32', '4', null, null, null, '2', '1');
INSERT INTO `paper_que` VALUES ('33', '4', null, null, null, '3', '1');
INSERT INTO `paper_que` VALUES ('34', '4', null, null, null, '4', '1');
INSERT INTO `paper_que` VALUES ('35', '4', null, null, null, '5', '1');
INSERT INTO `paper_que` VALUES ('36', '1', '21', null, null, null, '2');
INSERT INTO `paper_que` VALUES ('37', '1', '22', null, null, null, '2');
INSERT INTO `paper_que` VALUES ('38', '1', '23', null, null, null, '2');
INSERT INTO `paper_que` VALUES ('39', '1', '24', null, null, null, '2');
INSERT INTO `paper_que` VALUES ('40', '1', '25', null, null, null, '2');
INSERT INTO `paper_que` VALUES ('41', '1', '26', null, null, null, '2');
INSERT INTO `paper_que` VALUES ('42', '2', null, '6', null, null, '2');
INSERT INTO `paper_que` VALUES ('43', '2', null, '7', null, null, '2');
INSERT INTO `paper_que` VALUES ('44', '2', null, '8', null, null, '2');
INSERT INTO `paper_que` VALUES ('45', '3', null, null, '6', null, '2');
INSERT INTO `paper_que` VALUES ('46', '3', null, null, '7', null, '2');
INSERT INTO `paper_que` VALUES ('47', '4', null, null, null, '6', '2');
INSERT INTO `paper_que` VALUES ('48', '4', null, null, null, '7', '2');
INSERT INTO `paper_que` VALUES ('49', '1', '9', null, null, null, '3');
INSERT INTO `paper_que` VALUES ('50', '1', '17', null, null, null, '3');
INSERT INTO `paper_que` VALUES ('51', '1', '18', null, null, null, '3');
INSERT INTO `paper_que` VALUES ('52', '1', '19', null, null, null, '3');
INSERT INTO `paper_que` VALUES ('53', '2', null, '8', null, null, '3');
INSERT INTO `paper_que` VALUES ('54', '2', null, '9', null, null, '3');
INSERT INTO `paper_que` VALUES ('55', '3', null, null, '13', null, '3');
INSERT INTO `paper_que` VALUES ('56', '3', null, null, '14', null, '3');
INSERT INTO `paper_que` VALUES ('57', '4', null, null, null, '17', '3');
INSERT INTO `paper_que` VALUES ('58', '4', null, null, null, '18', '3');
INSERT INTO `paper_que` VALUES ('59', '1', '20', null, null, null, '4');
INSERT INTO `paper_que` VALUES ('60', '1', '21', null, null, null, '4');
INSERT INTO `paper_que` VALUES ('61', '2', null, '9', null, null, '4');
INSERT INTO `paper_que` VALUES ('62', '2', null, '10', null, null, '4');
INSERT INTO `paper_que` VALUES ('63', '3', null, null, '15', null, '4');
INSERT INTO `paper_que` VALUES ('64', '4', null, null, null, '19', '4');
INSERT INTO `paper_que` VALUES ('65', '1', '22', null, null, null, '5');
INSERT INTO `paper_que` VALUES ('66', '2', null, '5', null, null, '5');
INSERT INTO `paper_que` VALUES ('67', '3', null, null, '16', null, '5');
INSERT INTO `paper_que` VALUES ('68', '4', null, null, null, '20', '5');
INSERT INTO `paper_que` VALUES ('81', '1', '30', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('82', '1', '18', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('83', '1', '17', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('84', '1', '2', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('85', '1', '11', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('86', '1', '27', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('87', '1', '26', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('88', '1', '19', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('89', '1', '25', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('90', '1', '14', null, null, null, '8');
INSERT INTO `paper_que` VALUES ('91', '2', null, '10', null, null, '8');
INSERT INTO `paper_que` VALUES ('92', '2', null, '1', null, null, '8');
INSERT INTO `paper_que` VALUES ('93', '2', null, '7', null, null, '8');
INSERT INTO `paper_que` VALUES ('94', '2', null, '6', null, null, '8');
INSERT INTO `paper_que` VALUES ('95', '2', null, '3', null, null, '8');
INSERT INTO `paper_que` VALUES ('96', '3', null, null, '1', null, '8');
INSERT INTO `paper_que` VALUES ('97', '3', null, null, '7', null, '8');
INSERT INTO `paper_que` VALUES ('98', '3', null, null, '22', null, '8');
INSERT INTO `paper_que` VALUES ('99', '3', null, null, '9', null, '8');
INSERT INTO `paper_que` VALUES ('100', '3', null, null, '13', null, '8');
INSERT INTO `paper_que` VALUES ('101', '4', null, null, null, '5', '8');
INSERT INTO `paper_que` VALUES ('102', '4', null, null, null, '14', '8');
INSERT INTO `paper_que` VALUES ('103', '4', null, null, null, '21', '8');
INSERT INTO `paper_que` VALUES ('104', '4', null, null, null, '19', '8');
INSERT INTO `paper_que` VALUES ('105', '4', null, null, null, '24', '8');
INSERT INTO `paper_que` VALUES ('106', '1', '24', null, null, null, '9');
INSERT INTO `paper_que` VALUES ('107', '2', null, '2', null, null, '9');
INSERT INTO `paper_que` VALUES ('108', '3', null, null, '6', null, '9');
INSERT INTO `paper_que` VALUES ('109', '4', null, null, null, '16', '9');
INSERT INTO `paper_que` VALUES ('110', '1', '20', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('111', '1', '21', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('112', '1', '22', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('113', '1', '23', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('114', '1', '24', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('115', '1', '25', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('116', '1', '26', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('117', '1', '27', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('118', '1', '28', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('119', '1', '29', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('120', '1', '30', null, null, null, '10');
INSERT INTO `paper_que` VALUES ('121', '2', null, '6', null, null, '10');
INSERT INTO `paper_que` VALUES ('122', '2', null, '7', null, null, '10');
INSERT INTO `paper_que` VALUES ('123', '2', null, '8', null, null, '10');
INSERT INTO `paper_que` VALUES ('124', '2', null, '9', null, null, '10');
INSERT INTO `paper_que` VALUES ('125', '2', null, '10', null, null, '10');
INSERT INTO `paper_que` VALUES ('126', '3', null, null, '17', null, '10');
INSERT INTO `paper_que` VALUES ('127', '3', null, null, '18', null, '10');
INSERT INTO `paper_que` VALUES ('128', '3', null, null, '19', null, '10');
INSERT INTO `paper_que` VALUES ('129', '3', null, null, '20', null, '10');
INSERT INTO `paper_que` VALUES ('130', '3', null, null, '21', null, '10');
INSERT INTO `paper_que` VALUES ('131', '4', null, null, null, '26', '10');
INSERT INTO `paper_que` VALUES ('132', '4', null, null, null, '27', '10');
INSERT INTO `paper_que` VALUES ('133', '4', null, null, null, '28', '10');
INSERT INTO `paper_que` VALUES ('134', '4', null, null, null, '29', '10');
INSERT INTO `paper_que` VALUES ('135', '4', null, null, null, '30', '10');
INSERT INTO `paper_que` VALUES ('136', '1', '1', null, null, null, '11');
INSERT INTO `paper_que` VALUES ('137', '2', null, '1', null, null, '11');
INSERT INTO `paper_que` VALUES ('138', '3', null, null, '8', null, '11');
INSERT INTO `paper_que` VALUES ('139', '4', null, null, null, '8', '11');

-- ----------------------------
-- Table structure for `programing_language`
-- ----------------------------
DROP TABLE IF EXISTS `programing_language`;
CREATE TABLE `programing_language` (
  `lang_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编程语言id',
  `lang_name` varchar(255) DEFAULT NULL COMMENT '编程语言名称',
  `lang_desc` varchar(255) DEFAULT NULL COMMENT '编程语言描述',
  `lang_img_src` varchar(255) DEFAULT NULL COMMENT '编程语言图标',
  `lang_create_time` datetime DEFAULT NULL COMMENT '编程语言创建时间',
  `lang_created_by` varchar(255) DEFAULT NULL COMMENT '编程语言被创建者',
  `lang_change_time` datetime DEFAULT NULL COMMENT '编程语言最近修改时间',
  `lang_last_changer` varchar(255) DEFAULT NULL COMMENT '编程语言最近被修改者',
  `is_recommend` varchar(255) DEFAULT '0' COMMENT '是否在学生首页显示推荐，默认为0不推荐，1为推荐',
  PRIMARY KEY (`lang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of programing_language
-- ----------------------------
INSERT INTO `programing_language` VALUES ('1', 'Java', 'Java工程师能力评估', 'http://qiniu.maweitao.top/programImages/6f582277-9665-4acc-b52d-9adbf9839110', '2019-03-13 03:53:24', '小张', '2019-04-20 20:18:07', '小张', '1');
INSERT INTO `programing_language` VALUES ('2', 'C++', 'C++工程师能力评估', 'http://qiniu.maweitao.top/programImages/08733a00-dcd8-4d18-9619-4fff03034399', '2019-03-13 03:54:24', '小张', '2019-04-20 20:18:16', '小张', '0');
INSERT INTO `programing_language` VALUES ('3', 'Android', 'Android工程师能力评估', 'http://qiniu.maweitao.top/programImages/91675aeb-111d-4694-a5c4-5a44cc4aadbd', '2019-03-13 03:55:09', '小张', '2019-04-20 20:18:24', '小张', '1');
INSERT INTO `programing_language` VALUES ('4', 'IOS', 'IOS工程师能力评估', 'http://qiniu.maweitao.top/programImages/14ac1435-3e81-4e00-b192-17cf65ca6940', '2019-03-13 03:55:43', '小张', '2019-04-20 20:18:30', '小张', '0');
INSERT INTO `programing_language` VALUES ('5', 'php', 'php工程师能力评估', 'http://qiniu.maweitao.top/programImages/5001af39-ef9f-463c-997f-2f8303a0f936', '2019-03-13 03:56:37', '小张', '2019-04-20 20:18:37', '小张', '1');
INSERT INTO `programing_language` VALUES ('6', 'Python', 'Python工程师能力评估', 'http://qiniu.maweitao.top/programImages/5f034ff5-0248-4068-9ee6-8a446b8e1c9d', '2019-03-13 03:58:59', '小张', '2019-04-20 20:18:45', '小张', '1');
INSERT INTO `programing_language` VALUES ('7', 'Ruby', 'Ruby工程师能力评估', 'http://qiniu.maweitao.top/programImages/53b34746-6de9-4496-a937-593bcb630c74', '2019-03-13 03:59:59', '小张', '2019-04-20 20:19:31', '小张', '0');
INSERT INTO `programing_language` VALUES ('8', 'Go', 'Go工程师能力评估', 'http://qiniu.maweitao.top/programImages/3a4cbb26-ee50-422c-a462-300e9c9c572e', '2019-03-13 04:00:36', '小张', '2019-04-20 20:19:03', '小张', '0');
INSERT INTO `programing_language` VALUES ('9', 'JavaScript', 'Web工程师能力评估', 'http://qiniu.maweitao.top/programImages/cc74a51c-74fb-4be9-a851-342e0705c5e5', '2019-03-13 04:03:40', '小张', '2019-04-20 20:19:16', '小张', '1');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sno` char(12) NOT NULL COMMENT '主键，学生学号',
  `stu_psw` varchar(255) NOT NULL DEFAULT '123456' COMMENT '登录密码，默认为123456',
  `stu_name` varchar(255) NOT NULL COMMENT '学生姓名',
  `stu_img_src` varchar(255) DEFAULT NULL COMMENT '头像链接',
  `stu_sex` varchar(255) NOT NULL DEFAULT '男' COMMENT '学生性别',
  `stu_email` varchar(255) DEFAULT NULL COMMENT '学生邮箱',
  `stu_phone` char(11) DEFAULT NULL COMMENT '学生手机号码',
  `stu_create_time` datetime NOT NULL COMMENT '学生注册时间',
  `stu_last_login_time` datetime DEFAULT NULL COMMENT '学生最近登录时间',
  `stu_status` char(1) NOT NULL DEFAULT '1' COMMENT '学生登录状态',
  `stu_security_code` varchar(255) NOT NULL DEFAULT '123456' COMMENT '安全码用于密码找回',
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('201511314001', '123456', '小四', null, '男', '1234@qq.com', '13458956478', '2019-04-28 01:20:39', null, '1', '123456');
INSERT INTO `student` VALUES ('201511314002', '123456', '小五', null, '男', '1234@qq.com', '13458956478', '2019-04-28 01:21:10', null, '1', '123456');
INSERT INTO `student` VALUES ('201511314003', '123456', '小刘', null, '男', '12345@qq.com', '13565895641', '2019-04-28 01:21:45', '2019-04-28 01:21:47', '1', '123456');
INSERT INTO `student` VALUES ('201511314301', '123456', '小三', 'http://qiniu.maweitao.top/profiles/c721b496-fb54-4fc0-96a8-4a5095584bfd', '男', '123456789@qq.com', '13526459823', '2019-04-28 00:46:29', '2019-04-28 00:47:27', '1', '123456');
INSERT INTO `student` VALUES ('201511314321', '123456', '小马', 'http://qiniu.maweitao.top/profiles/e52b0c14-afe5-46dd-8433-01aa5a667753', '男', '1234567@qq.com', '13658952365', '2019-04-28 00:57:25', '2019-04-28 00:57:28', '1', '123456');
INSERT INTO `student` VALUES ('201521314301', '123456', '谢永宁', 'http://qiniu.maweitao.top/profiles/e67db9be-0faa-4118-abe5-d618f2561108', '男', '123456@qq.com', '13254896548', '2019-03-10 20:15:37', '2019-04-28 01:44:43', '1', '123456');
INSERT INTO `student` VALUES ('201521314302', '123456', '李四', 'http://qiniu.maweitao.top/profiles/bca36eb8-118a-4f16-9e51-e2f8bfa16e5c', '男', '123456@qq.com', '13625498549', '2019-03-11 18:37:18', '2019-04-15 20:16:00', '0', '123456');
INSERT INTO `student` VALUES ('201521314303', '123456', '马瑞欣', 'http://qiniu.maweitao.top/profiles/00b54bf8-dbfe-4952-80b7-045e42e8b11d', '女', '123456@qq.com', '13625894562', '2019-03-31 21:19:19', '2019-04-15 20:17:15', '1', '123456');
INSERT INTO `student` VALUES ('201521314304', '123456', '阿水', 'http://qiniu.maweitao.top/profiles/fd5fb96d-bd08-499f-9092-75699fba9adf', '男', '123456@qq.com', '13652485962', '2019-03-31 22:48:05', '2019-04-15 20:17:35', '0', '123456');
INSERT INTO `student` VALUES ('201521314305', '123456', '马导', 'http://qiniu.maweitao.top/profiles/30db92f7-6fef-401d-b756-765a21e31a2b', '女', '123456@qq.com', '13452685942', '2019-03-31 22:59:39', '2019-04-15 20:18:05', '1', '123456');
INSERT INTO `student` VALUES ('201521314310', '123456', '叶国冲', 'http://qiniu.maweitao.top/profiles/eadb0262-e703-4d66-a3ce-27ce5874a12b', '男', '1234567@qq.com', '13754695862', '2019-03-11 01:10:22', '2019-04-15 20:18:14', '1', '123456');
INSERT INTO `student` VALUES ('201521314316', '123456', '汤梓豪', 'http://qiniu.maweitao.top/profiles/1f987c0f-9af5-46c8-bc8f-1129abb13b22', '男', '123456@qq.com', '13225849856', '2019-03-03 18:59:47', '2019-04-15 20:18:29', '1', '123456');
INSERT INTO `student` VALUES ('201521314318', '123456', '张家豪', 'http://qiniu.maweitao.top/profiles/318dc134-5261-4bac-bde6-e7ea67c7dc53', '男', '123456@qq.com', '13632289756', '2019-03-10 20:10:30', '2019-04-15 20:19:25', '1', '123456');
INSERT INTO `student` VALUES ('201521314319', '123456', '罗建宏', 'http://qiniu.maweitao.top/profiles/9ed8e71c-d67f-4e80-8054-3172e124f41e', '男', '123456@qq.com', '13545687959', '2019-03-10 20:12:14', '2019-04-15 20:20:19', '1', '123456');
INSERT INTO `student` VALUES ('201521314321', '123456', '马伟涛', 'http://qiniu.maweitao.top/profiles/59665a0e-4387-45c9-91c3-0b307c7f0951', '男', '815699563@qq.com', '13602890590', '2019-03-01 18:35:26', '2019-05-07 16:31:01', '1', '123456');
INSERT INTO `student` VALUES ('201521314322', '123456', '杨铎', 'http://qiniu.maweitao.top/profiles/26a86525-916e-429f-afc6-e34450c66316', '男', '123456@qq.com', '13225849856', '2019-03-03 18:25:42', '2019-04-15 20:20:33', '1', '123456');
INSERT INTO `student` VALUES ('201521314323', '123456', '陈国', 'http://qiniu.maweitao.top/profiles/b3d029f1-0237-4595-bdf4-12e8f00cf1d9', '男', '123456@136.com', '15524752689', '2019-03-03 17:20:56', '2019-04-15 20:20:48', '1', '123456');
INSERT INTO `student` VALUES ('201521314330', '123456', '魏伟康', 'http://qiniu.maweitao.top/profiles/560662e3-d83f-43d0-bbcc-d3b830ad5d68', '男', '12345678@qq.com', '18054687965', '2019-03-10 20:17:37', '2019-04-15 20:21:27', '1', '123456');
INSERT INTO `student` VALUES ('201521314332', '123456', '陈荣涛', 'http://qiniu.maweitao.top/profiles/5d1435fb-ca6f-4a20-91bc-f6e79535a45b', '男', '123456@qq.com', '13456987532', '2019-03-10 20:20:32', '2019-04-15 20:22:01', '1', '123456');
INSERT INTO `student` VALUES ('201521314501', '123456', '小明', 'http://qiniu.maweitao.top/profiles/6431fa5d-9307-49f4-93fe-835866d50cca', '男', '123456@qq.com', '13625248596', '2019-04-08 03:32:29', '2019-04-15 20:22:45', '1', '123456');
INSERT INTO `student` VALUES ('201521314502', '123456', '小红', 'http://qiniu.maweitao.top/profiles/20a95a11-7af6-4e9f-ae52-1e0c068ed361', '女', '123456@qq.com', '13456258956', '2019-04-08 03:33:00', '2019-04-15 20:22:59', '1', '123456');
INSERT INTO `student` VALUES ('201521314503', '123456', '小黄', 'http://qiniu.maweitao.top/profiles/1cbc7613-0646-4d37-99e7-dbd5a10890d9', '男', '123456@qq.com', '13456258958', '2019-04-08 03:33:20', '2019-04-15 20:23:15', '1', '123456');
INSERT INTO `student` VALUES ('201521314505', '123456', '小飞', 'http://qiniu.maweitao.top/profiles/c34d8251-a0d7-4f67-a4fd-57719e5548dd', '男', '123456@qq.com', '13895487596', '2019-04-08 03:33:50', '2019-04-15 20:23:38', '1', '123456');
INSERT INTO `student` VALUES ('201521314506', '123456', '小亮', 'http://qiniu.maweitao.top/profiles/a4de68f1-adae-4087-a670-a0b5bce14a05', '男', '123456@qq.com', '13895487599', '2019-04-08 03:34:21', '2019-04-15 20:24:03', '1', '123456');
INSERT INTO `student` VALUES ('201521314507', '123456', '红苹果', 'http://qiniu.maweitao.top/profiles/23026bbc-2e85-4c14-ad8d-8d70094bea56', '女', '123456@qq.com', '13895487545', '2019-04-08 03:34:35', '2019-04-15 20:24:19', '1', '123456');
INSERT INTO `student` VALUES ('201521314508', '123456', '小敏', 'http://qiniu.maweitao.top/profiles/d6511ad5-ece1-43aa-ad69-c385dbe51104', '女', '123456@qq.com', '13895487548', '2019-04-08 03:34:46', '2019-04-15 20:24:33', '1', '123456');
INSERT INTO `student` VALUES ('201521314610', '123456', '飘雪国', 'http://qiniu.maweitao.top/profiles/007f6b62-5af8-4067-924c-ac9c0fe4f24a', '男', '123456@qq.com', '13526489523', '2019-04-08 03:48:40', '2019-04-15 20:24:54', '1', '123456');
INSERT INTO `student` VALUES ('201521314700', '123456', '咸蛋超人', 'http://qiniu.maweitao.top/profiles/9159e950-c550-4594-b15d-e33018eb70b5', '男', '8954233@qq.com', '18952484562', '2019-04-08 15:42:49', '2019-04-15 20:25:09', '1', '123456');
INSERT INTO `student` VALUES ('201521314701', '123456', '泽泽', 'http://qiniu.maweitao.top/profiles/407594a5-b296-4a48-b60b-63985b574218', '男', '123456@qq.com', '13526458952', '2019-04-08 15:44:36', '2019-04-15 20:25:22', '1', '123456');
INSERT INTO `student` VALUES ('201521314900', '123456', '张阿三', null, '男', null, null, '2019-04-16 22:40:19', '2019-04-28 01:45:49', '1', '123456');
INSERT INTO `student` VALUES ('201521314901', '123456', '张小红', null, '女', null, null, '2019-04-16 22:40:19', null, '1', '123456');
INSERT INTO `student` VALUES ('201521314902', '123456', '李阿四', null, '男', null, null, '2019-04-16 22:40:19', null, '1', '123456');

-- ----------------------------
-- Table structure for `student_feedback`
-- ----------------------------
DROP TABLE IF EXISTS `student_feedback`;
CREATE TABLE `student_feedback` (
  `feedback_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '反馈id',
  `feedback_content` varchar(255) NOT NULL COMMENT '反馈内容',
  `feedback_create_time` datetime NOT NULL COMMENT '反馈创建时间',
  `sno` char(12) NOT NULL COMMENT '学号',
  `stu_name` varchar(255) DEFAULT NULL COMMENT '学生姓名',
  `adm_answer` varchar(255) DEFAULT NULL COMMENT '管理员回复',
  `ano` char(6) DEFAULT NULL COMMENT '管理员号',
  `adm_name` varchar(255) DEFAULT NULL COMMENT '管理员姓名',
  `feedback_status` char(1) DEFAULT '0' COMMENT '留言状态0为管理员未读，1为管理员已读学生未读，2为学生已读',
  `reply_time` datetime DEFAULT NULL COMMENT '管理员回复时间',
  PRIMARY KEY (`feedback_id`),
  KEY `feedback_sno` (`sno`),
  KEY `feedback_ano` (`ano`),
  CONSTRAINT `feedback_ano` FOREIGN KEY (`ano`) REFERENCES `admin` (`ano`),
  CONSTRAINT `feedback_sno` FOREIGN KEY (`sno`) REFERENCES `student` (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_feedback
-- ----------------------------
INSERT INTO `student_feedback` VALUES ('2', '666', '2019-03-12 00:30:13', '201521314321', '马伟涛', '谢谢您的夸奖！', '100001', '小李', '2', '2019-03-12 14:59:34');
INSERT INTO `student_feedback` VALUES ('3', '加油，继续努力', '2019-03-12 00:30:55', '201521314321', '马伟涛', '好的，收到。记得给五星好评喔', '123456', '小张', '2', '2019-03-12 17:15:53');
INSERT INTO `student_feedback` VALUES ('4', '在线考试系统', '2019-03-12 00:45:16', '201521314321', '马伟涛', '嗯嗯，感谢您的使用', '100001', '小李', '2', '2019-03-13 18:25:11');
INSERT INTO `student_feedback` VALUES ('5', '111', '2019-03-12 00:50:50', '201521314321', '马伟涛', '222', '100000', '小王', '2', '2019-03-13 18:25:31');
INSERT INTO `student_feedback` VALUES ('6', '牛逼', '2019-03-12 00:52:47', '201521314322', '杨铎', '拓荒者牛逼', '100000', '小王', '1', '2019-03-13 19:00:06');
INSERT INTO `student_feedback` VALUES ('7', '小母牛开摩托车咯', '2019-03-12 00:53:07', '201521314322', '杨铎', '牛逼轰轰喔！', '100001', '小李', '1', '2019-03-13 19:00:08');
INSERT INTO `student_feedback` VALUES ('8', '我是谢永宁哈哈哈', '2019-03-13 19:08:47', '201521314301', '谢永宁', '我叼你啊，你再逼', '100000', '小王', '2', '2019-04-02 18:26:26');
INSERT INTO `student_feedback` VALUES ('10', '你好啊，哈哈哈', '2019-03-22 03:52:22', '201521314321', '马伟涛', '呵呵哒', '100000', '小王', '2', '2019-04-02 18:26:22');
INSERT INTO `student_feedback` VALUES ('19', '666', '2019-04-02 18:41:35', '201521314321', '马伟涛', '鸡你太美', '123456', '小张', '2', '2019-04-21 00:29:46');
INSERT INTO `student_feedback` VALUES ('21', '555', '2019-04-02 19:13:15', '201521314321', '马伟涛', '呜呜呜', '123456', '小张', '2', '2019-04-21 00:34:34');
INSERT INTO `student_feedback` VALUES ('23', '222', '2019-04-21 19:32:49', '201521314321', '马伟涛', '222', '100000', '小王', '2', '2019-04-21 23:50:43');
INSERT INTO `student_feedback` VALUES ('24', '111', '2019-04-21 19:33:12', '201521314321', '马伟涛', '111', '100000', '小王', '2', '2019-04-21 23:51:29');
INSERT INTO `student_feedback` VALUES ('36', '11', '2019-04-21 23:38:57', '201521314321', '马伟涛', '11', '100000', '小王', '2', '2019-04-22 00:11:25');
INSERT INTO `student_feedback` VALUES ('37', '111', '2019-04-21 23:40:54', '201521314321', '马伟涛', '111', '100000', '小王', '2', '2019-04-22 00:04:11');
INSERT INTO `student_feedback` VALUES ('38', '888', '2019-04-21 23:42:08', '201521314321', '马伟涛', '888', '100000', '小王', '2', '2019-04-22 00:02:07');
INSERT INTO `student_feedback` VALUES ('39', '大碗面', '2019-04-21 23:49:58', '201521314321', '马伟涛', '面大碗', '100000', '小王', '2', '2019-04-21 23:50:18');
INSERT INTO `student_feedback` VALUES ('40', '5555', '2019-04-21 23:52:31', '201521314321', '马伟涛', '5555', '100000', '小王', '2', '2019-04-21 23:52:49');
INSERT INTO `student_feedback` VALUES ('41', '11', '2019-04-21 23:53:36', '201521314321', '马伟涛', '22', '100000', '小王', '2', '2019-04-21 23:55:22');
INSERT INTO `student_feedback` VALUES ('42', '9999', '2019-04-22 00:04:36', '201521314321', '马伟涛', '9999', '100000', '小王', '2', '2019-04-22 00:04:44');
INSERT INTO `student_feedback` VALUES ('43', '测试一下', '2019-04-22 00:12:47', '201521314321', '马伟涛', '好的', '100000', '小王', '2', '2019-04-22 00:13:05');
INSERT INTO `student_feedback` VALUES ('44', '测试', '2019-04-22 00:14:10', '201521314321', '马伟涛', '测试', '100000', '小王', '2', '2019-04-22 00:14:16');
INSERT INTO `student_feedback` VALUES ('45', 'qqq', '2019-04-22 00:14:59', '201521314321', '马伟涛', 'qqq', '100000', '小王', '2', '2019-04-22 00:15:07');
INSERT INTO `student_feedback` VALUES ('46', '我们', '2019-04-22 00:15:39', '201521314321', '马伟涛', '我们', '100000', '小王', '2', '2019-04-22 00:15:44');
INSERT INTO `student_feedback` VALUES ('47', '8585', '2019-04-22 00:16:01', '201521314321', '马伟涛', '85585', '100000', '小王', '2', '2019-04-22 00:20:17');
INSERT INTO `student_feedback` VALUES ('48', '8888', '2019-04-22 00:16:04', '201521314321', '马伟涛', '8888', '100000', '小王', '2', '2019-04-22 00:16:15');
INSERT INTO `student_feedback` VALUES ('49', '7777', '2019-04-22 00:18:03', '201521314321', '马伟涛', '7777', '100000', '小王', '2', '2019-04-22 00:18:27');
INSERT INTO `student_feedback` VALUES ('50', '1111', '2019-04-22 00:19:53', '201521314321', '马伟涛', '1111', '100000', '小王', '2', '2019-04-22 00:20:02');
INSERT INTO `student_feedback` VALUES ('51', '我们', '2019-04-22 00:20:29', '201521314321', '马伟涛', '我们', '100000', '小王', '2', '2019-04-22 00:20:42');
INSERT INTO `student_feedback` VALUES ('52', '555', '2019-04-22 01:11:39', '201521314321', '马伟涛', '555', '100000', '小王', '2', '2019-04-22 01:41:39');
INSERT INTO `student_feedback` VALUES ('53', '测试额', '2019-04-22 01:40:40', '201521314321', '马伟涛', '测试额', '100000', '小王', '2', '2019-04-22 01:46:30');
INSERT INTO `student_feedback` VALUES ('54', '再来', '2019-04-22 01:41:05', '201521314321', '马伟涛', '再来', '100000', '小王', '2', '2019-04-22 01:51:07');
INSERT INTO `student_feedback` VALUES ('55', '来', '2019-04-22 01:53:58', '201521314321', '马伟涛', '来', '123456', '小张', '2', '2019-04-22 01:55:05');
INSERT INTO `student_feedback` VALUES ('56', '拉来', '2019-04-22 01:54:44', '201521314321', '马伟涛', '拉来', '100000', '小王', '2', '2019-04-22 02:00:01');
INSERT INTO `student_feedback` VALUES ('57', '来来来', '2019-04-22 01:55:52', '201521314321', '马伟涛', '来来来', '100000', '小王', '2', '2019-04-22 02:11:32');
INSERT INTO `student_feedback` VALUES ('58', '啦啦啦', '2019-04-22 01:58:44', '201521314321', '马伟涛', '啦啦啦', '100000', '小王', '2', '2019-04-22 02:12:22');
INSERT INTO `student_feedback` VALUES ('59', '哔哩哔哩', '2019-04-22 01:59:09', '201521314321', '马伟涛', '哔哩哔哩', '123456', '小张', '2', '2019-04-22 02:12:43');
INSERT INTO `student_feedback` VALUES ('60', '大碗宽面', '2019-04-22 01:59:42', '201521314321', '马伟涛', '大碗宽面', '123456', '小张', '2', '2019-04-25 16:05:36');
INSERT INTO `student_feedback` VALUES ('61', '渣渣辉', '2019-04-22 02:13:08', '201521314321', '马伟涛', '渣渣辉', '123456', '小张', '2', '2019-04-25 16:06:16');
INSERT INTO `student_feedback` VALUES ('62', '111', '2019-04-22 02:45:51', '201521314321', '马伟涛', '111', '123456', '小张', '2', '2019-04-22 02:46:51');
INSERT INTO `student_feedback` VALUES ('63', '222', '2019-04-22 02:47:00', '201521314321', '马伟涛', '222', '123456', '小张', '2', '2019-04-22 16:18:14');
INSERT INTO `student_feedback` VALUES ('64', '222', '2019-04-22 16:17:31', '201521314321', '马伟涛', '222', '123456', '小张', '2', '2019-04-22 16:17:46');
INSERT INTO `student_feedback` VALUES ('65', '996', '2019-04-22 16:21:22', '201521314321', '马伟涛', '996', '123456', '小张', '2', '2019-04-25 16:05:11');
INSERT INTO `student_feedback` VALUES ('66', '979', '2019-04-22 16:21:57', '201521314321', '马伟涛', '979', '123456', '小张', '2', '2019-04-22 17:17:36');
INSERT INTO `student_feedback` VALUES ('67', '878', '2019-04-22 16:22:56', '201521314321', '马伟涛', '878', '123456', '小张', '2', '2019-04-22 16:23:55');
INSERT INTO `student_feedback` VALUES ('68', '669', '2019-04-22 17:17:56', '201521314321', '马伟涛', '669', '123456', '小张', '2', '2019-04-23 23:38:34');
INSERT INTO `student_feedback` VALUES ('69', '打包咯', '2019-04-22 19:41:04', '201521314321', '马伟涛', '好的喔', '123456', '小张', '2', '2019-04-22 19:41:16');
INSERT INTO `student_feedback` VALUES ('70', '123', '2019-04-25 16:03:36', '201521314321', '马伟涛', '123', '123456', '小张', '2', '2019-04-25 16:04:05');
INSERT INTO `student_feedback` VALUES ('71', '11', '2019-04-25 16:08:18', '201521314321', '马伟涛', '11', '123456', '小张', '2', '2019-04-25 16:11:38');
INSERT INTO `student_feedback` VALUES ('72', '222', '2019-04-25 16:12:21', '201521314321', '马伟涛', '222', '123456', '小张', '2', '2019-04-25 16:14:48');
INSERT INTO `student_feedback` VALUES ('73', '33', '2019-04-25 16:15:06', '201521314321', '马伟涛', '33', '123456', '小张', '2', '2019-04-25 16:15:20');
INSERT INTO `student_feedback` VALUES ('74', '44', '2019-04-25 16:15:31', '201521314321', '马伟涛', '44', '123456', '小张', '2', '2019-04-25 16:17:22');
INSERT INTO `student_feedback` VALUES ('75', '55', '2019-04-25 16:31:05', '201521314321', '马伟涛', '55', '123456', '小张', '2', '2019-04-25 16:31:43');
INSERT INTO `student_feedback` VALUES ('76', '66', '2019-04-25 16:31:20', '201521314321', '马伟涛', '66', '123456', '小张', '2', '2019-04-25 16:31:53');
INSERT INTO `student_feedback` VALUES ('77', '77', '2019-04-25 16:31:29', '201521314321', '马伟涛', '77', '123456', '小张', '2', '2019-04-25 16:36:52');
INSERT INTO `student_feedback` VALUES ('78', '88', '2019-04-25 16:39:59', '201521314321', '马伟涛', '88', '123456', '小张', '2', '2019-04-25 16:40:09');
INSERT INTO `student_feedback` VALUES ('79', '99', '2019-04-25 16:46:32', '201521314321', '马伟涛', '99', '123456', '小张', '2', '2019-04-25 16:46:37');
INSERT INTO `student_feedback` VALUES ('80', '10', '2019-04-25 16:46:49', '201521314321', '马伟涛', '10', '123456', '小张', '2', '2019-04-25 16:46:57');
INSERT INTO `student_feedback` VALUES ('81', '12', '2019-04-25 16:49:56', '201521314321', '马伟涛', '12', '123456', '小张', '2', '2019-04-25 16:50:39');
INSERT INTO `student_feedback` VALUES ('82', '13', '2019-04-25 16:50:02', '201521314321', '马伟涛', '13', '123456', '小张', '2', '2019-04-25 16:52:34');
INSERT INTO `student_feedback` VALUES ('83', '14', '2019-04-25 16:50:05', '201521314321', '马伟涛', '14', '123456', '小张', '2', '2019-04-25 16:53:08');
INSERT INTO `student_feedback` VALUES ('84', '15', '2019-04-25 16:54:20', '201521314321', '马伟涛', '15', '123456', '小张', '2', '2019-04-25 16:54:26');
INSERT INTO `student_feedback` VALUES ('85', '16', '2019-04-25 16:54:31', '201521314321', '马伟涛', '16', '123456', '小张', '2', '2019-04-25 16:54:43');
INSERT INTO `student_feedback` VALUES ('86', '17', '2019-04-25 16:54:35', '201521314321', '马伟涛', '17', '123456', '小张', '2', '2019-04-25 16:55:46');
INSERT INTO `student_feedback` VALUES ('87', '18', '2019-04-25 16:56:36', '201521314321', '马伟涛', '18', '123456', '小张', '2', '2019-04-25 16:56:46');
INSERT INTO `student_feedback` VALUES ('88', '19', '2019-04-25 16:56:38', '201521314321', '马伟涛', '19', '123456', '小张', '2', '2019-04-25 16:58:13');
INSERT INTO `student_feedback` VALUES ('89', '20', '2019-04-25 16:56:40', '201521314321', '马伟涛', '20', '123456', '小张', '2', '2019-04-25 16:58:24');
INSERT INTO `student_feedback` VALUES ('90', '18', '2019-04-25 16:57:40', '201521314321', '马伟涛', '18', '123456', '小张', '2', '2019-04-25 16:57:47');
INSERT INTO `student_feedback` VALUES ('91', '21', '2019-04-25 16:59:26', '201521314321', '马伟涛', '21', '123456', '小张', '2', '2019-04-25 16:59:31');
INSERT INTO `student_feedback` VALUES ('92', '22', '2019-04-25 16:59:36', '201521314321', '马伟涛', '22', '123456', '小张', '2', '2019-04-25 16:59:40');
INSERT INTO `student_feedback` VALUES ('93', '23', '2019-04-25 16:59:44', '201521314321', '马伟涛', '23', '123456', '小张', '2', '2019-04-25 16:59:48');
INSERT INTO `student_feedback` VALUES ('94', '24', '2019-04-25 16:59:51', '201521314321', '马伟涛', '24', '123456', '小张', '2', '2019-04-25 17:00:48');
INSERT INTO `student_feedback` VALUES ('95', '25', '2019-04-25 16:59:52', '201521314321', '马伟涛', '25', '123456', '小张', '2', '2019-04-25 17:05:34');
INSERT INTO `student_feedback` VALUES ('96', '26', '2019-04-25 17:00:05', '201521314321', '马伟涛', '26', '123456', '小张', '2', '2019-04-25 17:07:02');
INSERT INTO `student_feedback` VALUES ('97', '27', '2019-04-25 17:07:27', '201521314321', '马伟涛', '27', '123456', '小张', '2', '2019-04-25 17:07:32');
INSERT INTO `student_feedback` VALUES ('98', '28', '2019-04-25 17:07:35', '201521314321', '马伟涛', '28', '123456', '小张', '2', '2019-04-25 17:07:46');
INSERT INTO `student_feedback` VALUES ('99', '29', '2019-04-25 17:07:37', '201521314321', '马伟涛', '29', '123456', '小张', '2', '2019-04-25 17:10:07');
INSERT INTO `student_feedback` VALUES ('100', '30', '2019-04-25 17:07:39', '201521314321', '马伟涛', '30', '123456', '小张', '2', '2019-04-25 17:10:53');
INSERT INTO `student_feedback` VALUES ('101', '31', '2019-04-25 17:11:03', '201521314321', '马伟涛', '31', '123456', '小张', '2', '2019-04-25 17:11:06');
INSERT INTO `student_feedback` VALUES ('102', '32', '2019-04-25 17:11:12', '201521314321', '马伟涛', '32', '123456', '小张', '2', '2019-04-25 17:11:25');
INSERT INTO `student_feedback` VALUES ('103', '33', '2019-04-25 17:11:14', '201521314321', '马伟涛', '33', '123456', '小张', '2', '2019-04-25 17:16:26');
INSERT INTO `student_feedback` VALUES ('104', '34', '2019-04-25 17:11:15', '201521314321', '马伟涛', '4', '123456', '小张', '2', '2019-04-25 17:16:44');
INSERT INTO `student_feedback` VALUES ('105', '35', '2019-04-25 17:16:35', '201521314321', '马伟涛', '35', '123456', '小张', '2', '2019-04-25 17:16:51');
INSERT INTO `student_feedback` VALUES ('106', '36', '2019-04-25 17:16:36', '201521314321', '马伟涛', '36', '123456', '小张', '2', '2019-04-25 17:18:11');
INSERT INTO `student_feedback` VALUES ('107', '37', '2019-04-25 17:16:40', '201521314321', '马伟涛', '37', '123456', '小张', '2', '2019-04-25 17:19:16');
INSERT INTO `student_feedback` VALUES ('108', '40', '2019-04-25 17:25:31', '201521314321', '马伟涛', '40', '123456', '小张', '2', '2019-04-25 17:31:06');
INSERT INTO `student_feedback` VALUES ('109', '41', '2019-04-25 17:25:42', '201521314321', '马伟涛', '41', '123456', '小张', '2', '2019-04-25 17:31:33');
INSERT INTO `student_feedback` VALUES ('110', '42', '2019-04-25 17:26:19', '201521314321', '马伟涛', '42', '123456', '小张', '2', '2019-04-25 17:37:53');
INSERT INTO `student_feedback` VALUES ('111', '45', '2019-04-25 17:29:03', '201521314321', '马伟涛', '45', '123456', '小张', '2', '2019-04-25 17:38:29');
INSERT INTO `student_feedback` VALUES ('112', '43', '2019-04-25 17:30:52', '201521314321', '马伟涛', '43', '123456', '小张', '2', '2019-04-25 17:38:15');
INSERT INTO `student_feedback` VALUES ('113', '44', '2019-04-25 17:30:57', '201521314321', '马伟涛', '44', '123456', '小张', '2', '2019-04-25 17:38:19');
INSERT INTO `student_feedback` VALUES ('114', '46', '2019-04-25 17:31:24', '201521314321', '马伟涛', '46', '123456', '小张', '2', '2019-04-25 17:39:08');
INSERT INTO `student_feedback` VALUES ('115', '47', '2019-04-25 17:38:07', '201521314321', '马伟涛', '47', '123456', '小张', '2', '2019-04-25 17:41:00');
INSERT INTO `student_feedback` VALUES ('116', '48', '2019-04-25 17:38:10', '201521314321', '马伟涛', '48', '123456', '小张', '2', '2019-04-25 17:41:47');
INSERT INTO `student_feedback` VALUES ('117', '49', '2019-04-25 17:42:17', '201521314321', '马伟涛', '49', '123456', '小张', '2', '2019-04-25 17:42:36');
INSERT INTO `student_feedback` VALUES ('118', '50', '2019-04-25 17:42:30', '201521314321', '马伟涛', '50', '123456', '小张', '2', '2019-04-25 17:43:04');
INSERT INTO `student_feedback` VALUES ('119', '50', '2019-04-25 17:42:44', '201521314321', '马伟涛', '50', '123456', '小张', '2', '2019-04-25 17:44:51');
INSERT INTO `student_feedback` VALUES ('120', '51', '2019-04-25 17:42:48', '201521314321', '马伟涛', '51', '123456', '小张', '2', '2019-04-25 17:45:04');
INSERT INTO `student_feedback` VALUES ('121', '52', '2019-04-25 17:42:50', '201521314321', '马伟涛', '52', '123456', '小张', '2', '2019-04-25 17:45:16');
INSERT INTO `student_feedback` VALUES ('122', '53', '2019-04-25 17:45:09', '201521314321', '马伟涛', '53', '123456', '小张', '2', '2019-04-25 17:45:22');
INSERT INTO `student_feedback` VALUES ('123', '54', '2019-04-25 17:45:11', '201521314321', '马伟涛', '54', '123456', '小张', '2', '2019-04-25 17:50:36');
INSERT INTO `student_feedback` VALUES ('124', '60', '2019-04-25 17:51:26', '201521314321', '马伟涛', '60', '123456', '小张', '2', '2019-04-25 17:51:56');
INSERT INTO `student_feedback` VALUES ('125', '61', '2019-04-25 17:51:31', '201521314321', '马伟涛', '61', '123456', '小张', '2', '2019-04-25 17:52:08');
INSERT INTO `student_feedback` VALUES ('126', '62', '2019-04-25 17:51:45', '201521314321', '马伟涛', '62', '123456', '小张', '2', '2019-04-25 17:52:22');
INSERT INTO `student_feedback` VALUES ('127', '63', '2019-04-25 17:51:48', '201521314321', '马伟涛', '63', '123456', '小张', '2', '2019-04-25 17:52:57');
INSERT INTO `student_feedback` VALUES ('128', '64', '2019-04-25 17:52:39', '201521314321', '马伟涛', '64', '123456', '小张', '2', '2019-04-25 17:52:44');
INSERT INTO `student_feedback` VALUES ('129', '65', '2019-04-25 17:52:49', '201521314321', '马伟涛', '65', '123456', '小张', '2', '2019-04-25 17:56:01');
INSERT INTO `student_feedback` VALUES ('130', '66', '2019-04-25 17:52:50', '201521314321', '马伟涛', '66', '123456', '小张', '2', '2019-04-26 22:30:15');
INSERT INTO `student_feedback` VALUES ('131', '67', '2019-04-25 17:55:48', '201521314321', '马伟涛', '67', '123456', '小张', '2', '2019-04-26 22:30:18');
INSERT INTO `student_feedback` VALUES ('132', '68', '2019-04-25 17:56:13', '201521314321', '马伟涛', '68', '123456', '小张', '2', '2019-04-25 17:56:18');
INSERT INTO `student_feedback` VALUES ('133', '#流泪;#流泪;#流泪;', '2019-04-26 21:13:52', '201521314321', '马伟涛', '摸摸头', '123456', '小张', '2', '2019-04-26 22:29:42');
INSERT INTO `student_feedback` VALUES ('134', '#爱心;#爱心;#爱心;么么哒', '2019-04-26 21:55:12', '201521314321', '马伟涛', '#爱心;#爱心;么么', '123456', '小张', '2', '2019-04-27 00:24:03');
INSERT INTO `student_feedback` VALUES ('135', '#得意;', '2019-04-26 22:04:23', '201521314321', '马伟涛', null, null, null, '0', null);
INSERT INTO `student_feedback` VALUES ('136', '#发呆;#发呆;', '2019-04-26 22:06:56', '201521314321', '马伟涛', '好的#心碎;', '123456', '小张', '2', '2019-04-27 00:26:21');
INSERT INTO `student_feedback` VALUES ('137', '#发呆;#发呆;#发呆;发呆中', '2019-04-26 22:07:09', '201521314321', '马伟涛', '发呆', '123456', '小张', '2', '2019-04-26 22:30:29');
INSERT INTO `student_feedback` VALUES ('138', '#流泪;#害羞;#闭嘴;', '2019-04-26 22:09:22', '201521314321', '马伟涛', null, null, null, '0', null);
INSERT INTO `student_feedback` VALUES ('139', '#吓;啊啊啊', '2019-04-26 22:17:08', '201521314321', '马伟涛', '#饥饿;#疑问;#衰;咪事阿', '123456', '小张', '2', '2019-04-27 00:29:50');
INSERT INTO `student_feedback` VALUES ('140', '#鼓掌;#坏笑;#微笑;', '2019-04-27 00:35:03', '201521314321', '马伟涛', null, null, null, '0', null);
INSERT INTO `student_feedback` VALUES ('141', '#乒乓;#篮球;来啊', '2019-04-27 02:06:54', '201521314321', '马伟涛', null, null, null, '0', null);
INSERT INTO `student_feedback` VALUES ('142', '#憨笑;嗷嗷嗷', '2019-04-28 00:48:24', '201511314301', '小三', '#发呆;#发呆;啊噢', '123456', '小张', '1', '2019-04-28 00:56:50');
INSERT INTO `student_feedback` VALUES ('143', '#可怜;#可怜;#可怜;哎哎', '2019-04-28 00:51:45', '201511314301', '小三', '1111', '123456', '小张', '1', '2019-05-07 19:17:49');
INSERT INTO `student_feedback` VALUES ('144', '#衰;爱哟', '2019-04-28 00:57:48', '201511314321', '小马', '#害羞;#害羞;害羞', '123456', '小张', '2', '2019-04-28 01:01:16');
INSERT INTO `student_feedback` VALUES ('145', '#亲亲;#亲亲;亲一下', '2019-04-28 01:01:33', '201511314321', '小马', '#咒骂;亲你妹呀', '123456', '小张', '2', '2019-04-28 01:02:16');
INSERT INTO `student_feedback` VALUES ('146', '#亲亲;#糗大了;达', '2019-04-28 01:52:43', '201521314900', '张阿三', '啊啊', '123456', '小张', '1', '2019-05-07 19:02:35');
INSERT INTO `student_feedback` VALUES ('147', '啊哈哈哈#胜利;#鼓掌;', '2019-04-28 02:25:55', '201521314900', '张阿三', '111', '123456', '小张', '1', '2019-05-07 19:02:19');
INSERT INTO `student_feedback` VALUES ('148', '#糗大了;试试', '2019-05-07 16:34:13', '201521314321', '马伟涛', '11', '123456', '小张', '1', '2019-05-07 19:00:06');
INSERT INTO `student_feedback` VALUES ('149', '#发呆;#得意;测试', '2019-05-07 16:35:02', '201521314321', '马伟涛', '#憨笑;#坏笑;#鼓掌;好的喔', '123456', '小张', '2', '2019-05-07 16:35:36');
INSERT INTO `student_feedback` VALUES ('150', '#糗大了;#阴险;', '2019-05-07 17:03:35', '201521314321', '马伟涛', '111#委屈;#抠鼻;', '123456', '小张', '2', '2019-05-07 17:03:59');

-- ----------------------------
-- Table structure for `student_home_rotation_img`
-- ----------------------------
DROP TABLE IF EXISTS `student_home_rotation_img`;
CREATE TABLE `student_home_rotation_img` (
  `img_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '轮播图id',
  `img_title` varchar(255) DEFAULT NULL COMMENT '轮播图标题',
  `img_src` varchar(255) NOT NULL COMMENT '轮播图图片地址',
  `img_create_time` datetime NOT NULL COMMENT '轮播图创建时间',
  `ano` int(11) NOT NULL COMMENT '创建轮播图的管理员id',
  `adm_name` varchar(255) DEFAULT NULL COMMENT '创建轮播图的管理员姓名',
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_home_rotation_img
-- ----------------------------
INSERT INTO `student_home_rotation_img` VALUES ('1', '轮播图1', 'http://qiniu.maweitao.top/programImages/82a1c26a-39b9-4453-8103-22d0d477478f', '2019-03-05 01:48:22', '123456', '小张');
INSERT INTO `student_home_rotation_img` VALUES ('2', '轮播图2', 'http://qiniu.maweitao.top/programImages/1205f95d-5dd0-4def-8f2c-408f490db07a', '2019-03-05 01:48:45', '123456', '小张');
INSERT INTO `student_home_rotation_img` VALUES ('3', '轮播图3', 'http://qiniu.maweitao.top/programImages/b3c05167-40a7-4bd3-bd6e-ed9bb864bb0a', '2019-03-05 01:49:03', '123456', '小张');
INSERT INTO `student_home_rotation_img` VALUES ('4', '轮播图4', 'http://qiniu.maweitao.top/programImages/4c32633e-3e05-4835-b4b6-dc6695b88d11', '2019-03-05 01:49:17', '123456', '小张');
INSERT INTO `student_home_rotation_img` VALUES ('5', '测试添加轮播图1', 'http://qiniu.maweitao.top/programImages/8f7a39f1-b732-4cf5-b26a-b9c5c70ff272', '2019-04-20 17:18:40', '123456', '小张');
INSERT INTO `student_home_rotation_img` VALUES ('6', '测试添加轮播图2', 'http://qiniu.maweitao.top/programImages/b4bcbbbb-599c-4a6a-b055-4f8bef73e25a', '2019-04-20 17:19:01', '123456', '小张');

-- ----------------------------
-- Table structure for `student_paper_answer`
-- ----------------------------
DROP TABLE IF EXISTS `student_paper_answer`;
CREATE TABLE `student_paper_answer` (
  `answer_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生答卷答案id',
  `stu_answer` varchar(255) DEFAULT NULL COMMENT '学生答卷答案',
  `isCorrect` varchar(255) DEFAULT NULL COMMENT '答案是否正确',
  `que_id` int(11) DEFAULT NULL COMMENT '问题id',
  `paper_id` int(11) DEFAULT NULL COMMENT '试卷id',
  `sno` char(12) DEFAULT NULL COMMENT '学号',
  `isCollect` varchar(255) DEFAULT '0' COMMENT '是否被收藏,0为否，1为是',
  PRIMARY KEY (`answer_id`),
  KEY `answer_que_id` (`que_id`),
  KEY `answer_paper_id` (`paper_id`),
  KEY `answer_sno` (`sno`),
  CONSTRAINT `answer_paper_id` FOREIGN KEY (`paper_id`) REFERENCES `paper` (`paper_id`),
  CONSTRAINT `answer_que_id` FOREIGN KEY (`que_id`) REFERENCES `paper_que` (`que_id`),
  CONSTRAINT `answer_sno` FOREIGN KEY (`sno`) REFERENCES `student` (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=662 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_paper_answer
-- ----------------------------
INSERT INTO `student_paper_answer` VALUES ('3', 'A', '0', '1', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('4', 'A', '0', '2', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('5', 'B', '0', '3', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('6', 'B', '1', '4', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('7', 'A', '1', '5', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('8', 'D', '1', '6', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('9', 'A', '1', '7', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('10', 'B', '1', '8', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('11', 'A', '1', '9', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('12', 'B', '1', '10', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('13', '', '0', '11', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('14', null, '0', '12', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('15', null, '0', '13', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('16', null, '0', '14', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('17', null, '0', '15', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('18', null, '0', '16', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('19', null, '0', '17', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('20', null, '0', '18', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('21', null, '0', '19', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('22', null, '0', '20', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('23', 'BCD', '0', '21', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('24', 'BCD', '1', '22', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('25', 'BCD', '1', '23', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('26', 'BCD', '0', '24', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('27', null, '0', '25', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('28', 'T', '1', '26', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('29', 'T', '1', '27', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('30', 'T', '1', '28', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('31', 'T', '1', '29', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('32', null, '0', '30', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('33', 'java ee', '1', '31', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('34', 'jdk', '1', '32', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('35', 'cmd', '1', '33', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('36', '', '0', '34', '1', '201521314321', '1');
INSERT INTO `student_paper_answer` VALUES ('37', null, '0', '35', '1', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('38', 'A', '0', '1', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('39', 'B', '0', '2', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('40', 'A', '0', '3', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('41', 'B', '1', '4', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('42', 'C', '0', '5', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('43', '', '0', '6', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('44', null, '0', '7', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('45', null, '0', '8', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('46', null, '0', '9', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('47', null, '0', '10', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('48', null, '0', '11', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('49', null, '0', '12', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('50', null, '0', '13', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('51', null, '0', '14', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('52', null, '0', '15', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('53', null, '0', '16', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('54', null, '0', '17', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('55', null, '0', '18', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('56', null, '0', '19', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('57', null, '0', '20', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('58', 'ABC', '0', '21', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('59', 'BCD', '1', '22', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('60', 'BCD', '1', '23', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('61', 'BCD', '0', '24', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('62', 'BCD', '0', '25', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('63', 'T', '1', '26', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('64', 'T', '1', '27', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('65', 'T', '1', '28', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('66', 'T', '1', '29', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('67', 'T', '0', '30', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('68', 'java ee', '1', '31', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('69', 'jdk', '1', '32', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('70', 'cmd', '1', '33', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('71', '', '0', '34', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('72', null, '0', '35', '1', '201521314323', '0');
INSERT INTO `student_paper_answer` VALUES ('73', 'A', '0', '1', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('74', 'B', '0', '2', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('75', 'C', '1', '3', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('76', 'B', '1', '4', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('77', 'A', '1', '5', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('78', 'D', '1', '6', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('79', 'A', '1', '7', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('80', 'B', '1', '8', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('81', 'A', '1', '9', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('82', 'B', '1', '10', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('83', 'B', '1', '11', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('84', 'A', '1', '12', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('85', 'B', '1', '13', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('86', 'B', '1', '14', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('87', 'C', '1', '15', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('88', null, '0', '16', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('89', null, '0', '17', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('90', null, '0', '18', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('91', null, '0', '19', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('92', null, '0', '20', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('93', 'BCDE', '1', '21', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('94', 'BCD', '1', '22', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('95', 'BCD', '1', '23', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('96', 'ACD', '1', '24', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('97', 'ACD', '1', '25', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('98', 'T', '1', '26', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('99', 'T', '1', '27', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('100', 'T', '1', '28', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('101', 'T', '1', '29', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('102', 'F', '1', '30', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('103', 'java ee', '1', '31', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('104', 'jdk', '1', '32', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('105', 'cmd', '1', '33', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('106', 'bin', '1', '34', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('107', 'path', '1', '35', '1', '201521314322', '0');
INSERT INTO `student_paper_answer` VALUES ('180', 'B', '1', '1', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('181', 'D', '1', '2', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('182', 'C', '1', '3', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('183', 'B', '1', '4', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('184', 'A', '1', '5', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('185', 'D', '1', '6', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('186', 'A', '1', '7', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('187', 'B', '1', '8', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('188', 'A', '1', '9', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('189', 'B', '1', '10', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('190', null, '0', '11', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('191', null, '0', '12', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('192', null, '0', '13', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('193', null, '0', '14', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('194', null, '0', '15', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('195', null, '0', '16', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('196', null, '0', '17', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('197', null, '0', '18', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('198', null, '0', '19', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('199', null, '0', '20', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('200', 'BCD', '0', '21', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('201', 'BCD', '1', '22', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('202', 'BCD', '1', '23', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('203', 'BCD', '0', '24', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('204', 'ACD', '1', '25', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('205', 'T', '1', '26', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('206', 'T', '1', '27', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('207', 'T', '1', '28', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('208', 'T', '1', '29', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('209', 'F', '1', '30', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('210', 'java ee', '1', '31', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('211', 'cmd', '0', '32', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('212', 'cmd', '1', '33', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('213', null, '0', '34', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('214', '', '0', '35', '1', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('219', 'A', '0', '1', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('220', 'B', '0', '2', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('221', 'C', '1', '3', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('222', 'D', '0', '4', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('223', 'A', '1', '5', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('224', null, '0', '6', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('225', null, '0', '7', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('226', null, '0', '8', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('227', null, '0', '9', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('228', null, '0', '10', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('229', null, '0', '11', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('230', null, '0', '12', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('231', null, '0', '13', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('232', null, '0', '14', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('233', null, '0', '15', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('234', null, '0', '16', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('235', null, '0', '17', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('236', null, '0', '18', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('237', null, '0', '19', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('238', null, '0', '20', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('239', 'BCD', '0', '21', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('240', 'BCD', '1', '22', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('241', 'BCD', '1', '23', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('242', 'BCD', '0', '24', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('243', 'ACD', '1', '25', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('244', 'T', '1', '26', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('245', 'T', '1', '27', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('246', 'T', '1', '28', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('247', 'T', '1', '29', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('248', 'F', '1', '30', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('249', 'java ee', '1', '31', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('250', null, '0', '32', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('251', null, '0', '33', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('252', null, '0', '34', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('253', null, '0', '35', '1', '201521314330', '0');
INSERT INTO `student_paper_answer` VALUES ('256', 'B', '1', '1', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('257', 'D', '1', '2', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('258', 'C', '1', '3', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('259', 'B', '1', '4', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('260', 'A', '1', '5', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('261', '', '0', '6', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('262', null, '0', '7', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('263', null, '0', '8', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('264', null, '0', '9', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('265', null, '0', '10', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('266', null, '0', '11', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('267', null, '0', '12', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('268', null, '0', '13', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('269', null, '0', '14', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('270', null, '0', '15', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('271', null, '0', '16', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('272', null, '0', '17', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('273', null, '0', '18', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('274', null, '0', '19', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('275', null, '0', '20', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('276', 'BCD', '0', '21', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('277', 'BCD', '1', '22', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('278', 'BCD', '1', '23', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('279', 'BCD', '0', '24', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('280', 'ACD', '1', '25', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('281', 'T', '1', '26', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('282', 'T', '1', '27', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('283', 'T', '1', '28', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('284', 'T', '1', '29', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('285', 'F', '1', '30', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('286', null, '0', '31', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('287', null, '0', '32', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('288', null, '0', '33', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('289', null, '0', '34', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('290', null, '0', '35', '1', '201521314316', '0');
INSERT INTO `student_paper_answer` VALUES ('299', 'A', '0', '1', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('300', 'B', '0', '2', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('301', 'C', '1', '3', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('302', 'D', '0', '4', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('303', null, '0', '5', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('304', null, '0', '6', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('305', null, '0', '7', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('306', null, '0', '8', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('307', null, '0', '9', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('308', null, '0', '10', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('309', null, '0', '11', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('310', null, '0', '12', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('311', null, '0', '13', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('312', null, '0', '14', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('313', null, '0', '15', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('314', null, '0', '16', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('315', null, '0', '17', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('316', null, '0', '18', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('317', null, '0', '19', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('318', null, '0', '20', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('319', 'BCD', '0', '21', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('320', 'BCD', '1', '22', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('321', 'BCD', '1', '23', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('322', 'BCD', '0', '24', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('323', 'ACD', '1', '25', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('324', 'T', '1', '26', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('325', 'T', '1', '27', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('326', 'T', '1', '28', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('327', 'T', '1', '29', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('328', 'T', '0', '30', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('329', 'java ee', '1', '31', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('330', null, '0', '32', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('331', null, '0', '33', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('332', null, '0', '34', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('333', null, '0', '35', '1', '201521314303', '0');
INSERT INTO `student_paper_answer` VALUES ('334', 'A', '0', '1', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('335', 'B', '0', '2', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('336', 'B', '0', '3', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('337', 'C', '0', '4', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('338', 'A', '1', '5', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('339', 'C', '0', '6', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('340', 'D', '0', '7', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('341', 'A', '0', '8', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('342', 'C', '0', '9', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('343', 'D', '0', '10', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('344', 'C', '0', '11', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('345', 'C', '0', '12', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('346', 'B', '1', '13', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('347', 'B', '1', '14', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('348', 'B', '0', '15', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('349', 'A', '0', '16', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('350', 'A', '1', '17', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('351', 'C', '1', '18', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('352', 'C', '0', '19', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('353', 'B', '1', '20', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('354', 'B', '0', '21', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('355', 'BCD', '1', '22', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('356', 'BCD', '1', '23', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('357', 'BCD', '0', '24', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('358', 'ACD', '1', '25', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('359', 'T', '1', '26', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('360', 'T', '1', '27', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('361', 'T', '1', '28', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('362', 'T', '1', '29', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('363', 'T', '0', '30', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('364', 'java ee', '1', '31', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('365', 'jdk', '1', '32', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('366', 'cmd', '1', '33', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('367', '', '0', '34', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('368', '', '0', '35', '1', '201521314304', '0');
INSERT INTO `student_paper_answer` VALUES ('369', 'A', '0', '1', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('370', 'B', '0', '2', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('371', 'B', '0', '3', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('372', 'C', '0', '4', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('373', 'B', '0', '5', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('374', 'A', '0', '6', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('375', 'A', '1', '7', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('376', 'C', '0', '8', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('377', 'C', '0', '9', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('378', 'A', '0', '10', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('379', 'A', '0', '11', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('380', 'A', '1', '12', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('381', 'C', '0', '13', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('382', 'A', '0', '14', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('383', 'C', '1', '15', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('384', '', '0', '16', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('385', null, '0', '17', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('386', null, '0', '18', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('387', null, '0', '19', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('388', null, '0', '20', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('389', 'BC', '0', '21', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('390', 'BCD', '1', '22', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('391', 'BCD', '1', '23', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('392', 'BCD', '0', '24', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('393', 'ACD', '1', '25', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('394', 'T', '1', '26', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('395', 'T', '1', '27', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('396', 'F', '0', '28', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('397', 'T', '1', '29', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('398', 'F', '1', '30', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('399', 'JAVA EE', '1', '31', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('400', 'JDK', '1', '32', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('401', 'CMD', '1', '33', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('402', '', '0', '34', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('403', '', '0', '35', '1', '201521314305', '0');
INSERT INTO `student_paper_answer` VALUES ('478', 'A', '0', '1', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('479', 'B', '0', '2', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('480', 'C', '1', '3', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('481', 'D', '0', '4', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('482', 'A', '1', '5', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('483', 'B', '0', '6', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('484', 'C', '0', '7', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('485', 'C', '0', '8', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('486', 'B', '0', '9', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('487', 'C', '0', '10', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('488', 'C', '0', '11', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('489', 'A', '1', '12', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('490', 'A', '0', '13', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('491', 'C', '0', '14', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('492', 'A', '0', '15', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('493', 'B', '1', '16', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('494', 'A', '1', '17', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('495', 'C', '1', '18', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('496', 'B', '0', '19', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('497', 'B', '1', '20', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('498', 'BCD', '0', '21', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('499', 'BCD', '1', '22', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('500', 'ACD', '0', '23', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('501', 'BCD', '0', '24', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('502', 'ACD', '1', '25', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('503', 'T', '1', '26', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('504', 'T', '1', '27', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('505', 'T', '1', '28', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('506', 'T', '1', '29', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('507', 'T', '0', '30', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('508', 'java ee', '1', '31', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('509', 'jdk', '1', '32', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('510', 'cmd', '1', '33', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('511', null, '0', '34', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('512', null, '0', '35', '1', '201521314318', '0');
INSERT INTO `student_paper_answer` VALUES ('539', 'A', '0', '36', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('540', 'B', '0', '37', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('541', 'C', '1', '38', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('542', 'D', '0', '39', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('543', 'A', '1', '40', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('544', 'B', '0', '41', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('545', 'BCD', '0', '42', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('546', 'BCD', '0', '43', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('547', 'A', '0', '44', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('548', 'T', '0', '45', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('549', 'T', '0', '46', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('550', 'java ee', '0', '47', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('551', '//', '1', '48', '2', '201521314701', '0');
INSERT INTO `student_paper_answer` VALUES ('552', 'B', '1', '36', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('553', 'C', '0', '37', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('554', 'D', '0', '38', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('555', 'B', '1', '39', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('556', 'A', '1', '40', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('557', 'B', '0', '41', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('558', 'BCD', '0', '42', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('559', 'BCD', '0', '43', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('560', 'BCD', '0', '44', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('561', 'T', '0', '45', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('562', 'T', '0', '46', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('563', '', '0', '47', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('564', '//', '1', '48', '2', '201521314301', '0');
INSERT INTO `student_paper_answer` VALUES ('565', 'B', '1', '36', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('566', 'B', '0', '37', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('567', 'A', '0', '38', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('568', 'B', '1', '39', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('569', 'A', '1', '40', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('570', 'D', '1', '41', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('571', 'BCD', '0', '42', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('572', 'BCD', '0', '43', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('573', 'ACD', '0', '44', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('574', 'T', '0', '45', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('575', 'F', '1', '46', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('576', '//', '0', '47', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('577', '//', '1', '48', '2', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('578', 'A', '0', '1', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('579', 'B', '0', '2', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('580', 'C', '1', '3', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('581', 'B', '1', '4', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('582', 'A', '1', '5', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('583', 'D', '1', '6', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('584', 'A', '1', '7', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('585', 'B', '1', '8', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('586', 'C', '0', '9', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('587', 'C', '0', '10', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('588', 'B', '1', '11', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('589', 'C', '0', '12', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('590', 'A', '0', '13', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('591', 'C', '0', '14', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('592', 'B', '0', '15', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('593', 'A', '0', '16', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('594', 'A', '1', '17', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('595', 'A', '0', '18', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('596', 'A', '1', '19', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('597', 'C', '0', '20', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('598', 'BCD', '0', '21', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('599', 'BCD', '1', '22', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('600', 'ACD', '0', '23', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('601', 'ACD', '1', '24', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('602', 'ACD', '1', '25', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('603', 'T', '1', '26', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('604', 'T', '1', '27', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('605', 'F', '0', '28', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('606', 'T', '1', '29', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('607', 'F', '1', '30', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('608', 'java ee', '1', '31', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('609', 'jdk', '1', '32', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('610', 'cmd', '1', '33', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('611', '', '0', '34', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('612', null, '0', '35', '1', '201521314700', '0');
INSERT INTO `student_paper_answer` VALUES ('613', 'A', '0', '36', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('614', 'B', '0', '37', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('615', 'C', '1', '38', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('616', 'B', '1', '39', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('617', 'A', '1', '40', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('618', 'D', '1', '41', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('619', 'BCD', '0', '42', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('620', 'BCD', '0', '43', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('621', 'ACD', '0', '44', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('622', 'T', '0', '45', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('623', 'T', '0', '46', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('624', '//', '0', '47', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('625', '//', '1', '48', '2', '201521314610', '0');
INSERT INTO `student_paper_answer` VALUES ('626', 'B', '1', '36', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('627', 'C', '0', '37', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('628', 'D', '0', '38', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('629', 'A', '0', '39', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('630', 'B', '0', '40', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('631', 'D', '1', '41', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('632', 'BCD', '0', '42', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('633', 'ABC', '1', '43', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('634', 'CD', '0', '44', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('635', 'T', '0', '45', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('636', 'T', '0', '46', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('637', '', '0', '47', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('638', null, '0', '48', '2', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('639', 'C', '0', '36', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('640', 'D', '1', '37', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('641', 'C', '1', '38', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('642', 'B', '1', '39', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('643', 'A', '1', '40', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('644', 'D', '1', '41', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('645', 'BCD', '0', '42', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('646', 'ABC', '1', '43', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('647', 'BCD', '0', '44', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('648', 'T', '0', '45', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('649', 'F', '1', '46', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('650', '', '0', '47', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('651', '', '0', '48', '2', '201521314310', '0');
INSERT INTO `student_paper_answer` VALUES ('658', 'A', '0', '65', '5', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('659', 'BCD', '0', '66', '5', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('660', 'T', '0', '67', '5', '201521314321', '0');
INSERT INTO `student_paper_answer` VALUES ('661', 'true', '1', '68', '5', '201521314321', '0');

-- ----------------------------
-- Table structure for `student_paper_score`
-- ----------------------------
DROP TABLE IF EXISTS `student_paper_score`;
CREATE TABLE `student_paper_score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生答卷分数id',
  `score` int(11) DEFAULT NULL COMMENT '学生答卷总分',
  `time_used` int(11) DEFAULT NULL COMMENT '答题花费时间，单位毫秒',
  `start_time` datetime DEFAULT NULL COMMENT '答题开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '答题结束时间',
  `sno` char(12) DEFAULT NULL COMMENT '学号',
  `paper_id` int(11) DEFAULT NULL COMMENT '试卷id',
  PRIMARY KEY (`score_id`),
  KEY `score_sno` (`sno`),
  KEY `score_paper_id` (`paper_id`),
  CONSTRAINT `score_paper_id` FOREIGN KEY (`paper_id`) REFERENCES `paper` (`paper_id`),
  CONSTRAINT `score_sno` FOREIGN KEY (`sno`) REFERENCES `student` (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_paper_score
-- ----------------------------
INSERT INTO `student_paper_score` VALUES ('2', '41', '113770', '2019-03-24 18:04:47', '2019-03-24 18:06:42', '201521314321', '1');
INSERT INTO `student_paper_score` VALUES ('3', '23', '74330', '2019-03-25 14:57:40', '2019-03-25 14:58:55', '201521314323', '1');
INSERT INTO `student_paper_score` VALUES ('4', '79', '117353', '2019-03-25 15:06:01', '2019-03-25 15:08:00', '201521314322', '1');
INSERT INTO `student_paper_score` VALUES ('7', '54', '76000', '2019-03-25 15:43:54', '2019-03-25 15:45:10', '201521314301', '1');
INSERT INTO `student_paper_score` VALUES ('10', '28', '38214', '2019-03-25 15:50:04', '2019-03-25 15:50:44', '201521314330', '1');
INSERT INTO `student_paper_score` VALUES ('12', '35', '42209', '2019-03-25 15:54:24', '2019-03-25 15:55:08', '201521314316', '1');
INSERT INTO `student_paper_score` VALUES ('22', '24', '28672', '2019-03-31 21:21:42', '2019-03-31 21:22:12', '201521314303', '1');
INSERT INTO `student_paper_score` VALUES ('23', '43', '80000', '2019-03-31 22:48:32', '2019-03-31 22:49:52', '201521314304', '1');
INSERT INTO `student_paper_score` VALUES ('24', '34', '63871', '2019-03-31 23:00:40', '2019-03-31 23:01:46', '201521314305', '1');
INSERT INTO `student_paper_score` VALUES ('29', '41', '76180', '2019-04-01 20:30:19', '2019-04-01 20:31:37', '201521314318', '1');
INSERT INTO `student_paper_score` VALUES ('32', '10', '34478', '2019-04-08 23:40:42', '2019-04-08 23:41:18', '201521314701', '2');
INSERT INTO `student_paper_score` VALUES ('33', '14', '30187', '2019-04-08 23:42:15', '2019-04-08 23:42:46', '201521314301', '2');
INSERT INTO `student_paper_score` VALUES ('34', '20', '41001', '2019-04-08 23:45:56', '2019-04-08 23:46:37', '201521314700', '2');
INSERT INTO `student_paper_score` VALUES ('35', '52', '92894', '2019-04-08 23:46:53', '2019-04-08 23:48:28', '201521314700', '1');
INSERT INTO `student_paper_score` VALUES ('36', '18', '28750', '2019-04-08 23:49:35', '2019-04-08 23:50:04', '201521314610', '2');
INSERT INTO `student_paper_score` VALUES ('37', '14', '36190', '2019-04-11 23:42:15', '2019-04-11 23:42:52', '201521314321', '2');
INSERT INTO `student_paper_score` VALUES ('39', '28', '34092', '2019-04-13 17:58:21', '2019-04-13 17:58:56', '201521314310', '2');
INSERT INTO `student_paper_score` VALUES ('41', null, null, '2019-04-13 18:08:37', null, '201521314310', '1');
INSERT INTO `student_paper_score` VALUES ('43', null, null, '2019-04-27 16:19:20', null, '201521314321', '3');
INSERT INTO `student_paper_score` VALUES ('44', '4', '20456', '2019-04-27 23:43:56', '2019-04-27 23:44:16', '201521314321', '5');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tno` char(6) NOT NULL COMMENT '教工号',
  `tea_psw` varchar(255) NOT NULL DEFAULT '123456' COMMENT '登录密码，默认为123456',
  `tea_name` varchar(255) NOT NULL COMMENT '教师姓名',
  `tea_sex` varchar(255) NOT NULL DEFAULT '男' COMMENT '教师性别',
  `tea_email` varchar(255) DEFAULT NULL COMMENT '教师邮箱',
  `tea_phone` char(11) DEFAULT NULL COMMENT '教师手机号码',
  `tea_last_login_time` datetime DEFAULT NULL COMMENT '教师最近登录时间',
  PRIMARY KEY (`tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('100000', '123456', '杨老师', '男', '123456@qq.com', '13524569875', null);
INSERT INTO `teacher` VALUES ('100001', '123456', '高老师', '男', '123456@qq.com', '13658426951', null);
INSERT INTO `teacher` VALUES ('100100', '123456', '侯老师', '男', '123456@qq.com', '13658245962', null);
INSERT INTO `teacher` VALUES ('100860', '123456', '王老师', '男', '123456@qq.com', '13254859621', null);
INSERT INTO `teacher` VALUES ('123456', '123456', '胡老师', '男', '123456@qq.com', '13229622789', '2019-05-07 16:38:13');
INSERT INTO `teacher` VALUES ('654321', '123456', '鸡你太美', '女', null, null, null);

-- ----------------------------
-- Table structure for `teacher_notice`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_notice`;
CREATE TABLE `teacher_notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教师公告id',
  `notice_content` varchar(255) NOT NULL COMMENT '公告内容',
  `notice_create_time` datetime DEFAULT NULL COMMENT '公告创建时间',
  `tea_name` varchar(255) DEFAULT NULL COMMENT '创建公告的教师姓名',
  `tno` char(6) DEFAULT NULL COMMENT '创建公告教工号',
  `sno` char(12) DEFAULT NULL COMMENT '学号',
  `is_see` varchar(255) DEFAULT NULL COMMENT '是否查看',
  PRIMARY KEY (`notice_id`),
  KEY `notice_tno` (`tno`),
  KEY `notice_sno` (`sno`),
  CONSTRAINT `notice_sno` FOREIGN KEY (`sno`) REFERENCES `student` (`sno`),
  CONSTRAINT `notice_tno` FOREIGN KEY (`tno`) REFERENCES `teacher` (`tno`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_notice
-- ----------------------------
INSERT INTO `teacher_notice` VALUES ('1', '2019年3月1号下午两点到四点将会有一场计算机图形学在线考试，请同学们做好相关考试准备。', '2019-03-13 19:43:07', '胡老师', '123456', null, null);
INSERT INTO `teacher_notice` VALUES ('2', '2019年3月2号下午两点到四点将会有一场Java语言程序设计在线考试，请同学们做好相关考试准备。', '2019-03-13 19:43:23', '高老师', '100001', null, null);
INSERT INTO `teacher_notice` VALUES ('3', '2019年3月3号下午两点到四点将会有一场数据库原理与设计在线考试，请同学们做好相关考试准备。', '2019-03-13 19:43:41', '杨老师', '100000', null, null);
INSERT INTO `teacher_notice` VALUES ('4', '2019年3月4号下午两点到四点将会有一场C++语言程序设计在线考试，请同学们做好相关考试准备。', '2019-03-13 19:43:55', '杨老师', '100000', null, null);
INSERT INTO `teacher_notice` VALUES ('5', '2019年3月5号下午两点到四点将会有一场Web程序设计在线考试，请同学们做好相关考试准备。', '2019-03-13 19:45:03', '侯老师', '100100', null, null);
INSERT INTO `teacher_notice` VALUES ('6', '2019年3月6号下午两点到四点将会有一场Android程序设计在线考试，请同学们做好相关考试准备。', '2019-03-13 19:45:09', '侯老师', '100100', null, null);
INSERT INTO `teacher_notice` VALUES ('7', '2019年3月7号下午两点到四点将会有一场计算机网络编程在线考试，请同学们做好相关考试准备。', '2019-03-13 19:45:19', '王老师', '100860', null, null);
INSERT INTO `teacher_notice` VALUES ('8', '2019年3月8号下午两点到四点将会有一场PHP语言程序设计在线考试，请同学们做好相关考试准备。', '2019-03-13 19:45:36', '侯老师', '100100', null, null);
INSERT INTO `teacher_notice` VALUES ('9', '2019年3月9号下午两点到四点将会有一场Ruby语言程序设计在线考试，请同学们做好相关考试准备。', '2019-03-14 16:38:08', '高老师', '100001', null, null);
INSERT INTO `teacher_notice` VALUES ('10', '2019年3月10号下午两点到四点将会有一场JavaScript语言程序设计在线考试，请同学们做好相关考试准备。', '2019-03-14 16:40:00', '侯老师', '100100', null, null);
INSERT INTO `teacher_notice` VALUES ('15', '2019年3月11号下午两点到四点将会有一场计算机图形学在线考试，请同学们做好相关考试准备。', '2019-04-11 17:49:28', '胡老师', '123456', null, null);
INSERT INTO `teacher_notice` VALUES ('16', '2019年3月12号下午两点到四点将会有一场计算机图形学在线考试，请同学们做好相关考试准备。', '2019-04-11 17:49:45', '胡老师', '123456', null, null);
INSERT INTO `teacher_notice` VALUES ('37', '2019年4月22号下午两点到四点将会有一场计算机图形学在线考试，请同学们做好相关考试准备。', '2019-04-22 18:44:29', '胡老师', '123456', null, null);
INSERT INTO `teacher_notice` VALUES ('39', '2019年4月23号下午两点到四点将会有一场计算机图形学在线考试，请同学们做好相关考试准备。', '2019-04-22 19:40:09', '胡老师', '123456', null, null);
INSERT INTO `teacher_notice` VALUES ('42', '2019年4月25号下午两点到四点将会有一场前端测试在线考试，请同学们做好相关考试准备。', '2019-04-25 18:00:28', '胡老师', '123456', null, null);
INSERT INTO `teacher_notice` VALUES ('47', '2019年5月7号下午两点到四点将会有一场前端测试在线考试，请同学们做好相关考试准备。', '2019-05-07 16:48:26', '胡老师', '123456', null, null);
