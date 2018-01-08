package edacy_package;
//la classe TalentForeign qui etend de Talent
public class TalentForeign extends Talent{
private String countryOfOrigin;
// le constructeur de TalentForeign qui initialise la classe TalentForeign
public TalentForeign(String name, String firstName, String specializationCourse, String level, int age,String countryOfOrigin) {
		super(name, firstName, specializationCourse, level, age);
		this.countryOfOrigin=countryOfOrigin;
		// TODO Auto-generated constructor stub
	}
//la methode print qui permet d'imprimer un talentForeign
public String print() {
	return super.print()+"TalentForeign countryOfOrigin=" + countryOfOrigin + "]";
}
//---------------des methodes que j'ai ajouter-----------------------

//la methode getCountryOfOrigin qui retoune le pays d'origine du Talent
public String getCountryOfOrigin() {
	return countryOfOrigin;
}
//cette méthode permet de modifier le pays d'origine du talent
public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;
}

}
