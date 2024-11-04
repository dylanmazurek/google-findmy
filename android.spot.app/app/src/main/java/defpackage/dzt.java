package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt {
    public final boolean a;
    public final jer b;

    public dzt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzt) {
            dzt dztVar = (dzt) obj;
            if (this.a == dztVar.a && this.b.equals(dztVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ProfileInformation{isManagedProfile=" + this.a + ", switchProfileButtonIconAndText=" + String.valueOf(this.b) + "}";
    }

    public dzt(boolean z, jer jerVar) {
        this.a = z;
        this.b = jerVar;
    }
}
