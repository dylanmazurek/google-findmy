package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aip extends aiq {
    public int b;
    public int d;
    public int f;
    public int g;
    public int h;
    public aij[] a = new aij[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public static final int h(int i) {
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    private static final int i(int i, int i2) {
        return moz.ac(i + moz.ad(i, 1024), i2);
    }

    public final aij a() {
        aij aijVar = this.a[this.b - 1];
        aijVar.getClass();
        return aijVar;
    }

    public final void b() {
        this.b = 0;
        this.d = 0;
        mkm.e(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void c(aaw aawVar, agb agbVar, afp afpVar) {
        int i;
        if (g()) {
            ain ainVar = new ain(this);
            do {
                ainVar.c().b(ainVar, aawVar, agbVar, afpVar);
                if (ainVar.a >= ainVar.d.b) {
                    break;
                }
                aij c = ainVar.c();
                ainVar.b += c.b;
                ainVar.c += c.c;
                i = ainVar.a + 1;
                ainVar.a = i;
            } while (i < ainVar.d.b);
        }
        b();
    }

    public final void d(aij aijVar) {
        if (aijVar.b != 0 || aijVar.c != 0) {
            ael.a("Cannot push " + aijVar + " without arguments because it expects " + aijVar.b + " ints and " + aijVar.c + " objects.");
        }
        e(aijVar);
    }

    public final void e(aij aijVar) {
        this.g = 0;
        this.h = 0;
        int i = this.b;
        aij[] aijVarArr = this.a;
        if (i == aijVarArr.length) {
            Object[] copyOf = Arrays.copyOf(aijVarArr, i + moz.ad(i, 1024));
            copyOf.getClass();
            this.a = (aij[]) copyOf;
        }
        int i2 = this.d + aijVar.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 > length) {
            int[] copyOf2 = Arrays.copyOf(iArr, i(length, i2));
            copyOf2.getClass();
            this.c = copyOf2;
        }
        int i3 = this.f + aijVar.c;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i3 > length2) {
            Object[] copyOf3 = Arrays.copyOf(objArr, i(length2, i3));
            copyOf3.getClass();
            this.e = copyOf3;
        }
        aij[] aijVarArr2 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        aijVarArr2[i4] = aijVar;
        this.d += aijVar.b;
        this.f += aijVar.c;
    }

    public final boolean f() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }
}
