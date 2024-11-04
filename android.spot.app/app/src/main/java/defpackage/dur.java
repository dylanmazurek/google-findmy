package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dur extends dus {
    private final int a;

    public dur(int i) {
        this.a = i;
    }

    @Override // defpackage.duw
    public final int b() {
        return 2;
    }

    @Override // defpackage.dus, defpackage.duw
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duw) {
            duw duwVar = (duw) obj;
            if (duwVar.b() == 2 && this.a == duwVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AuthTokenResult{errorStatusCode=" + this.a + "}";
    }
}
