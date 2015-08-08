package school.charts;

import javax.inject.Named;



public class Charts  {

	protected  String acyear;
	protected int noOfExam;
	protected int stdPerfId;
	protected int perfParamValue;
	protected String comment;
	
	public int getStdPerfId() {
		return stdPerfId;
	}

	public void setStdPerfId(int stdPerfId) {
		this.stdPerfId = stdPerfId;
	}

	

	public int getPerfParamValue() {
		return perfParamValue;
	}

	public void setPerfParamValue(int perfParamValue) {
		this.perfParamValue = perfParamValue;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAcyear() {
		return acyear;
	}

	public void setAcyear(String acyear) {
		this.acyear = acyear;
	}

	public int getNoOfExam() {
		return noOfExam;
	}

	public void setNoOfExam(int noOfExam) {
		this.noOfExam = noOfExam;
	}

}
