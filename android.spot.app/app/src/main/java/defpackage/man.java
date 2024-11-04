package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class man {
    public final lys a;
    public final mbc b;
    public final mbg c;
    private final mal d;

    public man() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            man manVar = (man) obj;
            if (amr.g(this.a, manVar.a) && amr.g(this.b, manVar.b) && amr.g(this.c, manVar.c) && amr.g(this.d, manVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        lys lysVar = this.a;
        mbc mbcVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + mbcVar.toString() + " callOptions=" + lysVar.toString() + "]";
    }

    public man(mbg mbgVar, mbc mbcVar, lys lysVar, mal malVar) {
        mbgVar.getClass();
        this.c = mbgVar;
        mbcVar.getClass();
        this.b = mbcVar;
        lysVar.getClass();
        this.a = lysVar;
        malVar.getClass();
        this.d = malVar;
    }
}
