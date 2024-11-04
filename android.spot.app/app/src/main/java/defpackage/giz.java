package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giz implements lsh {
    private final mko a;
    private final mko b;
    private final /* synthetic */ int c;

    public giz(mko mkoVar, mko mkoVar2, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        if (this.c != 0) {
            return b();
        }
        return b();
    }

    public final gry b() {
        if (this.c != 0) {
            mko mkoVar = this.b;
            nca a = ((gyu) this.a).a();
            ggs ggsVar = (ggs) mkoVar.a();
            ggsVar.getClass();
            return a.j(ggsVar, "CHIME_REFRESH_NOTIFICATIONS", 9);
        }
        return ((gyu) this.a).a().j(((gjc) this.b).a(), "CHIME_NOTIFICATION_RECEIVED", 5);
    }
}
