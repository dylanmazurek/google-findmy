package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axy {
    private final Comparator a;
    private final baf b;

    public axy() {
        mkm.a(3, ph.s);
        kg kgVar = new kg(3);
        this.a = kgVar;
        this.b = new baf(kgVar);
    }

    public final ayr a() {
        ayr ayrVar = (ayr) this.b.first();
        e(ayrVar);
        return ayrVar;
    }

    public final void b(ayr ayrVar) {
        if (!ayrVar.ad()) {
            ll.g("DepthSortedSet.add called on an unattached node");
        }
        this.b.add(ayrVar);
    }

    public final boolean c(ayr ayrVar) {
        return this.b.contains(ayrVar);
    }

    public final boolean d() {
        return this.b.isEmpty();
    }

    public final void e(ayr ayrVar) {
        if (!ayrVar.ad()) {
            ll.g("DepthSortedSet.remove called on an unattached node");
        }
        this.b.remove(ayrVar);
    }

    public final String toString() {
        return this.b.toString();
    }
}
