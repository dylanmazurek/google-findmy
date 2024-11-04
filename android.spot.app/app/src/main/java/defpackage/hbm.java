package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbm extends frx implements cem {
    public String a;
    public String d;
    public boolean e;
    private final hcd f;
    private boolean g;
    private final iwn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public hbm(Context context, hcc hccVar) {
        super(null, null, null);
        iwn iwnVar = new iwn(context, hccVar.j);
        this.f = hccVar.b;
        frx frxVar = hccVar.o;
        this.h = iwnVar;
        ewy ewyVar = new ewy(this, 17);
        if (iwnVar.d != null) {
            return;
        }
        iwnVar.d = ewyVar;
        new hbw((Context) iwnVar.b, iwnVar).executeOnExecutor(iwnVar.a, new Void[0]);
    }

    private final Object aU(String str) {
        jis b = this.f.b();
        int i = ((jmi) b).c;
        int i2 = 0;
        while (i2 < i) {
            Object obj = b.get(i2);
            i2++;
            if (frx.aj(obj).equals(str)) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.frx
    public final void a(Object obj) {
        String aj;
        if (!this.g && this.e) {
            if (obj == null) {
                aj = null;
            } else {
                aj = frx.aj(obj);
            }
            this.d = aj;
            ?? r0 = this.h.c;
            if (r0 != 0) {
                r0.edit().putString("selected_account_id", aj).apply();
            }
        }
    }

    public final void aT() {
        if (this.e) {
            Object aU = aU(this.a);
            if (aU == null) {
                aU = aU(this.d);
            }
            if (aU != null) {
                try {
                    this.g = true;
                    this.f.a.h(aU);
                } finally {
                    this.g = false;
                }
            }
        }
    }

    @Override // defpackage.frx
    public final void au() {
        aT();
    }

    @Override // defpackage.cem
    public final void b() {
        ijs.c();
        ijs.c();
        this.f.d(this);
        aT();
    }

    @Override // defpackage.cem
    public final void c() {
        ijs.c();
        ijs.c();
        this.f.e(this);
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void cT(cfc cfcVar) {
    }
}
