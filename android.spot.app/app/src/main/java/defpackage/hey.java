package defpackage;

import android.content.Context;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hey extends gzp {
    public Object b;
    public jis c;
    public boolean d;
    public final miv e;
    private final han f;
    private final Context g;

    public hey(Context context, cfc cfcVar, han hanVar) {
        int i = jis.d;
        this.c = jmi.a;
        this.g = context;
        this.f = hanVar;
        this.e = new miv(context);
        hanVar.g(cfcVar, new hdm(this, 12));
    }

    @Override // defpackage.gzp
    public final void a(Object obj) {
        int i;
        jer jerVar;
        Object i2;
        ijs.c();
        this.b = obj;
        if (obj == null) {
            i2 = jdl.a;
        } else {
            jin jinVar = new jin();
            jinVar.j(this.c);
            jinVar.h(this.b);
            jis g = jinVar.g();
            if (!this.f.q(g)) {
                i2 = jdl.a;
            } else {
                Context context = this.g;
                if (true != hhd.b(context).a) {
                    i = R.color.google_grey900;
                } else {
                    i = R.color.google_white;
                }
                int i3 = 3;
                jer i4 = jer.i(new gzn(frx.as(context, bqx.c(context, i), frx.Y(context, R.attr.ogRedColorOnSurface)), context.getString(R.string.og_critical_security_alert_badge_label_a11y), 3));
                if (this.d && hzc.ab(g, new etw(this.f, i3))) {
                    jerVar = jer.i(new hae(null, this.e, null, 3));
                } else {
                    jerVar = jdl.a;
                }
                i2 = jer.i(new gzo(i4, jerVar));
            }
        }
        this.a.l(i2);
    }
}
