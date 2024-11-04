package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public hjq() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gee, java.lang.Object] */
    public final void a(View view, int i, hjf hjfVar) {
        gbn gbnVar;
        Object obj = this.b;
        gbw a = this.a.a();
        gbl g = ((hjr) obj).g(i);
        if (hjfVar.b - 1 != 0) {
            nqe nqeVar = gbz.a;
            ljh k = gby.d.k();
            if (!k.b.y()) {
                k.t();
            }
            gby gbyVar = (gby) k.b;
            gbyVar.c = 2;
            gbyVar.a = 2 | gbyVar.a;
            gbnVar = new gbn(nqeVar, (gby) k.q());
        } else {
            String str = hjfVar.a;
            str.getClass();
            nqe nqeVar2 = gbz.a;
            ljh k2 = gby.d.k();
            if (!k2.b.y()) {
                k2.t();
            }
            ljn ljnVar = k2.b;
            gby gbyVar2 = (gby) ljnVar;
            gbyVar2.c = 1;
            gbyVar2.a = 2 | gbyVar2.a;
            if (!ljnVar.y()) {
                k2.t();
            }
            gby gbyVar3 = (gby) k2.b;
            gbyVar3.a |= 1;
            gbyVar3.b = str;
            gbnVar = new gbn(nqeVar2, (gby) k2.q());
        }
        g.b(gbnVar);
        g.b(hji.a);
        a.a(view, g);
    }

    public final void b() {
        ((hcc) this.a).b.d(((hgd) this.b).b);
        ((hgd) this.b).a();
    }

    public final void c() {
        ((hcc) this.a).b.e(((hgd) this.b).b);
    }

    public final void d() {
        ((fir) ((fiq) this.b).b).b();
        if (((Dialog) this.a).isShowing()) {
            ((Dialog) this.a).dismiss();
        }
    }

    public /* synthetic */ hjq(hia hiaVar, hig higVar) {
        this.a = hiaVar;
        this.b = higVar;
    }

    public hjq(Object obj, Object obj2) {
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ hjq(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }
}
