package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class crz implements mnw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ crz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mnw
    public final Object a() {
        if (this.b != 0) {
            cwt.a((crm) this.a);
            return mlh.a;
        }
        Object obj = this.a;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = ((csb) obj).b;
            if (Build.VERSION.SDK_INT >= 34) {
                cta.a(context).cancelAll();
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            List e = ctc.e(context, jobScheduler);
            if (e != null && !e.isEmpty()) {
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    ctc.f(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        csb csbVar = (csb) obj;
        cvv B = csbVar.c.B();
        cwn cwnVar = (cwn) B;
        cwnVar.a.l();
        cks d = cwnVar.h.d();
        try {
            ((cwn) B).a.m();
            try {
                d.a();
                ((cwn) B).a.p();
                cwnVar.h.f(d);
                crh.a(csbVar.h, csbVar.c, csbVar.d);
                return mlh.a;
            } finally {
                ((cwn) B).a.n();
            }
        } catch (Throwable th) {
            cwnVar.h.f(d);
            throw th;
        }
    }
}
