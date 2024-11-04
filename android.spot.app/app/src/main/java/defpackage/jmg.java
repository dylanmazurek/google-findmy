package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmg extends jtw implements Serializable, jet {
    public static final jmg a = new jmg(jhl.a, jhj.a);
    private static final long serialVersionUID = 0;
    public final jhm b;
    public final jhm c;

    public jmg(jhm jhmVar, jhm jhmVar2) {
        this.b = jhmVar;
        this.c = jhmVar2;
        if (jhmVar != jhj.a && jhmVar2 != jhl.a) {
        } else {
            throw new IllegalArgumentException("Invalid range: ".concat("(-∞..+∞)"));
        }
    }

    @Override // defpackage.jet
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        ((Comparable) obj).getClass();
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jmg) {
            jmg jmgVar = (jmg) obj;
            if (this.b.equals(jmgVar.b) && this.c.equals(jmgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.b) * 31) + System.identityHashCode(this.c);
    }

    Object readResolve() {
        jmg jmgVar = a;
        if (equals(jmgVar)) {
            return jmgVar;
        }
        return this;
    }

    public final String toString() {
        return "(-∞..+∞)";
    }
}
