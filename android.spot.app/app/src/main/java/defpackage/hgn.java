package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgn implements View.OnAttachStateChangeListener {
    final /* synthetic */ hcd a;
    final /* synthetic */ hbk b;
    final /* synthetic */ hcy c;
    final /* synthetic */ hcy d;
    final /* synthetic */ hgp e;
    final /* synthetic */ eu f;
    final /* synthetic */ eu g;
    final /* synthetic */ eu h;

    public hgn(hgp hgpVar, hcd hcdVar, hbk hbkVar, eu euVar, eu euVar2, hcy hcyVar, hcy hcyVar2, eu euVar3) {
        this.a = hcdVar;
        this.b = hbkVar;
        this.f = euVar;
        this.g = euVar2;
        this.c = hcyVar;
        this.d = hcyVar2;
        this.h = euVar3;
        this.e = hgpVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ag d = be.d(view);
        if (this.e.o.g()) {
            ((cfk) this.e.o.c()).g(d, this.e.g);
        }
        this.a.d(this.e.r);
        this.b.q(this.f);
        this.f.e(0, 0);
        this.e.r.a(this.a.a());
        this.b.q(this.g);
        this.c.q(this.g);
        this.g.e(0, 0);
        this.d.q(this.h);
        ((hgm) this.h).l();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.e(this.e.r);
        this.b.r(this.g);
        this.c.r(this.g);
        this.b.r(this.f);
        this.d.r(this.h);
        if (this.e.o.g()) {
            ((cfk) this.e.o.c()).j(this.e.g);
        }
    }
}
