package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	@SuppressWarnings({ "null", "unused" })
	public List <Skill> listAllSkill () throws SQLException, Exception {
		ConnectionManager conn=new ConnectionManager();
		Statement s=ConnectionManager.getConnection().createStatement();
		ResultSet r=s.executeQuery("select * from skill order by name ASCENDING");
		
		List<Skill> list=null;
		while(r.next()) {
			String skillId =r.getString("skillId");
			String skillName=r.getString("skillName");
			Skill sk=new Skill(skillId,skillName);
			list.add(sk);
		}
		return list;
		
	}
	
}
