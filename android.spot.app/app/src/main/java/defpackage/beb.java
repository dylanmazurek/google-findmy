package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beb implements abs, cfa {
    public final baw a;
    public final abs b;
    public boolean c;
    public cex d;
    public mol e = bcd.a;

    public beb(baw bawVar, abs absVar) {
        this.a = bawVar;
        this.b = absVar;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (cevVar == cev.ON_DESTROY) {
            b();
        } else if (cevVar == cev.ON_CREATE && !this.c) {
            d(this.e);
        }
    }

    @Override // defpackage.abs
    public final void b() {
        if (!this.c) {
            this.c = true;
            this.a.setTag(R.id.wrapped_composition_tag, null);
            cex cexVar = this.d;
            if (cexVar != null) {
                cexVar.c(this);
            }
        }
        this.b.b();
    }

    @Override // defpackage.abs
    public final boolean c() {
        throw null;
    }

    public final void d(mol molVar) {
        tn tnVar = new tn(this, molVar, 16);
        baw bawVar = this.a;
        bfi I = bawVar.I();
        if (I != null) {
            tnVar.a(I);
        }
        if (!bawVar.isAttachedToWindow()) {
            bawVar.t = tnVar;
        }
    }
}
