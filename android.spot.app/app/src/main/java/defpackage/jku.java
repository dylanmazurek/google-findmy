package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jku extends AbstractList implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object[] b;

    public jku(Object obj, Object[] objArr) {
        this.a = obj;
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        hwx.Z(i, size());
        if (i == 0) {
            return this.a;
        }
        return this.b[i - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int length = this.b.length;
        return iqg.q(3, 1);
    }
}
