package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emx {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothSettingsImpl");
    public final Context b;
    public jer d;
    public jer e;
    public jer f;
    public jer g;
    public jer h;
    public boolean i;
    public final AtomicInteger j;
    public int k;
    public final fhq l;
    public final ilv m;
    public final dhx n;
    private final Executor o;
    private jbx q;
    private final bym r;
    public final cfn c = new cfn(null);
    private final Object p = new Object();

    public emx(bym bymVar, Context context, fhq fhqVar, dhx dhxVar, ilv ilvVar, Executor executor) {
        int i;
        jdl jdlVar = jdl.a;
        this.d = jdlVar;
        this.e = jdlVar;
        this.f = jdlVar;
        this.g = jdlVar;
        this.h = jdlVar;
        this.q = jbx.d(jyv.a);
        this.j = new AtomicInteger(0);
        this.r = bymVar;
        this.b = context;
        this.l = fhqVar;
        this.n = dhxVar;
        this.m = ilvVar;
        this.o = executor;
        if (bymVar == null) {
            i = 1;
        } else {
            i = 3;
        }
        this.k = i;
    }

    public final pf a(pe peVar, pd pdVar) {
        return peVar.L(new emw(), pdVar);
    }

    public final pf b(pe peVar, pd pdVar) {
        return peVar.L(new pr(), new dyd(pdVar, 4));
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
        fma.aH(true, "priority %d must be a Priority.PRIORITY_* constant", 100);
        locationRequest.a = 100;
        arrayList.add(locationRequest);
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, false, false);
        synchronized (this.p) {
            this.j.incrementAndGet();
            this.q = this.q.f(new ejc(this, locationSettingsRequest, 5), this.o).e(new eil(17), jxv.a).a(fhy.class, new eil(18), jxv.a).a(Throwable.class, new eil(19), jxv.a).e(new dyv(this, 20), this.o);
        }
    }

    public final void d() {
        if (this.k != 1) {
            bym bymVar = this.r;
            int i = 3;
            if (bymVar != null && bymVar.q()) {
                i = 2;
            }
            this.k = i;
        }
    }

    public final boolean e(pf pfVar) {
        if (this.k != 3) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothSettingsImpl", "enableBluetooth", 133, "BluetoothSettingsImpl.java")).r("Bluetooth not off, so it cannot be turned on");
            return false;
        }
        this.k = 4;
        pfVar.b(null);
        return true;
    }

    public final boolean f(pf pfVar) {
        if (!this.h.g() || ((fhy) this.h.c()).b() == null) {
            return false;
        }
        PendingIntent b = ((fhy) this.h.c()).b();
        b.getClass();
        IntentSender intentSender = b.getIntentSender();
        intentSender.getClass();
        pfVar.b(new pm(intentSender, null, 0, 0));
        return true;
    }

    public final boolean g() {
        d();
        if (this.k == 2) {
            if (!a.f() && h() != 2) {
                return false;
            }
            return emm.a(this.b);
        }
        return false;
    }

    public final int h() {
        if (!this.i) {
            return 1;
        }
        if (this.h.g()) {
            return 3;
        }
        return 2;
    }
}
