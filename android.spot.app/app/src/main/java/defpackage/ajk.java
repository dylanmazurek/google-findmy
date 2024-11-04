package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajk extends ajh implements List, ajc {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public ajk(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            ael.a("Trie-based persistent vector should have at least 33 elements, got " + i);
        }
        int length = objArr2.length;
    }

    private final int l() {
        return ajs.b(this.c);
    }

    private final ajc m(Object[] objArr, int i, int i2, int i3) {
        ajk ajkVar;
        int i4 = this.c - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    objArr.getClass();
                }
                return new ajq(objArr);
            }
            ajj ajjVar = new ajj(null);
            Object[] q = q(objArr, i2, i - 1, ajjVar);
            q.getClass();
            Object obj = ajjVar.a;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (q[1] == null) {
                Object obj2 = q[0];
                obj2.getClass();
                ajkVar = new ajk((Object[]) obj2, objArr2, i, i2 - 5);
            } else {
                ajkVar = new ajk(q, objArr2, i, i2);
            }
            return ajkVar;
        }
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        int i5 = i4 - 1;
        if (i3 < i5) {
            mkm.q(this.b, copyOf, i3, i3 + 1, i4);
        }
        copyOf[i5] = null;
        return new ajk(objArr, copyOf, (i + i4) - 1, i2);
    }

    private final ajk n(Object[] objArr, int i, Object obj) {
        int l = this.c - l();
        Object[] copyOf = Arrays.copyOf(this.b, 32);
        copyOf.getClass();
        int i2 = i + 1;
        if (l < 32) {
            mkm.q(this.b, copyOf, i2, i, l);
            copyOf[i] = obj;
            return new ajk(objArr, copyOf, this.c + 1, this.d);
        }
        Object[] objArr2 = this.b;
        Object obj2 = objArr2[31];
        mkm.q(objArr2, copyOf, i2, i, l - 1);
        copyOf[i] = obj;
        return o(objArr, copyOf, ajs.c(obj2));
    }

    private final ajk o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = this.d;
        if ((i >> 5) > (1 << i2)) {
            Object[] c = ajs.c(objArr);
            int i3 = this.d + 5;
            return new ajk(r(c, i3, objArr2), objArr3, this.c + 1, i3);
        }
        return new ajk(r(objArr, i2, objArr2), objArr3, this.c + 1, this.d);
    }

    private final Object[] p(Object[] objArr, int i, int i2, Object obj, ajj ajjVar) {
        Object[] copyOf;
        int a = ajs.a(i2, i);
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                copyOf.getClass();
            }
            mkm.q(objArr, copyOf, a + 1, a, 31);
            ajjVar.a = objArr[31];
            copyOf[a] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        copyOf2.getClass();
        int i3 = i - 5;
        Object obj2 = objArr[a];
        obj2.getClass();
        copyOf2[a] = p((Object[]) obj2, i3, i2, obj, ajjVar);
        while (true) {
            a++;
            if (a >= 32 || copyOf2[a] == null) {
                break;
            }
            Object obj3 = objArr[a];
            obj3.getClass();
            copyOf2[a] = p((Object[]) obj3, i3, 0, ajjVar.a, ajjVar);
        }
        return copyOf2;
    }

    private final Object[] q(Object[] objArr, int i, int i2, ajj ajjVar) {
        Object[] q;
        int a = ajs.a(i2, i);
        if (i == 5) {
            ajjVar.a = objArr[a];
            q = null;
        } else {
            Object obj = objArr[a];
            obj.getClass();
            q = q((Object[]) obj, i - 5, i2, ajjVar);
        }
        if (q == null && a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf.getClass();
        copyOf[a] = q;
        return copyOf;
    }

    private final Object[] r(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArr3;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            objArr3.getClass();
        } else {
            objArr3 = new Object[32];
        }
        int a = ajs.a(this.c - 1, i);
        if (i == 5) {
            objArr3[a] = objArr2;
        } else {
            objArr3[a] = r((Object[]) objArr3[a], i - 5, objArr2);
        }
        return objArr3;
    }

    private final Object[] s(Object[] objArr, int i, int i2, ajj ajjVar) {
        Object[] copyOf;
        int a = ajs.a(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (a == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                copyOf.getClass();
            }
            mkm.q(objArr, copyOf, a, a + 1, 32);
            copyOf[31] = ajjVar.a;
            ajjVar.a = objArr[a];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = ajs.a(l() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        copyOf2.getClass();
        int i4 = i - 5;
        int i5 = a + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = s((Object[]) obj, i4, 0, ajjVar);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[a];
        obj2.getClass();
        copyOf2[a] = s((Object[]) obj2, i4, i2, ajjVar);
        return copyOf2;
    }

    private final Object[] t(Object[] objArr, int i, int i2, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf.getClass();
        int a = ajs.a(i2, i);
        if (i == 0) {
            copyOf[a] = obj;
        } else {
            Object obj2 = copyOf[a];
            obj2.getClass();
            copyOf[a] = t((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ajc
    public final ajc c(Object obj) {
        int l = this.c - l();
        if (l < 32) {
            Object[] copyOf = Arrays.copyOf(this.b, 32);
            copyOf.getClass();
            copyOf[l] = obj;
            return new ajk(this.a, copyOf, this.c + 1, this.d);
        }
        return o(this.a, this.b, ajs.c(obj));
    }

    @Override // defpackage.ajc
    public final ajc d(int i, Object obj) {
        a.u(i, this.c);
        if (i == this.c) {
            return c(obj);
        }
        int l = l();
        if (i >= l) {
            return n(this.a, i - l, obj);
        }
        ajj ajjVar = new ajj(null);
        return n(p(this.a, this.d, i, obj, ajjVar), 0, ajjVar.a);
    }

    @Override // defpackage.mln, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        a.t(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[ajs.a(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.ajc
    public final ajc h(moh mohVar) {
        ajm b = b();
        b.e(mohVar);
        return b.a();
    }

    @Override // defpackage.ajc
    public final ajc i(int i) {
        a.t(i, this.c);
        int l = l();
        if (i >= l) {
            return m(this.a, l, this.d, i - l);
        }
        return m(s(this.a, this.d, i, new ajj(this.b[0])), l, this.d, 0);
    }

    @Override // defpackage.ajc
    public final ajc j(int i, Object obj) {
        a.t(i, this.c);
        if (l() <= i) {
            Object[] copyOf = Arrays.copyOf(this.b, 32);
            copyOf.getClass();
            copyOf[i & 31] = obj;
            return new ajk(this.a, copyOf, this.c, this.d);
        }
        return new ajk(t(this.a, this.d, i, obj), this.b, this.c, this.d);
    }

    @Override // defpackage.ajc
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ajm b() {
        return new ajm(this, this.a, this.b, this.d);
    }

    @Override // defpackage.mln, java.util.List
    public final ListIterator listIterator(int i) {
        a.u(i, this.c);
        int i2 = this.d / 5;
        return new ajn(this.a, this.b, i, this.c, i2 + 1);
    }
}
