package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dm implements gs {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gs
    public final void a(gh ghVar, boolean z) {
        gh ghVar2;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (ghVar instanceof ha) {
                    ghVar.a().i(false);
                }
                gs gsVar = ((fx) this.a).e;
                if (gsVar != null) {
                    gsVar.a(ghVar, z);
                    return;
                }
                return;
            }
            ((dn) this.a).z(ghVar);
            return;
        }
        gh a = ghVar.a();
        if (a != ghVar) {
            ghVar2 = a;
        } else {
            ghVar2 = ghVar;
        }
        dl u = ((dn) this.a).u(ghVar2);
        if (u != null) {
            if (a != ghVar) {
                ((dn) this.a).y(u.a, u, a);
                ((dn) this.a).A(u, true);
                return;
            }
            ((dn) this.a).A(u, z);
        }
    }

    @Override // defpackage.gs
    public final boolean b(gh ghVar) {
        Window.Callback v;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                ho hoVar = (ho) obj;
                if (ghVar != hoVar.c) {
                    hoVar.l = ((ha) ghVar).m.a;
                    gs gsVar = ((fx) obj).e;
                    if (gsVar != null) {
                        return gsVar.b(ghVar);
                    }
                    return false;
                }
                return false;
            }
            Window.Callback v2 = ((dn) this.a).v();
            if (v2 != null) {
                v2.onMenuOpened(108, ghVar);
            }
            return true;
        }
        if (ghVar == ghVar.a()) {
            dn dnVar = (dn) this.a;
            if (dnVar.y && (v = dnVar.v()) != null && !((dn) this.a).F) {
                v.onMenuOpened(108, ghVar);
            }
        }
        return true;
    }
}
