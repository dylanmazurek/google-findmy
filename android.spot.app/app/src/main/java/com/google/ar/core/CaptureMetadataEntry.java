package com.google.ar.core;

import android.hardware.camera2.CaptureRequest;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CaptureMetadataEntry {
    private final CaptureRequest.Key key;
    private final Object value;

    public CaptureMetadataEntry(CaptureRequest.Key key, Object obj) {
        this.key = key;
        this.value = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getCaptureMetadataForPixelAndEmulatorDevices(String str, String str2, int i) {
        if (i >= 31) {
            ArrayList arrayList = new ArrayList(2);
            if (!str2.equals("oriole") && !str2.equals("raven") && !str2.equals("bluejay") && !str2.equals("panther") && !str2.equals("cheetah") && !str2.equals("lynx") && !str2.equals("shiba") && !str2.equals("husky") && !str2.equals("caiman") && !str2.equals("komodo") && !str2.equals("tokay")) {
                throw new UnavailableDeviceNotCompatibleException();
            }
            boolean equals = str.equals("1");
            boolean startsWith = str.startsWith("0");
            if (!equals && !startsWith) {
                throw new UnavailableDeviceNotCompatibleException();
            }
            arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("android.lens.opticalStabilizationMode", Integer.class), 0));
            arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("android.control.videoStabilizationMode", Integer.class), 0));
            arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("android.control.captureIntent", Integer.class), 3));
            if (!equals && ((!str2.equals("panther") && !str2.equals("cheetah")) || i < 34)) {
                if ((str2.equals("oriole") || str2.equals("raven")) && i >= 34) {
                    arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("android.control.sceneMode", Byte.class), (byte) 3));
                } else if ((str2.equals("oriole") || str2.equals("raven")) && i >= 33) {
                    arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("com.google.internal.SensorBinningMode", Byte.class), (byte) 1));
                    arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("android.control.sceneMode", Byte.class), (byte) 3));
                } else if (!str2.equals("oriole") && !str2.equals("raven")) {
                    if (str2.equals("bluejay") || str2.equals("panther") || str2.equals("cheetah") || str2.equals("lynx") || str2.equals("shiba") || str2.equals("husky") || str2.equals("caiman") || str2.equals("komodo") || str2.equals("tokay")) {
                        arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("com.google.internal.SensorBinningMode", Byte.class), (byte) 1));
                    }
                } else {
                    arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key("android.control.sceneMode", Byte.class), (byte) 3));
                }
            }
            return arrayList;
        }
        throw new UnavailableDeviceNotCompatibleException();
    }

    public void addToBuilder(CaptureRequest.Builder builder) {
        builder.set(this.key, this.value);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CaptureMetadataEntry)) {
            return false;
        }
        CaptureMetadataEntry captureMetadataEntry = (CaptureMetadataEntry) obj;
        if (!captureMetadataEntry.key.equals(this.key) || !captureMetadataEntry.value.equals(this.value)) {
            return false;
        }
        return true;
    }

    public CaptureRequest.Key getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        CaptureRequest.Key key = this.key;
        Object obj = this.value;
        return Objects.hash(key, obj, obj.getClass().getName());
    }

    public String toString() {
        CaptureRequest.Key key = this.key;
        Object obj = this.value;
        return String.format("[%s, %s, %s]", key, obj, obj.getClass().getName());
    }
}
