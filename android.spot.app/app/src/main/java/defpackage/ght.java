package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ght implements ghq {
    private final int a;

    public ght(int i) {
        this.a = i;
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
        if ((obj instanceof ght) && this.a == ((ght) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TrayLimitInfo(limit=" + this.a + ")";
    }
}
