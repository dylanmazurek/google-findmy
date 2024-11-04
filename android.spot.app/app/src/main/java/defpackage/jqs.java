package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqs {
    public static final Comparator a = new bfr(15);
    public static final jqs b = new jqs(new jqq(Collections.emptyList()));
    public final jqq c;

    public jqs(jqq jqqVar) {
        this.c = jqqVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jqs) && ((jqs) obj).c.equals(this.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
