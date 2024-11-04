package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idy {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static final jiy e;

    static {
        String a2 = ijn.a("180a");
        a = a2;
        String a3 = ijn.a("2a24");
        b = a3;
        String a4 = ijn.a("2a29");
        c = a4;
        String a5 = ijn.a("2a26");
        d = a5;
        jiu jiuVar = new jiu();
        jiuVar.d(a2, "Device Information");
        jiuVar.d(a4, "Manufacturer Name");
        jiuVar.d(a3, "Model Number");
        jiuVar.d(a5, "Firmware Version");
        jiuVar.d("a3c87600-0005-1000-8000-001a11000100", "Eddystone Ringing Service");
        jiuVar.d("a3c87601-0005-1000-8000-001a11000100", "Ringing State");
        jiuVar.d("a3c87602-0005-1000-8000-001a11000100", "Ringing Capabilities");
        jiuVar.d("a3c87603-0005-1000-8000-001a11000100", "Ringing Terminated Notification");
        jiuVar.d("a3c87500-8ed3-4bdf-8a39-a01bebede295", "Eddystone Configuration Service");
        jiuVar.d("a3c87501-8ed3-4bdf-8a39-a01bebede295", "Broadcast Capabilities");
        jiuVar.d("a3c87502-8ed3-4bdf-8a39-a01bebede295", "Active Slot");
        jiuVar.d("a3c87503-8ed3-4bdf-8a39-a01bebede295", "Advertising Interval");
        jiuVar.d("a3c87504-8ed3-4bdf-8a39-a01bebede295", "Radio Tx Power");
        jiuVar.d("a3c87506-8ed3-4bdf-8a39-a01bebede295", "Lock State");
        jiuVar.d("a3c87507-8ed3-4bdf-8a39-a01bebede295", "Unlock");
        jiuVar.d("a3c87509-8ed3-4bdf-8a39-a01bebede295", "EID Identity Key");
        jiuVar.d("a3c8750a-8ed3-4bdf-8a39-a01bebede295", "ADV Slot Data");
        jiuVar.d("a3c8750e-8ed3-4bdf-8a39-a01bebede295", "Global Clock Value");
        jiuVar.d("fe2c1238-8366-4814-8eb0-01de32100bea", "ES+FP Beacon Actions");
        jiuVar.d("00002902-0000-1000-8000-00805f9b34fb", "Client Config Descriptor");
        jiuVar.d("15190001-12f4-c226-88ed-2ac5579f2a85", "Accessory Non-Owner Service");
        jiuVar.d("8e0c0001-1d68-fb92-bf61-48377421680e", "Accessory Non-Owner operations");
        e = jiuVar.b();
    }

    public static String a(UUID uuid) {
        return (String) e.getOrDefault(uuid.toString(), "Unknown characteristic");
    }
}
