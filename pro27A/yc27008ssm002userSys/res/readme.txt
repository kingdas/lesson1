ssm:
web.xml
	<!-- 用参数方式配置spring配置文件位置 -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-mybatis.xml</param-value>
	</context-param>

	<!-- 监听器 :容器启动时，加载 spring（IOC） -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
spring-mybatis.xml
	<!-- 数据源 -->
	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/db_gw" />
		<property name="username" value="root" />
		<property name="password" value="root" />
	</bean>
	<!-- session工厂 -->
	<bean id="sessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="mapperLocations" value="classpath*:com/yc/userSys/dao/*.xml" />
	</bean>
	<!-- 动态生成DAO实现“类” -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.yc.userSys.dao" />
		<property name="sqlSessionFactoryBeanName" value="sessionFactory" />
	</bean>
------------------
ContextLoaderListener:context-param<->contextConfigLocation(classpath:spring-mybatis.xml)
BasicDataSource:driverClassName
SqlSessionFactoryBean:mapperLocations(classpath*:com/yc/userSys/dao/*.xml)
MapperScannerConfigurer:basePackage(com.yc.userSys.dao);sqlSessionFactoryBeanName
------------------
















