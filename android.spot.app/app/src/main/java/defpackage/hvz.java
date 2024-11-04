package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvz {
    public final Context a;
    public final jfe b;

    public hvz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hvz) {
            hvz hvzVar = (hvz) obj;
            if (this.a.equals(hvzVar.a) && this.b.equals(hvzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        jfe jfeVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + jfeVar.toString() + "}";
    }

    public hvz(Context context, jfe jfeVar) {
        this.a = context;
        this.b = jfeVar;
    }
}
