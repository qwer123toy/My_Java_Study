import java.util.ArrayList;
import java.util.List;

import products.IProductDAO;
import products.Product;
import products.ProductDAOImpl;

// 240816 수업

public class TestProducts {
	public static void main(String[] args) {
		IProductDAO dao = new ProductDAOImpl();
		
		// 모든 행 조회
//		List<Product> list = dao.selectAll();
//		System.out.println(list);
		
		// pk로 검색
//		Product product = dao.findByPK(3);
//		System.out.println(product);
		
		// 제조사로 검색
//		List<Product> list = dao.findByProduction("애플");
//		System.out.println(list);
		
		// 가격 범위로 검색
//		List<Product> list = dao.findByPriceRange(100, 130);
//		System.out.println(list);
		
		// 카테고리 목록 중 일치하는 행 검색
		List<String> list = new ArrayList<>();
		
		list.add("스마트폰");
		list.add("노트북");
		
		List<Product> findByCategories = dao.findByCategories(list);
		System.out.println(findByCategories);
		
		// 가격의 내림차순으로 제한된 행 조회하기
//		List<Product> list = dao.orderByPriceDesc(6, 2);
//		System.out.println(list);
		
		// 행 추가하기 1 : 추가된 행의 개수 반환
		
		// 행 추가하기 2 : 추가된 행의 개수 반환
//		int insert = dao.insert("LG", "스마트폰", 300);
//		System.out.println(insert);
		
		// 행 수정하기 1
		
		// 행 수정하기 2
//		int update = dao.update(2, "삼성", "스마트폰", 100);
//		System.out.println(update);
		
		// 행 삭제하기 : 삭제된 행의 개수 반환
//		int delete = dao.delete(13);
//		System.out.println(delete);
	}
}