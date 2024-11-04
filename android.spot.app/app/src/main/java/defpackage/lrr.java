package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrr implements lsc {
    private volatile Object a;
    private final Object b = new Object();
    private final ag c;

    public lrr(ag agVar) {
        this.c = agVar;
    }

    public static final Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    ag agVar = this.c;
                    if (agVar.S() != null) {
                        iqg.D(agVar.S() instanceof lsc, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", agVar.S().getClass());
                        ksr e = ((lrq) hzc.ai(this.c.S(), lrq.class)).e();
                        e.c = this.c;
                        iqg.z(e.c, ag.class);
                        this.a = new dwh((dwj) e.a, (dwf) e.b, (ag) e.c);
                    } else {
                        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
                    }
                }
            }
        }
        return this.a;
    }
}
