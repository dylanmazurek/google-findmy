package defpackage;

import android.service.notification.StatusBarNotification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmn {
    public final gmi a;
    public final StatusBarNotification b;
    public final giu c;
    public final ggk d;

    public gmn(gmi gmiVar, StatusBarNotification statusBarNotification, giu giuVar, ggk ggkVar) {
        this.a = gmiVar;
        this.b = statusBarNotification;
        this.c = giuVar;
        this.d = ggkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmn)) {
            return false;
        }
        gmn gmnVar = (gmn) obj;
        if (amr.i(this.a, gmnVar.a) && amr.i(this.b, gmnVar.b) && amr.i(this.c, gmnVar.c) && amr.i(this.d, gmnVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        StatusBarNotification statusBarNotification = this.b;
        int i = 0;
        if (statusBarNotification == null) {
            hashCode = 0;
        } else {
            hashCode = statusBarNotification.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        giu giuVar = this.c;
        if (giuVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = giuVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ggk ggkVar = this.d;
        if (ggkVar != null) {
            i = ggkVar.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "TrayModelDataItem(trayIdentifier=" + this.a + ", notification=" + this.b + ", notificationTarget=" + this.c + ", thread=" + this.d + ")";
    }
}
