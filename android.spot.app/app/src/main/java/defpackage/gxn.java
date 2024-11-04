package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxn {
    public final Boolean a;
    public final Boolean b;
    public final boolean c;
    private final Boolean d;

    public gxn(Boolean bool, Boolean bool2, Boolean bool3) {
        this.d = bool;
        this.a = bool2;
        this.b = bool3;
        boolean z = false;
        if ((bool == null || bool.booleanValue()) && ((bool2 == null || bool2.booleanValue()) && (bool3 == null || bool3.booleanValue()))) {
            z = true;
        }
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxn)) {
            return false;
        }
        gxn gxnVar = (gxn) obj;
        if (amr.i(this.d, gxnVar.d) && amr.i(this.a, gxnVar.a) && amr.i(this.b, gxnVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.d;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        Boolean bool2 = this.a;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool3 = this.b;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return ((i2 + hashCode2) * 31) + i;
    }

    public final String toString() {
        return "ImageLoadingOutcome(collapsedViewIconLoadingOutcome=" + this.d + ", expandedViewImageLoadingOutcome=" + this.a + ", expandedViewIconLoadingOutcome=" + this.b + ")";
    }
}
