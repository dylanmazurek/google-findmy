package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxo {
    public final bpm a;
    public final gxn b;
    private final bps c;
    private final Notification d;

    public gxo(bpm bpmVar, bps bpsVar, Notification notification, gxn gxnVar) {
        this.a = bpmVar;
        this.c = bpsVar;
        this.d = notification;
        this.b = gxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxo)) {
            return false;
        }
        gxo gxoVar = (gxo) obj;
        if (amr.i(this.a, gxoVar.a) && amr.i(this.c, gxoVar.c) && amr.i(this.d, gxoVar.d) && amr.i(this.b, gxoVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        bps bpsVar = this.c;
        int i = 0;
        if (bpsVar == null) {
            hashCode = 0;
        } else {
            hashCode = bpsVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Notification notification = this.d;
        if (notification == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = notification.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        gxn gxnVar = this.b;
        if (gxnVar != null) {
            i = gxnVar.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "NotificationBuilderAndComponents(notificationBuilder=" + this.a + ", style=" + this.c + ", publicVersion=" + this.d + ", imageLoadingOutcome=" + this.b + ")";
    }

    public gxo(bpm bpmVar, bps bpsVar, Notification notification) {
        this(bpmVar, bpsVar, notification, null);
    }
}
