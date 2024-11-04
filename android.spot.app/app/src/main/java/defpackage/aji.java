package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aji extends ajf {
    private final Object[] c;

    public aji(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // defpackage.ajf, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object[] objArr = this.c;
            int i = this.a;
            this.a = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.c;
            int i = this.a - 1;
            this.a = i;
            return objArr[i];
        }
        throw new NoSuchElementException();
    }
}
