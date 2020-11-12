/*
 Navicat Premium Data Transfer

 Source Server         : ShuShun
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : sue-blog

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 11/11/2020 23:27:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `title` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文章标题',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文章内容',
  `created_time` timestamp(0) NOT NULL COMMENT '文章创建时间',
  `update_time` timestamp(0) NOT NULL COMMENT '文章更新时间',
  `delete_time` timestamp(0) NULL DEFAULT NULL COMMENT '文章删除时间',
  `is_show` int(11) NOT NULL COMMENT '文章是否显示',
  `category_id` int(11) NOT NULL COMMENT '文章分类id',
  `author_id` int(11) NOT NULL COMMENT '作者id',
  `comment_counts` int(11) NOT NULL COMMENT '文章评论总数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (36, '🔥关于探索', '![RUNOOB 图标](https://shushun.oss-cn-shenzhen.aliyuncs.com/banner-img/001.jpg)\n> 一切的源泉 源于不断寻求的心\n> ```\n> cout << \"一日之际在于晨\"<<endl;\n> ```\n\n# 探索小故事\n\n##  齐白石\n我国国画大师齐白石，坚持每日作画，除身体不适外，从不间断。85岁那 年，一天他一连作画四幅后，又特为昨天补画一幅，并题字道：“昨日大风雨，心绪 不宁，不曾作画，今朝制此补之，不教一日闲也。”\n## 鲁迅\n鲁迅先生从小认真学习。少年时，在江南水师学堂读书，第一学期成绩优异，学校奖给他一枚金质奖章。他立即拿到南京鼓楼街头卖掉，然后买了几本书，又买了一串红辣椒。每当晚上寒冷时，夜读难耐，他便摘下一颗辣椒，放在嘴里嚼着，直辣得额头冒汗。他就用这种办法驱寒坚持读书。由于苦读书，后来终于成为我国著名的文学家。\n\n', '2020-11-09 23:00:28', '2020-11-09 23:00:28', NULL, 1, 1, 1, 0);
INSERT INTO `article` VALUES (38, '☕JAVA-JDK', '# ☕JDK 1.8\n## 安装简介\n> 安装环境:CentOS 7\n- 🚬下载\n- 📦解压\n- 🛠配置\n- ⚗测试\n# 🚬下载JDK1.8\n ###  📞官方提供:[JDK1.8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)\n ###  🤝作者提供:[JDK1.8](https://shushun.oss-cn-shenzhen.aliyuncs.com/software/jdk-8u191-linux-x64.tar.gz)\n# 📦解压   \n    mkdir /usr/java\n    tar -zxvf /home/software/jdk-8u191-linux-x64.tar.gz -C /usr/java/\n# 🛠配置环境变量\n    ✏vim /etc/profile/ (在unset -f pathmunge下方空白处添加以下配置)\n        export JAVA_HOME=/usr/java/jdk1.8.0_191\n        export CLASSPATH=.:%JAVA_HOME%/lib/dt.jar:%JAVA_HOME%/lib/tools.jar  \n        export PATH=$PATH:$JAVA_HOME/bin\n    ☕刷新配置文件:\n        source /etc/profile\n# ⚗测试\n    java -version\n# 🌈成功\n    java version \"1.8.0_191\"\n    Java(TM) SE Runtime Environment (build 1.8.0_191-b12)\n    Java HotSpot(TM) 64-Bit Server VM (build 25.191-b12, mixed mode)\n\n', '2020-11-11 23:02:50', '2020-11-11 23:02:50', NULL, 1, 2, 1, 0);
INSERT INTO `article` VALUES (39, '🐱TomcatConfig', '# 🐱Tomcat9.0.33\n## 安装简介\n> 安装环境:CentOS 7\n- 🚬下载\n- 📦解压\n- ⚗测试\n# 🚬下载Tomcat9.0.33\n ###  📞官方提供:[tomcat9.0.33](https://archive.apache.org/dist/tomcat/tomcat-9)\n ###  🤝作者提供:[tomcat9.0.33](https://shushun.oss-cn-shenzhen.aliyuncs.com/software/apache-tomcat-9.0.33.tar.gz)\n# 📦解压   \n    tar -zxvf /home/software/apache-tomcat-9.0.33.tar.gz -C /usr/local/\n# ⚗测试\n    cd /apache-9.0.33/bin\n    ./startup.sh\n# 🌈成功\n    http://localhost:8080\n   ![avatar](https://shushun.oss-cn-shenzhen.aliyuncs.com/QQ%E6%88%AA%E5%9B%BE20200811120057.png)\n        \n', '2020-11-11 23:04:07', '2020-11-11 23:04:07', NULL, 1, 16, 1, 0);
INSERT INTO `article` VALUES (40, '🍃SpringBootWarFileConfig', '# 🍃SpringBootWarFileConfig\n## 配置简介\n- ⚒依赖配置\n- 🍖War包类添加\n# ⚒依赖配置\n    📁添加:\n        <packaging>war</packageing>\n        <dependency>\n                    <groupId>javax.servlet</groupId>\n                    <artifactId>javax.servlet-api</artifactId>\n                    <scope>provided</scope>\n        </dependency>\n    🗑排除:\n        <dependency>\n                   <groupId>org.springframework.boot</groupId>\n                   <artifactId>spring-boot-starter-web</artifactId>\n                   <exclusions>\n                         <exclusion>\n                               <groupId>org.sprinframework.boot</groupId>\n                               <artifactId>org-springframework-starter-tomcat</artifactId>\n                         </exclusion>\n                   </exclusions>\n        </dependency>\n# 🍖War包类添加\n    public class WarStarterApplication extends SpringBootServletInitializer {\n                @Override\n                protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {\n                    //指向Application启动类\n                    return builder.sources(Application.class);\n                }\n    }', '2020-11-11 23:05:16', '2020-11-11 23:05:16', NULL, 1, 1, 1, 0);
INSERT INTO `article` VALUES (41, '🌳NginxConfig', '# 🌳Nginx1.8.10\n## 安装简介\n> 安装环境:CentOS 7\n- 🚬下载\n- 🥩环境准备\n- 📦解压\n- ⚒编译准备\n- ⚙编译\n- ⚗测试\n# 🚬下载Nginx1.8.10\n ###  📞官方提供:[nginx1.8.10](http://nginx.org/en/download.html)\n ###  🤝作者提供:[nginx1.8.10](https://shushun.oss-cn-shenzhen.aliyuncs.com/software/nginx-1.18.0.tar.gz)\n# 🥩环境准备   \n    💿安装gcc环境:  yum install gcc-c++\n    💿安装PCRE库,用于解析正则表达式:yum install -y pcre pcre-devel\n    💿安装zlib库和解压缩依赖:yum install -y zlib zlib-devel\n    💿安装SSL安全加密套接字的协议层，用于http安全传输，也就是https: yum install -y openssl openssl-devel\n# 📦解压\n    tar -zxvf nginx-1.8.10.tar.gz -C /usr/local/\n# ⚒编译准备\n    📁首先创建nginx临时目录:mkdir /var/temp/nginx -p\n    ⚙在nginx目录下编译(直接在命令行输入如下指得到makefile):\n                           ./configure \\\n                           --prefix=/usr/local/nginx \\\n                           --conf-path=/usr/local/nginx/conf/nginx.conf \\\n                           --pid-path=/var/run/nginx/nginx.pid \\\n                           --lock-path=/var/lock/nginx.lock \\\n                           --error-log-path=/var/log/nginx/error.log \\\n                           --http-log-path=/var/log/nginx/access.log \\\n                           --with-http_gzip_static_module \\\n                           --http-client-body-temp-path=/var/temp/nginx/client \\\n                           --http-proxy-temp-path=/var/temp/nginx/proxy \\\n                           --http-fastcgi-temp-path=/var/temp/nginx/fastcgi \\\n                           --http-uwsgi-temp-path=/var/temp/nginx/uwsgi \\\n                           --http-scgi-temp-path=/var/temp/nginx/scgizoo_sample.cfg \\\n                           --with-http_ssl_module\n    😊命令解释:\n           –prefix	指定nginx安装目录\n           –pid-path	指向nginx的pid\n           –lock-path	锁定安装文件，防止被恶意篡改或误操作\n           –error-log	错误日志\n           –http-log-path	http日志\n           –with-http_gzip_static_module	启用gzip模块，在线实时压缩输出数据流\n           –http-client-body-temp-path	设定客户端请求的临时目录\n           –http-proxy-temp-path	设定http代理临时目录\n           –http-fastcgi-temp-path	设定fastcgi临时目录\n           –http-uwsgi-temp-path	设定uwsgi临时目录\n           –http-scgi-temp-path	设定scgi临时目录\n# ⚙编译\n    make\n    make insatll\n# ⚗测试\n    cd /usr/local/nginx/sbin\n    启动./nginx \n# 🌈成功\n   ![avatar](https://shushun.oss-cn-shenzhen.aliyuncs.com/QQ%E6%88%AA%E5%9B%BE20200811122920.png)\n        \n', '2020-11-11 23:05:40', '2020-11-11 23:05:40', NULL, 1, 8, 1, 0);
INSERT INTO `article` VALUES (42, '🐰RabbitMQ', '# 🐰RabbitMQ 3.6.5\n## 🧭安装简介\n> ### 安装环境:CentOS 7\n> ##### 🚬下载相关组件\n> ##### 🎬环境准备\n> ##### 💿安装组件\n> ##### ⚙配置\n> ##### 💿安装管理插件\n> ##### ⚗测试\n# 🚬下载🐰RabbitMQ 3.6.5\n ###  🤝作者提供:[RabbitMQ 3.6.5](https://www.shushunstudio.com/software/RabbitMQ3.6.5.zip)\n# 🎬环境准备\n    修改三台计算机节点的 /etc/hosts和/etc/hostname\n    vim /etc/hosts (节点1为例)                   \n        192.168.182.150 sue1 (节点1自己)        \n        192.168.182.151 sue2 (节点2)          | 节点1 192.168.182.150\n        192.168.182.152 sue3 (节点3)\n    vim /etc/hostname(节点1为例)\n        sue1\n    ----------------------------------------    \n    vim /etc/hosts (节点2为例)\n            192.168.182.150 sue1 (节点1)\n            192.168.182.151 sue2 (节点2自己)  | 节点2 192.168.182.151\n            192.168.182.152 sue3 (节点3)\n    vim /etc/hostname(节点2为例)\n        sue2\n     ----------------------------------------      \n    vim /etc/hosts (节点3为例)\n            192.168.182.150 sue1 (节点1)\n            192.168.182.151 sue2 (节点2)      | 节点3 192.168.182.152\n            192.168.182.152 sue3 (节点3自己)\n    vim /etc/hostname(节点3为例)\n        sue3\n        \n    下载基础软件包  \n    yum install build-essential openssl openssl-devel unixODBC unixODBC-devel make gcc gcc-c++ kernel-devel m4 ncurses-devel tk tc xz\n# 💿安装组件\n    rpm -ivh erlang-18.3-1.el7.centos.x86_64.rpm \n    rpm -ivh socat-1.7.3.2-1.1.el7.x86_64.rpm --force --nodeps\n    rpm -ivh rabbitmq-server-3.6.5-1.noarch.rpm\n# ⚙配置\n    修改用户登录与连接心跳检测，注意修改\n    vim /usr/lib/rabbitmq/lib/rabbitmq_server-3.6.5/ebin/rabbit.app\n    修改点1：loopback_users 中的 <<\"guest\">>,只保留guest （用于用户登录）\n    修改点2：heartbeat 为10（用于心跳连接）\n\n# 💿安装管理插件\n    首先启动\n    /etc/init.d/rabbitmq-server start\n    启用管理插件\n    rabbitmq-plugins enable rabbitmq_management\n    查看是否启动\n    lsof -i:15672 或者 netstat -tnlp | grep 15672\n# ⚗测试\n    http://ip:15672\n# 🌈成功\n   ![avatar](http://www.shushunstudio.com/success-image/QQ%E6%88%AA%E5%9B%BE20200814182108.png)\n\n# 🌾RabbitMQ镜像集群搭建\n  ### 💡文件同步\n        PS:选择150、151、152任意一个节点为Master（这里选择150为Master），\n        也就是说我们需要把150的Cookie文件同步到151、152节点上去，\n        进入/var/lib/rabbitmq目录下，\n    \n        //进入目录修改权限；远程copy77、78节点\n        scp /var/lib/rabbitmq/.erlang.cookie 192.168.11.77:/var/lib/rabbitmq/\n        scp /var/lib/rabbitmq/.erlang.cookie 192.168.11.78:/var/lib/rabbitmq/\n  ### 💡停止MQ服务\n        停止三个节点MQ服务\n        rabbitmqctl stop\n  ### 💡组成集群操作\n        PS:接下来我们就可以使用集群命令，配置76、77、78为集群模式，3个节点（76、77、78）执行启动命令，后续启动集群使用此命令即可。\n        \n        rabbitmq-server -detached\n  ### 💡slave加入集群操作（重新加入集群也是如此，以最开始的主节点为加入节点）\n        从节点1：rabbitmqctl stop_app\n        从节点1：rabbitmqctl join_cluster --ram rabbit@主节点(76)\n        从节点1：rabbitmqctl start_app\n        从节点2：rabbitmqctl stop_app\n        从节点2：rabbitmqctl join_cluster rabbit@主节点(76)\n        从节点2：rabbitmqctl start_app\n        \n        另外:其他节点上操作要移除的集群节点\n        rabbitmqctl forget_cluster_node rabbit@(移除的节点hostname)\n  ### 💡修改集群名称(任意节点都可以修改)\n        rabbitmqctl set_cluster_name rabbitmq_cluster1\n  ### 💡查看集群状态(任意节点都可以查看)\n        rabbitmqctl cluster_status\n  ### 🍹配置镜像队列(任意一个节点上执行)\n        rabbitmqctl set_policy ha-all \"^\" \'{\"ha-mode\":\"all\"}\'\n  # 🗿成功\n   ## 进入控制台能看到如下:\n   ### ![avatar](http://www.shushunstudio.com/success-image/QQ%E6%88%AA%E5%9B%BE20200815124516.png)\n   ## 创建新队列测试会看到如下:\n   ### ![avatar](http://www.shushunstudio.com/success-image/QQ%E5%9B%BE%E7%89%8720200815124500.png)', '2020-11-11 23:06:56', '2020-11-11 23:06:56', NULL, 1, 5, 1, 0);

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `category_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '分类名字',
  `category_img` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'SpringBoot', '🏅');
INSERT INTO `category` VALUES (2, 'Java', '☕');
INSERT INTO `category` VALUES (3, 'MySql', '🍣');
INSERT INTO `category` VALUES (4, 'Redis', '🌮');
INSERT INTO `category` VALUES (5, 'RabbitMQ', '🍨');
INSERT INTO `category` VALUES (6, 'TypeScript', '🥧');
INSERT INTO `category` VALUES (7, 'SpringCloud', '🍦');
INSERT INTO `category` VALUES (8, 'Nginx', '🌲');
INSERT INTO `category` VALUES (9, 'JavaScript', '🍬');
INSERT INTO `category` VALUES (16, 'Tomcat', '🐱');

-- ----------------------------
-- Table structure for dynamic
-- ----------------------------
DROP TABLE IF EXISTS `dynamic`;
CREATE TABLE `dynamic`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '动态id',
  `content` varchar(5289) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '动态内容',
  `dy_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '动态内容里的图片',
  `dy_video` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '动态内容里的视频',
  `is_show` tinyint(1) NOT NULL DEFAULT 1 COMMENT '动态是否显示',
  `uid` int(11) NOT NULL COMMENT '发布动态的用户id',
  `mood` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '发送动态时的心情',
  `created_time` timestamp(0) NOT NULL COMMENT '动态创建时间',
  `updated_time` timestamp(0) NOT NULL COMMENT '动态更新时间',
  `deleted_time` timestamp(0) NULL DEFAULT NULL COMMENT '动态删除时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dynamic
-- ----------------------------
INSERT INTO `dynamic` VALUES (28, 'SUE-BLOG-CMS越来越壮大了', NULL, NULL, 1, 1, '😂', '2020-11-05 21:10:03', '2020-11-05 21:10:03', NULL);
INSERT INTO `dynamic` VALUES (29, '对于设计我们追求简洁', NULL, NULL, 1, 1, '😂', '2020-11-05 21:21:28', '2020-11-05 21:21:28', NULL);
INSERT INTO `dynamic` VALUES (30, '今天要更努力！！！！！！！', NULL, NULL, 1, 1, '😊', '2020-11-06 12:12:46', '2020-11-06 12:13:30', NULL);
INSERT INTO `dynamic` VALUES (31, '🐖', NULL, NULL, 1, 1, '😂', '2020-11-09 14:30:07', '2020-11-09 14:30:07', NULL);
INSERT INTO `dynamic` VALUES (32, '完成了分类管理设计', NULL, NULL, 1, 1, '😂', '2020-11-09 19:56:07', '2020-11-10 19:50:42', NULL);
INSERT INTO `dynamic` VALUES (33, '完成了分类业务对接', NULL, NULL, 1, 1, '😊', '2020-11-11 16:53:52', '2020-11-11 16:53:52', NULL);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言ID',
  `is_show` tinyint(1) NOT NULL COMMENT '留言是否可见',
  `content` varchar(320) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '留言内容',
  `created_time` datetime(0) NOT NULL COMMENT '留言时间',
  `deleted_time` datetime(0) NULL DEFAULT NULL COMMENT '留言删除时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, 1, '地方萨芬', '2020-11-11 19:51:30', NULL);
INSERT INTO `message` VALUES (2, 1, '12312313', '2020-11-11 19:55:54', NULL);

-- ----------------------------
-- Table structure for readme
-- ----------------------------
DROP TABLE IF EXISTS `readme`;
CREATE TABLE `readme`  (
  `id` int(11) NOT NULL,
  `content` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of readme
-- ----------------------------
INSERT INTO `readme` VALUES (1, '我是舒顺');

SET FOREIGN_KEY_CHECKS = 1;
