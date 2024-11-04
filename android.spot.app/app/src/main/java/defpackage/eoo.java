package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoo {
    public final String a;
    public final kye b;
    public final boolean c;
    public final jis d;
    public final jis e;
    public final boolean f;
    public final boolean g;

    public eoo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eoo) {
            eoo eooVar = (eoo) obj;
            if (this.a.equals(eooVar.a) && this.b.equals(eooVar.b) && this.c == eooVar.c && hzc.L(this.d, eooVar.d) && hzc.L(this.e, eooVar.e) && this.f == eooVar.f && this.g == eooVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i3 = 1237;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = ((((((hashCode * 1000003) ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (true != this.f) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = (hashCode2 ^ i2) * 1000003;
        if (true == this.g) {
            i3 = 1231;
        }
        return i4 ^ i3;
    }

    public final String toString() {
        jis jisVar = this.e;
        jis jisVar2 = this.d;
        return "SpotDeviceDetailsSharingState{deviceName=" + this.a + ", sharingState=" + String.valueOf(this.b) + ", canInviteMoreOwners=" + this.c + ", activeOwners=" + String.valueOf(jisVar2) + ", pendingOwners=" + String.valueOf(jisVar) + ", refreshingSharedOwners=" + this.f + ", isRelinquishing=" + this.g + "}";
    }

    public eoo(String str, kye kyeVar, boolean z, jis jisVar, jis jisVar2, boolean z2, boolean z3) {
        this.a = str;
        this.b = kyeVar;
        this.c = z;
        this.d = jisVar;
        this.e = jisVar2;
        this.f = z2;
        this.g = z3;
    }
}
