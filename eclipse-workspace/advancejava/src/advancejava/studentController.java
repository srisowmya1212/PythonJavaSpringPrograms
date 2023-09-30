package advancejava;

import java.sql.SQLException;

public class studentController {
	//It is used to control .

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    
		studentDto dto=new studentDto();
		dto.setId(3);
		dto.setName("gowrivani");
		studentDao dao=new studentDao();
		dao.use(dto);
				

	}

}
