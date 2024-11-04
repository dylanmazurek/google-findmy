package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crm extends bpd {
    private static final String g = cqc.a("WorkContinuationImpl");
    public final csb a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private cqh i;

    public crm(csb csbVar, String str, int i, List list) {
        this(csbVar, str, i, list, null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final cqh g() {
        String str;
        if (!this.e) {
            csb csbVar = this.a;
            Object obj = csbVar.h.f;
            int i = 1;
            if (this.f != 1) {
                str = "KEEP";
            } else {
                str = "REPLACE";
            }
            this.i = bpd.f((bop) obj, "EnqueueRunnable_".concat(str), csbVar.i.a, new crz(this, i));
        } else {
            cqc.b();
            Log.w(g, "Already enqueued work ids (" + TextUtils.join(", ", this.d) + ")");
        }
        return this.i;
    }

    public crm(csb csbVar, String str, int i, List list, byte[] bArr) {
        this.a = csbVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.h = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((cvu) ((apc) list.get(i2)).c).s != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String e = ((apc) list.get(i2)).e();
            this.d.add(e);
            this.h.add(e);
        }
    }
}
