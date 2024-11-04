package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gge {
    public final List a;

    public gge() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gge) {
            return this.a.equals(((gge) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetPreferencesRequest{preferenceEntries=" + String.valueOf(this.a) + "}";
    }

    public gge(List list) {
        this.a = list;
    }
}
