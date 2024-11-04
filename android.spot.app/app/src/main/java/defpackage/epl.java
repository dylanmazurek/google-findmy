package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epl {
    public final int a;
    public final Object b;
    public epo c;
    public jer d;
    public jer e;
    private final kyf f;
    private final kyh g;
    private final jzd h;
    private final hya i;
    private jer j;
    private final cfm k;
    private jzb l;
    private final kqr m;

    public epl(kyf kyfVar, kyh kyhVar, kqr kqrVar, jzd jzdVar) {
        int i;
        Duration ofMillis = Duration.ofMillis(lua.a.a().q());
        if (ofMillis != null) {
            Duration ofMillis2 = Duration.ofMillis(lua.a.a().t());
            if (ofMillis2 != null) {
                Duration ofMillis3 = Duration.ofMillis(lua.a.a().r());
                if (ofMillis3 != null) {
                    Duration ofMillis4 = Duration.ofMillis(lua.a.a().u());
                    if (ofMillis4 != null) {
                        Duration ofMillis5 = Duration.ofMillis(lua.a.a().v());
                        if (ofMillis5 != null) {
                            Duration ofMillis6 = Duration.ofMillis(lua.a.a().s());
                            if (ofMillis6 != null) {
                                float a = (float) lua.a.a().a();
                                float b = (float) lua.a.a().b();
                                Optional.empty().isPresent();
                                hwx.K(true, "RangeWithSelectedTechnologies should be set only when RangeWithAllAvailableTechnologies is set to false");
                                jis q = jis.q(hyh.UWB);
                                if (q != null) {
                                    this.i = new hya(true, q, ofMillis2, ofMillis, ofMillis3, ofMillis4, ofMillis5, ofMillis6, a, b);
                                    this.j = jdl.a;
                                    this.b = new Object();
                                    this.k = new cfm(epk.a);
                                    jdl jdlVar = jdl.a;
                                    this.d = jdlVar;
                                    this.e = jdlVar;
                                    this.f = kyfVar;
                                    if (true != hqk.c(kyfVar)) {
                                        i = -60;
                                    } else {
                                        i = -48;
                                    }
                                    this.a = i;
                                    this.g = kyhVar;
                                    this.m = kqrVar;
                                    this.h = jzdVar;
                                    return;
                                }
                                throw new NullPointerException("Null rangeWithSelectedTechnologies");
                            }
                            throw new NullPointerException("Null initTimeout");
                        }
                        throw new NullPointerException("Null noUpdateTimeout");
                    }
                    throw new NullPointerException("Null maxUpdateInterval");
                }
                throw new NullPointerException("Null estimateLevelRecalculationDuration");
            }
            throw new NullPointerException("Null initialEstimateLevelConvergenceDuration");
        }
        throw new NullPointerException("Null driftTimeout");
    }

    private final boolean e() {
        boolean z;
        synchronized (this.b) {
            if (this.l != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final cfk a() {
        if (!e()) {
            c();
        }
        return this.k;
    }

    public final void b() {
        epo epoVar = this.c;
        epoVar.getClass();
        jer i = jer.i(Double.valueOf(epoVar.a(SystemClock.elapsedRealtime())));
        jer jerVar = this.d;
        if (jerVar != null) {
            jer jerVar2 = this.e;
            if (jerVar2 != null) {
                this.k.i(new epk(i, jerVar, jerVar2));
                return;
            }
            throw new NullPointerException("Null bearingRads");
        }
        throw new NullPointerException("Null rangeMeters");
    }

    /* JADX WARN: Type inference failed for: r2v38, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [mko, java.lang.Object] */
    public final void c() {
        jyz o;
        jyz o2;
        jer jerVar;
        if (e()) {
            return;
        }
        synchronized (this.b) {
            this.c = new epo();
            if (!this.j.g()) {
                kqr kqrVar = this.m;
                kyf kyfVar = this.f;
                kyh kyhVar = this.g;
                ah ahVar = new ah(this, 12);
                if (lua.l()) {
                    jerVar = jer.i(this.i);
                } else {
                    jerVar = jdl.a;
                }
                fma fmaVar = (fma) kqrVar.c.a();
                fmaVar.getClass();
                hot a = ((idv) kqrVar.b).a();
                hnu hnuVar = (hnu) ((lsi) kqrVar.d).b;
                hnuVar.getClass();
                kuv a2 = ((iiz) kqrVar.f).a();
                jzd jzdVar = (jzd) kqrVar.a.a();
                jzdVar.getClass();
                hnu hnuVar2 = (hnu) ((lsi) kqrVar.e).b;
                hnuVar2.getClass();
                this.j = jer.i(new ifh(fmaVar, a, hnuVar, a2, jzdVar, hnuVar2, kyfVar, kyhVar, ahVar, jerVar));
            }
            Object c = this.j.c();
            hwx.V(!((ifh) c).i.g(), "Already connected to device.");
            ibh l = ((ifh) c).q.l(((ifh) c).d, ((ifh) c).e, new ifg((ifh) c));
            l.a();
            ((ifh) c).i = jer.i(l);
            int i = 15;
            if (!((ifh) c).c.g()) {
                o2 = ivc.E(jdl.a);
            } else {
                kyq kyqVar = ((ifh) c).d.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                if (kyqVar.e.z()) {
                    o = ivc.E(jdl.a);
                } else {
                    kuv kuvVar = ((ifh) c).r;
                    kyq kyqVar2 = ((ifh) c).d.f;
                    if (kyqVar2 == null) {
                        kyqVar2 = kyq.g;
                    }
                    o = iuu.o(kuvVar.s(kyqVar2), new iaf(16), ((ifh) c).f);
                }
                o2 = iuu.o(o, new huw(c, i), ((ifh) c).f);
            }
            iuu.p(o2, new hxj(c, 19), ((ifh) c).f);
            this.l = this.h.scheduleWithFixedDelay(new dzw(this, 15), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ibh] */
    public final void d() {
        synchronized (this.b) {
            jzb jzbVar = this.l;
            if (jzbVar != null) {
                jzbVar.cancel(false);
                this.l = null;
            }
            this.k.i(epk.a);
            if (this.j.g()) {
                Object c = this.j.c();
                if (((ifh) c).i.g()) {
                    ((ifh) c).i.c().close();
                    ((ifh) c).i = jdl.a;
                    ((ifh) c).a();
                    if (((ifh) c).j.g()) {
                        ((hxz) ((ifh) c).j.c()).b();
                        ((ifh) c).j = jdl.a;
                    }
                    ((ifh) c).c();
                }
            }
            this.c = null;
        }
    }
}
