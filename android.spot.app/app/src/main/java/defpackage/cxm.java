package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxm {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Object c = new Object();
    public final bet d;

    static {
        cqc.a("WorkTimer");
    }

    public cxm(bet betVar) {
        this.d = betVar;
    }

    public final void a(cvk cvkVar) {
        synchronized (this.c) {
            if (((cri) this.a.remove(cvkVar)) != null) {
                cqc.b();
                Objects.toString(cvkVar);
                this.b.remove(cvkVar);
            }
        }
    }
}
