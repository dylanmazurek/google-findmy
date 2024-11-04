package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbc implements hbd, haw {
    public boolean a;
    public hjq b;
    private final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final Object d = new Object();
    private final Map e = new HashMap();
    private jis f;
    private gzc g;

    public hbc() {
        int i = jis.d;
        this.f = jmi.a;
    }

    private static Object i(gzc gzcVar) {
        if (gzcVar != null) {
            return gzcVar.a;
        }
        return null;
    }

    private final void j() {
        if (!this.a) {
            this.a = true;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((frx) it.next()).au();
            }
        }
    }

    private final void k() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((frx) it.next()).a(i(this.g));
        }
    }

    @Override // defpackage.haw
    public final Object a() {
        return i(this.g);
    }

    @Override // defpackage.haw
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.haw
    public final void d(frx frxVar) {
        this.c.add(frxVar);
    }

    @Override // defpackage.haw
    public final void e(frx frxVar) {
        this.c.remove(frxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.haw
    /* renamed from: f */
    public final jis b() {
        jis g;
        jin jinVar = new jin();
        synchronized (this.d) {
            jmx it = this.f.iterator();
            while (it.hasNext()) {
                jinVar.h(((gzc) it.next()).a);
            }
            g = jinVar.g();
        }
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.hbd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.jis r19) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbc.g(jis):void");
    }

    public final void h(Object obj) {
        gzc gzcVar;
        boolean z;
        if (obj == null) {
            if (this.g != null) {
                this.g = null;
                k();
                return;
            }
            return;
        }
        gzc gzcVar2 = this.g;
        Object obj2 = this.d;
        String aj = frx.aj(obj);
        synchronized (obj2) {
            gzcVar = (gzc) this.e.get(aj);
        }
        if (gzcVar != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "Selected account must be an available account");
        this.g = gzcVar;
        if (!gzcVar.equals(gzcVar2)) {
            k();
        }
    }
}
