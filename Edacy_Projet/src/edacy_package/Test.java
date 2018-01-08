package edacy_package;

import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		//creation d'objets Talent
		Talent talent1=new Talent("tounkara","atya","java","niveau1",18);
		Talent talent2=new TalentForeign("manga","rodrigue","java","niveau2",22,"senegal");
		Talent talent5=new TalentForeign("sonko","sokhna","java","niveau3",20,"gabon");
		Talent talent6=new TalentForeign("diagne","paul","javascript","niveau4",25,"gambie");
		Talent talent3=new Talent("diedhiou","amadou","javascript","niveau1",28);
		Talent talent4=new Talent("gaye","alassane","java","niveau9",27);
		//creation du tableau de talents
		Talent tabTalent[]=new Talent[1000];
		//creation d'une ecole de talent
		School edacy=new School(tabTalent);
		//ajouts des talents dans l'ecole
		edacy.addTalent(talent1);
		edacy.addTalent(talent2);
		edacy.addTalent(talent3);
		edacy.addTalent(talent4);
		edacy.addTalent(talent5);
		edacy.addTalent(talent6);
		//modification du talent a l'indice 0
		edacy.updateTalent(0, new Talent("amar","mama","java","niveau5",29));
		//affichage des differents talents
		System.out.println("---------------------------la liste des talents dans une ecole-------------------------------------------");
		for(int i=0;i<School.nombreTalent;i++)
			System.out.println(tabTalent[i].print());
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("le nombre de talent dans l'ecole est de:"+School.nombreTalent);
	}
	
}

