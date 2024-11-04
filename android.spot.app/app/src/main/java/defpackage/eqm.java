package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqm {
    public final jer a;
    public final jer b;
    public final jer c;
    public final boolean d;

    public eqm() {
        throw null;
    }

    public static eqm a(kzc kzcVar, kxz kxzVar, boolean z) {
        return new eqm(jdl.a, jer.i(kzcVar), jer.i(kxzVar), z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eqm) {
            eqm eqmVar = (eqm) obj;
            if (this.a.equals(eqmVar.a) && this.b.equals(eqmVar.b) && this.c.equals(eqmVar.c) && this.d == eqmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        jer jerVar = this.c;
        jer jerVar2 = this.b;
        return "MarkAsLostUiState{uiLoadingState=" + this.a.toString() + ", lostInfo=" + jerVar2.toString() + ", contactInfo=" + jerVar.toString() + ", hasContactInfoUpdateInProgress=" + this.d + "}";
    }

    public eqm(jer jerVar, jer jerVar2, jer jerVar3, boolean z) {
        this.a = jerVar;
        this.b = jerVar2;
        this.c = jerVar3;
        this.d = z;
    }
}
