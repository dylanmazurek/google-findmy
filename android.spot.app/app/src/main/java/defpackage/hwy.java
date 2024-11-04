package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwy {
    public final ExperimentTokens a;
    public final String b;

    public hwy(ExperimentTokens experimentTokens, String str) {
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwy)) {
            return false;
        }
        hwy hwyVar = (hwy) obj;
        if (amr.i(this.a, hwyVar.a) && amr.i(this.b, hwyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
