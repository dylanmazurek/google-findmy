package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hao {
    public final cfc a;
    public final jer b;
    public final jer c;

    public hao(cfc cfcVar, jer jerVar, jer jerVar2) {
        this.a = cfcVar;
        this.b = jerVar;
        this.c = jerVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hao)) {
            return false;
        }
        hao haoVar = (hao) obj;
        if (amr.i(this.a, haoVar.a) && amr.i(this.b, haoVar.b) && amr.i(this.c, haoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2040732332) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ObservableAccountInformation(lifecycleOwner=" + this.a + ", countDecorationGenerator=" + this.b + ", criticalAlertFeature=" + this.c + ")";
    }
}
