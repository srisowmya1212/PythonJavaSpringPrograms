package com.skss.hibernate_empprj;

import java.util.Scanner;

public class AndraStudentController {

	public static void main(String[] args) {
		AndraStudentService service =new AndraStudentService();
//	    AndraStudentDto dto=new AndraStudentDto();
//	    dto.setId(2);
//	    dto.setName("arunsai");
//	    dto.setEnglish(91);
//	    dto.setMaths(95);
//	    dto.setScience(80);
//	    service.save(dto);
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		while (condition) {
			System.out.println("1.Save 2.Retrieve 3.Delete 4.Alldata 5.Update 6.exit");
			int value = sc.nextInt();
			switch (value) {
			case 1: {
				AndraStudentDto dto = new AndraStudentDto();
				System.out.println("enter 1.id 2.name 3.eng 4.math 5.science");
				dto.setId(sc.nextInt());
				dto.setName(sc.next());
				dto.setEnglish(sc.nextDouble());
				dto.setMaths(sc.nextDouble());
				dto.setScience(sc.nextDouble());
				service.save(dto);
				break;
			}
			case 2: {
				System.out.println("enter the id to retrieve");
				int id = sc.nextInt();
				service.retrieveById(id);
				break;
			}
			case 3: {
				System.out.println("enter the id to delete the data");
				int id = sc.nextInt();
				service.deleteById(id);
				break;
			}
			case 4: {
				System.out.println("-------List Of Students---------");
				service.retrieveAll();
				break;
			}
			case 5: {
				System.out.println("enter the details of person to update");
				AndraStudentDto dto = new AndraStudentDto();
				System.out.println("enter 1.id 2.eng 3.math 4.science 5.name");
				dto.setId(sc.nextInt());

				dto.setEnglish(sc.nextDouble());
				dto.setMaths(sc.nextDouble());
				dto.setScience(sc.nextDouble());
				dto.setName(sc.next());
				service.update(dto);
				break;
			}
			case 6: {
				condition = false;
			}
			}
		}
	}

}
