package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qb extends qc implements Iterator {
    pz a;
    pz b;

    public qb(pz pzVar, pz pzVar2) {
        this.a = pzVar2;
        this.b = pzVar;
    }

    private final pz d() {
        pz pzVar = this.b;
        pz pzVar2 = this.a;
        if (pzVar != pzVar2 && pzVar2 != null) {
            return b(pzVar);
        }
        return null;
    }

    public abstract pz a(pz pzVar);

    public abstract pz b(pz pzVar);

    @Override // defpackage.qc
    public final void bN(pz pzVar) {
        if (this.a == pzVar && pzVar == this.b) {
            this.b = null;
            this.a = null;
        }
        pz pzVar2 = this.a;
        if (pzVar2 == pzVar) {
            this.a = a(pzVar2);
        }
        if (this.b == pzVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        pz pzVar = this.b;
        this.b = d();
        return pzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
