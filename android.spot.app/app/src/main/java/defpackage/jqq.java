package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqq extends AbstractMap {
    public static final Comparator a = new bfr(16);
    public final Object[] b;
    public final int[] c;
    public final Set d = new jqp(this, -1);
    private Integer e = null;
    private String f = null;

    public jqq(jqq jqqVar, jqq jqqVar2) {
        int i;
        Object obj;
        Object[] objArr;
        int size = jqqVar.size() + jqqVar2.size();
        int b = jqqVar.b() + jqqVar2.b();
        int i2 = size + 1;
        Object[] objArr2 = new Object[b];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        int i4 = size;
        Map.Entry c = jqqVar.c(0);
        Map.Entry c2 = jqqVar2.c(0);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (c == null && c2 == null) {
                break;
            }
            int i8 = i5 + 1;
            int i9 = c == null ? 1 : c2 == null ? -1 : 0;
            if (i9 == 0 && (i9 = ((String) c.getKey()).compareTo((String) c2.getKey())) == 0) {
                int i10 = i7 + 1;
                int i11 = i6 + 1;
                objArr2[i5] = d((String) c.getKey(), i5);
                jqp jqpVar = (jqp) c.getValue();
                jqp jqpVar2 = (jqp) c2.getValue();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= jqpVar.size() && i12 >= jqpVar2.size()) {
                        break;
                    }
                    int i14 = i13 == jqpVar.size() ? 1 : i12 == jqpVar2.size() ? -1 : 0;
                    if (i14 == 0) {
                        i = i10;
                        i14 = jqs.a.compare(jqpVar.c(i13), jqpVar2.c(i12));
                    } else {
                        i = i10;
                    }
                    if (i14 < 0) {
                        obj = jqpVar.c(i13);
                        i13++;
                    } else {
                        int i15 = i12 + 1;
                        Object c3 = jqpVar2.c(i12);
                        i13 = i14 == 0 ? i13 + 1 : i13;
                        obj = c3;
                        i12 = i15;
                    }
                    objArr2[i4] = obj;
                    i4++;
                    i10 = i;
                    i3 = 0;
                }
                iArr[i8] = i4;
                c = jqqVar.c(i11);
                c2 = jqqVar2.c(i10);
                i7 = i10;
                i6 = i11;
                i5 = i8;
            } else {
                if (i9 < 0) {
                    int i16 = i6 + 1;
                    int a2 = a(c, i5, i4, objArr2, iArr);
                    c = jqqVar.c(i16);
                    i4 = a2;
                    i6 = i16;
                } else {
                    int i17 = i7 + 1;
                    int a3 = a(c2, i5, i4, objArr2, iArr);
                    c2 = jqqVar2.c(i17);
                    i4 = a3;
                    i7 = i17;
                }
                i5 = i8;
                i3 = 0;
            }
        }
        int i18 = iArr[i3];
        int i19 = i18 - i5;
        if (i19 != 0) {
            for (int i20 = 0; i20 <= i5; i20++) {
                iArr[i20] = iArr[i20] - i19;
            }
            int i21 = iArr[i5];
            int i22 = i21 - i5;
            if (e(b, i21)) {
                objArr = new Object[i21];
                System.arraycopy(objArr2, i3, objArr, i3, i5);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i18, objArr, i5, i22);
            objArr2 = objArr;
        }
        this.b = objArr2;
        int i23 = iArr[i3] + 1;
        this.c = e(i2, i23) ? Arrays.copyOf(iArr, i23) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        jqp jqpVar = (jqp) entry.getValue();
        int a2 = jqpVar.a() - jqpVar.b();
        System.arraycopy(jqpVar.b.b, jqpVar.b(), objArr, i2, a2);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + a2;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new jqp(this, i));
    }

    private static boolean e(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(super.hashCode());
        }
        return this.e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }

    public jqq(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            Object obj = ((jck) it2.next()).a;
            throw null;
        }
        Object obj2 = ((jck) it.next()).a;
        throw null;
    }
}
