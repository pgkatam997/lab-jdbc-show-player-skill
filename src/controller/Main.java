package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import dao.SkillDAO;
import model.Skill;

public class Main{
	@SuppressWarnings("unused")
	public static void main(String argu[]) {
		
	Skill skill=new Skill();
	SkillDAO skilsdao=new SkillDAO();
	
	BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
	
	System.out.println("Enter skill ID:");
	String skillId=skill.getSkillId();
	//skill.getSkillId();
	//skill.setSkillId(skillId);
	
	System.out.println("Enter skill Name");
	String skillname=skill.getSkillName();
	System.out.println("List of Skills:");
	
	System.out.println("\nskill Id:"+skillId +"\nskill Name:"+skillname);
	
	}
}
