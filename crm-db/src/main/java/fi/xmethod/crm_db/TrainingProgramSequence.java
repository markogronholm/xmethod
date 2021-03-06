package fi.xmethod.crm_db;

// Generated Feb 20, 2014 8:20:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TrainingProgramSequence generated by hbm2java
 */
public class TrainingProgramSequence implements java.io.Serializable {

	private int sequenceId;
	private TrainingProgram trainingProgram;
	private String sequenceLabel;
	private String sequenceColumnLabel;
	private String sequenceUnit;
	private Set fitnesses = new HashSet(0);
	private Set powers = new HashSet(0);
	private Set endurances = new HashSet(0);

	public TrainingProgramSequence() {
	}

	public TrainingProgramSequence(int sequenceId,
			TrainingProgram trainingProgram, String sequenceLabel,
			String sequenceColumnLabel, String sequenceUnit) {
		this.sequenceId = sequenceId;
		this.trainingProgram = trainingProgram;
		this.sequenceLabel = sequenceLabel;
		this.sequenceColumnLabel = sequenceColumnLabel;
		this.sequenceUnit = sequenceUnit;
	}

	public TrainingProgramSequence(int sequenceId,
			TrainingProgram trainingProgram, String sequenceLabel,
			String sequenceColumnLabel, String sequenceUnit, Set fitnesses,
			Set powers, Set endurances) {
		this.sequenceId = sequenceId;
		this.trainingProgram = trainingProgram;
		this.sequenceLabel = sequenceLabel;
		this.sequenceColumnLabel = sequenceColumnLabel;
		this.sequenceUnit = sequenceUnit;
		this.fitnesses = fitnesses;
		this.powers = powers;
		this.endurances = endurances;
	}

	public int getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public TrainingProgram getTrainingProgram() {
		return this.trainingProgram;
	}

	public void setTrainingProgram(TrainingProgram trainingProgram) {
		this.trainingProgram = trainingProgram;
	}

	public String getSequenceLabel() {
		return this.sequenceLabel;
	}

	public void setSequenceLabel(String sequenceLabel) {
		this.sequenceLabel = sequenceLabel;
	}

	public String getSequenceColumnLabel() {
		return this.sequenceColumnLabel;
	}

	public void setSequenceColumnLabel(String sequenceColumnLabel) {
		this.sequenceColumnLabel = sequenceColumnLabel;
	}

	public String getSequenceUnit() {
		return this.sequenceUnit;
	}

	public void setSequenceUnit(String sequenceUnit) {
		this.sequenceUnit = sequenceUnit;
	}

	public Set getFitnesses() {
		return this.fitnesses;
	}

	public void setFitnesses(Set fitnesses) {
		this.fitnesses = fitnesses;
	}

	public Set getPowers() {
		return this.powers;
	}

	public void setPowers(Set powers) {
		this.powers = powers;
	}

	public Set getEndurances() {
		return this.endurances;
	}

	public void setEndurances(Set endurances) {
		this.endurances = endurances;
	}

}
