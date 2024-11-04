package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbl {
    public static final nbj a = new nbj("NO_THREAD_ELEMENTS");
    private static final mol b = cbj.i;
    private static final mol c = cbj.j;
    private static final mol d = cbj.k;

    public static final Object a(mnb mnbVar) {
        Object fold = mnbVar.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object b(mnb mnbVar, Object obj) {
        if (obj == null) {
            obj = a(mnbVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return mnbVar.fold(new nbo(mnbVar, ((Number) obj).intValue()), d);
        }
        return ((mvb) obj).dg(mnbVar);
    }

    public static final void c(mnb mnbVar, Object obj) {
        if (obj != a) {
            if (obj instanceof nbo) {
                nbo nboVar = (nbo) obj;
                int length = nboVar.c.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    mvb mvbVar = nboVar.c[length];
                    mvbVar.getClass();
                    mvbVar.dh(nboVar.b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = mnbVar.fold(null, c);
                fold.getClass();
                ((mvb) fold).dh(obj);
            }
        }
    }
}
