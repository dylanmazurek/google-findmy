package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiy {
    public final lim a;
    public final jer b;
    public final lln c;

    static {
        TimeUnit.DAYS.toHours(60L);
        lim.v("eddystoneringing");
    }

    public iiy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iiy) {
            iiy iiyVar = (iiy) obj;
            if (this.a.equals(iiyVar.a) && this.b.equals(iiyVar.b) && this.c.equals(iiyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        lln llnVar = this.c;
        if (llnVar.y()) {
            i = llnVar.i();
        } else {
            int i2 = llnVar.y;
            if (i2 == 0) {
                i2 = llnVar.i();
                llnVar.y = i2;
            }
            i = i2;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        lln llnVar = this.c;
        jer jerVar = this.b;
        return "UserSecrets{identityKey=" + String.valueOf(this.a) + ", accountKey=" + String.valueOf(jerVar) + ", creationTimestamp=" + String.valueOf(llnVar) + "}";
    }

    public iiy(lim limVar, jer jerVar, lln llnVar) {
        this.a = limVar;
        this.b = jerVar;
        this.c = llnVar;
    }
}
