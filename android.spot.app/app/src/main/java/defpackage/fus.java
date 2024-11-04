package defpackage;

import com.google.android.gms.nearby.uwb.internal.OnRangingSuspendedParams;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fus extends ftk {
    final /* synthetic */ OnRangingSuspendedParams a;
    final /* synthetic */ fud b;

    public fus(fud fudVar, OnRangingSuspendedParams onRangingSuspendedParams) {
        this.a = onRangingSuspendedParams;
        this.b = fudVar;
    }

    @Override // defpackage.fjn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        fud.c(this.a.a);
        ((ftp) obj).c(this.a.b);
    }

    @Override // defpackage.ftk, defpackage.fjn
    public final void b() {
        fud.c(this.a.a);
        this.b.b.c(this.a.b);
    }
}
