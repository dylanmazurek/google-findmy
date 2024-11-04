package defpackage;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkk extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ jks b;

    public jkk(jks jksVar, Object obj) {
        this.a = obj;
        this.b = jksVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new jkr(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        jko jkoVar = (jko) this.b.d.get(this.a);
        if (jkoVar == null) {
            return 0;
        }
        return jkoVar.a;
    }
}
