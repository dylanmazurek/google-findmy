package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqe {
    final String a;
    final String b;
    final Notification c;

    public bqe(String str, String str2, Notification notification) {
        this.a = str;
        this.b = str2;
        this.c = notification;
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.a + ", id:0, tag:" + this.b + "]";
    }
}
