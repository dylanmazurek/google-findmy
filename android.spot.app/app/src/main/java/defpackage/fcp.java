package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcp extends fdd {
    final /* synthetic */ fcr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcp(fcr fcrVar, fcn fcnVar) {
        super(fcnVar);
        this.a = fcrVar;
    }

    @Override // defpackage.fdd
    public final void a() {
        fbm.b();
        fcr fcrVar = this.a;
        if (!fcrVar.e()) {
            return;
        }
        fcrVar.y("Inactivity, disconnecting from device AnalyticsService");
        fcrVar.b();
    }
}
