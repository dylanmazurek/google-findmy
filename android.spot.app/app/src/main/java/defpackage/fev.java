package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fev implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public fev(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return new bym(this.a.a());
            case 1:
                return new eze((Context) this.a.a());
            case 2:
                return new ksr((fhq) this.a.a());
            case 3:
                Set<cqn> a = ((lsp) this.a).a();
                cpq cpqVar = new cpq();
                for (cqn cqnVar : a) {
                    cqnVar.getClass();
                    cpqVar.a.add(cqnVar);
                }
                return cpqVar;
            case 4:
                gay gayVar = (gay) ((jer) ((lsi) this.a).b).e(new gay(4, null));
                int i = gayVar.b;
                if (i == 4 || i == 3) {
                    z = true;
                }
                hwx.J(z);
                return new gbx(gayVar);
            case 5:
                return ((gok) this.a.a()).b;
            case 6:
                return new gok((ddg) this.a.a());
            case 7:
                return new gea(new gdz(1), ((lsk) this.a).a());
            case 8:
                joo jooVar = gdx.a;
                return new gok(((lse) this.a).a);
            case 9:
                joo jooVar2 = gdx.a;
                return new gok(((lse) this.a).a);
            case 10:
                Map map = (Map) ((lsi) this.a).b;
                joo jooVar3 = gdx.a;
                return new gok(map);
            case 11:
                return new ggs((gyw) this.a.a());
            case 12:
                return new ghc(new gwc(), ((ghb) this.a).a());
            case 13:
                return new ddg(((goq) this.a).b(), (byte[]) null);
            case 14:
                return new ghv(((lry) this.a).b());
            case 15:
                return new frx();
            case 16:
                return new gjv(((lry) this.a).b());
            case 17:
                return new ddg(((gre) this.a).b(), (byte[]) null);
            case 18:
                return new ddg((gla) this.a.a(), (byte[]) null);
            case 19:
                return new gok((gnh) new gkv(((lry) this.a).b(), 0));
            default:
                return new gkx(((lry) this.a).b());
        }
    }
}
