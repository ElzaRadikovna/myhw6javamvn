public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;

    public Radio(int maxVolume, int minVolume, int currentVolume, int maxStation, int minStation, int currentStation) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = minVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = minStation;
    }

    public Radio () {

    }
    public Radio (int stationsCount) {
        stationsCount = 10;
    }

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

    public void setToMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setToMinVolume() {
        this.minVolume = minVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume++);
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

    public void setToMaxStation() {
        this.maxStation = maxStation;
    }

    public void setToMinStation() {
        this.minStation = minStation;
    }

    public int pressNextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation++);
        }
        return minStation;
    }

    public int pressPrevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else setCurrentStation(currentStation - 1);
        return maxStation;
    }
}
