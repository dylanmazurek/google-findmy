package defpackage;

import j$.util.Collection;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igh {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal");
    public final jzd b;
    public final ici f;
    public final hot g;
    public final Object c = new Object();
    public final HashMap d = new HashMap();
    private final HashMap h = new HashMap();
    public final jif e = new jif();

    public igh(ici iciVar, hot hotVar, jzd jzdVar) {
        this.f = iciVar;
        this.g = hotVar;
        this.b = jzdVar;
    }

    public final void a(kyf kyfVar, buc bucVar) {
        synchronized (this.c) {
            jif jifVar = this.e;
            kxv kxvVar = kyfVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            Collection.EL.forEach(jifVar.b(kxvVar.a), new ebd(bucVar, 13));
        }
    }

    public final void b(igd igdVar) {
        synchronized (this.c) {
            if (igdVar.equals((igd) this.d.get(igdVar.c))) {
                this.d.remove(igdVar.c);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.igd c(final defpackage.kyf r11, defpackage.jjr r12, defpackage.igo r13, final defpackage.jer r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igh.c(kyf, jjr, igo, jer):igd");
    }

    public final jyz d(kyf kyfVar, jjr jjrVar, jxd jxdVar, igo igoVar) {
        jyz e;
        synchronized (this.c) {
            e = e(kyfVar, jjrVar, jxdVar, igoVar, jdl.a, false);
        }
        return e;
    }

    public final jyz e(kyf kyfVar, final jjr jjrVar, final jxd jxdVar, igo igoVar, jer jerVar, final boolean z) {
        final igg iggVar;
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        HashMap hashMap = this.h;
        String str = kxvVar.a;
        if (hashMap.containsKey(str)) {
            iggVar = (igg) this.h.get(str);
        } else {
            iggVar = new igg(this, kyfVar, igoVar);
        }
        this.h.put(str, iggVar);
        if (jerVar.g()) {
            iggVar.b = jer.i(jerVar.c());
        }
        return bei.d(new bmh() { // from class: ifz
            @Override // defpackage.bmh
            public final Object a(bmf bmfVar) {
                igg iggVar2 = igg.this;
                Object obj = iggVar2.e.c;
                jjr jjrVar2 = jjrVar;
                jxd jxdVar2 = jxdVar;
                synchronized (obj) {
                    iggVar2.c.add(new bxi(iggVar2, jjrVar2, jxdVar2, bmfVar, 6));
                    if (z) {
                        iggVar2.e.c(iggVar2.a, jjrVar2, iggVar2.f, iggVar2.b).d();
                    }
                    if (!iggVar2.d) {
                        iggVar2.d = true;
                        iggVar2.b();
                    }
                }
                return "[SharedGattConnectionManagerInternalExecute]";
            }
        });
    }
}
