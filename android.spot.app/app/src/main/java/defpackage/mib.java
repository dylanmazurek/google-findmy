package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mib extends mas {
    public final mak d;
    public map e;
    public lze f = lze.IDLE;

    public mib(mak makVar) {
        this.d = makVar;
    }

    @Override // defpackage.mas
    public final mca a(mao maoVar) {
        mhy mhyVar;
        Boolean bool;
        List list = maoVar.a;
        if (!list.isEmpty()) {
            Object obj = maoVar.c;
            if ((obj instanceof mhy) && (bool = (mhyVar = (mhy) obj).a) != null && bool.booleanValue()) {
                ArrayList arrayList = new ArrayList(list);
                Long l = mhyVar.b;
                Collections.shuffle(arrayList, new Random());
                list = arrayList;
            }
            map mapVar = this.e;
            if (mapVar == null) {
                mak makVar = this.d;
                maf mafVar = new maf();
                mafVar.b(list);
                map b = makVar.b(mafVar.a());
                b.c(new mhx(this, b, 0));
                this.e = b;
                d(lze.CONNECTING, new mhz(mam.b(b)));
                b.a();
            } else {
                mapVar.d(list);
            }
            return mca.b;
        }
        List list2 = maoVar.a;
        lyp lypVar = maoVar.b;
        mca d = mca.i.d("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + lypVar.toString());
        b(d);
        return d;
    }

    @Override // defpackage.mas
    public final void b(mca mcaVar) {
        map mapVar = this.e;
        if (mapVar != null) {
            mapVar.b();
            this.e = null;
        }
        d(lze.TRANSIENT_FAILURE, new mhz(mam.a(mcaVar)));
    }

    @Override // defpackage.mas
    public final void c() {
        map mapVar = this.e;
        if (mapVar != null) {
            mapVar.b();
        }
    }

    public final void d(lze lzeVar, maq maqVar) {
        this.f = lzeVar;
        this.d.e(lzeVar, maqVar);
    }
}
