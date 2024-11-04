package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmo implements Comparator {
    final /* synthetic */ ggk a;
    private final /* synthetic */ int b;

    public gmo(ggk ggkVar, int i) {
        this.b = i;
        this.a = ggkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.b != 0) {
            ggk ggkVar = ((gmn) obj).d;
            ggk ggkVar2 = this.a;
            Long c = gmq.c(frx.S(ggkVar2), ggkVar2, ggkVar);
            ggk ggkVar3 = ((gmn) obj2).d;
            ggk ggkVar4 = this.a;
            return mjo.C(c, gmq.c(frx.S(ggkVar4), ggkVar4, ggkVar3));
        }
        StatusBarNotification statusBarNotification = ((gmn) obj).b;
        frx.T(this.a);
        Long valueOf = Long.valueOf(gmq.b(statusBarNotification));
        StatusBarNotification statusBarNotification2 = ((gmn) obj2).b;
        frx.T(this.a);
        return mjo.C(valueOf, Long.valueOf(gmq.b(statusBarNotification2)));
    }
}
