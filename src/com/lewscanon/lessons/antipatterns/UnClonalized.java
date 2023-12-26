package com.lewscanon.lessons.antipatterns;

public class UnClonalized {

    public static abstract class Mobile {
        public boolean touchScreen;
        public boolean waterResistance;
        public String color;
        public String network;
        public int camera;
        public int fps;
        public int simSlots;
        public String display;


        public abstract Mobile clone();

        public Mobile() {
        }

        public Mobile(Mobile mobile) {
            if (mobile != null) {
                touchScreen = mobile.touchScreen;
                waterResistance = mobile.waterResistance;
                color = mobile.color;
                network = mobile.network;
                camera = mobile.camera;
                fps = mobile.fps;
                simSlots = mobile.simSlots;
                display = mobile.display;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Mobile) && !super.equals(obj)) {
                return false;
            }
            assert obj instanceof Mobile;
            Mobile other = (Mobile) obj;
            return touchScreen == other.touchScreen
                    && waterResistance == other.waterResistance
                    && color.equals(other.color)
                    && network.equals(other.network)
                    && camera == other.camera
                    && fps == other.fps
                    && simSlots == other.simSlots
                    && display.equals(other.display);
        }
    }

    public static class IOS extends Mobile {
        public double iOSVersion;
        public String iOSCodeName;

        public IOS() {
        }

        public IOS(IOS ios) {
            super(ios);
            if (ios != null) {
                iOSVersion = ios.iOSVersion;
                iOSCodeName = ios.iOSCodeName;
            }
        }

        @Override
        public Mobile clone() {
            return new IOS(this);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof IOS) && !super.equals(obj)) {
                return false;
            }
            else {
                IOS ios = (IOS) obj;
                return super.equals(ios) && iOSVersion == ios.iOSVersion && iOSCodeName.equals(ios.iOSCodeName);
            }
        }

        @Override
        public String toString() {
            return "IOS{" + "iOSVersion=" + iOSVersion
                    + ", iOSCodeName='" + iOSCodeName
                    + '\'' + ", touchScreen=" + touchScreen
                    + ", waterResistance=" + waterResistance
                    + ", color='" + color
                    + '\'' + ", network='" + network
                    + '\'' + ", camera=" + camera
                    + ", fps=" + fps
                    + ", simSlots=" + simSlots
                    + ", display='" + display
                    + '\''
                    + '}';
        }
    }

    // Android Class
    public static class Android extends Mobile {
        public double androidVersion;
        public String androidCodeName;

        public Android() {
        }

        public Android(Android android) {
            super(android);
            if (android != null) {
                androidVersion = android.androidVersion;
                androidCodeName = android.androidCodeName;
            }
        }

        @Override
        public Mobile clone() {
            return new Android(this);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Android) && !super.equals(obj)) return false;
            Android and = (Android) obj;
            return super.equals(and) && androidVersion == and.androidVersion && androidCodeName.equals(and.androidCodeName);
        }

        @Override
        public String toString() {
            return "Android{" + "androidVersion=" + androidVersion
                    + ", androidCodeName='" + androidCodeName
                    + '\'' + ", touchScreen=" + touchScreen
                    + ", waterResistance=" + waterResistance
                    + ", color='" + color
                    + '\'' + ", network='" + network
                    + '\'' + ", camera=" + camera
                    + ", fps=" + fps
                    + ", simSlots=" + simSlots
                    + ", display='" + display + '\''
                    + '}';
        }
    }

    public static void main(String[] args) {

    }
}
