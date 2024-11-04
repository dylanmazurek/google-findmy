package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzi {
    static final Logger a = Logger.getLogger(lzi.class.getName());
    public static final lzi b = new lzi();

    private lzi() {
    }

    public static lzi b() {
        lzi a2 = lzg.a.a();
        if (a2 == null) {
            return b;
        }
        return a2;
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException((String) obj2);
        }
    }

    public final lzi a() {
        lzi b2 = lzg.a.b(this);
        if (b2 == null) {
            return b;
        }
        return b2;
    }

    public final void c(lzi lziVar) {
        d(lziVar, "toAttach");
        lzg.a.c(this, lziVar);
    }
}
