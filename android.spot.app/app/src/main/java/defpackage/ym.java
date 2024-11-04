package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ym implements arm {
    public final yn a;
    public final yn b;
    public final yn c;
    public final yn d;

    public ym(yn ynVar, yn ynVar2, yn ynVar3, yn ynVar4) {
        this.a = ynVar;
        this.b = ynVar2;
        this.c = ynVar3;
        this.d = ynVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym) {
            ym ymVar = (ym) obj;
            if (amr.i(this.a, ymVar.a) && amr.i(this.b, ymVar.b) && amr.i(this.c, ymVar.c) && amr.i(this.d, ymVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
