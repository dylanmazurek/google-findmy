package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fik {
    private final int a;
    private final fhl b;
    private final String c;
    private final gok d;

    public fik(gok gokVar, fhl fhlVar, String str) {
        this.d = gokVar;
        this.b = fhlVar;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{gokVar, fhlVar, str});
    }

    public final String a() {
        return (String) this.d.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fik)) {
            return false;
        }
        fik fikVar = (fik) obj;
        if (!amr.g(this.d, fikVar.d) || !amr.g(this.b, fikVar.b) || !amr.g(this.c, fikVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
