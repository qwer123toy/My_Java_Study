package member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subscribe {
	private int no;
	private int memberId;
	private String subscribeType;
	
	public Subscribe(String subsCribeType) {
		this.subscribeType = subsCribeType;
	}
}
