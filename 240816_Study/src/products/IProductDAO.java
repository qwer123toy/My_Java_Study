package products;

import java.util.List;

// 240816 수업

// interface
// 내용을 쉽게 찾을 수 있는 목차 개념
// 소통의 수단
// 인터페이스를 구현하는 클래스에는 오버라이드 꼭 해야함

// DAO : Data Access Object
public interface IProductDAO {
	// 모든 행 조회
	List<Product> selectAll();
	
	// pk로 검색
	Product findByPK(int no);
	
	// 제조사로 검색
	List<Product> findByProduction(String production);
	
	// 가격 범위로 검색
	List<Product> findByPriceRange(int start, int end);
	
	// 카테고리 목록 중 일치하는 행 검색
	List<Product> findByCategories(List<String> categories);
	
	// 가격의 내림차순으로 제한된 행 조회하기
	List<Product> orderByPriceDesc(int limit, int offset);
	
	// 행 추가하기 : 추가된 행의 개수 반환
	int insert(Product p);
	int insert(String production, String category, int price);
	
	// 행 수정하기 : 변경된 행의 개수 반환
	int update(Product p);
	int update(int no, String production, String category, int price);
	
	// 행 삭제하기 : 삭제된 행의 개수 반환
	int delete(int no);
}