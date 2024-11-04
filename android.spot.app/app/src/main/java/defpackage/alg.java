package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alg {
    public static final int a(int i, int i2) {
        return i << ((i2 * 3) + 1);
    }

    public static final int b(int i) {
        return a(2, i);
    }

    public static final int c(int i) {
        return a(1, i);
    }

    public static final boolean d(aer aerVar, aer aerVar2) {
        if (aerVar == null) {
            return true;
        }
        if (aerVar instanceof aeu) {
            aeu aeuVar = (aeu) aerVar;
            if (!aeuVar.k() || amr.i(aerVar, aerVar2) || amr.i(aeuVar.c, ((aeu) aerVar2).c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final alb e(int i, Object obj, abi abiVar) {
        Object g = abiVar.g();
        if (g == abh.a) {
            g = new alf(i, true, obj);
            abiVar.w(g);
        }
        alf alfVar = (alf) g;
        if (!amr.i(alfVar.b, obj)) {
            Object obj2 = alfVar.b;
            alfVar.b = obj;
            if (obj2 != null && alfVar.a) {
                aer aerVar = alfVar.c;
                if (aerVar != null) {
                    aerVar.a();
                    alfVar.c = null;
                }
                List list = alfVar.d;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((aer) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return alfVar;
    }
}
