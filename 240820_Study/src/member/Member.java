package member;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Member {
	private int id;
	private String name;
	private String phoneNumber;
	
	//private List<Hobby> hobbys;
	private Subscribe subscribe;
	private String data;
}
