package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfd {
    public cew a;
    private cfa b;

    public cfd(cfb cfbVar, cew cewVar) {
        cfa cfpVar;
        cewVar.getClass();
        cfg cfgVar = cfg.a;
        boolean z = cfbVar instanceof cfa;
        boolean z2 = cfbVar instanceof cem;
        if (z && z2) {
            cfpVar = new cen((cem) cfbVar, (cfa) cfbVar);
        } else if (z2) {
            cfpVar = new cen((cem) cfbVar, null);
        } else if (z) {
            cfpVar = (cfa) cfbVar;
        } else {
            Class<?> cls = cfbVar.getClass();
            if (cfg.a.a(cls) == 2) {
                Object obj = cfg.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    cfpVar = new cga(cfg.b((Constructor) list.get(0), cfbVar), 2);
                } else {
                    int size = list.size();
                    cer[] cerVarArr = new cer[size];
                    for (int i = 0; i < size; i++) {
                        cerVarArr[i] = cfg.b((Constructor) list.get(i), cfbVar);
                    }
                    cfpVar = new cga(cerVarArr, 1);
                }
            } else {
                cfpVar = new cfp(cfbVar);
            }
        }
        this.b = cfpVar;
        this.a = cewVar;
    }

    public final void a(cfc cfcVar, cev cevVar) {
        cew a = cevVar.a();
        this.a = bsx.d(this.a, a);
        this.b.a(cfcVar, cevVar);
        this.a = a;
    }
}
