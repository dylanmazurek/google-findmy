package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sl implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public sl() {
        this((byte[]) null);
    }

    public final int a(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != sm.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return td.b(this.b, this.d, j);
    }

    public final int b() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != sm.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final long c(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.d)) {
            if (this.a) {
                long[] jArr = this.b;
                Object[] objArr = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != sm.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
            }
            return this.b[i];
        }
        throw new IllegalArgumentException(a.ae(i, "Expected index to be within 0..size()-1, but was "));
    }

    /* renamed from: d */
    public final sl clone() {
        Object clone = super.clone();
        clone.getClass();
        sl slVar = (sl) clone;
        slVar.b = (long[]) this.b.clone();
        slVar.c = (Object[]) this.c.clone();
        return slVar;
    }

    public final Object e(long j) {
        Object obj;
        int b = td.b(this.b, this.d, j);
        if (b >= 0 && (obj = this.c[b]) != sm.a) {
            return obj;
        }
        return null;
    }

    public final Object f(long j, Object obj) {
        Object obj2;
        int b = td.b(this.b, this.d, j);
        if (b >= 0 && (obj2 = this.c[b]) != sm.a) {
            return obj2;
        }
        return obj;
    }

    public final Object g(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.d)) {
            if (this.a) {
                long[] jArr = this.b;
                Object[] objArr = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != sm.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
            }
            return this.c[i];
        }
        throw new IllegalArgumentException(a.ae(i, "Expected index to be within 0..size()-1, but was "));
    }

    public final void h(long j, Object obj) {
        int i = this.d;
        if (i != 0 && j <= this.b[i - 1]) {
            j(j, obj);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                Object[] objArr = this.c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = objArr[i3];
                    if (obj2 != sm.a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj2;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.a = false;
                this.d = i2;
                i = i2;
            }
        }
        long[] jArr2 = this.b;
        if (i >= jArr2.length) {
            int e = td.e(i + 1);
            long[] copyOf = Arrays.copyOf(jArr2, e);
            copyOf.getClass();
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            copyOf2.getClass();
            this.c = copyOf2;
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d = i + 1;
    }

    public final void i() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void j(long j, Object obj) {
        int b = td.b(this.b, this.d, j);
        if (b >= 0) {
            this.c[b] = obj;
            return;
        }
        int i = ~b;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == sm.a) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != sm.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~td.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        long[] jArr2 = this.b;
        if (i5 >= jArr2.length) {
            int e = td.e(i5 + 1);
            long[] copyOf = Arrays.copyOf(jArr2, e);
            copyOf.getClass();
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            copyOf2.getClass();
            this.c = copyOf2;
        }
        int i6 = this.d - i;
        if (i6 != 0) {
            long[] jArr3 = this.b;
            int i7 = i + 1;
            jArr3.getClass();
            jArr3.getClass();
            System.arraycopy(jArr3, i, jArr3, i7, i6);
            Object[] objArr3 = this.c;
            mkm.q(objArr3, objArr3, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void k(long j) {
        int b = td.b(this.b, this.d, j);
        if (b >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[b];
            Object obj2 = sm.a;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.a = true;
            }
        }
    }

    public final boolean l(long j) {
        if (a(j) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public sl(int i) {
        if (i == 0) {
            this.b = td.b;
            this.c = td.c;
        } else {
            int e = td.e(i);
            this.b = new long[e];
            this.c = new Object[e];
        }
    }

    public /* synthetic */ sl(byte[] bArr) {
        this(10);
    }
}
