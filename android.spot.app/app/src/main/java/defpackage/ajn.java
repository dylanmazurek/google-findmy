package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajn extends ajf {
    private final Object[] c;
    private final ajr d;

    public ajn(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int b = ajs.b(i2);
        this.d = new ajr(objArr, moz.ad(i, b), b, i3);
    }

    @Override // defpackage.ajf, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        ajr ajrVar = this.d;
        if (ajrVar.hasNext()) {
            this.a++;
            return ajrVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i - ajrVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        ajr ajrVar = this.d;
        int i3 = ajrVar.b;
        if (i > i3) {
            Object[] objArr = this.c;
            this.a = i2;
            return objArr[i2 - i3];
        }
        this.a = i2;
        return ajrVar.previous();
    }
}
