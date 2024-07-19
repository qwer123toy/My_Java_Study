import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Coffee {
	private int shot;
	private int milk;
	private int sugar;
}
