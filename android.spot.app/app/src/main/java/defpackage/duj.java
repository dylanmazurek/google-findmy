package defpackage;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duj implements cem, dyf {
    private static final jnk j = jnk.l("com/google/android/apps/adm/accountmenu/AccountMenuHandler");
    public SelectedAccountDisc a;
    public final ag b;
    public final evy c;
    public final dyh d;
    public final jer e;
    public final lqz f;
    public final lqz g;
    public final nca h;
    public njz i;
    private hcc k;
    private final hcc l;
    private final hfo m;
    private final ezl n;
    private frx o;

    public duj(ag agVar, evy evyVar, dyh dyhVar, hcc hccVar, hfo hfoVar, jer jerVar, nca ncaVar, lqz lqzVar, lqz lqzVar2, ezl ezlVar) {
        this.b = agVar;
        this.c = evyVar;
        this.d = dyhVar;
        this.l = hccVar;
        this.m = hfoVar;
        this.e = jerVar;
        this.h = ncaVar;
        this.f = lqzVar;
        this.g = lqzVar2;
        this.n = ezlVar;
    }

    public static /* synthetic */ void h(Context context) {
        String str;
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 31) {
            str = "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity";
        } else {
            str = "com.google.android.gms.mdm.settings.AdmSettingsActivity";
        }
        intent.setClassName("com.google.android.gms", str);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) j.f()).i(e)).j("com/google/android/apps/adm/accountmenu/AccountMenuHandler", "lambda$createFmdSettingsAction$4", (char) 341, "AccountMenuHandler.java")).r("Failed to start FMD Settings");
        }
    }

    @Override // defpackage.cem
    public final void b() {
        this.o = new dui(this);
        this.l.b.d(this.o);
        this.b.ad.a(this.m);
        hbm hbmVar = new hbm(this.b.y(), this.l);
        Account d = this.d.d();
        if (d != null) {
            hbmVar.a = d.name;
        }
        this.b.ad.a(hbmVar);
        g();
    }

    @Override // defpackage.cem
    public final void c() {
        frx frxVar = this.o;
        if (frxVar != null) {
            this.l.b.e(frxVar);
        }
        this.a = null;
    }

    @Override // defpackage.cem
    public final void d() {
        this.d.f(this);
    }

    @Override // defpackage.cem
    public final void e() {
        this.d.e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cfc] */
    public final void g() {
        boolean z;
        jis jisVar;
        int a;
        Context y = this.b.y();
        hcb hcbVar = new hcb(this.l);
        hea a2 = heb.a();
        mep mepVar = new mep(null, null);
        int i = jis.d;
        mepVar.g(jmi.a);
        jin jinVar = new jin();
        heg a3 = heh.a();
        a3.b(y.getString(R.string.guest_sign_in));
        Drawable drawable = y.getDrawable(R.drawable.gs_account_circle_vd_theme_24);
        drawable.getClass();
        a3.b = drawable;
        a3.e = new he(this, 3, null);
        jinVar.h(a3.a());
        Account d = this.d.d();
        if (d != null && ((bym) this.f.a()).j(d.name)) {
            heg a4 = heh.a();
            a4.b(y.getString(R.string.require_sign_in));
            Drawable drawable2 = y.getDrawable(R.drawable.gs_password_vd_theme_24);
            drawable2.getClass();
            a4.b = drawable2;
            a4.e = new he(this, 6, null);
            jinVar.h(a4.a());
        }
        dwr dwrVar = (dwr) ((jeu) this.e).a;
        if (!dwrVar.a.getPackageManager().queryIntentActivities(dwrVar.a(), 0).isEmpty()) {
            heg a5 = heh.a();
            a5.b("Launch BetterBug");
            Drawable drawable3 = y.getDrawable(R.drawable.gs_bug_report_vd_theme_24);
            drawable3.getClass();
            a5.b = drawable3;
            a5.e = new he(this, 7, null);
            jinVar.h(a5.a());
        }
        jis g = jinVar.g();
        if (((jmi) g).c <= 4) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "Custom actions are limited to up to 4 items.");
        mepVar.g(g);
        Object obj = mepVar.a;
        if (obj != null) {
            a2.b = new hed((jer) mepVar.b, (jis) obj, (jer) mepVar.c);
            jin jinVar2 = new jin();
            if (!this.n.b() && !ltl.e()) {
                he heVar = new he(y, 4, null);
                String string = y.getString(R.string.og_app_settings, y.getString(R.string.full_app_name));
                hdw a6 = hdy.a();
                a6.e(R.id.og_ai_settings);
                a6.d(R.drawable.quantum_gm_ic_settings_vd_theme_24);
                a6.f(string);
                a6.h(90537);
                a6.g(heVar);
                a6.i(true);
                a6.b(hdv.SETTINGS);
                jinVar2.h(a6.a());
            }
            if (nca.l(y)) {
                he heVar2 = new he(this, 5, null);
                hdw a7 = hdy.a();
                a7.e(R.id.og_ai_help_and_feedback);
                a7.d(R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
                a7.f(y.getString(R.string.og_help_feedback));
                a7.h(90538);
                a7.g(heVar2);
                a7.i(true);
                a7.b(hdv.HELP_AND_FEEDBACK);
                jinVar2.h(a7.a());
            }
            a2.b(jinVar2.g());
            hcbVar.c = a2.a();
            hcc a8 = hcbVar.a();
            this.k = a8;
            SelectedAccountDisc selectedAccountDisc = this.a;
            if (selectedAccountDisc != null) {
                ag agVar = this.b;
                ijs.c();
                new WeakReference(agVar.E());
                agVar.getClass();
                ktn ktnVar = new ktn(agVar, a8, selectedAccountDisc);
                ijs.c();
                Object obj2 = ktnVar.d;
                ag agVar2 = (ag) obj2;
                ?? r1 = obj2;
                if (agVar2.P != null) {
                    r1 = agVar2.O();
                }
                ((ag) ktnVar.d).H();
                Object obj3 = ktnVar.d;
                Object obj4 = ktnVar.b;
                Object obj5 = ktnVar.a;
                ijs.c();
                ag agVar3 = (ag) obj3;
                be G = agVar3.G();
                aj E = agVar3.E();
                if (obj3 instanceof lsc) {
                    ((hcm) hzc.ai(obj3, hcn.class)).d();
                }
                hcc hccVar = (hcc) obj4;
                hcl hclVar = new hcl((View) obj5, new apc(G, hccVar, E), hccVar);
                hcc hccVar2 = (hcc) ktnVar.b;
                hej hejVar = hccVar2.d.j;
                jer.i(hccVar2.n);
                Object obj6 = ktnVar.c;
                hbq hbqVar = (hbq) obj6;
                SelectedAccountDisc selectedAccountDisc2 = hbqVar.b;
                hcc hccVar3 = hbqVar.a;
                selectedAccountDisc2.e = hccVar3;
                hccVar3.l.a(selectedAccountDisc2, 75245);
                selectedAccountDisc2.b.g();
                selectedAccountDisc2.b.r();
                selectedAccountDisc2.b.s(hccVar3.i, hccVar3.o);
                selectedAccountDisc2.b.f(hccVar3.l);
                selectedAccountDisc2.getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size);
                selectedAccountDisc2.b.a();
                jer jerVar = hccVar3.d.b;
                jin jinVar3 = new jin();
                Context f = hccVar3.d.n.f(selectedAccountDisc2.getContext());
                hek hekVar = hccVar3.d.f;
                frx frxVar = hccVar3.o;
                ExecutorService executorService = hccVar3.j;
                if (selectedAccountDisc2.b.j != null) {
                    jisVar = jmi.a;
                } else {
                    hekVar.c();
                    jisVar = jmi.a;
                }
                jinVar3.j(jisVar);
                jer jerVar2 = hccVar3.d.g;
                if (jerVar2.g()) {
                    hey heyVar = new hey(f, r1, (han) jerVar2.c());
                    if (selectedAccountDisc2.a.getVisibility() == 0) {
                        a = (selectedAccountDisc2.a.getHeight() - selectedAccountDisc2.a.getPaddingTop()) - selectedAccountDisc2.a.getPaddingBottom();
                    } else {
                        AccountParticleDisc accountParticleDisc = selectedAccountDisc2.b;
                        if (accountParticleDisc.m.g()) {
                            a = accountParticleDisc.d.c(accountParticleDisc.a());
                        } else {
                            a = accountParticleDisc.a();
                        }
                    }
                    CirclePulseDrawable circlePulseDrawable = (CirclePulseDrawable) heyVar.e.a;
                    circlePulseDrawable.b = a;
                    circlePulseDrawable.a();
                    heyVar.d = true;
                    jer jerVar3 = hccVar3.d.l;
                    r1.N().a(new hex(hccVar3.b, heyVar));
                    jinVar3.h(heyVar);
                }
                jer jerVar4 = hccVar3.d.h;
                if (jerVar4.g()) {
                    hec hecVar = (hec) jerVar4.c();
                    hecVar.h = new heq(f, new gvf(hccVar3, 2), r1, hecVar.b);
                    hecVar.h.b(hecVar.j);
                    jinVar3.h(hecVar.h);
                    r1.N().a(((hec) jerVar4.c()).d);
                }
                jis g2 = jinVar3.g();
                if (!g2.isEmpty()) {
                    selectedAccountDisc2.f = new hac(g2, r1);
                    selectedAccountDisc2.b.l(selectedAccountDisc2.f);
                }
                fz fzVar = new fz(obj6, 3);
                fz fzVar2 = new fz(obj6, 4);
                hbqVar.b.addOnAttachStateChangeListener(fzVar);
                hbqVar.b.addOnAttachStateChangeListener(fzVar2);
                SelectedAccountDisc selectedAccountDisc3 = hbqVar.b;
                int[] iArr = bwn.a;
                if (selectedAccountDisc3.isAttachedToWindow()) {
                    fzVar.onViewAttachedToWindow(hbqVar.b);
                    fzVar2.onViewAttachedToWindow(hbqVar.b);
                }
                hclVar.c = new gcb(ktnVar, 18);
                hclVar.d = new gvf(ktnVar, 3);
                ijs.c();
                hck hckVar = new hck(hclVar, new hcj(hclVar), 0);
                hclVar.a.addOnAttachStateChangeListener(hckVar);
                if (hclVar.a.isAttachedToWindow()) {
                    hckVar.onViewAttachedToWindow(hclVar.a);
                }
                hclVar.a.setEnabled(hclVar.b.c());
                apc apcVar = hclVar.e;
                ((Boolean) jer.h(null).b(new gfa(11)).e(false)).booleanValue();
                hclVar.a.setOnClickListener(new ecp(hclVar, new hci((be) apcVar.b, (hcc) apcVar.a, (aj) apcVar.c), 17));
                return;
            }
            return;
        }
        throw new IllegalStateException("Missing required properties: flavorCustomActions");
    }

    @Override // defpackage.dyf
    public final void i(njz njzVar) {
        this.i = njzVar;
    }

    @Override // defpackage.cem
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void cT(cfc cfcVar) {
    }
}
