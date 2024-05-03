package com.cnbbx.ZPush;

import org.teleal.cling.model.meta.Device;

class DeviceDisplay {
    private final Device device;
    private final String TAG = "ZPush";
    public DeviceDisplay(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceDisplay that = (DeviceDisplay) o;
        return device.equals(that.device);
    }

    @Override
    public int hashCode() {
        return device.hashCode();
    }

    @Override
    public String toString() {
        String display;
        if (device.getDetails().getFriendlyName() != null)
            display = device.getDetails().getFriendlyName();
        else display = device.getDisplayString();
        return device.isFullyHydrated() ? display : display + " *";
    }
} 


