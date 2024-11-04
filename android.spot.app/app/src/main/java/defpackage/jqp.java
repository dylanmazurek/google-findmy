package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqp extends AbstractSet {
    final int a;
    final /* synthetic */ jqq b;

    public jqp(jqq jqqVar, int i) {
        this.b = jqqVar;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.b.c[this.a + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object c(int i) {
        return this.b.b[b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Comparator comparator;
        int i = this.a;
        int b = b();
        int a = a();
        if (i == -1) {
            comparator = jqq.a;
        } else {
            comparator = jqs.a;
        }
        if (Arrays.binarySearch(this.b.b, b, a, obj, comparator) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jqo(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
