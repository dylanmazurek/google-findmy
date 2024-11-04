package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnj implements dnh {
    private final String a;

    public dnj(String str) {
        this.a = str;
    }

    @Override // defpackage.dnh
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dnj) {
            return this.a.equals(((dnj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
