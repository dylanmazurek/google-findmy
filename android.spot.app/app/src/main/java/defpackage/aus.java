package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aus {
    private final int a;

    public final boolean equals(Object obj) {
        if ((obj instanceof aus) && this.a == ((aus) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
