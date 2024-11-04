package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.gms.common.Feature;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class han extends cfn {
    public jiy a;
    public String h;
    private final fpu i;
    private final fqp j;
    private final frx k;

    public han() {
        throw null;
    }

    public final fpt a(Object obj) {
        return (fpt) jer.h(o(obj)).b(new gfa(15)).f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void b() {
        fqb.b.b(this.i, new ewy(this.j, 5));
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fpk.a};
        fjyVar.a = new fun(1);
        fjyVar.c = 28003;
        this.j.f(fjyVar.a());
        String str = this.h;
        if (str != null) {
            fqp fqpVar = this.j;
            fjy fjyVar2 = new fjy();
            fjyVar2.b = new Feature[]{fpk.a};
            fjyVar2.a = new fep(str, 16);
            fjyVar2.c = 28006;
            fqpVar.f(fjyVar2.a());
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void c() {
        fqb.b.c(this.i, new ewy(this.j, 4));
    }

    public final hap o(Object obj) {
        jis p = p(obj);
        if (!p.isEmpty()) {
            return (hap) p.get(0);
        }
        return null;
    }

    public final jis p(Object obj) {
        jis jisVar = (jis) frx.ar(obj, this.a, null);
        if (jisVar == null) {
            int i = jis.d;
            return jmi.a;
        }
        return jisVar;
    }

    public final boolean q(jis jisVar) {
        return hzc.ab(jisVar, new etw(this, 4));
    }

    public final void r(Context context, final Object obj, ViewGroup viewGroup, final hgw hgwVar, View view, final hjp hjpVar, final boolean z) {
        boolean z2;
        boolean z3;
        hfd hfdVar;
        jis jisVar;
        int i = 1;
        if (viewGroup.getChildCount() <= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.V(z2, "Critical alert container can contain one child at most.");
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null && !(childAt instanceof hfd)) {
            z3 = false;
        } else {
            z3 = true;
        }
        hwx.V(z3, "Critical alert container can only contain children of type CriticalAlertView.");
        fpt a = a(obj);
        if (a == null) {
            if (childAt != null) {
                ((hfd) childAt).cU(hjpVar);
                viewGroup.removeAllViews();
            }
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
            view.setContentDescription(null);
            view.setFocusable(false);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        if (childAt == null) {
            hfdVar = new hfd(context, z);
            viewGroup.addView(hfdVar);
            hfdVar.b(hjpVar);
        } else {
            hfdVar = (hfd) childAt;
        }
        hfd hfdVar2 = hfdVar;
        hfdVar2.a.setText(a.b);
        hfdVar2.b.setText(a.c);
        hfdVar2.d.c(jis.r(a.d, a.e));
        hfdVar2.setContentDescription(hfdVar2.getContext().getString(R.string.og_account_critical_alert_view_label_a11y, a.b, frx.ay(obj)) + "\n" + a.c + "\n" + a.d);
        String ak = frx.ak(obj);
        jis p = p(obj);
        int size = p.size();
        int i2 = 0;
        while (i2 < size) {
            fpt fptVar = ((hap) p.get(i2)).b;
            if (!fptVar.g) {
                fqp fqpVar = this.j;
                String str = fptVar.a;
                fjy fjyVar = new fjy();
                jisVar = p;
                fjyVar.b = new Feature[]{fpk.a};
                fjyVar.a = new fpx((Object) ak, str, i);
                fjyVar.c = 28004;
                fqpVar.f(fjyVar.a());
            } else {
                jisVar = p;
            }
            i2++;
            p = jisVar;
        }
        hfdVar2.setOnClickListener(new View.OnClickListener() { // from class: hez
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view2) {
                hjpVar.f(new bym(5), view2);
                final boolean z4 = z;
                final han hanVar = han.this;
                final Object obj2 = obj;
                Runnable runnable = new Runnable() { // from class: hfa
                    @Override // java.lang.Runnable
                    public final void run() {
                        han hanVar2 = han.this;
                        hap o = hanVar2.o(obj2);
                        ljh k = kxk.d.k();
                        if (!k.b.y()) {
                            k.t();
                        }
                        boolean z5 = z4;
                        View view3 = view2;
                        kxk kxkVar = (kxk) k.b;
                        kxkVar.a |= 1;
                        kxkVar.b = 409;
                        k.E(jiy.m("rfn", o.c, "rfnc", o.d, "security-event-id", o.e, "sa", String.valueOf(z5), "ve", String.valueOf(hfd.a(z5)), "origin", "8"));
                        kxk kxkVar2 = (kxk) k.q();
                        hanVar2.h = o.a;
                        hav.a(view3, hanVar2.h, kxkVar2);
                    }
                };
                hgw hgwVar2 = hgwVar;
                hgwVar2.b().run();
                runnable.run();
                hgwVar2.a().run();
            }
        });
        viewGroup.setVisibility(0);
        view.setContentDescription(hfdVar2.getContentDescription());
        view.setFocusable(true);
        view.setOnClickListener(new ewu(hfdVar2, 3));
    }

    public han(Context context, frx frxVar) {
        fqp fqpVar = new fqp(context);
        this.a = jmn.a;
        this.k = frxVar;
        this.j = fqpVar;
        this.i = new fpu() { // from class: hfb
            @Override // defpackage.fpu
            public final void a(Map map) {
                jis jisVar;
                char c;
                jiu jiuVar = new jiu();
                for (Map.Entry entry : map.entrySet()) {
                    fpl fplVar = (fpl) entry.getValue();
                    if (fplVar != null && !fplVar.b.isEmpty()) {
                        jin jinVar = new jin();
                        for (fpt fptVar : fplVar.b) {
                            String str = fplVar.a;
                            fps fpsVar = fptVar.h;
                            if (fpsVar == null) {
                                fpsVar = fps.c;
                            }
                            int i = fpsVar.a;
                            if (i != 0) {
                                if (i != 1) {
                                    c = 0;
                                } else {
                                    c = 3;
                                }
                            } else {
                                c = 2;
                            }
                            hap hapVar = null;
                            if (c != 0 && c == 3) {
                                jvv a = iqh.s(fpsVar.b).a();
                                String a2 = hap.a(a, "rfn");
                                String a3 = hap.a(a, "rfnc");
                                String a4 = hap.a(a, "eid");
                                if (a2 != null && a3 != null && a4 != null) {
                                    hapVar = new hap(str, fptVar, a2, a3, a4);
                                } else {
                                    Log.e("OneGoogle", "Critical alert URL data is not valid.");
                                }
                            } else {
                                Log.e("OneGoogle", "Target type of Critical alert data is not of type Octarine.");
                            }
                            if (hapVar != null) {
                                jinVar.h(hapVar);
                            }
                        }
                        jisVar = jinVar.g();
                    } else {
                        int i2 = jis.d;
                        jisVar = jmi.a;
                    }
                    if (!jisVar.isEmpty()) {
                        jiuVar.d((String) entry.getKey(), jisVar);
                    }
                }
                han hanVar = han.this;
                hanVar.a = jiuVar.b();
                hog.R(hanVar, jdl.a);
            }
        };
    }
}
