
public class ShoesWithSize extends Shoes{
	private int size;

	public ShoesWithSize(String modelName, int price, int size) {
		super(modelName, price);
		this.size = size;
	}

	int getSize() {
		return size;
	}

	void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoesWithSize other = (ShoesWithSize) obj;
		if (size != other.size)
			return false;
		return true;
	}
	
}
