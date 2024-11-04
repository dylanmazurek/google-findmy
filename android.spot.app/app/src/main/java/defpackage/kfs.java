package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfs {
    public final int a;
    private final kab b;
    private final String c;
    private final String d;

    public kfs(kab kabVar, int i, String str, String str2) {
        this.b = kabVar;
        this.a = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kfs)) {
            return false;
        }
        kfs kfsVar = (kfs) obj;
        if (this.b != kfsVar.b || this.a != kfsVar.a || !this.c.equals(kfsVar.c) || !this.d.equals(kfsVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a), this.c, this.d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.b, Integer.valueOf(this.a), this.c, this.d);
    }
}
