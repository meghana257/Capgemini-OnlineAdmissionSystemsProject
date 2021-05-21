package com.cg.oms.repository;

import java.util.ArrayList;

import com.cg.oms.entity.Application;
import com.cg.oms.entity.Program;
import com.cg.oms.entity.ProgramScheduled;

public interface IProgramScheduleRepository {
	public boolean addProgramSchedule(ProgramScheduled programSchedule);
	public ArrayList<ProgramScheduled> viewAllProgramScheduleDetails();
	public  ArrayList<ProgramScheduled>
	getProgramScheduleByCollegeName(String collegeName);
	public  ArrayList<ProgramScheduled> getProgramScheduleByDate(String date);
	public int deleteProgramScheduleById(int scheduleId);
//	public int deleteProgramScheduleByDate(String startDate);
	public ProgramScheduled getProgramScheduleById(int scheduleId);
	public int  updateProgramSchedule(ProgramScheduled programSchedule);
	//as per requirment can be added more function
}
