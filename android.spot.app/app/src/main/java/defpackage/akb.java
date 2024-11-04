package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akb implements Iterator, mpq {
    public final ajz a;

    public akb(ajy ajyVar) {
        ako[] akoVarArr = new ako[8];
        for (int i = 0; i < 8; i++) {
            akoVarArr[i] = new aks(this);
        }
        this.a = new ajz(ajyVar, akoVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (Map.Entry) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
