package defpackage;

import android.os.SystemClock;
import com.google.android.apps.adm.integrations.spot.ringing.RingerService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifo implements ifk {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/RingerControlImpl");
    static final long b = TimeUnit.SECONDS.toMillis(40);
    static final long c = TimeUnit.SECONDS.toMillis(10);
    static final long d = TimeUnit.SECONDS.toMillis(3);
    public static final jjr e = jjr.r(iec.class, ied.class, iee.class, ief.class, ieg.class);
    public final jzd f;
    public final ibl g;
    public final long i;
    public jyz k;
    public long p;
    public final kuv q;
    private final kyf r;
    private final kzl s;
    private final kyh t;
    private final ifi u;
    private boolean v;
    private final kuv x;
    public final Object h = new Object();
    public ifj j = ifj.STOPPED;
    public jyz l = null;
    public jyz m = null;
    public boolean n = false;
    private boolean w = false;
    public boolean o = false;

    public ifo(jzd jzdVar, kuv kuvVar, kuv kuvVar2, kyf kyfVar, ibl iblVar, long j, kzl kzlVar, kyh kyhVar, ifi ifiVar) {
        this.f = jzdVar;
        this.x = kuvVar;
        this.q = kuvVar2;
        this.r = kyfVar;
        this.g = iblVar;
        this.i = TimeUnit.SECONDS.toMillis(j);
        this.s = kzlVar;
        this.t = kyhVar;
        this.u = ifiVar;
    }

    private final jyz j(ifr ifrVar, boolean z) {
        long j;
        int i;
        long j2;
        hwx.U(ifrVar.f());
        if (z) {
            j = this.p - SystemClock.elapsedRealtime();
            if (j <= 0) {
                i();
                return jyv.a;
            }
        } else {
            j = this.i;
        }
        long j3 = b;
        if (j > j3) {
            j2 = (SystemClock.elapsedRealtime() + j3) - c;
            i = (int) j3;
        } else {
            i = (int) j;
            j2 = -1;
        }
        c();
        return jbx.d(ifrVar.a(i, this.s, this.t, z)).e(new ifm(this, j2, 0), this.f);
    }

    private final void k() {
        synchronized (this.h) {
            jyz jyzVar = this.m;
            if (jyzVar != null) {
                jyzVar.cancel(false);
                this.m = null;
            }
        }
    }

    public final jyz a() {
        synchronized (this.h) {
            if (this.j == ifj.STOPPED) {
                return jyv.a;
            }
            ((jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/RingerControlImpl", "connectAndDoWork", 445, "RingerControlImpl.java")).r("Connecting for ringing operation");
            return jwb.h(jwu.h(jys.q(this.x.w(this.r, this.t, new hxj(this, 20))), new ifl(this, 1), this.f), ieq.class, new ifl(this, 0), this.f);
        }
    }

    public final jyz b(ifr ifrVar) {
        boolean z;
        jbx e2;
        jbx d2;
        jbx e3;
        synchronized (this.h) {
            int ordinal = this.j.ordinal();
            int i = 17;
            int i2 = 18;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal == 3) {
                        return jyv.a;
                    }
                    z = false;
                } else {
                    if (this.o) {
                        this.o = false;
                        return iuu.p(j(ifrVar, true), new ibz(this, ifrVar, 4), this.f);
                    }
                    idt g = ifrVar.g();
                    synchronized (this.h) {
                        jyz d3 = g.d();
                        this.k = d3;
                        e3 = jbx.d(d3).a(CancellationException.class, new iaf(i2), this.f).e(new huw(this, i), this.f);
                    }
                    return iuu.p(e3, new ibz(this, ifrVar, 5), this.f);
                }
            } else {
                this.w = false;
                z = true;
            }
            ifj ifjVar = this.j;
            jni jniVar = (jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/RingerControlImpl", "sendRequest", 277, "RingerControlImpl.java");
            String str = "start";
            if (true != z) {
                str = "stop";
            }
            jniVar.u("Sending %s ring request", str);
            if (z) {
                if (ifrVar.f()) {
                    d2 = jbx.d(j(ifrVar, false)).e(new huw(this, 16), jxv.a);
                } else {
                    d2 = jbx.d(ifrVar.a((int) this.i, this.s, this.t, false));
                }
                e2 = d2.e(new huw(this, i2), jxv.a);
            } else {
                e2 = jbx.d(ifrVar.c()).e(new iaf(i), jxv.a);
            }
            return iuu.p(iuu.o(e2, new ifn(this, z, ifjVar, ifrVar, 0), this.f), new ibz(this, ifrVar, 6), this.f);
        }
    }

    public final void c() {
        synchronized (this.h) {
            jyz jyzVar = this.l;
            if (jyzVar != null) {
                jyzVar.cancel(false);
                this.l = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, ifi] */
    public final void d(ifj ifjVar, long j, jer jerVar) {
        if (ifjVar == this.j) {
            return;
        }
        if (ifjVar != ifj.RINGING) {
            c();
        }
        this.j = ifjVar;
        ifi ifiVar = this.u;
        synchronized (((esh) ifiVar).h.a) {
            ((esh) ifiVar).e = ifjVar;
            if (ifjVar == ifj.RINGING) {
                ((esh) ifiVar).f = SystemClock.elapsedRealtime() + j;
            }
            if (((esh) ifiVar).g.g()) {
                ((esh) ifiVar).g.c().a(ifjVar, j, jerVar);
            }
            if (ifjVar == ifj.STOPPED && ((esh) ifiVar).e()) {
                RingerService ringerService = ((esh) ifiVar).h;
                ringerService.e = jdl.a;
                synchronized (ringerService.a) {
                    ringerService.b = false;
                    ringerService.c = false;
                }
                ringerService.stopSelf();
            }
        }
    }

    public final void e(boolean z) {
        String str;
        ifj ifjVar;
        synchronized (this.h) {
            jni jniVar = (jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/RingerControlImpl", "makeDeviceRing", 481, "RingerControlImpl.java");
            if (z) {
                str = "start";
            } else {
                str = "stop";
            }
            jniVar.y("Requested %s ringing: %s", str, this.t);
            if (z) {
                k();
            }
            if (z) {
                ifjVar = ifj.STARTING;
            } else {
                ifjVar = ifj.STOPPING;
            }
            if (this.j == ifjVar) {
                return;
            }
            d(ifjVar, 0L, jdl.a);
            if (this.v) {
                h();
            } else {
                this.v = true;
                ivc.N(a(), jbn.e(new dup(this, 18)), this.f);
            }
        }
    }

    public final void f(jer jerVar) {
        ifj ifjVar;
        synchronized (this.h) {
            this.v = false;
            long max = Math.max(0L, this.p - SystemClock.elapsedRealtime());
            if (max > 0 && this.n && !this.w) {
                ifjVar = ifj.RINGING;
            } else {
                ifjVar = ifj.STOPPED;
            }
            d(ifjVar, max, jerVar);
        }
    }

    public final void g(long j) {
        synchronized (this.h) {
            k();
            this.m = this.f.schedule(new csf(this, 19), j, TimeUnit.MILLISECONDS);
        }
    }

    public final void h() {
        synchronized (this.h) {
            jyz jyzVar = this.k;
            if (jyzVar != null) {
                jyzVar.cancel(false);
            }
        }
    }

    public final void i() {
        synchronized (this.h) {
            ifj ifjVar = this.j;
            if (ifjVar == ifj.RINGING || ifjVar == ifj.STOPPING) {
                d(ifj.STOPPED, 0L, jdl.a);
                this.w = true;
                h();
            }
        }
    }
}
