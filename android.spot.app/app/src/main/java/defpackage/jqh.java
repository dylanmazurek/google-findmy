package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqh extends jql {
    public static final jqh a = new jqh(jqn.a);
    public final AtomicReference b;

    public jqh(jql jqlVar) {
        this.b = new AtomicReference(jqlVar);
    }

    @Override // defpackage.jql
    public final jpa a() {
        return ((jql) this.b.get()).a();
    }

    @Override // defpackage.jql
    public final jqs b() {
        return ((jql) this.b.get()).b();
    }

    @Override // defpackage.jql
    public final void c(String str, Level level, boolean z) {
        ((jql) this.b.get()).c(str, level, z);
    }
}
