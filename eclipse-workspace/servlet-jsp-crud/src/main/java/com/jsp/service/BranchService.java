package com.jsp.service;

import java.util.List;

import com.jsp.dao.BranchDao;
import com.jsp.dto.Branch;

public class BranchService {
	BranchDao dao=new BranchDao();
	public Branch saveService(Branch branch) {
		return dao.save(branch);
	}
	public Branch updateService(Branch branch) {
		return dao.update(branch);
	}
	public Branch deleteService(int id) {
		return dao.delete(id);
		
	}
	public List<Branch> getAllService(){
		return dao.getAll();
	}
	public Branch getByIdService(int id) {
		return dao.getById(id);
	}
	public List<Branch> loginService(Branch branch){
		return dao.login(branch);
		
	}

}
