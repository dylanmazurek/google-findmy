package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvd implements gur {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final gsk c;
    private final guq d;

    public gvd(Context context, gsk gskVar, guq guqVar) {
        this.b = context;
        this.c = gskVar;
        this.d = guqVar;
    }

    private static long d(Context context) {
        SecurityException securityException;
        long j = -1;
        try {
            long a2 = fyo.a(context.getContentResolver(), "android_id", -1L);
            if (a2 == -1) {
                try {
                    ((jol) ((jol) a.g()).j("com/google/android/libraries/notifications/platform/internal/rpc/impl/TargetCreatorHelperImpl", "getAndroidId", 179, "TargetCreatorHelperImpl.java")).r("Failed to get android ID.");
                    return a2;
                } catch (SecurityException e) {
                    securityException = e;
                    j = a2;
                    ((jol) ((jol) ((jol) a.f()).i(securityException)).j("com/google/android/libraries/notifications/platform/internal/rpc/impl/TargetCreatorHelperImpl", "getAndroidId", (char) 184, "TargetCreatorHelperImpl.java")).r("Exception reading GServices key.");
                    return j;
                }
            }
            return a2;
        } catch (SecurityException e2) {
            securityException = e2;
        }
    }

    private static long e(Context context) {
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
    }

    @Override // defpackage.gur
    public final ldd a(goa goaVar) {
        String str;
        ljh k = ldd.e.k();
        String packageName = this.b.getApplicationContext().getPackageName();
        if (!k.b.y()) {
            k.t();
        }
        ldd lddVar = (ldd) k.b;
        packageName.getClass();
        lddVar.a |= 1;
        lddVar.d = packageName;
        ljh k2 = lck.f.k();
        String packageName2 = this.b.getApplicationContext().getPackageName();
        if (!k2.b.y()) {
            k2.t();
        }
        lck lckVar = (lck) k2.b;
        packageName2.getClass();
        lckVar.a |= 8;
        lckVar.d = packageName2;
        long e = e(this.b);
        if (e != -1) {
            if (!k2.b.y()) {
                k2.t();
            }
            lck lckVar2 = (lck) k2.b;
            lckVar2.a |= 16;
            lckVar2.e = e;
        }
        if (lvy.a.a().a() || goaVar == null) {
            String b = this.c.b();
            if (!TextUtils.isEmpty(b)) {
                if (!k2.b.y()) {
                    k2.t();
                }
                lck lckVar3 = (lck) k2.b;
                b.getClass();
                lckVar3.a |= 1;
                lckVar3.b = b;
            }
            long d = d(this.b);
            if (d != -1) {
                if (!k2.b.y()) {
                    k2.t();
                }
                lck lckVar4 = (lck) k2.b;
                lckVar4.a |= 4;
                lckVar4.c = d;
            }
        }
        ljh k3 = ldc.e.k();
        if (!k3.b.y()) {
            k3.t();
        }
        ldc ldcVar = (ldc) k3.b;
        ldcVar.b = 3;
        ldcVar.a |= 1;
        ljh k4 = lcg.c.k();
        lck lckVar5 = (lck) k2.q();
        if (!k4.b.y()) {
            k4.t();
        }
        lcg lcgVar = (lcg) k4.b;
        lckVar5.getClass();
        lcgVar.b = lckVar5;
        lcgVar.a = 2;
        lcg lcgVar2 = (lcg) k4.q();
        if (!k3.b.y()) {
            k3.t();
        }
        ljn ljnVar = k3.b;
        ldc ldcVar2 = (ldc) ljnVar;
        lcgVar2.getClass();
        ldcVar2.c = lcgVar2;
        ldcVar2.a = 2 | ldcVar2.a;
        if (goaVar != null && (str = goaVar.i) != null) {
            if (!ljnVar.y()) {
                k3.t();
            }
            ldc ldcVar3 = (ldc) k3.b;
            ldcVar3.a |= 8;
            ldcVar3.d = str;
        }
        ldc ldcVar4 = (ldc) k3.q();
        if (!k.b.y()) {
            k.t();
        }
        ldd lddVar2 = (ldd) k.b;
        ldcVar4.getClass();
        lddVar2.c = ldcVar4;
        lddVar2.b = 1;
        return (ldd) k.q();
    }

    @Override // defpackage.gur
    public final lfj b(goa goaVar) {
        ljh k = ldx.g.k();
        String packageName = this.b.getApplicationContext().getPackageName();
        if (!k.b.y()) {
            k.t();
        }
        ldx ldxVar = (ldx) k.b;
        packageName.getClass();
        ldxVar.a |= 8;
        ldxVar.e = packageName;
        String c = this.c.c();
        if (!k.b.y()) {
            k.t();
        }
        ldx ldxVar2 = (ldx) k.b;
        ldxVar2.a |= 1;
        ldxVar2.b = c;
        long d = d(this.b);
        if (d != -1) {
            if (!k.b.y()) {
                k.t();
            }
            ldx ldxVar3 = (ldx) k.b;
            ldxVar3.a |= 4;
            ldxVar3.d = d;
        }
        long e = e(this.b);
        if (e != -1) {
            if (!k.b.y()) {
                k.t();
            }
            ldx ldxVar4 = (ldx) k.b;
            ldxVar4.a |= 16;
            ldxVar4.f = e;
        }
        ljh k2 = lfj.e.k();
        if (!k2.b.y()) {
            k2.t();
        }
        lfj lfjVar = (lfj) k2.b;
        lfjVar.b = 3;
        lfjVar.a |= 1;
        ljh k3 = ldr.c.k();
        ldx ldxVar5 = (ldx) k.q();
        if (!k3.b.y()) {
            k3.t();
        }
        ldr ldrVar = (ldr) k3.b;
        ldxVar5.getClass();
        ldrVar.b = ldxVar5;
        ldrVar.a = 1;
        ldr ldrVar2 = (ldr) k3.q();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar = k2.b;
        lfj lfjVar2 = (lfj) ljnVar;
        ldrVar2.getClass();
        lfjVar2.c = ldrVar2;
        lfjVar2.a |= 2;
        String str = goaVar.i;
        if (str != null) {
            if (!ljnVar.y()) {
                k2.t();
            }
            lfj lfjVar3 = (lfj) k2.b;
            lfjVar3.a |= 4;
            lfjVar3.d = str;
        }
        return (lfj) k2.q();
    }

    @Override // defpackage.gur
    public final lfk c(goa goaVar) {
        ljh k = lfk.f.k();
        String packageName = this.b.getApplicationContext().getPackageName();
        if (!k.b.y()) {
            k.t();
        }
        lfk lfkVar = (lfk) k.b;
        packageName.getClass();
        lfkVar.a |= 1;
        lfkVar.d = packageName;
        lfj b = b(goaVar);
        if (!k.b.y()) {
            k.t();
        }
        lfk lfkVar2 = (lfk) k.b;
        b.getClass();
        lfkVar2.c = b;
        lfkVar2.b = 1;
        List a2 = this.d.a(goaVar.b());
        if (a2 != null && !a2.isEmpty()) {
            if (!k.b.y()) {
                k.t();
            }
            lfk lfkVar3 = (lfk) k.b;
            ljv ljvVar = lfkVar3.e;
            if (!ljvVar.c()) {
                lfkVar3.e = ljn.p(ljvVar);
            }
            lhv.g(a2, lfkVar3.e);
        }
        return (lfk) k.q();
    }
}
