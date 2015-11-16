package objects;

public class Student {

	Integer matrikelNummer;
	Integer alter;
	String name;
	String[] faecher;
	Boolean gastHoerer;
	
	
	public void setMatrikeNummer(){
		this.matrikelNummer = matrikelNummer;
		
	}
	
	public Integer getMatrikelNummer(){
		 return matrikelNummer;
	}
	
	public void setFaecher(String[] faecher){
		this.faecher = faecher;
	}
	public String[] getFaecher(){
		return faecher;
	}
	public void setAlter(){
		this.alter = alter;
	}
	public Integer getAlter(){
		return alter;
	}
	public void setName(){
		this.name = name;
		
	}
	
	public String getName(){
		 return name;
	}
	
	public void setGastHoerer(){
		this.gastHoerer = gastHoerer;
	}
	public Boolean getGastHoerer(){
		return gastHoerer;
	}


}

