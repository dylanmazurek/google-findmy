package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ksf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ksf(FirebaseMessaging firebaseMessaging, String str, ksn ksnVar) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = ksnVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lqz, java.lang.Object] */
    public final void a() {
        ((bym) this.a.a()).l(dxq.WELCOME_SCREEN_CLOSE);
        njz njzVar = ((dyt) this.b).g;
        if (njzVar != null) {
            ((dyq) njzVar.a).k.set(false);
            ((dyq) njzVar.a).j.finish();
        }
    }

    public ksf(dyt dytVar, lqz lqzVar, exl exlVar) {
        this.a = lqzVar;
        this.c = exlVar;
        this.b = dytVar;
    }

    public ksf(efa efaVar, lqz lqzVar, ees eesVar) {
        this.a = lqzVar;
        this.b = eesVar;
        this.c = efaVar;
    }
}
