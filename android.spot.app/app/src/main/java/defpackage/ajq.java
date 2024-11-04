package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajq extends ajh implements List, aja {
    public static final ajq a = new ajq(new Object[0]);
    private final Object[] b;

    public ajq(Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.ajc
    public final ajb b() {
        return new ajm(this, null, this.b, 0);
    }

    @Override // defpackage.ajc
    public final ajc c(Object obj) {
        if (a() < 32) {
            Object[] copyOf = Arrays.copyOf(this.b, a() + 1);
            copyOf.getClass();
            copyOf[a()] = obj;
            return new ajq(copyOf);
        }
        return new ajk(this.b, ajs.c(obj), a() + 1, 0);
    }

    @Override // defpackage.ajc
    public final ajc d(int i, Object obj) {
        a.u(i, a());
        if (i != a()) {
            int i2 = i + 1;
            if (a() < 32) {
                Object[] objArr = new Object[a() + 1];
                mkm.y(this.b, objArr, 0, i, 6);
                mkm.q(this.b, objArr, i2, i, a());
                objArr[i] = obj;
                return new ajq(objArr);
            }
            Object[] objArr2 = this.b;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf.getClass();
            mkm.q(this.b, copyOf, i2, i, a() - 1);
            copyOf[i] = obj;
            return new ajk(copyOf, ajs.c(this.b[31]), a() + 1, 0);
        }
        return c(obj);
    }

    @Override // defpackage.ajh, defpackage.ajc
    public final ajc e(Collection collection) {
        if (a() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.b, a() + collection.size());
            copyOf.getClass();
            int a2 = a();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[a2] = it.next();
                a2++;
            }
            return new ajq(copyOf);
        }
        ajb b = b();
        b.addAll(collection);
        return b.a();
    }

    @Override // defpackage.mln, java.util.List
    public final Object get(int i) {
        a.t(i, a());
        return this.b[i];
    }

    @Override // defpackage.ajc
    public final ajc h(moh mohVar) {
        Object[] objArr = this.b;
        int a2 = a();
        int a3 = a();
        boolean z = false;
        for (int i = 0; i < a3; i++) {
            Object obj = this.b[i];
            if (((Boolean) mohVar.a(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    objArr.getClass();
                    z = true;
                    a2 = i;
                }
            } else if (z) {
                objArr[a2] = obj;
                a2++;
            }
        }
        if (a2 == a()) {
            return this;
        }
        if (a2 == 0) {
            return a;
        }
        return new ajq(mkm.g(objArr, 0, a2));
    }

    @Override // defpackage.ajc
    public final ajc i(int i) {
        a.t(i, a());
        if (a() == 1) {
            return a;
        }
        Object[] copyOf = Arrays.copyOf(this.b, a() - 1);
        copyOf.getClass();
        mkm.q(this.b, copyOf, i, i + 1, a());
        return new ajq(copyOf);
    }

    @Override // defpackage.mln, java.util.List
    public final int indexOf(Object obj) {
        return mkm.i(this.b, obj);
    }

    @Override // defpackage.ajc
    public final ajc j(int i, Object obj) {
        a.t(i, a());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf.getClass();
        copyOf[i] = obj;
        return new ajq(copyOf);
    }

    @Override // defpackage.mln, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (!amr.i(obj, objArr[length2])) {
                    if (i2 < 0) {
                        return -1;
                    }
                    length2 = i2;
                } else {
                    return length2;
                }
            }
        }
    }

    @Override // defpackage.mln, java.util.List
    public final ListIterator listIterator(int i) {
        a.u(i, a());
        return new aji(this.b, i, a());
    }
}
