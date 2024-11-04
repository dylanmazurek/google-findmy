package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzb {
    public static final jnk a = jnk.l("com/google/android/libraries/precisionfinding/ranging/UwbAdapter");
    public final Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    public final Object f;
    public final jzc g;
    public int h;

    public hzb(Context context, jzc jzcVar) {
        Optional empty;
        Object obj = new Object();
        this.f = obj;
        if (context.getPackageManager().hasSystemFeature("android.hardware.uwb")) {
            fxf fxfVar = new fxf((char[]) null);
            fxfVar.a = 2;
            fma.aG(true, "deviceType must be set.");
            empty = Optional.of(new fuu(context, new ftt(fxfVar.a, fxfVar.hashCode())));
        } else {
            empty = Optional.empty();
        }
        this.b = empty;
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.c = Optional.empty();
        this.g = jzcVar;
        synchronized (obj) {
            this.h = 1;
        }
    }

    public final void a() {
        synchronized (this.f) {
            boolean z = true;
            if (this.h != 1) {
                z = false;
            }
            hwx.V(z, "Tried to clear object state while internalState != STOPPED");
        }
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
    }

    public final void b() {
        ((jni) ((jni) a.e()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter", "stopRanging", 194, "UwbAdapter.java")).r("UwbAdapter stopRanging.");
        Object obj = this.b.get();
        Object obj2 = this.c.get();
        fjy fjyVar = new fjy();
        fjyVar.a = new fpx(obj, obj2, 5);
        fjyVar.c = 1305;
        fjyVar.b = new Feature[]{ftb.i};
        iuu.q(fzo.b(((fhq) obj).h(fjyVar.a())), new dup(this, 15), this.g);
    }
}
