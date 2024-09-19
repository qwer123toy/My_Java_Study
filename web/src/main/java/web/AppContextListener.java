package web;

import java.sql.Connection; // 데이터베이스와의 연결을 나타내는 인터페이스
import java.sql.SQLException; // SQL 처리 중 발생할 수 있는 예외

import javax.servlet.ServletContextEvent; // 서블릿 컨텍스트의 생명 주기 이벤트를 처리하기 위한 클래스
import javax.servlet.ServletContextListener; // 서블릿 컨텍스트의 초기화 및 종료를 감지하는 리스너 인터페이스
import javax.sql.DataSource; // 데이터베이스 연결 풀을 관리하기 위한 DataSource 인터페이스

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory; // Apache Commons DBCP에서 제공하는 데이터베이스 연결 풀을 구현하는 클래스
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import web.coffee.CoffeeDynamicMapper;
import web.coffee.CoffeeMapper;
import web.user.UserDynamicMapper;

// 웹 애플리케이션 시작과 종료 시 특정 작업을 수행하는 리스너 클래스
public class AppContextListener implements ServletContextListener {

	// static으로 선언된 DataSource 객체. 이 클래스에서 사용할 데이터 소스가 저장됨.
	private static DataSource dataSource;

	// MyBatis의 SqlSessionFactory 객체. SQL 세션을 관리하기 위한 팩토리 객체.
	private static SqlSessionFactory sessionFactory;

	// 애플리케이션 초기화 시 호출되는 메서드
	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// 데이터 소스를 초기화하는 메서드 호출
		initDataSource();

		// SqlSessionFactory를 초기화하는 메서드 호출
		initSqlSessionFactory();
	}

	// 외울 필요 없음(홈페이지에 사용법 존재)
	// SqlSessionFactory를 초기화하는 메서드
	private void initSqlSessionFactory() {
		// 트랜잭션 관리를 위한 JdbcTransactionFactory 객체 생성
		TransactionFactory transactionFactory = new JdbcTransactionFactory();

		// 환경 설정을 위한 Environment 객체 생성 (개발 환경: "dev", 트랜잭션 팩토리 및 데이터 소스 전달)
		Environment environment = new Environment("dev", transactionFactory, dataSource);

		// MyBatis의 설정(Configuration) 객체 생성 및 환경 설정 추가
		Configuration configuration = new Configuration(environment);
		
		configuration.addMapper(CoffeeMapper.class);
		configuration.addMapper(CoffeeDynamicMapper.class);
		configuration.addMapper(UserDynamicMapper.class);

		// SqlSessionFactoryBuilder를 사용하여 SqlSessionFactory 객체 생성
		sessionFactory = new SqlSessionFactoryBuilder().build(configuration);
	}

	private void initDataSource() {
		// Apache DBCP의 BasicDataSource 객체 생성 및 데이터베이스 연결 설정
		BasicDataSource dataSource = new BasicDataSource();

		// MySQL JDBC 드라이버를 사용하도록 드라이버 클래스 이름을 설정
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

		// MySQL 데이터베이스에 연결할 URL 설정
		dataSource.setUrl("jdbc:mysql://localhost:3306/my_db");

		// 데이터베이스 사용자 이름 설정
		dataSource.setUsername("root");

		// 데이터베이스 비밀번호 설정
		dataSource.setPassword("root");

		// 최대 활성 연결 수 설정 (최대 10개의 연결을 가질 수 있음)
		dataSource.setMaxTotal(10);

		// 초기 연결 풀의 크기 설정 (처음 5개의 연결을 생성)
		dataSource.setInitialSize(5);

		// 연결 풀에서 유지할 최소 유휴 연결 수 설정 (필요시 0개까지 줄일 수 있음)
		dataSource.setMinIdle(0);

		// 연결 풀에서 유지할 최대 유휴 연결 수 설정 (최대 10개의 유휴 연결을 유지)
		dataSource.setMaxIdle(10);

		// static 필드에 데이터 소스 객체를 저장하여 다른 클래스에서 참조 가능하게 설정
		AppContextListener.dataSource = dataSource;
	}

	// 데이터베이스 연결을 가져오는 메서드
	public static Connection getcoConnection() throws SQLException {
		// 데이터 소스에서 데이터베이스 연결을 반환
		return dataSource.getConnection();
	}

	public static SqlSession getSqlSession() {
		return sessionFactory.openSession();
	}
}
