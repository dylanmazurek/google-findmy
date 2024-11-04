package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etp {
    public final etn a;
    public final boolean b;
    public final jer c;
    public final etk d;

    public etp() {
        throw null;
    }

    public static etp a(etn etnVar) {
        gji c = c();
        c.h(etnVar);
        c.f(false);
        return c.e();
    }

    public static etp b(etn etnVar, etk etkVar) {
        gji c = c();
        c.h(etnVar);
        c.f(false);
        c.g(etkVar);
        return c.e();
    }

    public static gji c() {
        gji gjiVar = new gji(null, null, null);
        gjiVar.g(etk.FAILURE);
        return gjiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof etp) {
            etp etpVar = (etp) obj;
            if (this.a.equals(etpVar.a) && this.b == etpVar.b && this.c.equals(etpVar.c) && this.d.equals(etpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((hashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        etk etkVar = this.d;
        jer jerVar = this.c;
        return "UiState{state=" + String.valueOf(this.a) + ", operationInProgress=" + this.b + ", resolutionPendingIntent=" + String.valueOf(jerVar) + ", requirementsResult=" + String.valueOf(etkVar) + "}";
    }

    public etp(etn etnVar, boolean z, jer jerVar, etk etkVar) {
        this.a = etnVar;
        this.b = z;
        this.c = jerVar;
        this.d = etkVar;
    }
}
