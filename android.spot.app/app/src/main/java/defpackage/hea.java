package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hea {
    public jer a;
    public hek b;
    public jer c;
    public jer d;
    public hej e;
    public hfe f;
    public Runnable g;
    public byte h;
    public int i;
    public frx j;
    private jer k;
    private jer l;
    private jer m;
    private jer n;
    private jis o;
    private jer p;
    private jer q;
    private jer r;
    private boolean s;

    public hea() {
        throw null;
    }

    public final heb a() {
        frx frxVar;
        hek hekVar;
        jis jisVar;
        hej hejVar;
        hfe hfeVar;
        Runnable runnable;
        if (this.h == 3 && (frxVar = this.j) != null && (hekVar = this.b) != null && (jisVar = this.o) != null && (hejVar = this.e) != null && this.i != 0 && (hfeVar = this.f) != null && (runnable = this.g) != null) {
            return new heb(this.k, this.l, this.m, this.a, frxVar, this.n, hekVar, this.c, this.d, jisVar, hejVar, this.p, this.q, this.r, hfeVar, this.s, runnable);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" policyFooterCustomizer");
        }
        if (this.b == null) {
            sb.append(" flavorsFeature");
        }
        if (this.o == null) {
            sb.append(" commonActions");
        }
        if (this.e == null) {
            sb.append(" educationManager");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isExperimental");
        }
        if (this.i == 0) {
            sb.append(" largeScreenDialogAlignment");
        }
        if (this.f == null) {
            sb.append(" materialVersion");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableQuickProfileSwitching");
        }
        if (this.g == null) {
            sb.append(" onSlowAccountSwitchingRunnable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(jis jisVar) {
        if (jisVar != null) {
            this.o = jisVar;
            return;
        }
        throw new NullPointerException("Null commonActions");
    }

    public final void c(boolean z) {
        this.s = z;
        this.h = (byte) (this.h | 2);
    }

    public hea(heb hebVar) {
        jdl jdlVar = jdl.a;
        this.k = jdlVar;
        this.l = jdlVar;
        this.m = jdlVar;
        this.a = jdlVar;
        this.n = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.p = jdlVar;
        this.q = jdlVar;
        this.r = jdlVar;
        this.k = hebVar.a;
        this.l = hebVar.b;
        this.m = hebVar.c;
        this.a = hebVar.d;
        this.j = hebVar.r;
        this.n = hebVar.e;
        this.b = hebVar.f;
        this.c = hebVar.g;
        this.d = hebVar.h;
        this.o = hebVar.i;
        this.e = hebVar.j;
        this.p = hebVar.k;
        this.q = hebVar.l;
        this.r = hebVar.m;
        this.i = hebVar.q;
        this.f = hebVar.n;
        this.s = hebVar.o;
        this.g = hebVar.p;
        this.h = (byte) 3;
    }

    public hea(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.k = jdlVar;
        this.l = jdlVar;
        this.m = jdlVar;
        this.a = jdlVar;
        this.n = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.p = jdlVar;
        this.q = jdlVar;
        this.r = jdlVar;
    }
}
