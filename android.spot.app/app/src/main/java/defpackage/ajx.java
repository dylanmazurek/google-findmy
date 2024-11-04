package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajx implements Iterator, mpq {
    public final ako[] a;
    public int b;
    public boolean c = true;

    public ajx(akn aknVar, ako[] akoVarArr) {
        this.a = akoVarArr;
        ako akoVar = akoVarArr[0];
        Object[] objArr = aknVar.b;
        int a = aknVar.a();
        akoVar.c(objArr, a + a);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        if (this.a[i].e()) {
            return i;
        }
        if (this.a[i].f()) {
            ako akoVar = this.a[i];
            akoVar.f();
            Object obj = akoVar.a[akoVar.b];
            obj.getClass();
            akn aknVar = (akn) obj;
            if (i == 6) {
                ako akoVar2 = this.a[7];
                Object[] objArr = aknVar.b;
                akoVar2.c(objArr, objArr.length);
            } else {
                ako akoVar3 = this.a[i + 1];
                Object[] objArr2 = aknVar.b;
                int a = aknVar.a();
                akoVar3.c(objArr2, a + a);
            }
            return b(i + 1);
        }
        return -1;
    }

    private final void c() {
        if (this.c) {
        } else {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (this.a[this.b].e()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int b = b(i);
            if (b == -1) {
                if (this.a[i].f()) {
                    this.a[i].b();
                    b = b(i);
                } else {
                    b = -1;
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                this.a[i - 1].b();
            }
            this.a[i].c(akn.a.b, 0);
        }
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        c();
        Object next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        a.a();
    }
}
