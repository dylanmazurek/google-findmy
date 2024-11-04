package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiy {
    public static final void a(su suVar, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int c = suVar.c(obj);
        if (c < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = suVar.c[c];
        }
        if (obj3 != null) {
            if (obj3 instanceof sy) {
                ((sy) obj3).i(obj2);
            } else if (obj3 != obj2) {
                sy syVar = new sy((byte[]) null);
                syVar.i(obj3);
                syVar.i(obj2);
                obj2 = syVar;
            }
            obj2 = obj3;
        }
        if (z) {
            int i = ~c;
            suVar.b[i] = obj;
            suVar.c[i] = obj2;
            return;
        }
        suVar.c[c] = obj2;
    }

    public static final void b(su suVar, Object obj) {
        int i;
        long[] jArr = suVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = suVar.b[i5];
                            Object obj3 = suVar.c[i5];
                            if (obj3 instanceof sy) {
                                obj3.getClass();
                                sy syVar = (sy) obj3;
                                syVar.k(obj);
                                if (!syVar.b()) {
                                }
                                suVar.g(i5);
                            } else {
                                if (obj3 != obj) {
                                }
                                suVar.g(i5);
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean c(su suVar, Object obj, Object obj2) {
        Object a = suVar.a(obj);
        if (a == null) {
            return false;
        }
        if (a instanceof sy) {
            sy syVar = (sy) a;
            boolean k = syVar.k(obj2);
            if (k && syVar.b()) {
                suVar.f(obj);
                return true;
            }
            return k;
        }
        if (!amr.i(a, obj2)) {
            return false;
        }
        suVar.f(obj);
        return true;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
