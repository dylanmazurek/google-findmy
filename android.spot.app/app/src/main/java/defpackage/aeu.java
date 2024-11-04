package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeu implements afv, aer {
    public int a;
    public aew b;
    public aav c;
    public mol d;
    public int e;
    public sr f;
    public su g;

    public aeu(aew aewVar) {
        this.b = aewVar;
    }

    public static final boolean n(acm acmVar, su suVar) {
        acmVar.getClass();
        if (!amr.i(((aci) acmVar.c()).d, suVar.a(acmVar))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aer
    public final void a() {
        aew aewVar = this.b;
        if (aewVar != null) {
            aewVar.a(this, null);
        }
    }

    public final ada b(Object obj) {
        ada a;
        aew aewVar = this.b;
        if (aewVar != null && (a = aewVar.a(this, obj)) != null) {
            return a;
        }
        return ada.IGNORED;
    }

    public final void c() {
        aew aewVar = this.b;
        if (aewVar != null) {
            aewVar.t();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void d(boolean z) {
        int i;
        if (z) {
            i = this.a | 4;
        } else {
            i = this.a & (-5);
        }
        this.a = i;
    }

    public final void e(boolean z) {
        int i;
        if (z) {
            i = this.a | 8;
        } else {
            i = this.a & (-9);
        }
        this.a = i;
    }

    public final void f(boolean z) {
        int i;
        if (z) {
            i = this.a | 32;
        } else {
            i = this.a & (-33);
        }
        this.a = i;
    }

    public final void g(boolean z) {
        int i;
        if (z) {
            i = this.a | 16;
        } else {
            i = this.a & (-17);
        }
        this.a = i;
    }

    public final void h(int i) {
        this.e = i;
        g(false);
    }

    public final boolean i() {
        if ((this.a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.a & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        aav aavVar;
        if (this.b != null && (aavVar = this.c) != null && aavVar.a()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.a |= 1;
    }
}
