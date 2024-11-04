package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbq {
    private static final String e = "hbq";
    public final hcc a;
    public final SelectedAccountDisc b;
    public final frx d = new hbp(this);
    public final gze c = new hff(this, 1);

    public hbq(SelectedAccountDisc selectedAccountDisc, hcc hccVar) {
        this.a = hccVar;
        this.b = selectedAccountDisc;
        hbv hbvVar = new hbv(hccVar, selectedAccountDisc);
        jin jinVar = new jin();
        jinVar.h(hbvVar);
        jer jerVar = hccVar.d.b;
        selectedAccountDisc.d = new hbo(jinVar.g(), 2);
    }

    public final void a(Object obj) {
        ljh k = lnh.g.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lnh lnhVar = (lnh) ljnVar;
        lnhVar.c = 8;
        lnhVar.a |= 2;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lnh lnhVar2 = (lnh) ljnVar2;
        lnhVar2.e = 8;
        lnhVar2.a |= 32;
        if (!ljnVar2.y()) {
            k.t();
        }
        ljn ljnVar3 = k.b;
        lnh lnhVar3 = (lnh) ljnVar3;
        lnhVar3.d = 3;
        lnhVar3.a = 8 | lnhVar3.a;
        if (!ljnVar3.y()) {
            k.t();
        }
        hcc hccVar = this.a;
        lnh lnhVar4 = (lnh) k.b;
        lnhVar4.b = 36;
        lnhVar4.a |= 1;
        hccVar.f.a(obj, (lnh) k.q());
    }

    public final void b() {
        String str;
        gzn gznVar;
        String str2;
        gzo gzoVar;
        String str3;
        if (this.a.b.c()) {
            SelectedAccountDisc selectedAccountDisc = this.b;
            hcc hccVar = this.a;
            jer jerVar = hccVar.h;
            hcd hcdVar = hccVar.b;
            Context context = selectedAccountDisc.getContext();
            if (hcdVar.b().isEmpty()) {
                str = context.getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
            } else {
                Object a = this.a.b.a();
                if (a == null) {
                    str = context.getString(R.string.og_account_and_settings) + "\n" + context.getString(R.string.og_choose_an_account_title);
                } else {
                    Object obj = this.b.b.k;
                    String str4 = "";
                    if (!a.equals(obj)) {
                        String str5 = e;
                        if (obj != null) {
                            str3 = "";
                        } else {
                            str3 = " Disc account null";
                        }
                        Log.w(str5, String.format("Disc account not the same as selected account.%s", str3));
                    }
                    SelectedAccountDisc selectedAccountDisc2 = this.b;
                    hcc hccVar2 = this.a;
                    AccountParticleDisc accountParticleDisc = selectedAccountDisc2.b;
                    Object obj2 = accountParticleDisc.k;
                    if (obj2 != null) {
                        frx frxVar = hccVar2.o;
                        String ay = frx.ay(obj2);
                        gzr gzrVar = accountParticleDisc.l;
                        String str6 = null;
                        if (gzrVar != null && (gzoVar = gzrVar.a) != null) {
                            gznVar = (gzn) gzoVar.a.f();
                        } else {
                            gznVar = null;
                        }
                        if (gznVar == null) {
                            str2 = null;
                        } else {
                            str2 = gznVar.b;
                        }
                        if (str2 != null) {
                            String trim = str2.trim();
                            if (!trim.isEmpty()) {
                                str6 = !trim.endsWith(".") ? String.valueOf(trim).concat(".") : trim;
                            }
                        }
                        String d = accountParticleDisc.d();
                        if (str6 != null && d != null) {
                            str4 = a.an(str6, d, " ");
                        } else if (str6 == null) {
                            if (d != null) {
                                str4 = d;
                            }
                        } else {
                            str4 = str6;
                        }
                        if (!str4.isEmpty()) {
                            str4 = a.an(str4, ay, "\n");
                        } else {
                            str4 = ay;
                        }
                    }
                    String string = context.getString(R.string.og_account_and_settings);
                    if (str4.isEmpty()) {
                        str = string;
                    } else {
                        str = context.getString(R.string.og_signed_in_as_account, str4) + "\n" + string;
                    }
                }
            }
            hog.H(new gno(this, str, 9));
            return;
        }
        hog.H(new gcb(this, 15));
    }

    public final void c() {
        hcd hcdVar = this.a.b;
        if (hcdVar.c()) {
            hog.H(new gno(this, hcdVar, 10));
        }
    }
}
