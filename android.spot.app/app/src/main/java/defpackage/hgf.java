package defpackage;

import android.content.Context;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgf {
    public final hcc a;
    public final Context b;
    public final cfc c;
    public boolean d;
    public jis e;
    public jis f;
    public boolean g;
    private boolean h;
    private boolean i;

    public hgf(hcc hccVar, Context context, cfc cfcVar) {
        int i = jis.d;
        jis jisVar = jmi.a;
        this.e = jisVar;
        this.f = jisVar;
        this.a = hccVar;
        this.b = context;
        this.c = cfcVar;
    }

    private final void d() {
        heb hebVar = this.a.d;
        jer jerVar = hebVar.b;
        jer jerVar2 = hebVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hge a() {
        jis jisVar;
        cfm cfmVar;
        int i;
        hek hekVar = this.a.d.f;
        if (this.d) {
            hekVar.d();
        }
        if (this.h) {
            jisVar = hekVar.b();
        } else {
            int i2 = jis.d;
            jisVar = jmi.a;
        }
        if (this.d) {
            hekVar.c();
        }
        int i3 = jis.d;
        jis jisVar2 = jmi.a;
        jisVar2.getClass();
        jin jinVar = new jin();
        jin jinVar2 = new jin();
        jinVar.j(this.f);
        if (this.i) {
            if (jisVar.isEmpty()) {
                d();
            } else {
                d();
            }
        }
        hcc hccVar = this.a;
        if (this.g) {
            jer jerVar = hccVar.d.h;
            if (jerVar.g()) {
                Object c = jerVar.c();
                Context context = this.b;
                final cfc cfcVar = this.c;
                jer jerVar2 = this.a.d.m;
                final jdl jdlVar = jdl.a;
                gvf gvfVar = new gvf(this, 4);
                String string = context.getString(R.string.og_recommended_actions_entry_point);
                if (string != null) {
                    if (true != hhd.b(context).a) {
                        i = R.drawable.yellow_alert_dark_vd;
                    } else {
                        i = R.drawable.yellow_alert_vd;
                    }
                    hdo b = hdp.b(cu.c(context, i));
                    b.e = jer.i(context.getString(R.string.og_important_account_alert_badge_a11y_label));
                    hdp a = b.a();
                    hdp c2 = hdp.c(cu.c(context, R.drawable.safer_gshield_ic_outline_hero));
                    String packageName = context.getPackageName();
                    if (packageName != null) {
                        final hev hevVar = new hev(string, a, c2, packageName);
                        ((cfk) gvfVar.a()).g(cfcVar, new hdm(c, 11));
                        final hec hecVar = (hec) c;
                        cfcVar.N().a(hecVar.e);
                        jinVar.h(new hcr(new hcq() { // from class: hes
                            @Override // defpackage.hcq
                            public final hcu a(Object obj) {
                                hec hecVar2 = hec.this;
                                hecVar2.g = obj;
                                Object obj2 = hecVar2.g;
                                if (obj2 != null) {
                                    hecVar2.f = new heo(hevVar, cfcVar, hecVar2.l, hecVar2.b, frx.ak(obj2));
                                    hecVar2.a(hecVar2.g, hecVar2.j, hecVar2.f, hecVar2.k);
                                } else {
                                    hecVar2.f = null;
                                }
                                return hecVar2.f;
                            }
                        }));
                    } else {
                        throw new NullPointerException("Null appPackageName");
                    }
                } else {
                    throw new NullPointerException("Null recommendedActions");
                }
            }
        }
        jis g = jinVar.g();
        jinVar2.j(this.e);
        jis g2 = jinVar2.g();
        cfn cfnVar = null;
        if (jisVar.isEmpty() && jisVar2.isEmpty() && g.isEmpty()) {
            cfmVar = null;
        } else {
            lyn lynVar = new lyn(null, null, null);
            lynVar.a = g;
            jin jinVar3 = new jin();
            jinVar3.j(jisVar2);
            int i4 = ((jmi) jisVar).c;
            for (int i5 = 0; i5 < i4; i5++) {
                jinVar3.h(new hcr(new hft((heh) jisVar.get(i5), 2)));
            }
            lynVar.b = jinVar3.g();
            cfmVar = new cfm();
            cfmVar.o(new cfn(jmi.a), new eqn(lynVar, cfmVar, 15));
        }
        if (!g2.isEmpty()) {
            cfnVar = new cfn(g2);
        }
        return new hge(cfmVar, cfnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.i = true;
    }
}
