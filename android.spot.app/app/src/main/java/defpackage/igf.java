package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class igf implements jxc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ igf(hso hsoVar, ljh ljhVar, jyz jyzVar, jyz jyzVar2, int i) {
        this.e = i;
        this.d = hsoVar;
        this.c = ljhVar;
        this.a = jyzVar;
        this.b = jyzVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [jxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [jxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, jyz] */
    @Override // defpackage.jxc
    public final jyz a() {
        jbx f;
        Uri uri;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return jwu.h(this.b, jbn.c(new gfl(this.d, this.a, this.c, 16, (byte[]) null)), jxv.a);
                    }
                    Object obj = this.d;
                    ifl iflVar = new ifl(obj, 17);
                    ?? r2 = this.c;
                    ?? r4 = this.a;
                    jyz h = jwu.h(this.b, iflVar, jxv.a);
                    jyz h2 = jwu.h(h, r4, r2);
                    return jwu.h(h2, jbn.c(new gfl(obj, h, h2, 15, (byte[]) null)), jxv.a);
                }
                Uri uri2 = (Uri) ivc.M(this.a);
                Set set = (Set) ivc.M(this.b);
                ilj iljVar = new ilj(set);
                Iterator it = set.iterator();
                while (true) {
                    Object obj2 = this.d;
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        ilk ilkVar = (ilk) obj2;
                        if (((Boolean) ((jfh) ilkVar.h).a).booleanValue()) {
                            uri = ilk.a(uri2);
                        } else {
                            uri = uri2;
                        }
                        intent.setData(uri);
                        intent.setPackage(str);
                        intent.setFlags(268435456);
                        ilkVar.b.sendOrderedBroadcast(intent, null, iljVar, ilkVar.e, -1, null, null);
                    } else {
                        Object obj3 = this.c;
                        jfd b = jfd.b(jdj.a);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        Integer num = (Integer) obj3;
                        ilk ilkVar2 = (ilk) obj2;
                        jyz g = jwb.g(jys.q(iljVar.a).r(num.intValue(), ilkVar2.g, null), TimeoutException.class, new iig(atomicBoolean, 4), jxv.a);
                        ivc.N(g, new ilg(ilkVar2, atomicBoolean, set, b, iljVar, num), jxv.a);
                        return g;
                    }
                }
            } else {
                ?? r0 = this.a;
                Object obj4 = this.c;
                try {
                    Map map = (Map) ((jer) ivc.M(r0)).f();
                    if (map != null) {
                        ljh ljhVar = (ljh) obj4;
                        long j = ((neh) ljhVar.b).b;
                        for (Map.Entry entry : map.entrySet()) {
                            Integer num2 = (Integer) entry.getKey();
                            num2.intValue();
                            long longValue = ((Long) entry.getValue()).longValue() - j;
                            if (!ljhVar.b.y()) {
                                ljhVar.t();
                            }
                            neh nehVar = (neh) ljhVar.b;
                            lkl lklVar = nehVar.v;
                            if (!lklVar.b) {
                                nehVar.v = lklVar.a();
                            }
                            nehVar.v.put(num2, Long.valueOf(longValue));
                        }
                    }
                } catch (Exception e) {
                    ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).r("Failed to get custom timestamps future");
                }
                Object obj5 = this.d;
                hoy a = hoz.a();
                ljh k = nfe.v.k();
                ljh k2 = ned.f.k();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (!k2.b.y()) {
                    k2.t();
                }
                ljn ljnVar = k2.b;
                ned nedVar = (ned) ljnVar;
                nedVar.a |= 1;
                nedVar.b = leastSignificantBits;
                if (!ljnVar.y()) {
                    k2.t();
                }
                ljn ljnVar2 = k2.b;
                ned nedVar2 = (ned) ljnVar2;
                nedVar2.c = 2;
                nedVar2.a = 2 | nedVar2.a;
                if (!ljnVar2.y()) {
                    k2.t();
                }
                ned nedVar3 = (ned) k2.b;
                neh nehVar2 = (neh) ((ljh) obj4).q();
                nehVar2.getClass();
                nedVar3.e = nehVar2;
                nedVar3.a |= 16;
                if (!k.b.y()) {
                    k.t();
                }
                hpd hpdVar = ((hso) obj5).a;
                ?? r42 = this.b;
                nfe nfeVar = (nfe) k.b;
                ned nedVar4 = (ned) k2.q();
                nedVar4.getClass();
                nfeVar.k = nedVar4;
                nfeVar.a |= 2048;
                a.e((nfe) k.q());
                a.b = (ndq) ((jer) ivc.M(r42)).f();
                a.c = null;
                a.d(true);
                return hpdVar.b(a.a());
            }
        } else {
            Object obj6 = this.a;
            igh ighVar = ((igg) obj6).e;
            Object obj7 = this.d;
            ?? r5 = this.c;
            Object obj8 = this.b;
            synchronized (ighVar.c) {
                kxv kxvVar = ((igg) obj6).a.b;
                if (kxvVar == null) {
                    kxvVar = kxv.b;
                }
                String str2 = kxvVar.a;
                igd igdVar = (igd) ((igg) obj6).e.d.get(str2);
                if (igdVar == null || !igdVar.f((jjr) obj8)) {
                    igdVar = ((igg) obj6).e.c(((igg) obj6).a, (jjr) obj8, ((igg) obj6).f, ((igg) obj6).b);
                }
                f = jbx.d(igdVar.b()).f(r5, ((igg) obj6).e.b);
                f.i(new ijo((igg) obj6, str2, (bmf) obj7, 1), ((igg) obj6).e.b);
            }
            return f;
        }
    }

    public /* synthetic */ igf(igg iggVar, jjr jjrVar, jxd jxdVar, bmf bmfVar, int i) {
        this.e = i;
        this.a = iggVar;
        this.b = jjrVar;
        this.c = jxdVar;
        this.d = bmfVar;
    }

    public /* synthetic */ igf(ilk ilkVar, jyz jyzVar, jyz jyzVar2, Integer num, int i) {
        this.e = i;
        this.d = ilkVar;
        this.a = jyzVar;
        this.b = jyzVar2;
        this.c = num;
    }

    public /* synthetic */ igf(Object obj, jyz jyzVar, jxd jxdVar, Executor executor, int i) {
        this.e = i;
        this.d = obj;
        this.b = jyzVar;
        this.a = jxdVar;
        this.c = executor;
    }
}
