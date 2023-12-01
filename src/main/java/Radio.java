public class Radio {
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public int getMinStation() {
        return minStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int setToMaxVolume() {
        currentVolume = maxVolume;

        return currentVolume;
    }

    public int setToMinVolume() {
        currentVolume = minVolume;

        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int setToMaxStation() {
        currentStation = maxStation;
        return currentStation;
    }

    public int setToMinStation() {
        currentStation = minStation;
        return currentStation;

    }

    public int pressNextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
        return minStation;
    }

    public int pressPrevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
        return maxStation;
    }
}
