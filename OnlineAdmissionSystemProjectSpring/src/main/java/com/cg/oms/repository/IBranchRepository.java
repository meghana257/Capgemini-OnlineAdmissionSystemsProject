package com.cg.oms.repository;

import java.util.ArrayList;

import com.cg.oms.entity.Application;
import com.cg.oms.entity.Branch;

public interface IBranchRepository
{
	public boolean addBranch( Branch branch);
	public ArrayList<Branch> viewAllBranchDetails();
	public  ArrayList<Branch> getBranchDetailsByName(String branchName);
	public int deleteBranchById(int branchId);
	public Branch getBranchById(int branchId);
	public int deleteBranchByName(String branchName);
	public int  updateBranch(Branch branch);

}
