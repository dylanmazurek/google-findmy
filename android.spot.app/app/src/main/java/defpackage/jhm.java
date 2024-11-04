package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jhm implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b = "";

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jhm jhmVar) {
        if (jhmVar != jhl.a) {
            if (jhmVar == jhj.a) {
                return -1;
            }
            Comparable comparable = jhmVar.b;
            jmg jmgVar = jmg.a;
            int compareTo = "".compareTo("");
            if (compareTo != 0) {
                return compareTo;
            }
            boolean z = this instanceof jhk;
            if (z == (jhmVar instanceof jhk)) {
                return 0;
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jhm) {
            try {
                if (compareTo((jhm) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
