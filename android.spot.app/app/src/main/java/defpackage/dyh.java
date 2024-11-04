package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyh extends dxu {
    public final evy b;
    public final dul c;
    public final lqz d;
    public final lqz e;
    public boolean f;
    public ecc g;
    public final kqp h;
    public njz i;
    private final Context j;
    private final pk k;
    private final lqz l;
    private final lqz m;
    private dyf n;
    private pf o;
    private final dhx p;
    private final nca q;
    private final njz r = new njz(this, null);

    public dyh(Context context, evy evyVar, pk pkVar, lqz lqzVar, dul dulVar, nca ncaVar, lqz lqzVar2, lqz lqzVar3, lqz lqzVar4, lqz lqzVar5, dhx dhxVar) {
        this.j = context;
        this.b = evyVar;
        this.k = pkVar;
        this.l = lqzVar;
        this.c = dulVar;
        this.q = ncaVar;
        this.m = lqzVar3;
        this.d = lqzVar4;
        this.e = lqzVar5;
        this.p = dhxVar;
        this.h = new kqp(this, lqzVar5, lqzVar2, evyVar, lqzVar);
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        pf pfVar;
        super.b();
        if (this.o == null) {
            this.o = this.k.a("add_accounts_request_key", new dyg(), new dyd(this, 0));
        }
        Account b = this.b.b();
        if (b == null) {
            String string = ((bym) this.l.a()).a.getString("key_current_account", null);
            if (this.c.b(string)) {
                b = new Account(string, "com.google");
            }
        }
        if (b != null && !this.c.b(b.name)) {
            b = null;
        }
        if (b == null && this.c.c()) {
            jmw listIterator = this.c.b.values().listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                Account account = new Account(((hjw) listIterator.next()).a, "com.google");
                if (this.q.n(account)) {
                    b = account;
                    break;
                }
                b = account;
            }
        }
        k(b);
        if (this.b.b() == null && (pfVar = this.o) != null) {
            pfVar.b(null);
            return;
        }
        Account b2 = this.b.b();
        if (b2 != null && this.q.n(b2)) {
            this.b.f(b2, -1L);
        }
        jmw listIterator2 = this.b.c().listIterator();
        while (listIterator2.hasNext()) {
            Account account2 = (Account) listIterator2.next();
            if (!this.q.n(account2)) {
                this.b.g(account2);
            }
        }
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        Account b = this.b.b();
        if (b != null && this.q.n(b)) {
            evy evyVar = this.b;
            evyVar.f(b, SystemClock.elapsedRealtime());
        }
        pf pfVar = this.o;
        if (pfVar != null) {
            pfVar.a();
            this.o = null;
        }
        super.c();
    }

    public final Account d() {
        return this.b.b();
    }

    public final void e(dyf dyfVar) {
        boolean z;
        if (this.n == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI already attached");
        this.n = dyfVar;
        dyfVar.i(this.r);
    }

    public final void f(dyf dyfVar) {
        boolean z;
        boolean z2 = true;
        if (this.n != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI not attached");
        if (this.n != dyfVar) {
            z2 = false;
        }
        hwx.K(z2, "detaching wrong UI");
        dyfVar.i(null);
        this.n = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:            if (r0.getBoolean("has_iris", r4) != false) goto L60;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.ag r8) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyh.g(ag):void");
    }

    public final void h(Account account, int i) {
        int i2;
        this.b.g(account);
        this.f = false;
        ecc eccVar = this.g;
        if (eccVar != null) {
            eccVar.aI();
            ecc eccVar2 = this.g;
            if (i != 902) {
                if (i != 904) {
                    if (i != 1100) {
                        i2 = 5;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
            eccVar2.aK(i2);
        }
    }

    public final void i(Account account) {
        Account b = this.b.b();
        if (!account.equals(b)) {
            b.getClass();
            h(b, 1100);
        }
        this.b.f(account, -1L);
        ecc eccVar = this.g;
        if (eccVar != null) {
            eccVar.aH();
        }
        njz njzVar = this.i;
        if (njzVar != null) {
            Object obj = njzVar.a;
            if (((dxu) obj).a) {
                ((dyq) obj).d();
                ((dyq) njzVar.a).g();
            }
        }
    }

    public final void j() {
        if (l()) {
            ((ebf) this.d.a()).f();
            return;
        }
        Account b = this.b.b();
        if (b != null) {
            if (this.p.a()) {
                ag b2 = ((ebf) this.d.a()).b();
                b2.getClass();
                g(b2);
                return;
            }
            ebf ebfVar = (ebf) this.d.a();
            if (ebfVar.a().f("password_verification_dialog") == null) {
                ecc eccVar = new ecc();
                Bundle bundle = new Bundle();
                bundle.putString("account_name", b.name);
                eccVar.ak(bundle);
                eccVar.q(ebfVar.a(), "password_verification_dialog");
                ebfVar.a().ag();
            }
        }
    }

    public final void k(Account account) {
        this.q.m(account);
        njz njzVar = this.i;
        if (njzVar != null) {
            Object obj = njzVar.a;
            if (((dxu) obj).a) {
                ((dyq) obj).k.set(false);
                ((dyq) njzVar.a).d();
                ((dyq) njzVar.a).g();
            }
        }
    }

    public final boolean l() {
        Account b = this.b.b();
        if (b != null) {
            if (((bym) this.l.a()).j(b.name) || this.q.n(b)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
