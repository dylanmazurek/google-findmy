package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mef extends med {
    final /* synthetic */ mej a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mef(mek mekVar, mej mejVar) {
        super(mekVar.a);
        this.a = mejVar;
    }

    @Override // defpackage.med
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            mej mejVar = this.a;
            synchronized (mejVar) {
                if (mejVar.b.isEmpty()) {
                    mejVar.b = null;
                    mejVar.a = true;
                    return;
                } else {
                    list = mejVar.b;
                    mejVar.b = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
