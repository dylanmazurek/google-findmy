package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dke implements dir {
    private final dir b;
    private final dir c;

    public dke(dir dirVar, dir dirVar2) {
        this.b = dirVar;
        this.c = dirVar2;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dke) {
            dke dkeVar = (dke) obj;
            if (this.b.equals(dkeVar.b) && this.c.equals(dkeVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        dir dirVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(dirVar) + "}";
    }
}
