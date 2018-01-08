package edacy_package;
//la classe Talent
public class Talent {
private String name,firstName,specializationCourse,level;
private int age;
//le constructeur qui permet d'initialiser la classe Talent
public Talent(String name, String firstName, String specializationCourse, String level, int age) {
	super();
	this.name = name;
	this.firstName = firstName;
	this.specializationCourse = specializationCourse;
	this.level = level;
	this.age = age;
}
//la methode print qui permet d'imprimer un talent
public String print() {
	return "Talent [name=" + name + ", firstName=" + firstName + ", specializationCourse=" + specializationCourse
			+ ", level=" + level + ", age=" + age+" ";
}
//la methode getName qui retoune le nom du Talent
public String getName() {
	return name;
}
//la methode getFirstName qui retoune le firstName du Talent
public String getFirstName() {
	return firstName;
}
//la methode getSpecializationCourse qui retoune le Specialization Course du Talent
public String getSpecializationCourse() {
	return specializationCourse;
}
//la methode getLevel qui retoune le niveau du Talent
public String getLevel() {
	return level;
}
//la methode getAge qui retoune l'Age du Talent
public int getAge() {
	return age;
}
//---------------des methodes que j'ai ajouter-----------------------

//cette méthode permet de modifier le name du talent
public void setName(String nom) {
	this.name = name;
}
//cette méthode permet de modifier le firstName du talent
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
//cette méthode permet de modifier le Specialization Course du talent alors qu'il est en private
public void setSpecializationCourse(String specializationCourse) {
	this.specializationCourse = specializationCourse;
}
//cette méthode permet de modifier le level du talent
public void setLevel(String level) {
	this.level = level;
}
//cette méthode permet de modifier l'age du talent
public void setAge(int age) {
	this.age = age;
}


}




