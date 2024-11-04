package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iaf implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ iaf(int i) {
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                kyf kyfVar = ((lac) obj).a;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                return jer.i(kyfVar);
            case 1:
                hym hymVar = (hym) obj;
                ((jni) ((jni) hyg.c.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "lambda$stopPrecisionFinding$3", 638, "PrecisionFindingImpl.java")).u("Sent stop ranging message with result: %s", hymVar);
                return hymVar;
            case 2:
                return null;
            case 3:
                jnk jnkVar = ibs.a;
                return null;
            case 4:
                int i = icn.c;
                return null;
            case 5:
                jnk jnkVar2 = idb.a;
                return null;
            case 6:
                jnk jnkVar3 = idb.a;
                lim j = ((lim) obj).j(2, 4);
                int i2 = iji.a;
                if (j.d() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.J(z);
                byte[] A = j.A();
                int length = A.length;
                if (length >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hwx.P(z2, "array too small: %s < %s", length, 2);
                byte b = A[0];
                return Long.valueOf(((char) ((short) ((A[1] & 255) | (b << 8)))) * 100);
            case 7:
                return Integer.valueOf(((ibj) obj).e);
            case 8:
                return null;
            case 9:
                return Long.valueOf(((ibj) obj).f);
            case 10:
                return null;
            case 11:
                ((jni) ((jni) ((jni) iey.a.f()).i((Throwable) obj)).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess", "lambda$start$1", (char) 139, "MulticomponentEddystoneBleTrackerProcess.java")).r("Tracking failed");
                return null;
            case 12:
                ies iesVar = (ies) obj;
                return iesVar.b.b(new huw(iesVar, 14));
            case 13:
                return ((ies) obj).a;
            case 14:
                byte[] bArr = (byte[]) obj;
                if (bArr.length == 1) {
                    BitSet valueOf = BitSet.valueOf(bArr);
                    jin jinVar = new jin();
                    for (hyh hyhVar : hyh.values()) {
                        if (valueOf.get(hyhVar.c)) {
                            jinVar.h(hyhVar);
                        }
                    }
                    jis g = jinVar.g();
                    if (g != null) {
                        return new hym(g);
                    }
                    throw new NullPointerException("Null successfulRangingTechnologies");
                }
                throw new IllegalArgumentException("Invalid message size");
            case 15:
                return ((ics) obj).a.A();
            case 16:
                return ((iiy) obj).b;
            case 17:
                return 0L;
            case 18:
                jnk jnkVar4 = ifo.a;
                return null;
            case 19:
                return jer.i((hot) obj);
            default:
                lae laeVar = (lae) obj;
                ((jni) ((jni) ihk.a.e()).j("com/google/android/libraries/spot/client/SharingOperationsImpl", "lambda$finalizeSharingApplication$14", 357, "SharingOperationsImpl.java")).r("Sharing application finalized successfully");
                return laeVar;
        }
    }
}
