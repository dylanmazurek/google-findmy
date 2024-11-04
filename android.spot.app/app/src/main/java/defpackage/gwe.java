package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwe {
    public final Set a;
    private final String b = null;

    public gwe(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwe)) {
            return false;
        }
        gwe gweVar = (gwe) obj;
        if (!amr.i(this.a, gweVar.a)) {
            return false;
        }
        String str = gweVar.b;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "AccountRegistrationInfo(notificationChannels=" + this.a + ", delegateGaiaActualAccountName=null)";
    }
}
