package com.cnbbx.ZPush;

import android.net.wifi.WifiManager;

import org.teleal.cling.android.AndroidUpnpServiceConfiguration;
import org.teleal.cling.android.AndroidUpnpServiceImpl;
import org.teleal.cling.model.types.ServiceType;
import org.teleal.cling.model.types.UDAServiceType;

public class MyUpnpService extends AndroidUpnpServiceImpl {

    protected AndroidUpnpServiceConfiguration createConfiguration(WifiManager wifiManager) {
        return new AndroidUpnpServiceConfiguration(wifiManager) {

            //            @Override
            //            public int getRegistryMaintenanceIntervalMillis() {
            //                return 7000;
            //            }

            public ServiceType[] getExclusiveServiceTypes() {
                return new ServiceType[]{new UDAServiceType("AVTransport"), new UDAServiceType("ConnectionManager")};
            }

        };
    }

}
