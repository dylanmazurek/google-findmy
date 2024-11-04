package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gml {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gml(ewf ewfVar, ewg ewgVar, ebf ebfVar, ele eleVar) {
        this.d = ewfVar;
        this.a = ewgVar;
        this.b = ebfVar;
        this.c = eleVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ele] */
    public final void a(lqc lqcVar) {
        jis g = eku.g(lqcVar, this.c);
        if (g.size() == 1) {
            Object obj = this.b;
            lqd lqdVar = lqcVar.d;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
            etx d = etx.d(lqdVar, ((kzq) g.get(0)).b);
            ebb a = ebc.a();
            a.b(true);
            ((ebf) obj).k(d, a.a());
            return;
        }
        Object obj2 = this.b;
        lqd lqdVar2 = lqcVar.d;
        if (lqdVar2 == null) {
            lqdVar2 = lqd.d;
        }
        ((ebf) obj2).i(lqdVar2);
    }

    public gml(gmi gmiVar, StatusBarNotification statusBarNotification, giu giuVar, ggk ggkVar) {
        this.a = gmiVar;
        this.b = statusBarNotification;
        this.c = giuVar;
        this.d = ggkVar;
    }

    public gml(gmi gmiVar, gml gmlVar, List list, Map map) {
        this.b = gmiVar;
        this.d = gmlVar;
        this.c = list;
        this.a = map;
    }
}
