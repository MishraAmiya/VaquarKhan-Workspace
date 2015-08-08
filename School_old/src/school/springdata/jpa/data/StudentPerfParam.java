package school.springdata.jpa.data;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the student_perf_params database table.
 * 
 */
@Entity
@Table(name = "student_perf_params")
@NamedQuery(name = "StudentPerfParam.findAll", query = "SELECT s FROM StudentPerfParam s")
public class StudentPerfParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "perf_param_cd")
	private String perfParamCd;
	@Id
	@Column(name = "perf_param_id")
	private int perfParamId;

	@Column(name = "perf_param_label")
	private String perfParamLabel;

	@Column(name = "perm_param_desc")
	private String permParamDesc;

	public StudentPerfParam() {
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