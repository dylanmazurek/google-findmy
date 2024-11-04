package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcn {
    private static volatile fcn i;
    public final Context a;
    public final Context b;
    public final fdc c;
    public final fdn d;
    public final fdf e;
    public final fdr f;
    public final fde g;
    public final flt h;
    private final fbm j;
    private final fcj k;
    private final fdw l;
    private final fbb m;
    private final fda n;
    private final fch o;
    private final fcu p;

    protected fcn(gok gokVar) {
        Object obj = gokVar.a;
        fma.aS(obj, "Application context can't be null");
        Object obj2 = gokVar.b;
        fma.aR(obj2);
        this.a = (Context) obj;
        this.b = (Context) obj2;
        this.h = flt.a;
        this.c = new fdc(this);
        fdn fdnVar = new fdn(this);
        fdnVar.I();
        this.d = fdnVar;
        h().E(4, a.ag(fcm.a, "Google Analytics ", " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"), null, null, null);
        fdr fdrVar = new fdr(this);
        fdrVar.I();
        this.f = fdrVar;
        fdw fdwVar = new fdw(this);
        fdwVar.I();
        this.l = fdwVar;
        fcj fcjVar = new fcj(this);
        fda fdaVar = new fda(this);
        fch fchVar = new fch(this);
        fcu fcuVar = new fcu(this);
        fde fdeVar = new fde(this);
        fma.aR(obj);
        if (fbm.a == null) {
            synchronized (fbm.class) {
                if (fbm.a == null) {
                    fbm.a = new fbm((Context) obj);
                }
            }
        }
        fbm fbmVar = fbm.a;
        fbmVar.f = new mgc(this, 1);
        this.j = fbmVar;
        fbb fbbVar = new fbb(this);
        fdaVar.I();
        this.n = fdaVar;
        fchVar.I();
        this.o = fchVar;
        fcuVar.I();
        this.p = fcuVar;
        fdeVar.I();
        this.g = fdeVar;
        fdf fdfVar = new fdf(this);
        fdfVar.I();
        this.e = fdfVar;
        fcjVar.I();
        this.k = fcjVar;
        fdw i2 = fbbVar.a.i();
        i2.H();
        i2.H();
        if (i2.f) {
            i2.H();
            fbbVar.e = i2.g;
        }
        i2.H();
        fbbVar.d = true;
        this.m = fbbVar;
        fcy fcyVar = fcjVar.a;
        fcyVar.H();
        fma.aO(!fcyVar.a, "Analytics backend already started");
        fcyVar.a = true;
        fcyVar.h().c(new eta(fcyVar, 7, null));
    }

    public static fcn e(Context context) {
        fma.aR(context);
        if (i == null) {
            synchronized (fcn.class) {
                if (i == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    fcn fcnVar = new fcn(new gok(context, (byte[]) null, (byte[]) null));
                    i = fcnVar;
                    List list = fbb.c;
                    synchronized (fbb.class) {
                        List list2 = fbb.c;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            fbb.c = null;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    Long l = (Long) fdh.D.x();
                    if (elapsedRealtime2 > l.longValue()) {
                        fcnVar.h().D("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), l);
                    }
                }
            }
        }
        return i;
    }

    public static final void j(fcl fclVar) {
        fma.aS(fclVar, "Analytics service not created/initialized");
        fma.aG(fclVar.J(), "Analytics service not initialized");
    }

    public final fbb a() {
        fma.aR(this.m);
        fma.aG(this.m.d, "Analytics instance not initialized");
        return this.m;
    }

    public final fbm b() {
        fma.aR(this.j);
        return this.j;
    }

    public final fch c() {
        j(this.o);
        return this.o;
    }

    public final fcj d() {
        j(this.k);
        return this.k;
    }

    public final fcu f() {
        j(this.p);
        return this.p;
    }

    public final fda g() {
        j(this.n);
        return this.n;
    }

    public final fdn h() {
        j(this.d);
        return this.d;
    }

    public final fdw i() {
        j(this.l);
        return this.l;
    }
}
