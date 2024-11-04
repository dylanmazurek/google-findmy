package defpackage;

import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcp implements gbf, gcn {
    public final juw a;
    public final List b;
    public final List c;
    public final SparseIntArray d;
    private final jis e;

    public gcp(juw juwVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = juwVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        DesugarCollections.unmodifiableList(list3);
        hwx.K(!list.isEmpty(), "Must have at least one graft");
        hwx.K(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.e = jis.q(frx.w((gco) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hwx.J(frx.w((gco) it.next()).equals(this.e.get(0)));
        }
    }

    @Override // defpackage.gcn
    public final /* synthetic */ gbs a() {
        return frx.w(this);
    }

    @Override // defpackage.gcn
    public final List b() {
        return this.e;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        juv juvVar = frx.w(this).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        q.d("rootVeId", juvVar.c);
        juv juvVar2 = frx.x(this).c;
        if (juvVar2 == null) {
            juvVar2 = juv.e;
        }
        q.d("targetVeId", juvVar2.c);
        return q.toString();
    }
}
