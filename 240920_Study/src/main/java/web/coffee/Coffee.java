package web.coffee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Coffee {
	private int coffeeId;
	private String coffeeName;
	private int coffeePrice;
	private String userId;
	
}
