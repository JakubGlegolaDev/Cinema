
public class Worker {  // zrobiæ tablice z pracownikami?
	
	private String Name;
	private String Surname;
	private int age;
	private String sex;
	private String profession;
	private int salary;
	
	public Worker(String Name, String Surname, int age, String sex, String profession, int salary) {
		this.Name = Name;
		this.Surname = Surname;
		this.age = age;
		this.sex = sex;
		this.profession = profession;
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public String getSurname() {
		return Surname;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public String getProfession() {
		return profession;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}


