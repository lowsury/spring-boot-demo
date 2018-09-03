spring-boot 服务端：
######### 初始化脚本：
doc/testDbInit.sql
######### demo-user-service
启动: 1.mvn install 
		java -jar demo-user-service-0.0.1-SNAPSHOT.jar
	  2.mvn spring-boot:run
访问：http://127.0.0.1:8081/info
	 get请求页面显示以下内容，代表启动成功	
	 { }
######### demo-war-portal
启动: 1.mvn install 
		java -jar demo-war-portal-0.0.1-SNAPSHOT.jar
	  2.mvn spring-boot:run
访问：http://127.0.0.1:8081/info
	 get请求页面显示以下内容，代表启动成功	
	 { }
测试功能：http://127.0.0.1:8000/v0/user/query/1
	get请求页面显示以下内容，代表集成成功	
	<ActionResponse>
		<code>0</code>
		<message/>
		<data>
			<id>1</id>
			<name>兴爷</name>
		</data>
	</ActionResponse>
	
调用路线：浏览器————>demo-war-portal--->cloud-eureka-server————>demo-user-service