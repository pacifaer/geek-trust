package com.geek.reevon.dto;

import com.geek.reevon.constant.KINGDOM;

public class SecretMessage {
    private final String data;
    private final KINGDOM kingdom;

    private SecretMessage(SecrectMessageBuilder builder) {
        this.data = builder.data;
        this.kingdom = builder.kingdom;
    }

    public static SecrectMessageBuilder builder() {
        return new SecrectMessageBuilder();
    }

    public static SecretMessage getDefaulUnkown(String data) {
        return builder().kingdom(KINGDOM.UNKNOWN).data(data).build();
    }

    public static SecretMessage getDefaulUnkown() {
        return builder().kingdom(KINGDOM.UNKNOWN).data("").build();
    }

    public String getData() {
        return data;
    }

    public KINGDOM getKingdom() {
        return kingdom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecretMessage)) return false;

        SecretMessage that = (SecretMessage) o;

        if (getData() != null ? !getData().equals(that.getData()) : that.getData() != null) return false;
        return getKingdom() == that.getKingdom();
    }

    @Override
    public int hashCode() {
        int result = getData() != null ? getData().hashCode() : 0;
        result = 31 * result + getKingdom().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SecrectMessage{" +
                "data='" + data + '\'' +
                ", kingdom=" + kingdom +
                '}';
    }

    public static class SecrectMessageBuilder {
        String data;
        KINGDOM kingdom;

        public SecrectMessageBuilder data(String data) {
            this.data = data;
            return this;
        }

        public SecrectMessageBuilder kingdom(KINGDOM kingdom) {
            this.kingdom = kingdom;
            return this;
        }

        public SecretMessage build() {
            return new SecretMessage(this);
        }
    }


}
