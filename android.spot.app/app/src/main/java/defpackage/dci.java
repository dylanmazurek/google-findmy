package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dci implements dcf {
    public final boolean a;
    public final int b;

    public dci(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.dcf
    public final cyz a(cym cymVar, cyb cybVar, dcu dcuVar) {
        if (!cymVar.h) {
            deu.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new czi(this);
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "EXCLUDE_INTERSECTIONS";
                        }
                    } else {
                        str = "INTERSECT";
                    }
                } else {
                    str = "SUBTRACT";
                }
            } else {
                str = "ADD";
            }
        } else {
            str = "MERGE";
        }
        return a.ag(str, "MergePaths{mode=", "}");
    }
}
