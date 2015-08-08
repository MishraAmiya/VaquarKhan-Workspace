package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sch_reg_fee database table.
 * 
 */
@Entity
@Table(name="sch_reg_fee")
@NamedQuery(name="SchRegFee.findAll", query="SELECT s FROM SchRegFee s")
public class SchRegFee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="fee_id")
	private int feeId;

	@Column(name="fee_amount")
	private double feeAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="pay_date")
	private Date payDate;

	//bi-directional many-to-one association to SchStdRegistration
	@ManyToOne
	@JoinColumn(name="reg_id")
	private SchStdRegistration schStdRegistration;

	public SchRegFee() {
	}

	public int getFeeId() {
		return this.feeId;
	}

	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}

	public double getFeeAmount() {
		return this.feeAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public SchStdRegistration getSchStdRegistration() {
		return this.schStdRegistration;
	}

	public void setSchStdRegistration(SchStdRegistration schStdRegistration) {
		this.schStdRegistration = schStdRegistration;
	}

}