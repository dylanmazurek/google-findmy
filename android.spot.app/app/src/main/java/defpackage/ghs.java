package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghs implements ghq {
    public final int a;
    public final String b;

    public ghs(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ghq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ghq
    public final /* synthetic */ ldg b() {
        return fzo.d(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghs)) {
            return false;
        }
        ghs ghsVar = (ghs) obj;
        if (this.a == ghsVar.a && amr.i(this.b, ghsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlotLimitInfo(limit=" + this.a + ", slotKey=" + this.b + ")";
    }
}
