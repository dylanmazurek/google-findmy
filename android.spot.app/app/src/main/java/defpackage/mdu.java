package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdu {
    public String a = "unknown-authority";
    public lyp b = lyp.a;
    public String c;
    public lzs d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof mdu)) {
            return false;
        }
        mdu mduVar = (mdu) obj;
        if (!this.a.equals(mduVar.a) || !this.b.equals(mduVar.b) || !amr.g(this.c, mduVar.c) || !amr.g(this.d, mduVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
