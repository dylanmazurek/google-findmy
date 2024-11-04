package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duq extends dus {
    private final String a;

    public duq(String str) {
        this.a = str;
    }

    @Override // defpackage.dus, defpackage.duw
    public final String a() {
        return this.a;
    }

    @Override // defpackage.duw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duw) {
            duw duwVar = (duw) obj;
            if (duwVar.b() == 1 && this.a.equals(duwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthTokenResult{authToken=" + this.a + "}";
    }
}
