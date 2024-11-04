package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eda {
    public final boolean a;
    public final boolean b;
    public final jer c;
    public final jer d;
    public final jer e;
    public final jer f;
    public final int g;

    public eda() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eda) {
            eda edaVar = (eda) obj;
            if (this.a == edaVar.a && this.b == edaVar.b && this.c.equals(edaVar.c)) {
                int i = this.g;
                int i2 = edaVar.g;
                if (i != 0) {
                    if (i == i2 && this.d.equals(edaVar.d) && this.e.equals(edaVar.e) && this.f.equals(edaVar.f)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.b) {
            i2 = 1231;
        }
        int hashCode = ((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.c.hashCode();
        int i3 = this.g;
        a.N(i3);
        return (((((((hashCode * 1000003) ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.g;
        String valueOf = String.valueOf(this.c);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "STOPPING";
                    }
                } else {
                    str = "RINGING";
                }
            } else {
                str = "STARTING";
            }
        } else {
            str = "STOPPED";
        }
        boolean z = this.b;
        boolean z2 = this.a;
        jer jerVar = this.d;
        jer jerVar2 = this.e;
        jer jerVar3 = this.f;
        return "RingingUiState{supportsStopRinging=" + z2 + ", supportsLock=" + z + ", explanationMessage=" + valueOf + ", ringingState=" + str + ", ringingStartedMillis=" + String.valueOf(jerVar) + ", ringingWillStopMillis=" + String.valueOf(jerVar2) + ", statusString=" + String.valueOf(jerVar3) + "}";
    }

    public eda(boolean z, boolean z2, jer jerVar, int i, jer jerVar2, jer jerVar3, jer jerVar4) {
        this.a = z;
        this.b = z2;
        this.c = jerVar;
        this.g = i;
        this.d = jerVar2;
        this.e = jerVar3;
        this.f = jerVar4;
    }
}
