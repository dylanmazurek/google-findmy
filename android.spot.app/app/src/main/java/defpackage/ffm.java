package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffm {
    public static final ffm a;
    public static final ffm b;
    public static final ffm c;
    public final jjr d;

    static {
        jjr jjrVar;
        EnumSet allOf = EnumSet.allOf(ffn.class);
        if (allOf instanceof Collection) {
            if (allOf.isEmpty()) {
                jjrVar = jmo.a;
            } else {
                jjrVar = jim.h(EnumSet.copyOf((Collection) allOf));
            }
        } else {
            Iterator it = allOf.iterator();
            if (it.hasNext()) {
                EnumSet of = EnumSet.of((Enum) it.next());
                hzc.Q(of, it);
                jjrVar = jim.h(of);
            } else {
                jjrVar = jmo.a;
            }
        }
        a = new ffm(jjrVar);
        b = new ffm(jmo.a);
        c = new ffm(jql.l(ffn.ZWIEBACK, new ffn[0]));
    }

    public ffm(jjr jjrVar) {
        this.d = jjrVar;
    }

    public final boolean a(ffn ffnVar) {
        return this.d.contains(ffnVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffm) && this.d.equals(((ffm) obj).d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
