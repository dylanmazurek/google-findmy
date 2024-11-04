package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mph implements mow {
    private final Class a;

    public mph(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.mow
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mph) && amr.i(this.a, ((mph) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
