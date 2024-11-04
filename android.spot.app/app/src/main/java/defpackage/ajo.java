package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajo extends ajf implements ListIterator, mpq {
    private final ajm c;
    private int d;
    private ajr e;
    private int f;

    public ajo(ajm ajmVar, int i) {
        super(i, ajmVar.d);
        this.c = ajmVar;
        this.d = ajmVar.b();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d == this.c.b()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f != -1) {
        } else {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        ajm ajmVar = this.c;
        this.b = ajmVar.d;
        this.d = ajmVar.b();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final void f() {
        ajm ajmVar = this.c;
        Object[] objArr = ajmVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int b = ajs.b(ajmVar.d);
        int ad = moz.ad(this.a, b);
        int i = ajmVar.a / 5;
        ajr ajrVar = this.e;
        int i2 = i + 1;
        if (ajrVar == null) {
            this.e = new ajr(objArr, ad, b, i2);
            return;
        }
        ajrVar.a = ad;
        ajrVar.b = b;
        ajrVar.c = i2;
        if (ajrVar.d.length < i2) {
            ajrVar.d = new Object[i2];
        }
        ?? r6 = 0;
        ajrVar.d[0] = objArr;
        if (ad == b) {
            r6 = 1;
        }
        ajrVar.e = r6;
        ajrVar.c(ad - r6, 1);
    }

    @Override // defpackage.ajf, java.util.ListIterator
    public final void add(Object obj) {
        c();
        this.c.add(this.a, obj);
        this.a++;
        e();
    }

    @Override // defpackage.ajf, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        ajr ajrVar = this.e;
        if (ajrVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i];
        }
        if (ajrVar.hasNext()) {
            this.a = i2;
            return ajrVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i - ajrVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        ajr ajrVar = this.e;
        if (ajrVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = ajrVar.b;
        if (i > i3) {
            Object[] objArr2 = this.c.c;
            this.a = i2;
            return objArr2[i2 - i3];
        }
        this.a = i2;
        return ajrVar.previous();
    }

    @Override // defpackage.ajf, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.ajf, java.util.ListIterator
    public final void set(Object obj) {
        c();
        d();
        this.c.set(this.f, obj);
        this.d = this.c.b();
        f();
    }
}
