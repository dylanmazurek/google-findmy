package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmt {
    public static final gmi a(giu giuVar, String str) {
        return new gmi(0, gmj.f(giuVar, str));
    }

    public static final void b(Map map, StatusBarNotification statusBarNotification, giu giuVar, ggk ggkVar) {
        gmn gmnVar;
        gmj gmjVar = gmj.a;
        gmn gmnVar2 = (gmn) map.get(gmj.i(statusBarNotification));
        if (gmnVar2 != null) {
            gmnVar = new gmn(gmnVar2.a, gmnVar2.b, giuVar, ggkVar);
        } else {
            gmnVar = null;
        }
        if (gmnVar != null) {
            map.put(gmj.i(statusBarNotification), gmnVar);
        }
    }

    public static final void c(Map map, giu giuVar, String str, ghq ghqVar) {
        if (!map.containsKey(giuVar)) {
            map.put(giuVar, new LinkedHashMap());
        }
        Map map2 = (Map) map.get(giuVar);
        if (map2 != null) {
        }
    }

    public static final gml d(gmn gmnVar) {
        if (gmnVar.b == null) {
            gmnVar = null;
        }
        if (gmnVar == null) {
            return null;
        }
        StatusBarNotification statusBarNotification = gmnVar.b;
        statusBarNotification.getClass();
        return new gml(gmnVar.a, statusBarNotification, gmnVar.c, gmnVar.d);
    }

    public static final void e(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gmn gmnVar = (gmn) it.next();
            StatusBarNotification statusBarNotification = gmnVar.b;
            if (statusBarNotification != null) {
                b(map, statusBarNotification, gmnVar.c, gmnVar.d);
            }
        }
    }
}
