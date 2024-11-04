package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hro implements hnl {
    final /* synthetic */ jzd a;
    public final /* synthetic */ hrq b;

    public hro(hrq hrqVar, jzd jzdVar) {
        this.a = jzdVar;
        this.b = hrqVar;
    }

    @Override // defpackage.hnl
    public final void i(hmq hmqVar) {
        this.b.d.a(3, hmqVar.a);
        this.b.a();
        this.b.f = this.a.schedule(new hka(this, hmqVar, 3, (byte[]) null), 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.hnl
    public final void j(hmq hmqVar) {
        this.b.d.a(4, hmqVar.a);
        this.b.a();
        this.b.e = this.a.schedule(new hka(this, hmqVar, 4, (byte[]) null), 10L, TimeUnit.SECONDS);
    }
}
