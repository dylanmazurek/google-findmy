package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkl implements hjy {
    private final hjt a;
    private final gfi b = new hkk(this);
    private final List c = new ArrayList();
    private final hkd d;
    private final hri e;
    private final hpd f;
    private final ktn g;

    public hkl(Context context, hpd hpdVar, hjt hjtVar, hri hriVar, hkc hkcVar) {
        context.getClass();
        hpdVar.getClass();
        this.f = hpdVar;
        this.a = hjtVar;
        this.d = hkcVar.a(context, hjtVar, new OnAccountsUpdateListener() { // from class: hki
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                hkl hklVar = hkl.this;
                hklVar.i();
                for (Account account : accountArr) {
                    hklVar.h(account);
                }
            }
        });
        this.g = new ktn(context, hpdVar, hjtVar, hriVar);
        this.e = new hri(hpdVar, context);
    }

    public static jyz g(jyz jyzVar) {
        return iuu.o(jyzVar, new gfa(18), jxv.a);
    }

    @Override // defpackage.hjy
    public final jyz a() {
        return this.g.h(new gfa(19));
    }

    @Override // defpackage.hjy
    public final jyz b() {
        return this.g.h(new gfa(20));
    }

    @Override // defpackage.hjy
    public final jyz c(String str, int i) {
        return this.e.c(new hkj(1), str, i);
    }

    @Override // defpackage.hjy
    public final jyz d(String str, int i) {
        return this.e.c(new hkj(0), str, i);
    }

    @Override // defpackage.hjy
    public final void e(njz njzVar) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                this.d.a();
                iuu.q(this.a.a(), new dup(this, 11), jxv.a);
            }
            this.c.add(njzVar);
        }
    }

    @Override // defpackage.hjy
    public final void f(njz njzVar) {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                return;
            }
            this.c.remove(njzVar);
            if (this.c.isEmpty()) {
                this.d.b();
            }
        }
    }

    public final void h(Account account) {
        gfn d = this.f.d(account);
        Object obj = d.b;
        gfi gfiVar = this.b;
        synchronized (obj) {
            d.a.remove(gfiVar);
        }
        d.e(this.b, jxv.a);
    }

    public final void i() {
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((njz) it.next()).n();
            }
        }
    }
}
