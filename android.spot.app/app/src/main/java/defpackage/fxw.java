package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fxw implements fxm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fxw(fgk fgkVar, String str, ScheduledFuture scheduledFuture, int i) {
        this.d = i;
        this.a = fgkVar;
        this.c = str;
        this.b = scheduledFuture;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    @Override // defpackage.fxm
    public final void a(fxs fxsVar) {
        if (this.d != 0) {
            Object obj = this.c;
            Object obj2 = this.a;
            synchronized (((fgk) obj2).c) {
                ((fgk) obj2).c.remove(obj);
            }
            this.b.cancel(false);
            return;
        }
        ((fqw) this.a).removeCallbacksAndMessages(null);
        boolean i = fxsVar.i();
        Object obj3 = this.b;
        if (!i) {
            if (((fxv) fxsVar).c) {
                ((fxv) ((bym) this.c).a).t(null);
                return;
            }
            Exception d = fxsVar.d();
            d.getClass();
            ((bym) obj3).t(d);
            return;
        }
        ((bym) obj3).u(fxsVar.e());
    }

    public /* synthetic */ fxw(fqw fqwVar, bym bymVar, bym bymVar2, int i) {
        this.d = i;
        this.a = fqwVar;
        this.b = bymVar;
        this.c = bymVar2;
    }
}
