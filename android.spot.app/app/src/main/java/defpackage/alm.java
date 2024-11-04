package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alm {
    private final AtomicReference a = new AtomicReference(aln.a);
    private final Object b = new Object();
    private Object c;

    public final Object a() {
        long a = alq.a();
        if (a == alp.a) {
            return this.c;
        }
        alo aloVar = (alo) this.a.get();
        int a2 = aloVar.a(a);
        if (a2 >= 0) {
            return aloVar.c[a2];
        }
        return null;
    }

    public final void b(Object obj) {
        long a = alq.a();
        if (a == alp.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            alo aloVar = (alo) this.a.get();
            int a2 = aloVar.a(a);
            if (a2 < 0) {
                AtomicReference atomicReference = this.a;
                int i = aloVar.a;
                int i2 = 0;
                int i3 = 0;
                for (Object obj2 : aloVar.c) {
                    if (obj2 != null) {
                        i3++;
                    }
                }
                int i4 = i3 + 1;
                long[] jArr = new long[i4];
                Object[] objArr = new Object[i4];
                if (i4 > 1) {
                    int i5 = 0;
                    while (true) {
                        if (i2 >= i4 || i5 >= i) {
                            break;
                        }
                        long j = aloVar.b[i5];
                        Object obj3 = aloVar.c[i5];
                        if (j > a) {
                            jArr[i2] = a;
                            objArr[i2] = obj;
                            i2++;
                            break;
                        } else {
                            if (obj3 != null) {
                                jArr[i2] = j;
                                objArr[i2] = obj3;
                                i2++;
                            }
                            i5++;
                        }
                    }
                    if (i5 == i) {
                        jArr[i3] = a;
                        objArr[i3] = obj;
                    } else {
                        while (i2 < i4) {
                            long j2 = aloVar.b[i5];
                            Object obj4 = aloVar.c[i5];
                            if (obj4 != null) {
                                jArr[i2] = j2;
                                objArr[i2] = obj4;
                                i2++;
                            }
                            i5++;
                        }
                    }
                } else {
                    jArr[0] = a;
                    objArr[0] = obj;
                }
                atomicReference.set(new alo(i4, jArr, objArr));
                return;
            }
            aloVar.c[a2] = obj;
        }
    }
}
