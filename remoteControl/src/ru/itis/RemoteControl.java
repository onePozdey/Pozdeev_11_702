package ru.itis;

public class RemoteControl {
    private String rcName;
    private String serialNumber;
    private String corpName;
    private String maintanCompName;
    private int durability;
    private TelevisionSet tv = TelevisionSet.getInstance();
    public void switchScannelForward(int channelOn) {
        channelOn++;
    }
    public void switchScannelBack(int channelOn) {
        channelOn--;
    }

    public RemoteControl(Builder builder) {
        this.rcName = builder.rcName;
        this.serialNumber = builder.serialNumber;
        this.corpName = builder.corpName;
        this.maintanCompName = builder.maintanCompName;
        this.durability = builder.durability;
        this.tv = TelevisionSet.getInstance();
    }
    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String rcName;
        private String serialNumber;
        private String corpName;
        private String maintanCompName;
        private int durability;
        private TelevisionSet tv = TelevisionSet.getInstance();

        public Builder rcName(String rcName) {
            this.rcName = rcName;
            return this;
        }
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Builder corpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public Builder maintanCompName(String maintanCompName) {
            this.maintanCompName = maintanCompName;
            return this;
        }
        public Builder durability(int durability) {
            this.durability = durability;
            return this;
        }
        public Builder tv(TelevisionSet tv) {
            this.tv = tv;
            return this;
        }
        public RemoteControl build() {
            return new RemoteControl(this);
        }
    }

    public String getRcName() {
        return rcName;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getCorpName() {
        return corpName;
    }
    public String getMaintanCompName() {
        return maintanCompName;
    }
    public int getDurability() {
        return durability;
    }
    public TelevisionSet getTv() {
        return tv;
    }



}
