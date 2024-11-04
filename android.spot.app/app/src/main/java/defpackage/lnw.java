package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnw {
    public final String a;
    private final String b;

    public lnw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lnw) {
            lnw lnwVar = (lnw) obj;
            if (Objects.equals(this.a, lnwVar.a) && Objects.equals(this.b, lnwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 37) + Objects.hashCode(this.b);
    }

    public final String toString() {
        return "[packageName=" + this.a + ",libraryName=" + this.b + "]";
    }
}
