package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqg extends jpx {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile jow g;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        } else {
            z = true;
        }
        a = z;
        if (!"goldfish".equals(Build.HARDWARE) && !"ranchu".equals(Build.HARDWARE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        b = z2;
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z3 = true;
        }
        c = z3;
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public jqg(String str) {
        super(str);
        if (!a && !b) {
            if (c) {
                jqi jqiVar = jqk.c;
                String str2 = jqiVar.a;
                int i = jqiVar.f;
                this.g = new jqi(2, Level.OFF, jqiVar.c, jqiVar.d, jqiVar.e).a(a());
                return;
            }
            this.g = null;
            return;
        }
        this.g = new jpy().a(a());
    }

    public static void e() {
        while (true) {
            jqg jqgVar = (jqg) jqf.a.poll();
            if (jqgVar != null) {
                jqgVar.g = ((jpz) d.get()).a(jqgVar.a());
            } else {
                f();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [jov, java.lang.Object] */
    private static void f() {
        while (true) {
            kuv kuvVar = (kuv) f.poll();
            if (kuvVar != null) {
                e.getAndDecrement();
                ?? r1 = kuvVar.b;
                Object obj = kuvVar.a;
                if (!r1.D()) {
                    if (((jow) obj).d(r1.o())) {
                    }
                }
                ((jow) obj).c(r1);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.jpx, defpackage.jow
    public final void b(RuntimeException runtimeException, jov jovVar) {
        if (this.g != null) {
            this.g.b(runtimeException, jovVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.jow
    public final void c(jov jovVar) {
        if (this.g != null) {
            this.g.c(jovVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new kuv(this, jovVar, (byte[]) null));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.jow
    public final boolean d(Level level) {
        if (this.g != null && !this.g.d(level)) {
            return false;
        }
        return true;
    }
}
