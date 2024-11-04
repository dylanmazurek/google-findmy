package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyr {
    public final Object a;
    public final Throwable b;

    public cyr(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyr)) {
            return false;
        }
        cyr cyrVar = (cyr) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(cyrVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || cyrVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public cyr(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
