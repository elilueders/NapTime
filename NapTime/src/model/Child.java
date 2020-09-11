package model;

public class Child {

	private String name;
	private double hoursAwake;
	private double hoursUntilBedtime;
	private boolean isInconsolable;

	public Child() {
		super();
	}

	public Child(String name, double hoursAwake, double hoursTillBedtime, boolean isInconsolable) {
		super();
		this.name = name;
		this.hoursAwake = hoursAwake;
		this.hoursUntilBedtime = hoursTillBedtime;
		this.isInconsolable = isInconsolable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHoursAwake() {
		return hoursAwake;
	}

	public void setHoursAwake(double hoursAwake) {
		this.hoursAwake = hoursAwake;
	}

	public double getHoursUntilBedtime() {
		return hoursUntilBedtime;
	}

	public void setHoursUntilBedtime(double hoursTillBedtime) {
		this.hoursUntilBedtime = hoursTillBedtime;
	}

	public boolean isInconsolable() {
		return isInconsolable;
	}

	public void setInconsolable(boolean isInconsolable) {
		this.isInconsolable = isInconsolable;
	}

}
