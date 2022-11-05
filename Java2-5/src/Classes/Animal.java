package Classes;

public class Animal {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	private int age;
	
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		
//		if (o == null || this.getClass() != o.getClass()) {
//			return false;
//		}
//		
//		Animal animal = (Animal) o; 
//		
//		if (age == animal.age && name.contentEquals(animal.name)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
