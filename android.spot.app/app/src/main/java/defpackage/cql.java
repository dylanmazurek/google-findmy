package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cql {
    public abstract cqh a(String str);

    public abstract void b(List list);

    public abstract cqh c(String str, List list);

    public final void d(apc apcVar) {
        b(mkm.N(apcVar));
    }

    public final cqh e(String str, apc apcVar) {
        return c(str, mkm.N(apcVar));
    }
}
