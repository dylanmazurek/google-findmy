package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqw extends hrb implements hnl, hpg {
    private final Context a;
    private final hnu b;
    private final hrh c;
    private final hqr d;
    private final hqu e;
    private final ArrayMap f;
    private final hpd g;
    private final mko h;
    private final lqz i;
    private final jfe j;
    private final mko k;

    /* JADX WARN: Type inference failed for: r5v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [mko, java.lang.Object] */
    public hqw(hpe hpeVar, Context context, hnu hnuVar, lqz lqzVar, hqr hqrVar, mko mkoVar, mko mkoVar2, Executor executor, lqz lqzVar2, hri hriVar, mko mkoVar3, mko mkoVar4, hrc hrcVar) {
        boolean z;
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        this.g = hpeVar.a(executor, lqzVar, mkoVar2);
        this.a = context;
        this.b = hnuVar;
        this.h = mkoVar;
        this.d = hqrVar;
        this.i = lqzVar2;
        this.j = hwx.H(new hiy(mkoVar4, context, 4));
        this.k = mkoVar4;
        hqu hquVar = new hqu(context, arrayMap, mkoVar3);
        this.e = hquVar;
        ?? a = hriVar.a.a();
        a.getClass();
        jzd jzdVar = (jzd) hriVar.b.a();
        jzdVar.getClass();
        this.c = new hrh(a, jzdVar, hquVar);
    }

    public static /* synthetic */ String b(mko mkoVar, Context context) {
        return ((hrg) mkoVar.a()).a.replace("%PACKAGE_NAME%", context.getPackageName());
    }

    @Override // defpackage.hpg
    public void Y() {
        this.b.a(this.c);
        this.b.a(this.d);
    }

    public jyz a(Activity activity) {
        hqy hqyVar;
        nfa nfaVar;
        boolean isEnabled;
        int i;
        Object obj = this.g.e;
        hqv c = hqv.c(activity);
        htu htuVar = (htu) obj;
        boolean z = htuVar.b;
        htz htzVar = htuVar.a;
        if (z && htzVar.c()) {
            synchronized (this.f) {
                hqyVar = (hqy) this.f.remove(c);
                if (this.f.isEmpty()) {
                    this.c.j();
                }
            }
            if (hqyVar == null) {
                ((jni) ((jni) hmz.a.e()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 247, "FrameMetricServiceImpl.java")).u("Measurement not found: %s", new hnh(((hqs) c).a));
                return jyv.a;
            }
            String d = c.d();
            int i2 = 0;
            if (Build.VERSION.SDK_INT >= 29) {
                isEnabled = Trace.isEnabled();
                if (isEnabled) {
                    Trace.endAsyncSection(String.format("J<%s>", d), 352691800);
                    for (hrf hrfVar : ((hrg) this.k.a()).b) {
                        int G = a.G(hrfVar.a);
                        if (G == 0) {
                            G = 1;
                        }
                        switch (G - 1) {
                            case 1:
                                i = 0;
                                break;
                            case 2:
                                i = hqyVar.f;
                                break;
                            case 3:
                                i = hqyVar.h;
                                break;
                            case 4:
                                i = hqyVar.i;
                                break;
                            case 5:
                                i = hqyVar.j;
                                break;
                            case 6:
                                i = hqyVar.k;
                                break;
                            case 7:
                                i = hqyVar.m;
                                break;
                            default:
                                ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "endTraceSectionAndEmitCounters", 394, "FrameMetricServiceImpl.java")).u("UNKNOWN COUNTER with %s as the name", hrfVar.b);
                                continue;
                        }
                        Trace.setCounter(hrfVar.b.replace("%EVENT_NAME%", d), i);
                    }
                }
            }
            if (hqyVar.h == 0) {
                return jyv.a;
            }
            if (((hrg) this.k.a()).c && hqyVar.m <= TimeUnit.SECONDS.toMillis(9L) && hqyVar.f != 0) {
                ((hpk) this.i.a()).a((String) this.j.a());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - hqyVar.c;
            ljh k = nex.o.k();
            if (!k.b.y()) {
                k.t();
            }
            int i3 = ((int) elapsedRealtime) + 1;
            ljn ljnVar = k.b;
            nex nexVar = (nex) ljnVar;
            nexVar.a |= 16;
            nexVar.f = i3;
            int i4 = hqyVar.f;
            if (!ljnVar.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            nex nexVar2 = (nex) ljnVar2;
            nexVar2.a |= 1;
            nexVar2.b = i4;
            int i5 = hqyVar.h;
            if (!ljnVar2.y()) {
                k.t();
            }
            ljn ljnVar3 = k.b;
            nex nexVar3 = (nex) ljnVar3;
            nexVar3.a |= 2;
            nexVar3.c = i5;
            int i6 = hqyVar.i;
            if (!ljnVar3.y()) {
                k.t();
            }
            ljn ljnVar4 = k.b;
            nex nexVar4 = (nex) ljnVar4;
            nexVar4.a |= 4;
            nexVar4.d = i6;
            int i7 = hqyVar.k;
            if (!ljnVar4.y()) {
                k.t();
            }
            ljn ljnVar5 = k.b;
            nex nexVar5 = (nex) ljnVar5;
            nexVar5.a |= 32;
            nexVar5.g = i7;
            int i8 = hqyVar.m;
            if (!ljnVar5.y()) {
                k.t();
            }
            ljn ljnVar6 = k.b;
            nex nexVar6 = (nex) ljnVar6;
            nexVar6.a |= 64;
            nexVar6.h = i8;
            int i9 = hqyVar.j;
            if (!ljnVar6.y()) {
                k.t();
            }
            nex nexVar7 = (nex) k.b;
            nexVar7.a |= 8;
            nexVar7.e = i9;
            int i10 = hqyVar.n;
            if (i10 != Integer.MIN_VALUE) {
                int[] iArr = hqyVar.e;
                int[] iArr2 = hqy.b;
                ljh k2 = nfa.c.k();
                int i11 = 0;
                while (true) {
                    if (i11 < 52) {
                        if (iArr2[i11] > i10) {
                            k2.al(0);
                            k2.ak(i10 + 1);
                            nfaVar = (nfa) k2.q();
                        } else {
                            int i12 = iArr[i11];
                            if (i12 > 0 || (i11 > 0 && iArr[i11 - 1] > 0)) {
                                k2.al(i12);
                                k2.ak(iArr2[i11]);
                            }
                            i11++;
                        }
                    } else {
                        if (iArr[51] > 0) {
                            k2.ak(i10 + 1);
                            k2.al(0);
                        }
                        nfaVar = (nfa) k2.q();
                    }
                }
                if (!k.b.y()) {
                    k.t();
                }
                ljn ljnVar7 = k.b;
                nex nexVar8 = (nex) ljnVar7;
                nfaVar.getClass();
                nexVar8.n = nfaVar;
                nexVar8.a |= 2048;
                int i13 = hqyVar.g;
                if (!ljnVar7.y()) {
                    k.t();
                }
                ljn ljnVar8 = k.b;
                nex nexVar9 = (nex) ljnVar8;
                nexVar9.a |= 512;
                nexVar9.l = i13;
                int i14 = hqyVar.l;
                if (!ljnVar8.y()) {
                    k.t();
                }
                nex nexVar10 = (nex) k.b;
                nexVar10.a |= 1024;
                nexVar10.m = i14;
            }
            while (i2 < 28) {
                int i15 = i2 + 1;
                if (hqyVar.d[i2] > 0) {
                    ljh k3 = Cnew.e.k();
                    int i16 = hqyVar.d[i2];
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    ljn ljnVar9 = k3.b;
                    Cnew cnew = (Cnew) ljnVar9;
                    cnew.a |= 1;
                    cnew.b = i16;
                    int i17 = hqy.a[i2];
                    if (!ljnVar9.y()) {
                        k3.t();
                    }
                    ljn ljnVar10 = k3.b;
                    Cnew cnew2 = (Cnew) ljnVar10;
                    cnew2.a |= 2;
                    cnew2.c = i17;
                    if (i15 < 28) {
                        int i18 = hqy.a[i15] - 1;
                        if (!ljnVar10.y()) {
                            k3.t();
                        }
                        Cnew cnew3 = (Cnew) k3.b;
                        cnew3.a |= 4;
                        cnew3.d = i18;
                    }
                    if (!k.b.y()) {
                        k.t();
                    }
                    nex nexVar11 = (nex) k.b;
                    Cnew cnew4 = (Cnew) k3.q();
                    cnew4.getClass();
                    ljv ljvVar = nexVar11.j;
                    if (!ljvVar.c()) {
                        nexVar11.j = ljn.p(ljvVar);
                    }
                    nexVar11.j.add(cnew4);
                }
                i2 = i15;
            }
            nex nexVar12 = (nex) k.q();
            jer a = hqt.a(this.a);
            if (a.g()) {
                ljh ljhVar = (ljh) nexVar12.z(5);
                ljhVar.w(nexVar12);
                int intValue = ((Float) a.c()).intValue();
                if (!ljhVar.b.y()) {
                    ljhVar.t();
                }
                nex nexVar13 = (nex) ljhVar.b;
                nexVar13.a |= 256;
                nexVar13.k = intValue;
                nexVar12 = (nex) ljhVar.q();
            }
            ljh k4 = nfe.v.k();
            if (!k4.b.y()) {
                k4.t();
            }
            nfe nfeVar = (nfe) k4.b;
            nexVar12.getClass();
            nfeVar.j = nexVar12;
            nfeVar.a |= 1024;
            nfe nfeVar2 = (nfe) k4.q();
            hpd hpdVar = this.g;
            hoy a2 = hoz.a();
            a2.e(nfeVar2);
            a2.b = null;
            a2.c = "Activity";
            a2.a = c.d();
            a2.c(true);
            return hpdVar.b(a2.a());
        }
        return jyv.a;
    }

    public void c(Activity activity) {
        boolean isEnabled;
        hqv c = hqv.c(activity);
        if (!this.g.c(c.d())) {
            return;
        }
        synchronized (this.f) {
            if (this.f.size() >= 25) {
                ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 174, "FrameMetricServiceImpl.java")).u("Too many concurrent measurements, ignoring %s", c);
                return;
            }
            hqy hqyVar = (hqy) this.f.put(c, ((hqz) this.h).a());
            if (hqyVar != null) {
                this.f.put(c, hqyVar);
                ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 187, "FrameMetricServiceImpl.java")).u("measurement already started: %s", c);
                return;
            }
            if (this.f.size() == 1) {
                this.c.i();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                isEnabled = Trace.isEnabled();
                if (isEnabled) {
                    Trace.beginAsyncSection(String.format("J<%s>", c.d()), 352691800);
                }
            }
        }
    }

    @Override // defpackage.hnl
    public void i(hmq hmqVar) {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    @Override // defpackage.hnl
    public /* synthetic */ void j(hmq hmqVar) {
    }
}
