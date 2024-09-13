package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
	private int no;
	private String production;
	private String category;
	private int price;
	
}
