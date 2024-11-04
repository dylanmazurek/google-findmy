package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cha extends cfn {
    public final int a = 54321;
    public final chg h;
    public chb i;
    private cfc j;

    public cha(chg chgVar) {
        this.h = chgVar;
        if (chgVar.j == null) {
            chgVar.j = this;
            chgVar.d = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void a() {
        cfc cfcVar = this.j;
        chb chbVar = this.i;
        if (cfcVar != null && chbVar != null) {
            super.j(chbVar);
            g(cfcVar, chbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void b() {
        if (cgz.b(2)) {
            toString();
        }
        chg chgVar = this.h;
        chgVar.f = true;
        chgVar.h = false;
        chgVar.g = false;
        chf chfVar = (chf) chgVar;
        List list = chfVar.c;
        if (list != null) {
            chfVar.b(list);
            return;
        }
        chgVar.d();
        chfVar.a = new che(chfVar);
        chfVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cfk
    public final void c() {
        if (cgz.b(2)) {
            toString();
        }
        chg chgVar = this.h;
        chgVar.f = false;
        chgVar.d();
    }

    @Override // defpackage.cfk
    public final void j(cfo cfoVar) {
        super.j(cfoVar);
        this.j = null;
        this.i = null;
    }

    public final void o() {
        if (cgz.b(3)) {
            toString();
        }
        this.h.d();
        this.h.g = true;
        chb chbVar = this.i;
        if (chbVar != null) {
            j(chbVar);
            if (chbVar.b) {
                if (cgz.b(2)) {
                    Objects.toString(chbVar.a);
                }
                hzz hzzVar = chbVar.c;
                hzzVar.a.clear();
                hzzVar.a.notifyDataSetChanged();
            }
        }
        chg chgVar = this.h;
        cha chaVar = chgVar.j;
        if (chaVar != null) {
            if (chaVar == this) {
                chgVar.j = null;
                chgVar.h = true;
                chgVar.f = false;
                chgVar.g = false;
                chgVar.i = false;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public final void p(cfc cfcVar, hzz hzzVar) {
        chb chbVar = new chb(this.h, hzzVar);
        g(cfcVar, chbVar);
        cfo cfoVar = this.i;
        if (cfoVar != null) {
            j(cfoVar);
        }
        this.j = cfcVar;
        this.i = chbVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        sb.append(this.h.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.h)));
        sb.append("}}");
        return sb.toString();
    }
}
