package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// 외부 프로퍼티 파일(mysql.properties)을 읽어와서 사용하도록 설정합니다.
@PropertySource(value = "classpath:/kr/co/greenart/config/mysql.properties")
// Mapper 인터페이스의 패키지를 스캔하여 MyBatis 매퍼로 등록합니다.
@MapperScan(basePackages = "kr.co.greenart")
// 트랜잭션 관리 기능을 활성화합니다.
@EnableTransactionManagement
public class RootConfig {
	// mysql.properties 파일에서 데이터베이스 연결에 필요한 값들을 주입받습니다.
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.driverClassName}")
	private String driverClassName;
	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;

	// 데이터베이스 연결을 위한 DataSource 객체를 생성합니다.
	@Bean
	public DataSource dateSource() {
		// Apache Commons DBCP2의 BasicDataSource를 사용하여 커넥션 풀을 관리합니다.
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(url);  // 데이터베이스 URL 설정
		dataSource.setDriverClassName(driverClassName);  // JDBC 드라이버 클래스 설정
		dataSource.setUsername(username);  // 데이터베이스 사용자명 설정
		dataSource.setPassword(password);  // 데이터베이스 비밀번호 설정
		
		return dataSource;
	}
	
	// 트랜잭션 관리를 위한 TransactionManager를 생성합니다.
	@Bean
	public TransactionManager transactionManager(@Autowired DataSource dataSource) {
		// DataSourceTransactionManager를 사용하여 트랜잭션을 관리합니다.
		return new DataSourceTransactionManager(dataSource);
	}
	
	// MyBatis의 SqlSessionFactory를 설정하고 반환합니다.
	@Bean
	public SqlSessionFactory sqlSessionFactory(@Autowired DataSource dataSource) throws Exception {
		// SqlSessionFactoryBean을 사용하여 SqlSessionFactory를 생성합니다.
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);  // 데이터 소스를 설정합니다.
		
		// SqlSessionFactory 객체를 반환합니다.
		return factory.getObject();
	}
}
