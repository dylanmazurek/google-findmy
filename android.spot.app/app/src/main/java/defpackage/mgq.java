package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgq extends lyt {
    public final String b;
    public final /* synthetic */ mgu c;
    public final AtomicReference a = new AtomicReference(mgu.e);
    private final lyt d = new mgn(this);

    public mgq(mgu mguVar, String str) {
        this.c = mguVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.lyt
    public final lyv a(mbg mbgVar, lys lysVar) {
        if (this.a.get() != mgu.e) {
            return c(mbgVar, lysVar);
        }
        mgu mguVar = this.c;
        mguVar.m.execute(new meg(this, 20));
        if (this.a.get() != mgu.e) {
            return c(mbgVar, lysVar);
        }
        if (this.c.A.get()) {
            return new mgo();
        }
        mgp mgpVar = new mgp(this, lzi.b(), mbgVar, lysVar);
        mgu mguVar2 = this.c;
        mguVar2.m.execute(new kvz(this, mgpVar, 19, null));
        return mgpVar;
    }

    @Override // defpackage.lyt
    public final String b() {
        return this.b;
    }

    public final lyv c(mbg mbgVar, lys lysVar) {
        lzx lzxVar = (lzx) this.a.get();
        if (lzxVar == null) {
            return this.d.a(mbgVar, lysVar);
        }
        if (lzxVar instanceof mhc) {
            mhb b = ((mhc) lzxVar).b.b(mbgVar);
            if (b != null) {
                lysVar = lysVar.d(mhb.a, b);
            }
            return this.d.a(mbgVar, lysVar);
        }
        return new mgg(lzxVar, this.d, this.c.k, mbgVar, lysVar);
    }

    public final void d(lzx lzxVar) {
        Collection collection;
        lzx lzxVar2 = (lzx) this.a.get();
        this.a.set(lzxVar);
        if (lzxVar2 == mgu.e && (collection = this.c.w) != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((mgp) it.next()).j();
            }
        }
    }
}
