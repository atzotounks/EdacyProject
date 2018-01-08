package edacy_package;
//la classe Schoool
public class School {

	
	private Talent tabTalent[]=new Talent[1000]; 
	static int nombreTalent=0;
	//le constructeur de school qui permet d'initialiser la classe school
	public School(Talent[] tabTalent) {
		super();
		this.tabTalent = tabTalent;
	}
	//une methode addTalent qui permet d'ajouter des Talents dans le tableau des talent
	public Talent[] addTalent(Talent tal){
		tabTalent[nombreTalent]=tal;
		nombreTalent++;
		return tabTalent;
	}
//---------------des methodes que j'ai ajouter-----------------------
	
	/*une methode updateTalent qui permet la modification de Talents 
	dans le tableau a un indice donne*/
	public void updateTalent(int index, Talent tal){
		tabTalent[index]=tal;
	}
	//la methode getTabtalent qui retoune le tableau des Talents
	public Talent[] getTabTalent() {
		return tabTalent;
	
	}
	
		
	
}
