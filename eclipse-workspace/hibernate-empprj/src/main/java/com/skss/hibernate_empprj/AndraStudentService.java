package com.skss.hibernate_empprj;



public class AndraStudentService {
	AndraStudentDaoImpl dao=new AndraStudentDaoImpl();
	public double result(AndraStudentDto dto) {
		return dto.getEnglish()+dto.getMaths()+dto.getScience();
	}
    public double percentage(AndraStudentDto dto) {
    	return (result (dto)/300)*100;
    }
    public  String grade(double percentage) {
		
		if(percentage>=35) {
			if(percentage>90) {
				return "A+";
				
			}
			else if(percentage>75 &&percentage<=90) {
				return "A";
			}
			else if(percentage>60 &&percentage<=75) {
				return "B";
			}
			else if(percentage>50 &&percentage<=60) {
				return "C";
			}
			else if(percentage>35 &&percentage<=50) {
				return "D";
			}
			
		}
		return "FAIL";
			
	}
    public void save(AndraStudentDto dto) {
    	dto.setResult(result(dto));
    	dto.setPercentage(percentage(dto));
    	dto.setGrade(grade(dto.getPercentage()));
    	dao.save(dto);
    }
    public void update(AndraStudentDto dto) {
    	dto.setResult(result(dto));
    	dto.setPercentage(percentage(dto));
    	dto.setGrade(grade(dto.getPercentage()));
    	dao.updateStudent(dto);
    }
    public void retrieveById(int id) {
    	dao.getStudentById(id);
    }
    public void retrieveAll() {
    	dao.getAllStudents();
    }
    public void deleteById(int id) {
    	dao.deleteStudent(id);
    }
    

}
