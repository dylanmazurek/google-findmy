package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvd implements fhl {
    public final int b;
    private final String c = null;

    public fvd(fxf fxfVar) {
        this.b = fxfVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fvd)) {
            return false;
        }
        fvd fvdVar = (fvd) obj;
        if (this.b == fvdVar.b) {
            String str = fvdVar.c;
            if (amr.g(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), null});
    }
}
