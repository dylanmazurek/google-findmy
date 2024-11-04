package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ift {
    public final jer a;
    public final jjm b;
    public final jer c;
    public final int d;

    public ift() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ift) {
            ift iftVar = (ift) obj;
            if (this.a.equals(iftVar.a) && this.b.equals(iftVar.b) && this.c.equals(iftVar.c) && this.d == iftVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        jer jerVar = this.c;
        jjm jjmVar = this.b;
        return "ScanParams{accountKey=" + String.valueOf(this.a) + ", e2EePubKeysIds=" + String.valueOf(jjmVar) + ", canonicDeviceId=" + String.valueOf(jerVar) + ", timeoutMillis=" + this.d + "}";
    }

    public ift(jer jerVar, jjm jjmVar, jer jerVar2, int i) {
        this.a = jerVar;
        this.b = jjmVar;
        this.c = jerVar2;
        this.d = i;
    }
}
