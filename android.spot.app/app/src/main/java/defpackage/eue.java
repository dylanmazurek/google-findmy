package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eue {
    public final boolean a;
    public final jer b;
    public final int c;

    public eue() {
        throw null;
    }

    public static eue a(boolean z) {
        return new eue(1, z, jdl.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eue) {
            eue eueVar = (eue) obj;
            if (this.c == eueVar.c && this.a == eueVar.a && this.b.equals(eueVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.c;
        a.N(i2);
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((i2 ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                str = "LINK_GENERATED";
            } else {
                str = "GENERATING_LINK";
            }
        } else {
            str = "SHOWING_EXPLANATION";
        }
        return "SharingInvitationExplanationState{state=" + str + ", isButtonEnabled=" + this.a + ", invitationLink=" + this.b.toString() + "}";
    }

    public eue(int i, boolean z, jer jerVar) {
        this.c = i;
        this.a = z;
        this.b = jerVar;
    }
}
