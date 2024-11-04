package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class end implements ihm {
    public final Executor a;
    public final eze b;
    public final iil c;

    public end(Executor executor, iil iilVar, eze ezeVar) {
        this.a = executor;
        this.c = iilVar;
        this.b = ezeVar;
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ihm
    public final jyz a(kxx kxxVar, ihn ihnVar, ihw ihwVar) {
        kxt kxtVar;
        kxt kxtVar2;
        kxt kxtVar3;
        kxt kxtVar4;
        kxt kxtVar5;
        boolean z;
        if (kxxVar.a == 12) {
            kxtVar = (kxt) kxxVar.b;
        } else {
            kxtVar = kxt.f;
        }
        kyf kyfVar = kxtVar.a;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        final kyf kyfVar2 = kyfVar;
        int i = kxxVar.a;
        if (i == 12) {
            kxtVar2 = (kxt) kxxVar.b;
        } else {
            kxtVar2 = kxt.f;
        }
        final ljv ljvVar = kxtVar2.b;
        if (i == 12) {
            kxtVar3 = (kxt) kxxVar.b;
        } else {
            kxtVar3 = kxt.f;
        }
        final ljv ljvVar2 = kxtVar3.c;
        if (i == 12) {
            kxtVar4 = (kxt) kxxVar.b;
        } else {
            kxtVar4 = kxt.f;
        }
        final int i2 = kxtVar4.d;
        if (i == 12) {
            kxtVar5 = (kxt) kxxVar.b;
        } else {
            kxtVar5 = kxt.f;
        }
        final Map unmodifiableMap = Collections.unmodifiableMap(kxtVar5.e);
        iil iilVar = this.c;
        kyq kyqVar = kyfVar2.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        kuv kuvVar = iilVar.e;
        if (kzv.e(kyqVar.b) == 4) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        return iuu.p(iuu.p(jwu.g(jys.q(((kuv) kuvVar.b).u()), new iig(kyqVar, 3), kuvVar.a), new jxd() { // from class: enb
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return ivc.E(enc.CANNOT_DECRYPT);
                }
                end endVar = end.this;
                jdl jdlVar = jdl.a;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (true) {
                    List list = ljvVar;
                    if (i3 < list.size()) {
                        arrayList.add(new iif((kym) list.get(i3), (lln) ljvVar2.get(i3)));
                        i3++;
                    } else {
                        iil iilVar2 = endVar.c;
                        Map map = unmodifiableMap;
                        return iuu.o(iilVar2.b(kyfVar2, jdlVar, arrayList, i2, new egd(endVar, map, 5)), new ene(1), endVar.a);
                    }
                }
            }
        }, this.a), new ejc(ihnVar, kxxVar, 6), this.a);
    }
}
