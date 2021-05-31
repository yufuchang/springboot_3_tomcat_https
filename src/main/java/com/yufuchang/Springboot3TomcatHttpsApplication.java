package com.yufuchang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot3TomcatHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3TomcatHttpsApplication.class, args);

		/**
		 * 证书生成命令示例
		 * keytool -genkey -alias tomcathttps -keyalg RSA -keysize 2048 -keystore yufuchang.p12 -validity 365
		 *
		 * -genkey：表示要创建一个新的密钥
		 * -alias：表示 keystore 的别名
		 * -keyalg：表示使用的加密算法是 RSA（一种非对称加密算法）
		 * -keysize：表示密钥的长度
		 * -keystore：表示生成的密钥存放位置
		 * -validity：表示密钥的有效时间（单位为天）
		 */

		/**
		 *  在application.properties里配置
		 *  server.ssl.key-store=yufuchang.p12
		 *  server.ssl.key-alias=tomcathttps
		 *  server.ssl.key-store-password=123456
		 */
	}

}
