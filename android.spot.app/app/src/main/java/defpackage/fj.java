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
public final class fj extends fi implements gf {
    public final gh a;
    private final Context b;
    private final ActionBarContextView c;
    private final fh f;
    private WeakReference g;
    private boolean h;

    public fj(Context context, ActionBarContextView actionBarContextView, fh fhVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = fhVar;
        gh ghVar = new gh(actionBarContextView.getContext());
        ghVar.D();
        this.a = ghVar;
        ghVar.b = this;
    }

    @Override // defpackage.gf
    public final void F(gh ghVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.gf
    public final boolean J(gh ghVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.fi
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.fi
    public final MenuInflater b() {
        return new fo(this.c.getContext());
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
        return this.c.h;
    }

    @Override // defpackage.fi
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.fi
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.fi
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.fi
    public final void h(View view) {
        WeakReference weakReference;
        this.c.j(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.g = weakReference;
    }

    @Override // defpackage.fi
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.fi
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.fi
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.fi
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.fi
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.fi
    public final boolean n() {
        return this.c.j;
    }
}
