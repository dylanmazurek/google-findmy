package defpackage;

import com.google.android.gms.common.Feature;
import j$.time.Duration;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyg implements hxz {
    public static final jiy a;
    public static final jiy b;
    public static final jnk c;
    private static final int[] t = {9, 10, 11, 12};
    private static final int[] u = {25, 26, 27, 28, 19, 30, 31, 32};
    public final ExecutorService d;
    public final Object e;
    public final hya f;
    public Optional g;
    public Optional h;
    public jis i;
    public jis j;
    public Optional k;
    public Optional l;
    public boolean m;
    public boolean n;
    int o;
    public int p;
    public final hyy q;
    public final hri r;
    public final njz s;
    private final lim v;

    static {
        hwx.B(0, 0);
        hwx.B(1, 8);
        hwx.B(2, 6);
        hwx.B(3, 7);
        a = jmn.a(4, new Object[]{0, 0, 1, 8, 2, 6, 3, 7});
        hyr hyrVar = hyr.OK;
        hyr hyrVar2 = hyr.BAD_STATE;
        hyr hyrVar3 = hyr.POOR_LIGHTNING;
        hyr hyrVar4 = hyr.EXCESSIVE_MOTION;
        hyr hyrVar5 = hyr.INSUFFICIENT_FEATURES;
        hyr hyrVar6 = hyr.CAMERA_UNAVAILABLE;
        hyr hyrVar7 = hyr.NOT_ENABLED;
        hwx.B(hyrVar, 0);
        hwx.B(hyrVar2, 1);
        hwx.B(hyrVar3, 2);
        hwx.B(hyrVar4, 3);
        hwx.B(hyrVar5, 4);
        hwx.B(hyrVar6, 5);
        hwx.B(hyrVar7, 6);
        b = jmn.a(7, new Object[]{hyrVar, 0, hyrVar2, 1, hyrVar3, 2, hyrVar4, 3, hyrVar5, 4, hyrVar6, 5, hyrVar7, 6});
        c = jnk.l("com/google/android/libraries/precisionfinding/PrecisionFindingImpl");
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v86, types: [mko, java.lang.Object] */
    public hyg(hya hyaVar, lim limVar, hri hriVar, njz njzVar, hnu hnuVar, ExecutorService executorService) {
        Object obj = new Object();
        this.e = obj;
        this.f = hyaVar;
        this.v = limVar;
        this.r = hriVar;
        this.s = njzVar;
        Optional.empty();
        jis jisVar = hyaVar.a;
        if (jisVar != null) {
            Duration duration = hyaVar.e;
            if (duration != null) {
                Duration duration2 = hyaVar.c;
                if (duration2 != null) {
                    Duration duration3 = hyaVar.f;
                    if (duration3 != null) {
                        Duration duration4 = hyaVar.g;
                        if (duration4 != null) {
                            ljh k = ncr.n.k();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ((ncr) k.b).c = true;
                            ljh k2 = ncw.b.k();
                            if (!k2.b.y()) {
                                k2.t();
                            }
                            ((ncw) k2.b).a = 500;
                            ncw ncwVar = (ncw) k2.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar = (ncr) k.b;
                            ncwVar.getClass();
                            ncrVar.b = ncwVar;
                            ncrVar.a |= 1;
                            ljh k3 = ncx.e.k();
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            ((ncx) k3.b).b = a.B(4);
                            ljh k4 = ncz.e.k();
                            if (!k4.b.y()) {
                                k4.t();
                            }
                            ljn ljnVar = k4.b;
                            ((ncz) ljnVar).b = 0.04d;
                            if (!ljnVar.y()) {
                                k4.t();
                            }
                            ((ncz) k4.b).d = 5;
                            ljh k5 = ncq.c.k();
                            ljh k6 = ncm.d.k();
                            if (!k6.b.y()) {
                                k6.t();
                            }
                            ljn ljnVar2 = k6.b;
                            ((ncm) ljnVar2).a = 0.52711296d;
                            if (!ljnVar2.y()) {
                                k6.t();
                            }
                            ljn ljnVar3 = k6.b;
                            ((ncm) ljnVar3).b = -0.16149637d;
                            if (!ljnVar3.y()) {
                                k6.t();
                            }
                            ((ncm) k6.b).c = 0.22877243d;
                            ncm ncmVar = (ncm) k6.q();
                            if (!k5.b.y()) {
                                k5.t();
                            }
                            ncq ncqVar = (ncq) k5.b;
                            ncmVar.getClass();
                            ncqVar.b = ncmVar;
                            ncqVar.a = 3;
                            ncq ncqVar2 = (ncq) k5.q();
                            if (!k4.b.y()) {
                                k4.t();
                            }
                            ncz nczVar = (ncz) k4.b;
                            ncqVar2.getClass();
                            nczVar.c = ncqVar2;
                            nczVar.a |= 1;
                            ncz nczVar2 = (ncz) k4.q();
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            ncx ncxVar = (ncx) k3.b;
                            nczVar2.getClass();
                            ncxVar.c = nczVar2;
                            ncxVar.a |= 2;
                            ljh k7 = ncl.b.k();
                            if (!k7.b.y()) {
                                k7.t();
                            }
                            ((ncl) k7.b).a = 0.1016d;
                            ncl nclVar = (ncl) k7.q();
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            ncx ncxVar2 = (ncx) k3.b;
                            nclVar.getClass();
                            ncxVar2.d = nclVar;
                            ncxVar2.a |= 4;
                            ncx ncxVar3 = (ncx) k3.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar2 = (ncr) k.b;
                            ncxVar3.getClass();
                            ncrVar2.d = ncxVar3;
                            ncrVar2.a |= 2;
                            ljh k8 = ncn.d.k();
                            if (!k8.b.y()) {
                                k8.t();
                            }
                            ljn ljnVar4 = k8.b;
                            ((ncn) ljnVar4).a = 250000000L;
                            if (!ljnVar4.y()) {
                                k8.t();
                            }
                            ljn ljnVar5 = k8.b;
                            ((ncn) ljnVar5).b = 250000000L;
                            if (!ljnVar5.y()) {
                                k8.t();
                            }
                            ((ncn) k8.b).c = 10;
                            ncn ncnVar = (ncn) k8.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ljn ljnVar6 = k.b;
                            ncr ncrVar3 = (ncr) ljnVar6;
                            ncnVar.getClass();
                            ncrVar3.e = ncnVar;
                            ncrVar3.a |= 8;
                            if (!ljnVar6.y()) {
                                k.t();
                            }
                            ((ncr) k.b).f = 0.001d;
                            ljh k9 = ncu.f.k();
                            if (!k9.b.y()) {
                                k9.t();
                            }
                            ljn ljnVar7 = k9.b;
                            ((ncu) ljnVar7).a = 2;
                            if (!ljnVar7.y()) {
                                k9.t();
                            }
                            ljn ljnVar8 = k9.b;
                            ((ncu) ljnVar8).b = 0.005d;
                            if (!ljnVar8.y()) {
                                k9.t();
                            }
                            ljn ljnVar9 = k9.b;
                            ((ncu) ljnVar9).c = 0.05d;
                            if (!ljnVar9.y()) {
                                k9.t();
                            }
                            ljn ljnVar10 = k9.b;
                            ((ncu) ljnVar10).d = 0.3d;
                            if (!ljnVar10.y()) {
                                k9.t();
                            }
                            ((ncu) k9.b).e = 5.0d;
                            ncu ncuVar = (ncu) k9.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar4 = (ncr) k.b;
                            ncuVar.getClass();
                            ncrVar4.g = ncuVar;
                            ncrVar4.a |= 16;
                            ljh k10 = ncs.f.k();
                            if (!k10.b.y()) {
                                k10.t();
                            }
                            ljn ljnVar11 = k10.b;
                            ((ncs) ljnVar11).a = 10;
                            if (!ljnVar11.y()) {
                                k10.t();
                            }
                            ((ncs) k10.b).b = a.C(5);
                            if (!k10.b.y()) {
                                k10.t();
                            }
                            ljn ljnVar12 = k10.b;
                            ((ncs) ljnVar12).c = 2.0d;
                            if (!ljnVar12.y()) {
                                k10.t();
                            }
                            ljn ljnVar13 = k10.b;
                            ((ncs) ljnVar13).d = 1.0d;
                            if (!ljnVar13.y()) {
                                k10.t();
                            }
                            ((ncs) k10.b).e = 0.5d;
                            ncs ncsVar = (ncs) k10.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ljn ljnVar14 = k.b;
                            ncr ncrVar5 = (ncr) ljnVar14;
                            ncsVar.getClass();
                            ncrVar5.k = ncsVar;
                            ncrVar5.a |= 256;
                            if (!ljnVar14.y()) {
                                k.t();
                            }
                            ((ncr) k.b).h = 20;
                            ljh k11 = ncv.b.k();
                            if (!k11.b.y()) {
                                k11.t();
                            }
                            ((ncv) k11.b).a = 100000000L;
                            ncv ncvVar = (ncv) k11.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar6 = (ncr) k.b;
                            ncvVar.getClass();
                            ncrVar6.i = ncvVar;
                            ncrVar6.a |= 64;
                            ljh k12 = nct.b.k();
                            if (!k12.b.y()) {
                                k12.t();
                            }
                            ((nct) k12.b).a = 100;
                            nct nctVar = (nct) k12.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar7 = (ncr) k.b;
                            nctVar.getClass();
                            ncrVar7.j = nctVar;
                            ncrVar7.a |= 128;
                            ljh k13 = ncp.c.k();
                            ljh k14 = ncq.c.k();
                            ljh k15 = ncm.d.k();
                            if (!k15.b.y()) {
                                k15.t();
                            }
                            ljn ljnVar15 = k15.b;
                            ((ncm) ljnVar15).a = 0.3d;
                            if (!ljnVar15.y()) {
                                k15.t();
                            }
                            ljn ljnVar16 = k15.b;
                            ((ncm) ljnVar16).b = -0.17d;
                            if (!ljnVar16.y()) {
                                k15.t();
                            }
                            ((ncm) k15.b).c = 0.7d;
                            ncm ncmVar2 = (ncm) k15.q();
                            if (!k14.b.y()) {
                                k14.t();
                            }
                            ncq ncqVar3 = (ncq) k14.b;
                            ncmVar2.getClass();
                            ncqVar3.b = ncmVar2;
                            ncqVar3.a = 3;
                            ncq ncqVar4 = (ncq) k14.q();
                            if (!k13.b.y()) {
                                k13.t();
                            }
                            ncp ncpVar = (ncp) k13.b;
                            ncqVar4.getClass();
                            ncpVar.b = ncqVar4;
                            ncpVar.a |= 1;
                            ncp ncpVar2 = (ncp) k13.q();
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar8 = (ncr) k.b;
                            ncpVar2.getClass();
                            ncrVar8.l = ncpVar2;
                            ncrVar8.a |= 512;
                            ljh k16 = nck.d.k();
                            if (!k16.b.y()) {
                                k16.t();
                            }
                            ljn ljnVar17 = k16.b;
                            ((nck) ljnVar17).a = 300;
                            if (!ljnVar17.y()) {
                                k16.t();
                            }
                            ljn ljnVar18 = k16.b;
                            ((nck) ljnVar18).b = 500000000L;
                            if (!ljnVar18.y()) {
                                k16.t();
                            }
                            ((nck) k16.b).c = 500000000L;
                            if (!k.b.y()) {
                                k.t();
                            }
                            ncr ncrVar9 = (ncr) k.b;
                            nck nckVar = (nck) k16.q();
                            nckVar.getClass();
                            ncrVar9.m = nckVar;
                            ncrVar9.a |= 2048;
                            hyv hyvVar = new hyv(jisVar, duration, duration4, duration2, duration3, Optional.of((ncr) k.q()));
                            hwx.K(!hyvVar.a.isEmpty(), "Ranging technologies to range with must contain at least one ranging technology.");
                            boolean z = hyvVar.b;
                            hyvVar.g.isPresent();
                            hwx.K(z, "Fusion algorithm config must be set when and only when useFusingAlgorithm is set to true.");
                            if (hyvVar.b && hyvVar.a.contains(hyh.UWB)) {
                                hwx.K(((ncr) hyvVar.g.get()).c, "Fusion algorithm should accept UWB measurements since UWB was requested.");
                            }
                            kpb kpbVar = (kpb) hnuVar.a;
                            this.q = new hyy(lsg.c(kpbVar.b), ((lry) kpbVar.a).b(), hyvVar, (ScheduledExecutorService) kpbVar.c.a());
                            jis jisVar2 = jmi.a;
                            this.i = jisVar2;
                            this.j = jisVar2;
                            this.k = Optional.empty();
                            this.l = Optional.empty();
                            this.h = Optional.empty();
                            this.o = 7;
                            this.d = executorService;
                            synchronized (obj) {
                                this.p = 1;
                            }
                            return;
                        }
                        throw new NullPointerException("Null initTimeout");
                    }
                    throw new NullPointerException("Null noUpdateTimeout");
                }
                throw new NullPointerException("Null fusionAlgorithmDriftTimeout");
            }
            throw new NullPointerException("Null maxUpdateInterval");
        }
        throw new NullPointerException("Null rangingTechnologiesToRangeWith");
    }

    @Override // defpackage.hxz
    public final void a() {
        jyz g;
        jyz b2;
        jnk jnkVar = c;
        ((jni) ((jni) jnkVar.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "start", 232, "PrecisionFindingImpl.java")).r("Start Precision Finding called.");
        synchronized (this.e) {
            if (this.p == 1) {
                this.p = 2;
                hyy hyyVar = this.q;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                int i2 = 0;
                while (true) {
                    jis jisVar = hyyVar.j.a;
                    if (i2 < ((jmi) jisVar).c) {
                        hyh hyhVar = (hyh) jisVar.get(i2);
                        hzb hzbVar = (hzb) hyyVar.f.get(hyhVar);
                        if (hzbVar == null) {
                            g = ivc.D(new IllegalStateException("Adapter not found for ranging technology: ".concat(String.valueOf(String.valueOf(hyhVar)))));
                            break;
                        }
                        if (hzbVar.b.isEmpty()) {
                            b2 = ivc.E(false);
                        } else {
                            Object obj = hzbVar.b.get();
                            fjy fjyVar = new fjy();
                            fjyVar.a = new fun(i);
                            fjyVar.b = new Feature[]{ftb.i};
                            fjyVar.c = 1300;
                            b2 = fzo.b(((fhq) obj).f(fjyVar.a()));
                        }
                        arrayList.add(b2);
                        i2++;
                    } else {
                        g = jwu.g(ivc.B(arrayList), new huw(hyyVar, 8), hyyVar.o);
                        break;
                    }
                }
                ivc.N(g, new dup(this, 12), this.d);
                return;
            }
            ((jni) ((jni) jnkVar.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "start", 235, "PrecisionFindingImpl.java")).r("Precision Finding is already running.");
        }
    }

    @Override // defpackage.hxz
    public final void b() {
        d(8);
    }

    public final void c() {
        synchronized (this.e) {
            if (this.p == 4 && this.m && this.n) {
                this.p = 5;
                ((jni) ((jni) c.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "notifyOnStartedIfReady", 517, "PrecisionFindingImpl.java")).r("Precision ranging notifying started state.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void d(int i) {
        int i2;
        int i3;
        int i4;
        jnk jnkVar = c;
        ((jni) ((jni) jnkVar.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "stopPrecisionFinding", 622, "PrecisionFindingImpl.java")).s("Stopping precision finding with reason: %s", i);
        synchronized (this.e) {
            int i5 = 1;
            if (this.p == 1) {
                return;
            }
            this.p = 1;
            if (this.m) {
                ((jni) ((jni) jnkVar.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "stopPrecisionFinding", 629, "PrecisionFindingImpl.java")).r("Sending stop ranging message to the peripheral");
                hri hriVar = this.r;
                jis q = jis.q(hyh.UWB);
                if (q != null) {
                    hyn hynVar = new hyn(q);
                    ico icoVar = ico.STOP_RANGING;
                    byte[] bArr = {hyh.a(hynVar.a)};
                    Object obj = hriVar.b;
                    Object obj2 = hriVar.a;
                    iuu.o(((nca) obj2).g(icoVar, bArr, (kyf) obj).e(new iaf(14), ((nca) obj2).e), new iaf(i5), this.d);
                } else {
                    throw new NullPointerException("Null rangingTechnologiesToStop");
                }
            }
            njz njzVar = this.s;
            synchronized (((ifh) njzVar.a).g) {
                Object obj3 = njzVar.a;
                jer jerVar = ((ifh) obj3).h.a;
                jdl jdlVar = jdl.a;
                i2 = 6;
                if (i == 6) {
                    i4 = 2;
                    i3 = 6;
                } else {
                    i3 = i;
                    i4 = 1;
                }
                ((ifh) obj3).d(hqk.f(jerVar, jdlVar, jdlVar, i4));
            }
            if (i3 == 3) {
                ((ifh) njzVar.a).j = jdl.a;
                i3 = 3;
            }
            if (i3 == 1 || i3 == 6 || i3 == 7) {
                synchronized (((ifh) njzVar.a).l) {
                    Object obj4 = njzVar.a;
                    ((ifh) obj4).m = jer.i(((ifh) obj4).f.schedule(new ide(njzVar, i2), ifh.b.toMillis(), TimeUnit.MILLISECONDS));
                }
            }
            this.q.a(1);
            this.g = Optional.empty();
            this.h = Optional.empty();
            int i6 = jis.d;
            jis jisVar = jmi.a;
            this.i = jisVar;
            this.j = jisVar;
            this.k = Optional.empty();
            this.l = Optional.empty();
            this.o = 7;
            synchronized (this.e) {
                this.n = false;
                this.m = false;
            }
        }
    }

    public final boolean e(hyo hyoVar, ftq ftqVar, ftl ftlVar) {
        int i;
        int i2;
        ftq ftqVar2;
        lim limVar;
        String str;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        if (hyoVar == null) {
            ((jni) ((jni) c.g()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "createUwbConfigsToUse", 531, "PrecisionFindingImpl.java")).r("UWB capabilities from peripheral is not set.");
            return false;
        }
        try {
            byte[] e = kne.e("HMACSHA256", this.v.A(), new byte[0], new byte[0], 16);
            int nextInt = new SecureRandom().nextInt();
            ArrayList arrayList = new ArrayList(hyoVar.b);
            arrayList.retainAll(ftlVar.a);
            if (arrayList.isEmpty()) {
                ((jni) ((jni) c.g()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "createUwbConfigsToUse", 556, "PrecisionFindingImpl.java")).r("Devices don't support a common UWB channel");
                return false;
            }
            Integer num = (Integer) arrayList.get(0);
            if (true == arrayList.contains(9)) {
                num = 9;
            }
            ArrayList arrayList2 = new ArrayList();
            ftu ftuVar = new ftu();
            arrayList2.add(fts.a(hyoVar.a.a));
            hyp hypVar = new hyp();
            hypVar.b(lim.b);
            if (ftqVar != null) {
                hypVar.a = ftqVar;
                hypVar.b = nextInt;
                hypVar.g = (byte) (hypVar.g | 1);
                hypVar.d = num.intValue();
                hypVar.g = (byte) (hypVar.g | 4);
                hypVar.b(lim.t(e));
                hypVar.g = (byte) (hypVar.g | 48);
                hypVar.f = "NA";
                Random random = new Random();
                if (hyoVar.c.contains(3) && ftlVar.b.contains(1003)) {
                    hypVar.a(3);
                    i = u[random.nextInt(8)];
                    i2 = 1003;
                } else if (hyoVar.c.contains(2) && ftlVar.b.contains(1002)) {
                    hypVar.a(2);
                    i = t[random.nextInt(4)];
                    i2 = 1002;
                } else {
                    ((jni) ((jni) c.g()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "createUwbConfigsToUse", 593, "PrecisionFindingImpl.java")).r("Devices don't support the finder config ids for UWB");
                    return false;
                }
                ftr ftrVar = new ftr(num.intValue(), i);
                int i4 = hypVar.g | 8;
                hypVar.g = (byte) i4;
                if (i4 == 63 && (ftqVar2 = hypVar.a) != null && (limVar = hypVar.e) != null && (str = hypVar.f) != null) {
                    hyq hyqVar = new hyq(ftqVar2, hypVar.b, hypVar.c, hypVar.d, i, limVar, str);
                    hyqVar.a.getClass();
                    int a2 = hyqVar.a();
                    if (a2 != 8 && a2 != 16 && a2 != 32) {
                        z = false;
                    } else {
                        z = true;
                    }
                    hwx.K(z, "Invalid session key length");
                    if (hyqVar.g.length() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hwx.K(z2, "Invalid country code length");
                    this.k = Optional.of(hyqVar);
                    try {
                        fma.aG(!arrayList2.isEmpty(), "At least 1 peer device must be set.");
                        fma.aF(true);
                        fma.aF(true);
                        if (i2 != 1002) {
                            i3 = 1003;
                        } else {
                            i3 = i2;
                        }
                        if (e.length == 16) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        fma.aG(z3, "At present, only 16 byte session key is supported for provisoned STS");
                        fma.aF(true);
                        fma.aF(true);
                        this.l = Optional.of(new ftn(i3, nextInt, e, ftrVar, arrayList2, ftuVar));
                        return true;
                    } catch (IllegalArgumentException e2) {
                        ((jni) ((jni) ((jni) c.g()).i(e2)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "createUwbConfigsToUse", (char) 610, "PrecisionFindingImpl.java")).r("Failed to build UWB ranging parameters");
                        return false;
                    }
                }
                StringBuilder sb = new StringBuilder();
                if (hypVar.a == null) {
                    sb.append(" uwbAddress");
                }
                if ((1 & hypVar.g) == 0) {
                    sb.append(" sessionId");
                }
                if ((hypVar.g & 2) == 0) {
                    sb.append(" selectedConfigId");
                }
                if ((hypVar.g & 4) == 0) {
                    sb.append(" selectedChannel");
                }
                if ((hypVar.g & 8) == 0) {
                    sb.append(" selectedPreambleIndex");
                }
                if ((hypVar.g & 16) == 0) {
                    sb.append(" selectedRangingIntervalMs");
                }
                if ((hypVar.g & 32) == 0) {
                    sb.append(" selectedSlotDurationMs");
                }
                if (hypVar.e == null) {
                    sb.append(" sessionKey");
                }
                if (hypVar.f == null) {
                    sb.append(" countryCode");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new NullPointerException("Null uwbAddress");
        } catch (GeneralSecurityException e3) {
            ((jni) ((jni) ((jni) c.g()).i(e3)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "createUwbConfigsToUse", (char) 545, "PrecisionFindingImpl.java")).r("Failed to compute HKDF for UWB");
            return false;
        }
    }
}
