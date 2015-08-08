package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the teacher_perf_params database table.
 * 
 */
@Entity
@Table(name="teacher_perf_params")
@NamedQuery(name="TeacherPerfParam.findAll", query="SELECT t FROM TeacherPerfParam t")
public class TeacherPerfParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="perf_param_cd")
	private String perfParamCd;

	@Column(name="perf_param_id")
	private int perfParamId;

	@Column(name="perf_param_label")
	private String perfParamLabel;

	@Column(name="perm_param_desc")
	private String permParamDesc;

	public TeacherPerfParam() {
	}

	public String getPerfParamCd() {
		return this.perfParamCd;
	}

	public void setPerfParamCd(String perfParamCd) {
		this.perfParamCd = perfParamCd;
	}

	public int getPerfParamId() {
		return this.perfParamId;
	}

	public void setPerfParamId(int perfParamId) {
		this.perfParamId = perfParamId;
	}

	public String getPerfParamLabel() {
		return this.perfParamLabel;
	}

	public void setPerfParamLabel(String perfParamLabel) {
		this.perfParamLabel = perfParamLabel;
	}

	public String getPermParamDesc() {
		return this.permParamDesc;
	}

	public void setPermParamDesc(String permParamDesc) {
		this.permParamDesc = permParamDesc;
	}

}