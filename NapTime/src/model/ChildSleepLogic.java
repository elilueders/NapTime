package model;

public class ChildSleepLogic {
	final private double MIN_NAP = 0.5;
	final private double MAX_NAP = 1.5;
	final private double MIN_AWAKE = 4;

	public boolean isClearedForSleep(Child child) {
		boolean isClearedForSleep = false;
		if (child.isInconsolable())
			isClearedForSleep = true;

		else if (child.getHoursAwake() >= MIN_AWAKE && child.getHoursUntilBedtime() >= MIN_AWAKE + MIN_NAP)
			isClearedForSleep = true;

		return isClearedForSleep;
	}

	public double hoursUntilClearedForSleep(Child child) {
		double hoursRemain = 0.0;

		if (!isClearedForSleep(child))
			hoursRemain = MIN_AWAKE - child.getHoursAwake();

		return hoursRemain;
	}

	public double amtHoursClearedForSleep(Child child) {
		double timeLeftForNap = child.getHoursUntilBedtime() + child.getHoursAwake() - MIN_AWAKE * 2;
		double hoursCleared = 0.0;

		if (isClearedForSleep(child)) {
			if (timeLeftForNap < MAX_NAP) {
				if (timeLeftForNap > MIN_NAP) {
					hoursCleared = timeLeftForNap;
				} else {
					hoursCleared = MIN_NAP;
				}
			} else {
				hoursCleared = MAX_NAP;
			}
		}

		return hoursCleared;
	}
}
