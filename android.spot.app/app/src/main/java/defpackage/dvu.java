package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvu implements lsh {
    private final mko a;
    private final /* synthetic */ int b;

    public dvu(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return b();
                    }
                    return b();
                }
                return b();
            }
            return b();
        }
        return b();
    }

    public final mnb b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        jzc jzcVar = (jzc) this.a.a();
                        jzcVar.getClass();
                        return new mtw(jzcVar);
                    }
                    jzc jzcVar2 = (jzc) this.a.a();
                    jzcVar2.getClass();
                    return new mtw(jzcVar2);
                }
                jzc jzcVar3 = (jzc) this.a.a();
                jzcVar3.getClass();
                return new mtw(jzcVar3);
            }
            ExecutorService executorService = (ExecutorService) this.a.a();
            executorService.getClass();
            return new mtw(executorService);
        }
        Executor executor = (Executor) this.a.a();
        executor.getClass();
        return mkm.aH(executor);
    }
}
