package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dz extends fi implements gf {
    public final gh a;
    public fh b;
    final /* synthetic */ ea c;
    private final Context f;
    private WeakReference g;

    public dz(ea eaVar, Context context, fh fhVar) {
        this.c = eaVar;
        this.f = context;
        this.b = fhVar;
        gh ghVar = new gh(context);
        ghVar.D();
        this.a = ghVar;
        ghVar.b = this;
    }

    @Override // defpackage.gf
    public final void F(gh ghVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.n();
    }

    @Override // defpackage.gf
    public final boolean J(gh ghVar, MenuItem menuItem) {
        fh fhVar = this.b;
        if (fhVar != null) {
            return fhVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.fi
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.fi
    public final MenuInflater b() {
        return new fo(this.f);
    }

    @Override // defpackage.fi
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.fi
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override // defpackage.fi
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.fi
    public final void f() {
        ea eaVar = this.c;
        if (eaVar.f != this) {
            return;
        }
        if (!ea.y(eaVar.k, false)) {
            eaVar.g = this;
            eaVar.h = this.b;
        } else {
            this.b.a(this);
        }
        this.b = null;
        this.c.v(false);
        ActionBarContextView actionBarContextView = this.c.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        ea eaVar2 = this.c;
        eaVar2.b.k(eaVar2.m);
        this.c.f = null;
    }

    @Override // defpackage.fi
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.fi
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.fi
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.fi
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.fi
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.fi
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.fi
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.fi
    public final boolean n() {
        return this.c.d.j;
    }
}
