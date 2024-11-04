package defpackage;

import android.content.Context;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heq extends gzp {
    public boolean b;
    public Object c;
    private final gzo d;
    private jiy e = jmn.a;

    public heq(Context context, jfe jfeVar, cfc cfcVar, jer jerVar) {
        this.d = new gzo(jer.i(new gzn(frx.as(context, context.getResources().getColor(R.color.google_grey900), hhd.c(context, jerVar).a(hhb.DARK_YELLOW)), context.getString(R.string.og_important_account_alert_badge_a11y_label), 2)), jdl.a);
        ((cfk) jfeVar.a()).g(cfcVar, new hdm(this, 10));
    }

    @Override // defpackage.gzp
    public final void a(Object obj) {
        fpp fppVar;
        ijs.c();
        this.c = obj;
        Object obj2 = jdl.a;
        if (obj != null && (fppVar = (fpp) frx.ar(obj, this.e, fpp.b)) != null && !this.b) {
            kxn kxnVar = fppVar.a;
            if (kxnVar == null) {
                kxnVar = kxn.c;
            }
            kxo kxoVar = kxnVar.a;
            if (kxoVar == null) {
                kxoVar = kxo.b;
            }
            int w = a.w(kxoVar.a);
            if (w != 0 && w == 3) {
                obj2 = jer.i(this.d);
            }
        }
        this.a.l(obj2);
    }

    public final void b(jiy jiyVar) {
        this.e = jiyVar;
        hog.H(new hep(this, 0));
    }
}
