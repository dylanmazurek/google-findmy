package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hef extends cfm {
    private static final Set j = mkm.F(hdu.OUT_OF_STORAGE, hdu.LOW_STORAGE_SEVERE);
    public final hcd a;
    public final cfo i;
    private final hee k;
    private final han l;
    private boolean m;
    private boolean n;
    private hdd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hef(heb hebVar, hcd hcdVar) {
        super(false);
        hebVar.getClass();
        hcdVar.getClass();
        this.a = hcdVar;
        cfo hdmVar = new hdm(this, 9);
        this.i = hdmVar;
        this.k = new hee(this);
        han hanVar = (han) hebVar.g.f();
        this.l = hanVar;
        hebVar.f.c();
        if (hanVar != null) {
            o(hanVar, hdmVar);
        }
    }

    public final void a(jis jisVar) {
        boolean z;
        han hanVar = this.l;
        boolean z2 = false;
        if (hanVar != null && hanVar.q(jisVar)) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.m) {
            ijs.c();
            this.m = z;
            if (z || this.n) {
                z2 = true;
            }
            l(Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfm, defpackage.cfk
    public final void b() {
        ijs.c();
        super.b();
        this.a.d(this.k);
        this.a.a();
        p();
        jis b = this.a.b();
        b.getClass();
        a(b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfm, defpackage.cfk
    public final void c() {
        ijs.c();
        super.c();
        this.a.e(this.k);
        p();
        int i = jis.d;
        jis jisVar = jmi.a;
        jisVar.getClass();
        a(jisVar);
    }

    public final void p() {
        this.o = null;
        boolean al = mkm.al(j, null);
        if (al != this.n) {
            ijs.c();
            this.n = al;
            boolean z = true;
            if (!this.m && !al) {
                z = false;
            }
            l(Boolean.valueOf(z));
        }
    }
}
