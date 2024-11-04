package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mat extends mai {
    public mbi b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("policy", c());
        q.d("priority", 5);
        q.f("available", true);
        return q.toString();
    }
}
