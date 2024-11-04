package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajz extends ajx implements Iterator, mpq {
    public final ajy d;
    public int e;
    private Object f;
    private boolean g;

    public ajz(ajy ajyVar, ako[] akoVarArr) {
        super(ajyVar.b, akoVarArr);
        this.d = ajyVar;
        this.e = ajyVar.d;
    }

    public final void b(int i, akn aknVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            ako akoVar = this.a[i2];
            Object[] objArr = aknVar.b;
            akoVar.d(objArr, objArr.length, 0);
            while (!amr.i(this.a[i2].a(), obj)) {
                this.a[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int a = 1 << akr.a(i, i3);
        if (aknVar.m(a)) {
            int b = aknVar.b(a);
            ako akoVar2 = this.a[i2];
            Object[] objArr2 = aknVar.b;
            int a2 = aknVar.a();
            akoVar2.d(objArr2, a2 + a2, b);
            this.b = i2;
            return;
        }
        int c = aknVar.c(a);
        akn i4 = aknVar.i(c);
        ako akoVar3 = this.a[i2];
        Object[] objArr3 = aknVar.b;
        int a3 = aknVar.a();
        akoVar3.d(objArr3, a3 + a3, c);
        b(i, i4, obj, i2 + 1);
    }

    @Override // defpackage.ajx, java.util.Iterator
    public final Object next() {
        if (this.d.d == this.e) {
            this.f = a();
            this.g = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // defpackage.ajx, java.util.Iterator
    public final void remove() {
        int i;
        if (this.g) {
            if (this.c) {
                Object a = a();
                ajy ajyVar = this.d;
                Object obj = this.f;
                mpp.h(ajyVar);
                ajyVar.remove(obj);
                if (a != null) {
                    i = a.hashCode();
                } else {
                    i = 0;
                }
                b(i, this.d.b, a, 0);
            } else {
                ajy ajyVar2 = this.d;
                Object obj2 = this.f;
                mpp.h(ajyVar2);
                ajyVar2.remove(obj2);
            }
            this.f = null;
            this.g = false;
            this.e = this.d.d;
            return;
        }
        throw new IllegalStateException();
    }
}
