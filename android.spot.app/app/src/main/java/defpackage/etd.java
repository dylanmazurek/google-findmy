package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etd {
    public final jer a;
    public final int b;

    public etd() {
        throw null;
    }

    public static etd a() {
        return new etd(4, jdl.a);
    }

    public static etd b(String str) {
        return new etd(2, jer.i(str));
    }

    public static etd c() {
        return new etd(1, jdl.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof etd) {
            etd etdVar = (etd) obj;
            if (this.b == etdVar.b && this.a.equals(etdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.N(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "FAILURE";
                } else {
                    str = "APPLICATION_ALREADY_APPROVED";
                }
            } else {
                str = "VALIDATION_CODE_CALCULATED";
            }
        } else {
            str = "WAITING_FOR_VALIDATION_CODE";
        }
        return "SharingValidationCalculationState{state=" + str + ", validationCode=" + this.a.toString() + "}";
    }

    public etd(int i, jer jerVar) {
        this.b = i;
        this.a = jerVar;
    }
}
