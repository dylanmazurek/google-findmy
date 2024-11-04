package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cga implements cfa {
    private final /* synthetic */ int a;
    private final Object b;

    public cga(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [cer, java.lang.Object] */
    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        cer[] cerVarArr;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                this.b.a();
                this.b.a();
                return;
            }
            new HashMap();
            int i2 = 0;
            while (true) {
                cerVarArr = (cer[]) this.b;
                if (i2 >= cerVarArr.length) {
                    break;
                }
                cerVarArr[i2].a();
                i2++;
            }
            for (cer cerVar : cerVarArr) {
                cerVar.a();
            }
            return;
        }
        if (cevVar == cev.ON_CREATE) {
            cfcVar.N().c(this);
            ((cgf) this.b).b();
        } else {
            Objects.toString(cevVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(cevVar.toString()));
        }
    }
}
