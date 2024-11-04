package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljt extends AbstractList {
    private final ljr a;
    private final ljs b;

    public ljt(ljr ljrVar, ljs ljsVar) {
        this.a = ljrVar;
        this.b = ljsVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
