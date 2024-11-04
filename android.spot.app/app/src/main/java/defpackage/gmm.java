package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmm {
    public final Map a;
    public final gmi b;
    public final gmn c;
    public final List d;

    public gmm(Map map, gmi gmiVar, gmn gmnVar, List list) {
        this.a = map;
        this.b = gmiVar;
        this.c = gmnVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmm)) {
            return false;
        }
        gmm gmmVar = (gmm) obj;
        if (amr.i(this.a, gmmVar.a) && amr.i(this.b, gmmVar.b) && amr.i(this.c, gmmVar.c) && amr.i(this.d, gmmVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        gmi gmiVar = this.b;
        int i = 0;
        if (gmiVar == null) {
            hashCode = 0;
        } else {
            hashCode = gmiVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        gmn gmnVar = this.c;
        if (gmnVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gmnVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "NotificationSlotResult(trayModel=" + this.a + ", addedNotificationTrayId=" + this.b + ", replacedNotificationTrayModelData=" + this.c + ", dismissedNotificationsTrayModelData=" + this.d + ")";
    }
}
