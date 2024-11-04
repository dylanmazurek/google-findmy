package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwc extends fvc {
    final /* synthetic */ fxf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwc(fht fhtVar, fxf fxfVar) {
        super(fhtVar);
        this.a = fxfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ fhz a(Status status) {
        return new fwb(status);
    }

    @Override // defpackage.fio
    protected final /* bridge */ /* synthetic */ void c(fhh fhhVar) {
        ((fvz) fhhVar).K(this, this.a.a);
    }
}
