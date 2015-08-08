package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the student_perf database table.
 * 
 */
@Entity
@Table(name="student_perf")
@NamedQuery(name="StudentPerf.findAll", query="SELECT s FROM StudentPerf s")
public class StudentPerf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="std_perf_id")
	private int stdPerfId;

	@Column(name="acd_year")
	private int acdYear;

	private String comment;

	@Column(name="crtd_by")
	private String crtdBy;

	@Column(name="crtd_ts")
	private Timestamp crtdTs;

	private int month;

	@Column(name="perf_param_cd")
	private String perfParamCd;

	@Column(name="perf_param_value")
	private int perfParamValue;

	@Column(name="uptd_ts")
	private Timestamp uptdTs;

	private int week;

	private int year;

	public StudentPerf() {
	}

	public int getStdPerfId() {
		return this.stdPerfId;
	}

	public void setStdPerfId(int stdPerfId) {
		this.stdPerfId = stdPerfId;
	}

	public int getAcdYear() {
		return this.acdYear;
	}

	public void setAcdYear(int acdYear) {
		this.acdYear = acdYear;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCrtdBy() {
		return this.crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	public Timestamp getCrtdTs() {
		return this.crtdTs;
	}

	public void setCrtdTs(Timestamp crtdTs) {
		this.crtdTs = crtdTs;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getPerfParamCd() {
		return this.perfParamCd;
	}

	public void setPerfParamCd(String perfParamCd) {
		this.perfParamCd = perfParamCd;
	}

	public int getPerfParamValue() {
		return this.perfParamValue;
	}

	public void setPerfParamValue(int perfParamValue) {
		this.perfParamValue = perfParamValue;
	}

	public Timestamp getUptdTs() {
		return this.uptdTs;
	}

	public void setUptdTs(Timestamp uptdTs) {
		this.uptdTs = uptdTs;
	}

	public int getWeek() {
		return this.week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}