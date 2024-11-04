package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class icb implements jxj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ icb(ici iciVar, ift iftVar, ibj ibjVar, jer jerVar, int i) {
        this.e = i;
        this.a = iciVar;
        this.d = iftVar;
        this.c = ibjVar;
        this.b = jerVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.jxj
    public final jxp a(jck jckVar, Object obj) {
        int i = this.e;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                jbx f = ((jbw) this.c).f();
                igw igwVar = new igw(8);
                return jbw.b(f.b((Class) this.d, igwVar, jxv.a)).e(new jbj(this.a, (Throwable) obj, 1), this.b).d(new ijj(0), jxv.a).a;
            }
            ((jni) ((jni) ((jni) ici.a.b().h(flv.a, 284)).i((Throwable) obj)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl", "lambda$connectToCachedMacAddress$6", (char) 253, "EddystoneScannerImpl.java")).r("Scan-less connect failed; Retrying with scan.");
            Object obj2 = this.b;
            Object obj3 = this.c;
            return ((ici) this.a).a((ift) this.d, (ibj) obj3, (jer) obj2).a;
        }
        ibv ibvVar = (ibv) obj;
        try {
            Object obj4 = ((jeu) this.b).a;
            fze fzeVar = ibvVar.b;
            if (!((ige) obj4).a.isEmpty()) {
                hwx.V(((ige) obj4).b.g(), "timestampedEphemeralIds must be set before scanning by EID");
                ick a = ick.a(fzeVar, (hot) ((ige) obj4).b.c());
                Iterator it = ((ige) obj4).a.iterator();
                while (it.hasNext()) {
                    ((icj) it.next()).a(a);
                }
            }
        } catch (Throwable th) {
            ((jni) ((jni) ((jni) ici.a.g().h(flv.a, 284)).i(th)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl", "lambda$forceScanAndConnect$9", (char) 272, "EddystoneScannerImpl.java")).r("Exception in scan callback");
        }
        Object obj5 = this.d;
        Object obj6 = this.c;
        ibj ibjVar = (ibj) obj6;
        if (!ibjVar.c.g()) {
            ift iftVar = (ift) obj5;
            iftVar.c.g();
            ibi ibiVar = new ibi(ibjVar);
            jer jerVar = iftVar.c;
            ibiVar.b(ihz.a((String) jerVar.c(), ibvVar.a));
            obj6 = ibiVar.a();
        }
        Object obj7 = this.a;
        ici iciVar = (ici) obj7;
        return iciVar.b.c(ibvVar.b.b(), (ibj) obj6).d(new ibx(iciVar, (ift) obj5, ibvVar, i2), iciVar.c).a;
    }

    public /* synthetic */ icb(ici iciVar, jer jerVar, ibj ibjVar, ift iftVar, int i) {
        this.e = i;
        this.a = iciVar;
        this.b = jerVar;
        this.c = ibjVar;
        this.d = iftVar;
    }

    public /* synthetic */ icb(jbw jbwVar, Class cls, jxj jxjVar, Executor executor, int i) {
        this.e = i;
        this.c = jbwVar;
        this.d = cls;
        this.a = jxjVar;
        this.b = executor;
    }
}
