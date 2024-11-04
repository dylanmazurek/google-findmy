package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qa extends qc implements Iterator {
    final /* synthetic */ qd a;
    private pz b;
    private boolean c = true;

    public qa(qd qdVar) {
        this.a = qdVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        pz pzVar;
        if (this.c) {
            this.c = false;
            pzVar = this.a.b;
        } else {
            pz pzVar2 = this.b;
            if (pzVar2 != null) {
                pzVar = pzVar2.c;
            } else {
                pzVar = null;
            }
        }
        this.b = pzVar;
        return this.b;
    }

    @Override // defpackage.qc
    public final void bN(pz pzVar) {
        boolean z;
        pz pzVar2 = this.b;
        if (pzVar == pzVar2) {
            pz pzVar3 = pzVar2.d;
            this.b = pzVar3;
            if (pzVar3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            if (this.a.b != null) {
                return true;
            }
            return false;
        }
        pz pzVar = this.b;
        if (pzVar != null && pzVar.c != null) {
            return true;
        }
        return false;
    }
}
