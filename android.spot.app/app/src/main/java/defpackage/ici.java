package defpackage;

import android.os.SystemClock;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ici {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/EddystoneScannerImpl");
    public final ibg b;
    public final jzd c;
    public final Object d = new Object();
    public final Set e = new HashSet();
    public final HashMap f = new HashMap();
    public final hot g;
    public final bym h;

    public ici(ibg ibgVar, jzd jzdVar, bym bymVar, hot hotVar) {
        this.b = ibgVar;
        this.c = jzdVar;
        this.h = bymVar;
        this.g = hotVar;
    }

    public final jbw a(ift iftVar, ibj ibjVar, jer jerVar) {
        jin jinVar = new jin();
        jmw listIterator = iftVar.b.map.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            jinVar.h(new hxh(new huw((Collection) entry.getValue(), 9), (ihy) entry.getKey()));
        }
        jis g = jinVar.g();
        ((jni) ((jni) a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl", "scan", 115, "EddystoneScannerImpl.java")).s("Starting scan for %d EIDs.", iftVar.b.size);
        jer jerVar2 = iftVar.a;
        int i = iftVar.d;
        AtomicReference atomicReference = new AtomicReference();
        jyz L = ivc.L(bei.d(new icd(this, atomicReference, g, jerVar2, 0)), i, TimeUnit.MILLISECONDS, this.c);
        L.c(new hka(this, atomicReference, 12), this.c);
        jyz j = iuu.j(L, TimeoutException.class, new hxj(atomicReference, 6), this.c);
        iftVar.c.g();
        return jbw.b(jbx.d(j).e(new emc(this, iftVar, 15, null), this.c)).e(new icb(this, jerVar, ibjVar, iftVar, 0), this.c);
    }

    public final void b(ihz ihzVar, fze fzeVar) {
        synchronized (this.d) {
            this.f.put(ihzVar, new ich(fzeVar.b().a(), SystemClock.elapsedRealtime()));
        }
    }

    public final ibh c(final String str, final hot hotVar, final icj icjVar) {
        jjr i = hotVar.i();
        iay iayVar = new iay() { // from class: ibw
            @Override // defpackage.iay
            public final void f(fze fzeVar) {
                lim b = ifv.b(fzeVar.a());
                hot hotVar2 = hotVar;
                ici.this.b(ihz.a(str, hotVar2.h(b)), fzeVar);
                icjVar.a(ick.a(fzeVar, hotVar2));
            }

            @Override // defpackage.iay
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.iay
            public final /* synthetic */ void c() {
            }

            @Override // defpackage.iay
            public final /* synthetic */ void d() {
            }

            @Override // defpackage.iay
            public final /* synthetic */ void e() {
            }

            @Override // defpackage.iay
            public final /* synthetic */ void b(int i2) {
            }
        };
        HashSet hashSet = new HashSet(i);
        return new icf(this, new ice(new HashSet(), iayVar, new HashSet(), hashSet));
    }
}
