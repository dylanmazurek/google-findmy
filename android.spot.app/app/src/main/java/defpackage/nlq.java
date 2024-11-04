package defpackage;

import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlq {
    public CronetProvider a;
    public nmd b;

    public final boolean equals(Object obj) {
        if ((obj instanceof nlq) && this.a.equals(((nlq) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
