package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnf extends mnp implements mol {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gwf d;
    final /* synthetic */ apc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnf(apc apcVar, gwf gwfVar, mmx mmxVar) {
        super(2, mmxVar);
        this.e = apcVar;
        this.d = gwfVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnf) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [goj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Object a;
        Iterator it;
        mne mneVar = mne.a;
        if (this.c != 0) {
            Object obj2 = this.b;
            a = this.a;
            try {
                mjo.o(obj);
                it = obj2;
            } catch (Exception e) {
                e = e;
                return new gmy(e);
            }
        } else {
            mjo.o(obj);
            try {
                a = this.e.a.a(this.d);
                it = this.e.c.iterator();
            } catch (gnx e2) {
                e = e2;
                return new gmy(e);
            }
        }
        while (it.hasNext()) {
            gne gneVar = (gne) it.next();
            this.a = a;
            this.b = it;
            this.c = 1;
            if (gneVar.a((goa) a, this) == mneVar) {
                return mneVar;
            }
        }
        apc apcVar = this.e;
        gwf b = ((goa) a).b();
        try {
            gok gokVar = ((goo) apcVar.a).b;
            int D = frx.D(b);
            String a2 = b.a();
            if (((Integer) bwr.c((cih) gokVar.a, false, true, new gon(D, a2, 0))).intValue() == 1) {
                return new gnc(mlh.a);
            }
        } catch (Exception e3) {
            ((jol) ((jol) goo.a.g()).i(e3)).q();
        }
        return new gmy(new Exception("Failed deleting account"));
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new gnf(this.e, this.d, mmxVar);
    }
}
