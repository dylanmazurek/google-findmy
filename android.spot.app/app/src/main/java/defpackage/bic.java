package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bic {
    private int[] a;
    private Object[] b;
    private int c;

    public bic() {
        this(null);
    }

    protected final int a(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a = bia.a(this.a, i2, i);
        if (a < 0) {
            return a;
        }
        if (amr.i(obj, this.b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (amr.i(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (amr.i(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int b(Object obj) {
        if (obj == null) {
            return c();
        }
        return a(obj, obj.hashCode());
    }

    protected final int c() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a = bia.a(this.a, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object d(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return this.b[b + b + 1];
        }
        return null;
    }

    public final Object e(int i) {
        return this.b[i + i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof bic) {
                bic bicVar = (bic) obj;
                int i = this.c;
                if (i != bicVar.c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object g = g(i2);
                    Object d = bicVar.d(e);
                    if (g == null) {
                        if (d != null || bicVar.b(e) < 0) {
                            return false;
                        }
                    } else if (!amr.i(g, d)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object g2 = g(i4);
                Map map = (Map) obj;
                Object obj2 = map.get(e2);
                if (g2 == null) {
                    if (obj2 != null || !map.containsKey(e2)) {
                        return false;
                    }
                } else if (!amr.i(g2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(Object obj, Object obj2) {
        int hashCode;
        int a;
        int i = this.c;
        if (obj == null) {
            a = c();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            a = a(obj, hashCode);
        }
        if (a >= 0) {
            int i2 = a + a + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~a;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i4 + i4);
            copyOf2.getClass();
            this.b = copyOf2;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            mkm.p(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            int i6 = this.c;
            mkm.q(objArr2, objArr2, i5 + i5, i3 + i3, i6 + i6);
        }
        int i7 = this.c;
        if (i == i7) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i8 = i3 + i3;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object g(int i) {
        return this.b[i + i + 1];
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i2 = this.c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final String toString() {
        int i = this.c;
        if (i > 0) {
            StringBuilder sb = new StringBuilder(i * 28);
            sb.append('{');
            int i2 = this.c;
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                Object e = e(i3);
                if (e != this) {
                    sb.append(e);
                } else {
                    sb.append("(this Map)");
                }
                sb.append('=');
                Object g = g(i3);
                if (g != this) {
                    sb.append(g);
                } else {
                    sb.append("(this Map)");
                }
            }
            sb.append('}');
            return sb.toString();
        }
        return "{}";
    }

    public /* synthetic */ bic(byte[] bArr) {
        this.a = bia.a;
        this.b = bia.b;
        this.c = 0;
    }
}
