public class Radio {
    private int currentVolume;
    private int currentStation;


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {

        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void pressNextStation() {
        if (currentStation != 9) {
            setCurrentStation(currentStation + 1);
        } else currentStation = 0;
    }

    public void pressPrevStation() {
        if (currentStation != 0) {
            setCurrentStation(currentStation - 1);
        } else
            currentStation = 9;
    }
}
