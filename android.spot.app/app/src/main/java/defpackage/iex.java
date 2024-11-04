package defpackage;

import android.os.SystemClock;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iex implements icj {
    public final boolean a;
    public bmf b;
    final /* synthetic */ iey c;
    private final EnumSet d = EnumSet.noneOf(kyh.class);
    private ick e;

    public iex(iey ieyVar, boolean z) {
        this.c = ieyVar;
        this.a = z;
    }

    @Override // defpackage.icj
    public final void a(ick ickVar) {
        if (ickVar.b.d()) {
            ((jni) ((jni) ((jni) iey.a.g()).g(10, TimeUnit.SECONDS)).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess$ScanTask", "onScanResult", 372, "MulticomponentEddystoneBleTrackerProcess.java")).r("Unexpected regular EID found for multicomponent device");
            return;
        }
        this.c.l.d(ickVar);
        ihx a = ickVar.b.a();
        int i = 1;
        if (a == ihx.CASE || a == ihx.BOTH_BUDS || a == ihx.CASE_WITH_BOTH_BUDS) {
            if (this.a) {
                ((jni) ((jni) iey.a.e()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess$ScanTask", "onTargetComponentFound", 408, "MulticomponentEddystoneBleTrackerProcess.java")).u("Initial scan - target component found: %s", ickVar.b);
                ick ickVar2 = this.e;
                if (ickVar2 == null || ickVar2.b.a() == ihx.CASE) {
                    this.e = ickVar;
                }
            } else {
                ((jni) ((jni) iey.a.e()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess$ScanTask", "onTargetComponentFound", 419, "MulticomponentEddystoneBleTrackerProcess.java")).u("Subsequent scan - target component found: %s", ickVar.b);
                ihy ihyVar = ickVar.b;
                iey ieyVar = this.c;
                ihx a2 = ihyVar.a();
                if (!ieyVar.e && !ieyVar.d.contains(a2)) {
                    this.e = ickVar;
                }
                if (a2 == ihx.BOTH_BUDS || a2 == ihx.CASE_WITH_BOTH_BUDS) {
                    if (!this.c.g.g()) {
                        this.e = ickVar;
                    } else {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) this.c.g.c()).longValue();
                        if (!this.c.h) {
                            ((jni) ((jni) iey.a.g()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess$ScanTask", "onTargetComponentFound", 435, "MulticomponentEddystoneBleTrackerProcess.java")).I(a2, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime));
                            this.c.h = true;
                        }
                        if (TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime) >= 30) {
                            this.e = ickVar;
                        }
                    }
                }
            }
        }
        if (this.a) {
            this.d.addAll(a.g);
            EnumSet enumSet = this.d;
            kyf kyfVar = this.c.c;
            int size = enumSet.size();
            kyg kygVar = kyfVar.g;
            if (kygVar == null) {
                kygVar = kyg.d;
            }
            int I = a.I(kygVar.c);
            if (I != 0) {
                i = I;
            }
            if (size == a.C(i)) {
                b();
                return;
            }
            return;
        }
        b();
    }

    public final void b() {
        ick ickVar = this.e;
        if (ickVar != null) {
            ((jni) ((jni) iey.a.e()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess$ScanTask", "stopScanIfTargetFound", 400, "MulticomponentEddystoneBleTrackerProcess.java")).u("Stopping scan, selecting %s", ickVar.b);
            this.b.c(ickVar);
        }
    }
}
