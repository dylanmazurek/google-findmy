package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcj implements lsh {
    private final mko a;
    private final mko b;
    private final /* synthetic */ int c;

    public gcj(mko mkoVar, mko mkoVar2, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                Set set = (Set) ((lsi) this.a).b;
                gcc gccVar = (gcc) this.b.a();
                joo jooVar = gdx.a;
                jjp jjpVar = new jjp();
                jjpVar.i(set);
                jjpVar.d(gccVar.i);
                return new ddg(jjpVar.g());
            case 1:
                return new fzo();
            case 2:
                return new ggl((ghf) this.b.a(), ((gwv) this.a).a());
            case 3:
                return ((gyu) this.b).a().j((gij) this.a.a(), "CHIME_PERIODIC_JOB", 7);
            case 4:
                return new hri((Object) ((gjf) this.b).a(), ((gre) this.a).b());
            case 5:
                return new gjq((gnv) this.b.a(), (gur) this.a.a());
            case 6:
                return new gok((gnv) this.b.a(), (gur) this.a.a());
            case 7:
                return new frx();
            case 8:
                return new gok((gnv) this.b.a(), (gur) this.a.a());
            case 9:
                return ((gyu) this.b).a().j((gkd) this.a.a(), "CHIME_THREAD_STATE_UPDATE", 10);
            case 10:
                return ((gyu) this.b).a().j((gkh) this.a.a(), "CHIME_CREATE_USER_SUBSCRIPTION", 3);
            case 11:
                return ((gyu) this.b).a().j((gki) this.a.a(), "CHIME_DELETE_USER_SUBSCRIPTION", 4);
            case 12:
                return ((gyu) this.b).a().j((gkj) this.a.a(), "CHIME_FETCH_LATEST_THREADS", 2);
            case 13:
                return ((gyu) this.b).a().j((gkk) this.a.a(), "CHIME_FETCH_UPDATED_THREADS", 2);
            case 14:
                return ((gyu) this.b).a().j((gkl) this.a.a(), "CHIME_REMOVE_TARGET", 1);
            case 15:
                return ((gyu) this.b).a().j((gki) this.a.a(), "CHIME_SET_USER_PREFERENCE", 6);
            case 16:
                return ((gyu) this.b).a().j((gko) this.a.a(), "CHIME_STORE_TARGET", 1);
            case 17:
                gok gokVar = (gok) this.a.a();
                return new gok((gnh) new gkv(gokVar, 1));
            case 18:
                gla glaVar = (gla) this.b.a();
                return new ddg(glaVar);
            case 19:
                return new glm((glu) this.a.a(), (ghf) this.b.a());
            default:
                gka gkaVar = (gka) this.a.a();
                return new gln(gkaVar);
        }
    }

    public gcj(mko mkoVar, mko mkoVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = mkoVar;
        this.a = mkoVar2;
    }
}
