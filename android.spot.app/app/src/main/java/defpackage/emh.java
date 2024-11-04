package defpackage;

import j$.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class emh implements els {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ emh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.els
    public final void a(eiu eiuVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    for (Map.Entry entry : this.a.entrySet()) {
                        eiuVar.c((kyh) entry.getKey(), new ebd(entry, 4));
                    }
                    return;
                }
                Collection.EL.forEach(((ihy) this.a).c(), new ebd(eiuVar, 5));
                return;
            }
            jnk jnkVar = ejg.a;
            eiuVar.d(false);
            eiuVar.c = jer.i(this.a);
            return;
        }
        jmw listIterator = ((ihy) ((jer) this.a).c()).c().listIterator();
        while (listIterator.hasNext()) {
            eiuVar.c((kyh) listIterator.next(), new emj(1));
        }
    }
}
