package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxb implements fhl {
    public static final fxb b = new fxb();
    private final boolean c = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private fxb() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        boolean z = fxbVar.c;
        boolean z2 = fxbVar.d;
        String str = fxbVar.e;
        if (amr.g(null, null)) {
            boolean z3 = fxbVar.f;
            boolean z4 = fxbVar.i;
            String str2 = fxbVar.g;
            if (amr.g(null, null)) {
                String str3 = fxbVar.h;
                if (amr.g(null, null)) {
                    Long l = fxbVar.j;
                    if (amr.g(null, null)) {
                        Long l2 = fxbVar.k;
                        if (amr.g(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
