package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftt implements fhl {
    public final int b;
    private final int e;
    private final boolean d = false;
    private final String c = null;

    public ftt(int i, int i2) {
        this.b = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ftt)) {
            return false;
        }
        ftt fttVar = (ftt) obj;
        boolean z = fttVar.d;
        if (amr.g(Integer.valueOf(this.b), Integer.valueOf(fttVar.b))) {
            String str = fttVar.c;
            if (amr.g(null, null) && amr.g(Integer.valueOf(this.e), Integer.valueOf(fttVar.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), false, null, Integer.valueOf(this.e)});
    }
}
