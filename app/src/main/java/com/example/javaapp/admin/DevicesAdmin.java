package com.example.javaapp.admin;

import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.net.ProxyInfo;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DevicesAdmin extends AppCompatActivity {

    DevicePolicyManager devicePolicyManager = this.getSystemService(DevicePolicyManager.class);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ComponentName componentName = new ComponentName(this.getApplicationContext(), DeviceAdminReceiver.class);
        devicePolicyManager.clearDeviceOwnerApp(getPackageName());
        devicePolicyManager.setRecommendedGlobalProxy(componentName, ProxyInfo.buildDirectProxy("www.baidu.com", 8576));
    }
}
