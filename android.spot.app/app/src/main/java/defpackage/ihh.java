package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ihh implements Callable {
    public final /* synthetic */ jyz a;
    public final /* synthetic */ jyz b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ihh(Object obj, jyz jyzVar, jyz jyzVar2, Object obj2, int i) {
        this.e = i;
        this.c = obj;
        this.a = jyzVar;
        this.b = jyzVar2;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.e != 0) {
            ljh k = huk.i.k();
            boolean y = k.b.y();
            ?? r3 = this.d;
            jyz jyzVar = this.b;
            jyz jyzVar2 = this.a;
            if (!y) {
                k.t();
            }
            Object obj = this.c;
            ljn ljnVar = k.b;
            huk hukVar = (huk) ljnVar;
            hukVar.a = 1 | hukVar.a;
            hul hulVar = (hul) obj;
            hukVar.b = hulVar.b;
            if (!ljnVar.y()) {
                k.t();
            }
            String str = hulVar.a;
            ljn ljnVar2 = k.b;
            huk hukVar2 = (huk) ljnVar2;
            hukVar2.a |= 2;
            hukVar2.c = str;
            boolean z = hulVar.c;
            if (!ljnVar2.y()) {
                k.t();
            }
            ljn ljnVar3 = k.b;
            huk hukVar3 = (huk) ljnVar3;
            hukVar3.a |= 4;
            hukVar3.d = z;
            boolean z2 = hulVar.d;
            if (!ljnVar3.y()) {
                k.t();
            }
            huk hukVar4 = (huk) k.b;
            hukVar4.a |= 32;
            hukVar4.h = z2;
            try {
                jer jerVar = (jer) ivc.M(jyzVar2);
                if (jerVar.g()) {
                    String str2 = (String) jerVar.c();
                    if (!k.b.y()) {
                        k.t();
                    }
                    huk hukVar5 = (huk) k.b;
                    hukVar5.a |= 16;
                    hukVar5.f = str2;
                }
            } catch (Exception e) {
                ((jni) ((jni) ((jni) hmz.a.c()).i(e)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "lambda$buildExtension$0", '^', "ClearcutMetricSnapshotBuilder.java")).r("Failed to set Account Name, falling back to Zwieback logging.");
            }
            try {
                List list = (List) ivc.M(jyzVar);
                if (!k.b.y()) {
                    k.t();
                }
                huk hukVar6 = (huk) k.b;
                ljr ljrVar = hukVar6.g;
                if (!ljrVar.c()) {
                    hukVar6.g = ljn.n(ljrVar);
                }
                lhv.g(list, hukVar6.g);
            } catch (Exception e2) {
                ((jni) ((jni) ((jni) hmz.a.c()).i(e2)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "lambda$buildExtension$0", 'f', "ClearcutMetricSnapshotBuilder.java")).r("Failed to set external Experiment Ids.");
            }
            try {
                jer jerVar2 = (jer) ivc.M(r3);
                if (jerVar2.g()) {
                    String str3 = (String) jerVar2.c();
                    if (!k.b.y()) {
                        k.t();
                    }
                    huk hukVar7 = (huk) k.b;
                    hukVar7.a |= 8;
                    hukVar7.e = str3;
                }
            } catch (Exception e3) {
                ((jni) ((jni) ((jni) hmz.a.c()).i(e3)).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "lambda$buildExtension$0", 'p', "ClearcutMetricSnapshotBuilder.java")).r("Failed to set Zwieback.");
            }
            ljj ljjVar = (ljj) hue.c.k();
            ljjVar.ap(huk.j, (huk) k.q());
            return (hue) ljjVar.q();
        }
        jer jerVar3 = (jer) ivc.M(this.a);
        hwx.V(jerVar3.g(), "Cannot calculate the sharing validation key without an owner key");
        kzq e4 = ihk.e((lae) ivc.M(this.b), (String) this.d);
        ijk b = ((ihk) this.c).b(e4, (ijf) jerVar3.c(), true);
        kzr kzrVar = e4.f;
        if (kzrVar == null) {
            kzrVar = kzr.c;
        }
        return ihk.g(b.b, kzrVar.b);
    }
}
