package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwc implements kvm {
    private static final joo a = joo.m("xRPC");
    private kwd b;
    private mbf c;
    private ktf d;

    @Override // defpackage.kvm
    public final /* synthetic */ kvy a() {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final kvy b() {
        if (this.c.equals(mbf.CLIENT_STREAMING) || this.c.equals(mbf.BIDI_STREAMING)) {
            this.b.h.incrementAndGet();
        }
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final void d() {
        if (!this.c.equals(mbf.SERVER_STREAMING) && !this.c.equals(mbf.BIDI_STREAMING)) {
            return;
        }
        this.b.g.incrementAndGet();
    }

    @Override // defpackage.kvm
    public final void e(ktf ktfVar) {
        boolean z;
        try {
            kwd kwdVar = this.b;
            if (kwdVar.m.getAndSet(((mca) ktfVar.b).l) == null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "Already recorded result.");
            ktf ktfVar2 = this.d;
            kwd kwdVar2 = this.b;
            if (((Boolean) ((jfh) ktfVar2.b).a).booleanValue() && kwdVar2.e.get()) {
                hms a2 = hms.a();
                hsb a3 = hsb.a(null, kwdVar2.c.a());
                boolean z2 = kwdVar2.d.get();
                hwx.J(true);
                hwx.J(true);
                a3.p = 1;
                a3.q = z2 ? 1 : 0;
                a2.c(a3);
            }
        } catch (Throwable th) {
            ((jol) ((jol) ((jol) a.f()).i(th)).j("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", 'R', "MetricsRecordingInterceptor.java")).r("Failed to record RPC metrics");
        }
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy f(nqe nqeVar) {
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final kvy g(nqe nqeVar) {
        boolean z;
        this.c = ((mbg) nqeVar.b).a;
        lyr lyrVar = ktm.a;
        lys lysVar = (lys) nqeVar.d;
        this.d = new ktf(((ktl) lysVar.e(lyrVar)).h);
        boolean z2 = false;
        if (lysVar.e(kwd.b) == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.O(z, "Unexpected option %s already set.", kwd.b);
        if (lysVar.e(kwb.a) == null) {
            z2 = true;
        }
        hwx.O(z2, "Unexpected option %s already set.", kwb.a);
        this.b = new kwd((kto) lysVar.e(kto.a));
        return new kvy(1, null, null, lysVar.d(kwd.b, this.b).d(kwb.a, this.b));
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void c() {
    }
}
