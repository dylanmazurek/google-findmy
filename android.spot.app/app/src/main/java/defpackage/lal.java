package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lal implements ktp {
    public final jjr t;
    private final jis x;
    private final jiy y;
    private static final hmq u = new hmq("google.internal.spot.v1.SpotService");
    public static final hmq a = new hmq("google.internal.spot.v1.SpotService.");
    private static final hmq v = new hmq("google.internal.spot.v1.SpotService/");
    public static final kto b = new laj(10, (int[][]) null);
    public static final kto c = new laj(11, (boolean[][]) null);
    public static final kto d = new laj(12, (float[][]) null);
    public static final kto e = new laj(13, (byte[][][]) null);
    public static final kto f = new laj(14, (char[][][]) null);
    public static final kto g = new laj(15, (short[][][]) null);
    public static final kto h = new laj(16, (int[][][]) null);
    public static final kto i = new laj(17, (boolean[][][]) null);
    public static final kto j = new laj(18, (float[][][]) null);
    public static final kto k = new laj(2, (char[]) null);
    public static final kto l = new laj(3, (short[]) null);
    public static final kto m = new laj(4, (int[]) null);
    public static final kto n = new laj(5, (boolean[]) null);
    public static final kto o = new laj(6, (float[]) null);
    public static final kto p = new laj(7, (byte[][]) null);
    public static final kto q = new laj(8, (char[][]) null);
    public static final kto r = new laj(9, (short[][]) null);
    public static final lal s = new lal();
    private static final hmq w = new hmq("spot-pa.googleapis.com");

    private lal() {
        jin jinVar = new jin();
        jinVar.h("canary-spot-pa.sandbox.googleapis.com");
        jinVar.h("dev-spot-pa.sandbox.googleapis.com");
        jinVar.h("spot-pa.googleapis.com");
        jinVar.h("spot-pa.googleapis.com");
        this.x = jinVar.g();
        jjp jjpVar = new jjp();
        jjpVar.d("https://www.googleapis.com/auth/spot");
        jjpVar.d("https://www.googleapis.com/auth/android_device_manager");
        jjpVar.d("https://www.googleapis.com/auth/spot");
        jjpVar.d("https://www.googleapis.com/auth/android_device_manager");
        this.t = jjpVar.g();
        kto ktoVar = b;
        kto ktoVar2 = c;
        kto ktoVar3 = d;
        kto ktoVar4 = e;
        kto ktoVar5 = f;
        kto ktoVar6 = g;
        kto ktoVar7 = h;
        kto ktoVar8 = i;
        kto ktoVar9 = j;
        kto ktoVar10 = k;
        kto ktoVar11 = l;
        kto ktoVar12 = m;
        kto ktoVar13 = n;
        kto ktoVar14 = o;
        kto ktoVar15 = p;
        kto ktoVar16 = q;
        kto ktoVar17 = r;
        jjr.s(ktoVar, ktoVar2, ktoVar3, ktoVar4, ktoVar5, ktoVar6, ktoVar7, ktoVar8, ktoVar9, ktoVar10, ktoVar11, ktoVar12, ktoVar13, ktoVar14, ktoVar15, ktoVar16, ktoVar17);
        jiu jiuVar = new jiu();
        jiuVar.d("CreateUser", ktoVar);
        jiuVar.d("GetUser", ktoVar2);
        jiuVar.d("UpdateUser", ktoVar3);
        jiuVar.d("DeleteUser", ktoVar4);
        jiuVar.d("CreateBleDevice", ktoVar5);
        jiuVar.d("UpdateBleDevice", ktoVar6);
        jiuVar.d("UpdateBleDeviceSharingSettings", ktoVar7);
        jiuVar.d("ListBleDevices", ktoVar8);
        jiuVar.d("ListEidsForBleDevices", ktoVar9);
        jiuVar.d("GetEidInfoForE2eeDevices", ktoVar10);
        jiuVar.d("UploadPrecomputedPublicKeyIds", ktoVar11);
        jiuVar.d("RotateBleDeviceKeys", ktoVar12);
        jiuVar.d("GetBleDevice", ktoVar13);
        jiuVar.d("GetScannedDeviceInfo", ktoVar14);
        jiuVar.d("DeleteBleDevice", ktoVar15);
        jiuVar.d("GetServicePublicKey", ktoVar16);
        jiuVar.d("UploadClientActionResult", ktoVar17);
        this.y = jiuVar.b();
        new jiu().b();
    }

    @Override // defpackage.ktp
    public final hmq a() {
        return u;
    }

    @Override // defpackage.ktp
    public final hmq b() {
        return w;
    }

    @Override // defpackage.ktp
    public final kto c(String str) {
        String str2 = v.a;
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (this.y.containsKey(substring)) {
                return (kto) this.y.get(substring);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.ktp
    public final List d() {
        return this.x;
    }
}
