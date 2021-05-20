
public class Sword {
	protected String Name;
	
	public Sword(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
        return Name;
    }
	
	@Override
	public String toString() {
		return Name;
	}
}
