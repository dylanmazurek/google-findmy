package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hec {
    public final fpv a;
    public final jer b;
    public final String c;
    public final cem d;
    public final cem e;
    public heo f;
    public Object g;
    public heq h;
    public String i;
    public jiy j;
    public boolean k;
    public final fqp l;
    public final frx m;

    public hec() {
        throw null;
    }

    public final void a(Object obj, jiy jiyVar, heo heoVar, boolean z) {
        int H;
        if (heoVar == null) {
            return;
        }
        kxm kxmVar = null;
        if (!z) {
            kxmVar = (kxm) jer.h((fpp) frx.ar(obj, jiyVar, null)).b(new gfa(13)).b(new gfa(14)).f();
        }
        heoVar.z = new ah(this, 17);
        heoVar.A = kxmVar;
        boolean z2 = false;
        if (kxmVar != null && (H = a.H(kxmVar.a)) != 0 && H == 4) {
            z2 = true;
        }
        heoVar.n(z2);
    }

    public hec(frx frxVar, Context context, hri hriVar) {
        fqp fqpVar = new fqp(context.getApplicationContext());
        jer i = jer.i(hriVar);
        String packageName = context.getPackageName();
        this.d = new het(this);
        this.e = new heu(this, 0);
        this.j = jmn.a;
        this.m = frxVar;
        this.l = fqpVar;
        this.b = i;
        this.c = packageName;
        this.a = new fpv() { // from class: her
            @Override // defpackage.fpv
            public final void a(Map map) {
                hec hecVar = hec.this;
                jiy i2 = jiy.i(map);
                hecVar.j = i2;
                hecVar.a(hecVar.g, i2, hecVar.f, hecVar.k);
                heq heqVar = hecVar.h;
                if (heqVar != null) {
                    heqVar.b(hecVar.j);
                }
            }
        };
    }
}
