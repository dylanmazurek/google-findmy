package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class laj implements kto {
    private final hmq b;
    private final jjr c;
    private final /* synthetic */ int d;

    public laj(int i, byte[] bArr) {
        this.d = i;
        this.b = hmq.a(lak.a, new hmq("UploadScans"));
        this.c = jmo.a;
    }

    @Override // defpackage.kto
    public final hmq a() {
        switch (this.d) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            case 6:
                return this.b;
            case 7:
                return this.b;
            case 8:
                return this.b;
            case 9:
                return this.b;
            case 10:
                return this.b;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b;
            case 14:
                return this.b;
            case 15:
                return this.b;
            case 16:
                return this.b;
            case 17:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.kto
    public final ktp b() {
        switch (this.d) {
            case 0:
                return lak.d;
            case 1:
                return lak.d;
            case 2:
                return lal.s;
            case 3:
                return lal.s;
            case 4:
                return lal.s;
            case 5:
                return lal.s;
            case 6:
                return lal.s;
            case 7:
                return lal.s;
            case 8:
                return lal.s;
            case 9:
                return lal.s;
            case 10:
                return lal.s;
            case 11:
                return lal.s;
            case 12:
                return lal.s;
            case 13:
                return lal.s;
            case 14:
                return lal.s;
            case 15:
                return lal.s;
            case 16:
                return lal.s;
            case 17:
                return lal.s;
            default:
                return lal.s;
        }
    }

    @Override // defpackage.kto
    public final Set c() {
        switch (this.d) {
            case 0:
                if (this.c.isEmpty()) {
                    return lak.d.e;
                }
                return this.c;
            case 1:
                if (this.c.isEmpty()) {
                    return lak.d.e;
                }
                return this.c;
            case 2:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 3:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 4:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 5:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 6:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 7:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 8:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 9:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 10:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 11:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 12:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 13:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 14:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 15:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 16:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            case 17:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
            default:
                if (this.c.isEmpty()) {
                    return lal.s.t;
                }
                return this.c;
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                return this.b.a;
        }
    }

    public laj(int i) {
        this.d = i;
        this.b = hmq.a(lak.a, new hmq("UploadOwnerScans"));
        this.c = jmo.a;
    }

    public laj(int i, char[] cArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("GetEidInfoForE2eeDevices"));
        this.c = jmo.a;
    }

    public laj(int i, short[] sArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("UploadPrecomputedPublicKeyIds"));
        this.c = jmo.a;
    }

    public laj(int i, int[] iArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("RotateBleDeviceKeys"));
        this.c = jmo.a;
    }

    public laj(int i, boolean[] zArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("GetBleDevice"));
        this.c = jmo.a;
    }

    public laj(int i, float[] fArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("GetScannedDeviceInfo"));
        this.c = jmo.a;
    }

    public laj(int i, byte[][] bArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("DeleteBleDevice"));
        this.c = jmo.a;
    }

    public laj(int i, char[][] cArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("GetServicePublicKey"));
        this.c = jmo.a;
    }

    public laj(int i, short[][] sArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("UploadClientActionResult"));
        this.c = jmo.a;
    }

    public laj(int i, int[][] iArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("CreateUser"));
        this.c = jmo.a;
    }

    public laj(int i, boolean[][] zArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("GetUser"));
        this.c = jmo.a;
    }

    public laj(int i, float[][] fArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("UpdateUser"));
        this.c = jmo.a;
    }

    public laj(int i, byte[][][] bArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("DeleteUser"));
        this.c = jmo.a;
    }

    public laj(int i, char[][][] cArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("CreateBleDevice"));
        this.c = jmo.a;
    }

    public laj(int i, short[][][] sArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("UpdateBleDevice"));
        this.c = jmo.a;
    }

    public laj(int i, int[][][] iArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("UpdateBleDeviceSharingSettings"));
        this.c = jmo.a;
    }

    public laj(int i, boolean[][][] zArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("ListBleDevices"));
        this.c = jmo.a;
    }

    public laj(int i, float[][][] fArr) {
        this.d = i;
        this.b = hmq.a(lal.a, new hmq("ListEidsForBleDevices"));
        this.c = jmo.a;
    }
}
