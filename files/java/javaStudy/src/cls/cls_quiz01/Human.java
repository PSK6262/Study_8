package cls.cls_quiz01;

public class Human {
	private String name;
	private String gender;
	private int age;
	private String job;
	private double height;
	private double weight;
	private String bloodType;
	private String bodyStatus;
	private boolean isSleep;
	
	Human(){}
	Human(String name,String gender,String bloodType){
		this.name=name;
		this.gender=gender;
		this.bloodType=bloodType;
	}
	//getter setter
	boolean isSleep() {
		return isSleep;
	}

	void setSleep(boolean isSleep) {
		this.isSleep = isSleep;
	}

	String getBodyStatus() {
		return bodyStatus;
	}

	void setBodyStatus(String bodyStatus) {
		this.bodyStatus = bodyStatus;
	}

	String getBloodType() {
		return bloodType;
	}

	void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	String getJob() {
		return job;
	}
	void setJob(String job) {
		this.job = job;
	}
}
