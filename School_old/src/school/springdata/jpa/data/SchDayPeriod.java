package school.springdata.jpa.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_day_period database table.
 * 
 */
@Entity
@Table(name="sch_day_period")
@NamedQuery(name="SchDayPeriod.findAll", query="SELECT s FROM SchDayPeriod s")
public class SchDayPeriod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dpid;

	private String dptime;

	//bi-directional many-to-one association to SchClassTimeTableLine
	@OneToMany(mappedBy="schDayPeriod")
	private List<SchClassTimeTableLine> schClassTimeTableLines;

	public SchDayPeriod() {
	}

	public int getDpid() {
		return this.dpid;
	}

	public void setDpid(int dpid) {
		this.dpid = dpid;
	}

	public String getDptime() {
		return this.dptime;
	}

	public void setDptime(String dptime) {
		this.dptime = dptime;
	}

	public List<SchClassTimeTableLine> getSchClassTimeTableLines() {
		return this.schClassTimeTableLines;
	}

	public void setSchClassTimeTableLines(List<SchClassTimeTableLine> schClassTimeTableLines) {
		this.schClassTimeTableLines = schClassTimeTableLines;
	}

	public SchClassTimeTableLine addSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().add(schClassTimeTableLine);
		schClassTimeTableLine.setSchDayPeriod(this);

		return schClassTimeTableLine;
	}

	public SchClassTimeTableLine removeSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().remove(schClassTimeTableLine);
		schClassTimeTableLine.setSchDayPeriod(null);

		return schClassTimeTableLine;
	}

}