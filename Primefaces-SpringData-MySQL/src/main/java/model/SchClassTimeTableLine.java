package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sch_class_time_table_line database table.
 * 
 */
@Entity
@Table(name="sch_class_time_table_line")
@NamedQuery(name="SchClassTimeTableLine.findAll", query="SELECT s FROM SchClassTimeTableLine s")
public class SchClassTimeTableLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tt_line_id")
	private int ttLineId;

	private String ttday;

	//bi-directional many-to-one association to SchDayPeriod
	@ManyToOne
	@JoinColumn(name="dpid")
	private SchDayPeriod schDayPeriod;

	//bi-directional many-to-one association to SchSubject
	@ManyToOne
	@JoinColumn(name="subject_id")
	private SchSubject schSubject;

	//bi-directional many-to-one association to SchTeacherInfo
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private SchTeacherInfo schTeacherInfo;

	//bi-directional many-to-one association to SchTimeTable
	@ManyToOne
	@JoinColumn(name="ttid")
	private SchTimeTable schTimeTable;

	public SchClassTimeTableLine() {
	}

	public int getTtLineId() {
		return this.ttLineId;
	}

	public void setTtLineId(int ttLineId) {
		this.ttLineId = ttLineId;
	}

	public String getTtday() {
		return this.ttday;
	}

	public void setTtday(String ttday) {
		this.ttday = ttday;
	}

	public SchDayPeriod getSchDayPeriod() {
		return this.schDayPeriod;
	}

	public void setSchDayPeriod(SchDayPeriod schDayPeriod) {
		this.schDayPeriod = schDayPeriod;
	}

	public SchSubject getSchSubject() {
		return this.schSubject;
	}

	public void setSchSubject(SchSubject schSubject) {
		this.schSubject = schSubject;
	}

	public SchTeacherInfo getSchTeacherInfo() {
		return this.schTeacherInfo;
	}

	public void setSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		this.schTeacherInfo = schTeacherInfo;
	}

	public SchTimeTable getSchTimeTable() {
		return this.schTimeTable;
	}

	public void setSchTimeTable(SchTimeTable schTimeTable) {
		this.schTimeTable = schTimeTable;
	}

}