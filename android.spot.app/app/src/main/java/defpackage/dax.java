package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dax extends day {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dax() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dax.<init>():void");
    }

    @Override // defpackage.day
    public final float a(cyb cybVar) {
        float f;
        String str = this.b;
        if (str == null) {
            return 1.0f;
        }
        dbp c = cybVar.c(str);
        if (c != null) {
            f = c.b + 0.0f;
        } else {
            f = 0.0f;
        }
        return moz.ab(f / cybVar.j, 0.0f, 1.0f);
    }

    @Override // defpackage.day
    public final float b(cyb cybVar) {
        float f;
        String str = this.a;
        if (str == null) {
            return 0.0f;
        }
        dbp c = cybVar.c(str);
        if (c != null) {
            f = c.b;
        } else {
            f = 0.0f;
        }
        return moz.ab(f / cybVar.j, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dax)) {
            return false;
        }
        dax daxVar = (dax) obj;
        if (!amr.i(this.a, daxVar.a) || !amr.i(this.b, daxVar.b)) {
            return false;
        }
        boolean z = daxVar.c;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + 1231;
    }

    public final String toString() {
        return "Markers(min=" + this.a + ", max=" + this.b + ", maxInclusive=true)";
    }

    public /* synthetic */ dax(String str, String str2, int i) {
        this.a = 1 == (i & 1) ? null : str;
        this.b = (i & 2) != 0 ? null : str2;
        this.c = true;
    }
}
