package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajr extends ajf {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ajr(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.e = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    private final Object d() {
        int i = this.a & 31;
        Object obj = this.d[this.c - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    private final void e(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = this.a;
            if (ajs.a(i2, i3) != i) {
                break;
            } else {
                i3 += 5;
            }
        }
        if (i3 > 0) {
            c(i2, ((this.c - 1) - (i3 / 5)) + 1);
        }
    }

    public final void c(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[ajs.a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // defpackage.ajf, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object d = d();
            int i = this.a + 1;
            this.a = i;
            if (i == this.b) {
                this.e = true;
                return d;
            }
            e(0);
            return d;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.a--;
            if (this.e) {
                this.e = false;
                return d();
            }
            e(31);
            return d();
        }
        throw new NoSuchElementException();
    }
}
