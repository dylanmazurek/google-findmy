package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hks implements hjy {
    public final hjy a;
    final /* synthetic */ hkt b;
    private final hjy c;
    private joo d;

    public hks(hkt hktVar, hjy hjyVar, hjy hjyVar2) {
        this.b = hktVar;
        this.c = hjyVar;
        this.a = hjyVar2;
    }

    private final jyz h(jei jeiVar) {
        return iuu.j((jyz) jeiVar.a(this.c), hkm.class, new ejc(this, jeiVar, 18), jxv.a);
    }

    private final jyz i(hkq hkqVar, String str, int i) {
        return iuu.j(hkqVar.a(this.c, str, i), hkm.class, new enm(this, hkqVar, str, i, 3), jxv.a);
    }

    @Override // defpackage.hjy
    public final jyz a() {
        return h(new hkn(2));
    }

    @Override // defpackage.hjy
    public final jyz b() {
        return h(new hkn(3));
    }

    @Override // defpackage.hjy
    public final jyz c(String str, int i) {
        return i(new hkr(1), str, i);
    }

    @Override // defpackage.hjy
    public final jyz d(String str, int i) {
        return i(new hkr(0), str, i);
    }

    @Override // defpackage.hjy
    public final void e(njz njzVar) {
        synchronized (this.b.b) {
            this.b.b.add(njzVar);
            this.c.e(njzVar);
        }
    }

    @Override // defpackage.hjy
    public final void f(njz njzVar) {
        synchronized (this.b.b) {
            this.b.b.remove(njzVar);
            this.c.f(njzVar);
        }
    }

    public final void g(Exception exc) {
        synchronized (this.b.b) {
            if (this.d == null) {
                this.d = joo.m("OneGoogle");
            }
            ((jol) ((jol) ((jol) this.d.g()).i(exc)).j("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", (char) 188, "SafeMdiOwnersProvider.java")).r("MDI Profile Sync not available on device. Reverting to backup implementation.");
            Iterator it = this.b.b.iterator();
            while (it.hasNext()) {
                this.a.e((njz) it.next());
            }
            hkt hktVar = this.b;
            hktVar.a = this.a;
            Iterator it2 = hktVar.b.iterator();
            while (it2.hasNext()) {
                this.c.f((njz) it2.next());
            }
            this.b.b.clear();
        }
    }
}
