package Day5.Assignment;

    public class Television {

        private boolean isOn;
        private int channel;
        private int volume;
        private boolean isMuted;
        private int previousVolume;

        public Television() {
            this.isOn = false;
            this.channel = 1;
            this.volume = 10;
            this.isMuted = false;
            this.previousVolume = 10;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
            isMuted = false;
            volume = 10;
            previousVolume = 10;
            channel = 1;
        }

        public void channelUp() {
            if (!isOn) {
                return;
            }
            if (channel < 100) {
                channel = channel + 1;
            }
        }

        public void channelDown() {
            if (!isOn) {
                return;
            }
            if (channel > 1) {
                channel = channel - 1;
            }
        }

        public void volumeUp() {
            if (!isOn) {
                return;
            }
            if (isMuted) {
                isMuted = false;
                volume = previousVolume;
            }
            if (volume < 100) {
                volume = volume + 1;
            }
            previousVolume = volume;
        }

        public void volumeDown() {
            if (!isOn) {
                return;
            }
            if (isMuted) {
                isMuted = false;
                volume = previousVolume;
            }
            if (volume > 0) {
                volume = volume - 1;
            }
            previousVolume = volume;
        }

        public void mute() {
            if (!isOn) {
                return;
            }
            if (!isMuted) {
                previousVolume = volume;
                volume = 0;
                isMuted = true;
            }
        }

        public void unmute() {
            if (!isOn) {
                return;
            }
            if (isMuted) {
                volume = previousVolume;
                isMuted = false;
            }
        }

        public boolean isOn() {
            return isOn;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolume() {
            return volume;
        }

        public boolean isMuted() {
            return isMuted;
        }
    }

