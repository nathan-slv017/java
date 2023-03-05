package ola_mundo_java_gado;

public class Gato {

	private String name;
	private String color;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Gato [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	/*
	 * public Gato(String name, String color, Integer age) { this.name = name;
	 * this.color = color; this.age = age; }
	 */

}
